package org.example.beans;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
@Data
public class ManngmentGrowBean implements Serializable {


    private OwnerBean owner_bean;

    private ArrayList<PlantGroupBean> plant_group_list;

    private ArrayList<PlantSensorBean> sensor_list;

    private OwnerBean owner_bean_original;

    private ArrayList<PlantGroupBean> plant_group_list_original;

    private ArrayList<PlantSensorBean> sensor_list_original;
    

}
