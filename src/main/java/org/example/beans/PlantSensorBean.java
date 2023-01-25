package org.example.beans;

import lombok.Data;

import java.util.ArrayList;

@Data
public class PlantSensorBean {

    private String type;


    private ArrayList<SensorDaraBean> data_list;

    private String type_original;
    private ArrayList<SensorDaraBean> data_list_original;

}
