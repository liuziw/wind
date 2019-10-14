package com.lzw.test.breakPointTrans.upload.two;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class SendFileThread extends Thread{

    private Socket socket=null;
    private DataOutputStream dos;
    private DataInputStream dis;
    private RandomAccessFile rad;
    private Container contentPanel;
    private JFrame frame;
    private JProgressBar progressbar;
    private JLabel label;

    public SendFileThread(){
        frame=new JFrame("文件传输");
        try {
            socket=new Socket("localhost", 8080);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void run(){

        JFileChooser fc = new JFileChooser();
        int status=fc.showOpenDialog(null);

        if (status==JFileChooser.APPROVE_OPTION) {
            String path=fc.getSelectedFile().getPath();
            try {

                dos=new DataOutputStream(socket.getOutputStream());
                dis=new DataInputStream(socket.getInputStream());
                dos.writeUTF("ok");

                rad=new RandomAccessFile(path, "r");
                File file=new File(path);

                byte[] buf=new byte[1024];
                dos.writeUTF(file.getName());
                dos.flush();
                String rsp=dis.readUTF();

                if (rsp.equals("ok")) {
                    long size=dis.readLong();//读取文件已发送的大小
                    dos.writeLong(rad.length());
                    dos.writeUTF("ok");
                    dos.flush();

                    long offset=size;//字节偏移量

                    int barSize=(int) (rad.length()/1024);
                    int barOffset=(int)(offset/1024);

                    //传输界面
                    frame.setSize(380,120);
                    contentPanel = frame.getContentPane();
                    contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
                    progressbar = new JProgressBar();//进度条

                    label=new JLabel(file.getName()+" 发送中");
                    contentPanel.add(label);

                    progressbar.setOrientation(JProgressBar.HORIZONTAL);
                    progressbar.setMinimum(0);
                    progressbar.setMaximum(barSize);
                    progressbar.setValue(barOffset);
                    progressbar.setStringPainted(true);
                    progressbar.setPreferredSize(new Dimension(150, 20));
                    progressbar.setBorderPainted(true);
                    progressbar.setBackground(Color.pink);

                    JButton cancel=new JButton("取消");

                    JPanel barPanel=new JPanel();
                    barPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

                    barPanel.add(progressbar);
                    barPanel.add(cancel);

                    contentPanel.add(barPanel);

                    cancel.addActionListener(new cancelActionListener());

                    frame.setDefaultCloseOperation(
                            JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);

                    //从文件指定位置开始传输
                    int length;
                    if (offset<rad.length()) {
                        rad.seek(offset);
                        while((length=rad.read(buf))>0){
                            dos.write(buf,0,length);
                            progressbar.setValue(++barOffset);
                            dos.flush();
                        }
                    }
                    label.setText(file.getName()+" 发送完成");
                }

                dis.close();
                dos.close();
                rad.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                label.setText(" 取消发送,连接关闭");
            }finally {
                frame.dispose();
            }

        }
    }

    class cancelActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e3){
            try {
                label.setText(" 取消发送,连接关闭");
                JOptionPane.showMessageDialog(frame, "取消发送给，连接关闭!", "提示：", JOptionPane.INFORMATION_MESSAGE);
                dis.close();
                dos.close();
                rad.close();
                frame.dispose();
                socket.close();
            } catch (IOException e1) {

            }
        }
    }

}
