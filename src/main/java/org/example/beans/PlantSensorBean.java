package org.example.beans;

import lombok.Data;

import java.util.ArrayList;

@Data
public class PlantSensorBean {

    private String type;

    private ArrayList<SensorDaraBean> datalist;

}
