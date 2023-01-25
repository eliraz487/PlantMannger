package org.example.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class PlantTypeBean implements Serializable {

    private String name;
    private WateringRequirementBean watering_requirement;
    private String name_original;


    private WateringRequirementBean watering_requirement_original;
}
