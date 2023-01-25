package org.example.plants;


import org.example.beans.*;
import java.io.Serializable;
import java.util.ArrayList;

public class ManngmentGrow extends ManngmentGrowBean {

    @Override
    public OwnerBean getOwnerBean() {
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
    public void setOwnerBean(OwnerBean OwnerBean) {
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
