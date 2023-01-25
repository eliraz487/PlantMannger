package org.example.beans;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
public class PlantGroupBean implements Serializable {

    private ArrayList<PlantBean> plantsList;

    private String catalognumber;
}
