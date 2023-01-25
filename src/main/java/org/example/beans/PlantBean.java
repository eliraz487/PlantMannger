package org.example.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class PlantBean implements Serializable {

    private PlantTypeBean plant_type_bean;

    private PlantTypeBean plant_type_bean_original;
}
