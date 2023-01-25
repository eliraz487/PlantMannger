package org.example.plants;

import org.example.beans.PlantBean;
import org.example.beans.PlantTypeBean;

import java.io.Serializable;


public class Plant extends PlantBean {

    @Override
    public PlantTypeBean getPlantTypeBean() {
        return super.getPlantTypeBean();
    }

    @Override
    public String getCatalognumber() {
        return super.getCatalognumber();
    }

    @Override
    public void setPlantTypeBean(PlantTypeBean plantTypeBean) {
        super.setPlantTypeBean(plantTypeBean);
    }

    @Override
    public void setCatalognumber(String catalognumber) {
        super.setCatalognumber(catalognumber);
    }

    public Plant() {
        super();
    }
}
