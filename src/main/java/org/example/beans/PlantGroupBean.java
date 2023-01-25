package org.example.beans;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
public class PlantGroupBean implements Serializable {

    private ArrayList<PlantBean> plants_list;
    private ArrayList<PlantBean> plants_list_original;

}
