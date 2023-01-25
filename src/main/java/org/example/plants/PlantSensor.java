package org.example.plants;


import org.example.beans.PlantSensorBean;
import org.example.beans.SensorDaraBean;

import java.util.ArrayList;


public class PlantSensor extends PlantSensorBean {
    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public ArrayList<SensorDaraBean> getDatalist() {
        return super.getDatalist();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public void setDatalist(ArrayList<SensorDaraBean> datalist) {
        super.setDatalist(datalist);
    }

    public PlantSensor() {
        super();
    }
}
