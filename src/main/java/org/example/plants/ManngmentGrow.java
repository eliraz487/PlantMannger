package org.example.plants;


import org.example.beans.ManngmentGrowBean;
import org.example.beans.PlantGroupBean;
import org.example.beans.PlantSensorBean;

import java.io.Serializable;
import java.util.ArrayList;

public class ManngmentGrow extends ManngmentGrowBean {

    @Override
    public org.example.beans.OwnerBean getOwnerBean() {
        return super.getOwnerBean();
    }

    @Override
    public ArrayList<PlantGroupBean> getPlant_group_list() {
        return super.getPlant_group_list();
    }

    @Override
    public ArrayList<PlantSensorBean> getSensorList() {
        return super.getSensorList();
    }

    @Override
    public void setOwnerBean(org.example.beans.OwnerBean OwnerBean) {
        super.setOwnerBean(OwnerBean);
    }

    @Override
    public void setPlant_group_list(ArrayList<PlantGroupBean> plant_group_list) {
        super.setPlant_group_list(plant_group_list);
    }

    @Override
    public void setSensorList(ArrayList<PlantSensorBean> SensorList) {
        super.setSensorList(SensorList);
    }

    public ManngmentGrow() {
        super();
    }
}
