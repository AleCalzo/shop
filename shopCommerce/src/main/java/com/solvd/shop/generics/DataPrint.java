package com.solvd.shop.generics;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataPrint <T>{
    T dataPrint;

    private static final Logger LOG = LogManager.getLogger("");

    public DataPrint (T dataToPrint){
        this.dataPrint=dataToPrint;
    }
    public void print (){
        LOG.debug(dataPrint);
    }
}
