package org.example.beans;

import lombok.Data;

import java.io.Serializable;
@Data
public class WateringRequirementBean implements Serializable {
    private int soil_moisture_from;
    private int soil_moisture_from_original;

    private int soilMoistureTo;
    private int soil_moisture_to_original;

    private double ph_from;
    private double ph_from_original;

    private double ph_to;
    private double ph_to_original;
}
