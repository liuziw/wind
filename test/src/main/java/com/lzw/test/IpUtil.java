package com.lzw.test;



import lombok.extern.slf4j.Slf4j;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Slf4j
public class IpUtil {

    /** 
     * @Title: getLocalIP 
     * @Description: 获取本机IP
     * @param @return    设定文件 
     * @return String    返回类型 
     * @throws 
     */
    public static String getLocalIP() {
        String sIP = "";
        InetAddress ip = null;
        try {
            boolean bFindIP = false;
            Enumeration<NetworkInterface> netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface
                    .getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()) {
                if (bFindIP) {
                    break;
                }
                NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    ip = (InetAddress) ips.nextElement();
                    if (!ip.isLoopbackAddress() && ip.getHostAddress().matches("(\\d{1,3}\\.){3}\\d{1,3}")) {
                        bFindIP = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        if (null != ip) {
            sIP = ip.getHostAddress();
        }
        return sIP;
    }


    /** 
     * @Title: getLocalIPS 
     * @Description: 获取多网卡IP地址列表
     * @param @return    设定文件 
     * @return List<String>    返回类型 
     * @throws 
     */
    public static List<String> getLocalIPS() {
        InetAddress ip = null;
        List<String> ipList = new ArrayList<String>();
        try {
            Enumeration<NetworkInterface> netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface
                    .getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()) {
                NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    ip = (InetAddress) ips.nextElement();
                    if (!ip.isLoopbackAddress() && ip.getHostAddress().matches("(\\d{1,3}\\.){3}\\d{1,3}")) {
                        ipList.add(ip.getHostAddress());
                    }
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return ipList;
    }


    /** 
     * @Title: getMacId 
     * @Description: 获取服务器MAC地址
     * @param @return    设定文件 
     * @return String    返回类型 
     * @throws 
     */
    public static String getMacId() {
        String macId = "";
        InetAddress ip = null;
        NetworkInterface ni = null;
        try {
            boolean bFindIP = false;
            Enumeration<NetworkInterface> netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface
                    .getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()) {
                if (bFindIP) {
                    break;
                }
                ni = (NetworkInterface) netInterfaces.nextElement();
                // ----------特定情况，可以考虑用ni.getName判断
                // 遍历所有ip
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    ip = (InetAddress) ips.nextElement();
                    if (!ip.isLoopbackAddress() // 非127.0.0.1
                            && ip.getHostAddress().matches("(\\d{1,3}\\.){3}\\d{1,3}")) {
                        bFindIP = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        if (null != ip) {
            try {
                macId = getMacFromBytes(ni.getHardwareAddress());
            } catch (SocketException e) {
                log.error(e.getMessage());
            }
        }
        return macId;
    }


    /** 
     * @Title: getMacIds 
     * @Description: 获取多网卡MAC地址列表
     * @param @return    设定文件 
     * @return List<String>    返回类型 
     * @throws 
     */
    public static List<String> getMacIds() {
        InetAddress ip = null;
        NetworkInterface ni = null;
        List<String> macList = new ArrayList<String>();
        try {
            Enumeration<NetworkInterface> netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface
                    .getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()) {
                ni = (NetworkInterface) netInterfaces.nextElement();
                // ----------特定情况，可以考虑用ni.getName判断
                // 遍历所有ip
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    ip = (InetAddress) ips.nextElement();
                    if (!ip.isLoopbackAddress() // 非127.0.0.1
                            && ip.getHostAddress().matches("(\\d{1,3}\\.){3}\\d{1,3}")) {
                        macList.add(getMacFromBytes(ni.getHardwareAddress()));
                    }
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return macList;
    }


    private static String getMacFromBytes(byte[] bytes) {
        StringBuffer mac = new StringBuffer();
        byte currentByte;
        boolean first = false;
        for (byte b : bytes) {
            if (first) {
                mac.append("-");
            }
            currentByte = (byte) ((b & 240) >> 4);
            mac.append(Integer.toHexString(currentByte));
            currentByte = (byte) (b & 15);
            mac.append(Integer.toHexString(currentByte));
            first = true;
        }
        return mac.toString().toUpperCase();
    }




    public static IpMac getLocalIPMac() {

        IpMac ipmac=new IpMac();
        String sIP = "";
        String macId = "";
        InetAddress ip = null;
        NetworkInterface ni = null;
        try {
            boolean bFindIP = false;
            Enumeration<NetworkInterface> netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface
                    .getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()) {
                if (bFindIP) {
                    break;
                }
                ni = (NetworkInterface) netInterfaces.nextElement();
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    ip = (InetAddress) ips.nextElement();
                    if (!ip.isLoopbackAddress() && ip.getHostAddress().matches("(\\d{1,3}\\.){3}\\d{1,3}")) {
                        bFindIP = true;
                        break;
                    }
                }



            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        if (null != ip) {
            sIP = ip.getHostAddress();
            try {
                macId = getMacFromBytes(ni.getHardwareAddress());
            } catch (SocketException e) {
                log.error(e.getMessage());
            }
        }

        ipmac.setIp(sIP);
        ipmac.setMac(macId);
        return ipmac;
    }

    public static List<IpMac> getLocalIpMacs()
    {
        List<IpMac> ipmacList = new ArrayList<IpMac>();

        InetAddress ip = null;
        NetworkInterface ni = null;
        try {
            Enumeration<NetworkInterface> netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface
                    .getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()) {
                ni = (NetworkInterface) netInterfaces.nextElement();
                // ----------特定情况，可以考虑用ni.getName判断
                // 遍历所有ip
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                while (ips.hasMoreElements()) {
                    ip = (InetAddress) ips.nextElement();
                    if (!ip.isLoopbackAddress() // 非127.0.0.1
                            && ip.getHostAddress().matches("(\\d{1,3}\\.){3}\\d{1,3}")) {
                        ipmacList.add(new IpMac(ip.getHostAddress(),getMacFromBytes(ni.getHardwareAddress())));
                    }
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return ipmacList;
    }



    public static void main(String[] args) {
        System.out.println(IpUtil.getLocalIP());
        System.out.println(IpUtil.getMacId());
        List<String> list=IpUtil.getLocalIPS();
        for (String s:list)
        {
            System.out.println(s);
        }
        List<String> maclist=IpUtil.getMacIds();
        for (String s:maclist)
        {
            System.out.println(s);
        }
        IpMac ipmac = IpUtil.getLocalIPMac();


        System.out.println("ip="+ipmac.getIp()+"     mac="+ipmac.getMac());


        List<IpMac> ipmaclist = IpUtil.getLocalIpMacs();

        for (IpMac ipmacs:ipmaclist)
        {
            System.out.println("ip="+ipmacs.getIp()+"     mac="+ipmacs.getMac());
        }
    }





    public static class IpMac {

        private String ip;
        private String mac;

        public IpMac(String ip, String mac) {
            super();
            this.ip = ip;
            this.mac = mac;
        }


        public IpMac() {
            super();
        }


        public String getIp() {
            return ip;
        }
        public void setIp(String ip) {
            this.ip = ip;
        }
        public String getMac() {
            return mac;
        }
        public void setMac(String mac) {
            this.mac = mac;
        }
    }
}
