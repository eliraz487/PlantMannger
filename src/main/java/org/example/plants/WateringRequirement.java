package org.example.plants;


import org.example.beans.WateringRequirementBean;


public class WateringRequirement extends WateringRequirementBean {

    @Override
    public int getSoilMoistureFrom() {
        return super.getSoilMoistureFrom();
    }

    @Override
    public int getSoilMoistureTo() {
        return super.getSoilMoistureTo();
    }

    @Override
    public double getPhFrom() {
        return super.getPhFrom();
    }

    @Override
    public double getPhTo() {
        return super.getPhTo();
    }

    @Override
    public void setSoilMoistureFrom(int soilMoistureFrom) {
        super.setSoilMoistureFrom(soilMoistureFrom);
    }

    @Override
    public void setSoilMoistureTo(int soilMoistureTo) {
        super.setSoilMoistureTo(soilMoistureTo);
    }

    @Override
    public void setPhFrom(double phFrom) {
        super.setPhFrom(phFrom);
    }

    @Override
    public void setPhTo(double phTo) {
        super.setPhTo(phTo);
    }

    public WateringRequirement() {
        super();
    }
}
