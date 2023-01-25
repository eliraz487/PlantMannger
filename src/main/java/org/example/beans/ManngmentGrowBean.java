package org.example.beans;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
@Data
public class ManngmentGrowBean implements Serializable {
    private OwnerBean OwnerBean;

    private ArrayList<PlantGroupBean> plant_group_list;

    private ArrayList<PlantSensorBean> SensorList;

}
