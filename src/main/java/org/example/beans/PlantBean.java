package org.example.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class PlantBean implements Serializable {

    private PlantTypeBean plantTypeBean;

    private String catalognumber;
}
