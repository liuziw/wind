package com.lzw.wind.mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "charge_poi")
public class ChargePoi implements Serializable {

    private static final long serialVersionUID = 2653147280472201924L;
    @Id
    private String _id;

    @Indexed
    private String poi_id;
    private String poi_name;
    @GeoSpatialIndexed
    private Double[] location;
    private String media_url;
    private Double price;

    public ChargePoi() {
        super();
    }

    @PersistenceConstructor
    ChargePoi(String _id, String poi_id, String poi_name, Double[] location, String media_url, Double price) {
        super();
        this._id = _id;
        this.poi_id = poi_id;
        this.poi_name = poi_name;
        this.location = location;
        this.media_url = media_url;
        this.price = price;
    }

    public ChargePoi(String _id, String poi_id, String poi_name, Double x, Double y, String media_url, Double price) {
        super();
        this._id = _id;
        this.poi_id = poi_id;
        this.poi_name = poi_name;
        this.location = new Double[]{x, y};
        this.media_url = media_url;
        this.price = price;
    }

}
