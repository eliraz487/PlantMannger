package org.example.plants;

import org.example.beans.PlantTypeBean;
import org.example.beans.WateringRequirementBean;



public class PlantType extends PlantTypeBean {

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public WateringRequirementBean getWateringRequirement() {
        return super.getWateringRequirement();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setWateringRequirement(WateringRequirementBean wateringRequirement) {
        super.setWateringRequirement(wateringRequirement);
    }

    public PlantType() {
        super();
    }
}
