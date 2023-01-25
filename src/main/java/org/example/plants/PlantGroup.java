package org.example.plants;

import org.example.beans.PlantBean;
import org.example.beans.PlantGroupBean;
import java.util.ArrayList;


public class PlantGroup extends PlantGroupBean {
    @Override
    public ArrayList<PlantBean> getPlantsList() {
        return super.getPlantsList();
    }

    @Override
    public String getCatalognumber() {
        return super.getCatalognumber();
    }

    @Override
    public void setPlantsList(ArrayList<PlantBean> plantsList) {
        super.setPlantsList(plantsList);
    }

    @Override
    public void setCatalognumber(String catalognumber) {
        super.setCatalognumber(catalognumber);
    }

    public PlantGroup() {
        super();
    }
}
