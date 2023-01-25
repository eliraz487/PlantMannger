package org.example.beans;

import lombok.Data;

import java.io.Serializable;
@Data
public class WateringRequirementBean implements Serializable {
    private int soilMoistureFrom;

    private int soilMoistureTo;

    private double phFrom;

    private double phTo;
}
