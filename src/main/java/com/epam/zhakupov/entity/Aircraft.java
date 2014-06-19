package com.epam.zhakupov.entity;

import java.math.BigDecimal;
import java.util.Random;

public  class Aircraft {
    private String PlaneName;
    private String SerialNumber;
    private String PlaneType;
    private BigDecimal CargoPayLoad;
    private double FuelTankVolume;
    private double FlightRange;
    private BigDecimal Cost;

    public Aircraft(AircraftBuilder Builder) {
        PlaneName = Builder.PlaneName;
        SerialNumber = Builder.SerialNumber;
        PlaneType = Builder.PlaneType;
        CargoPayLoad = Builder.CargoPayLoad;
        FuelTankVolume = Builder.FuelTankVolume;
        FlightRange = Builder.FlightRange;
        Cost = Builder.Cost;
    }
public static class AircraftBuilder{
    private String PlaneName=null;
    private String SerialNumber=null;
    private String PlaneType=null;
    private BigDecimal CargoPayLoad=BigDecimal.ZERO;
    private double FuelTankVolume=0;
    private double FlightRange=0;
    private BigDecimal Cost=BigDecimal.ZERO;
    public AircraftBuilder PlaneName(String val){
        PlaneName=val;
        return this;
    }
    public AircraftBuilder SerialNumber(String val){
        SerialNumber=val;
        return this;
    }
    public AircraftBuilder PlaneType(String val){
        PlaneType=val;
        return this;
    }
    public AircraftBuilder CargoPayLoad(BigDecimal val){
        CargoPayLoad=val;
        return this;
    }
    public AircraftBuilder FuelTankVolume(double val){
        FuelTankVolume=val;
        return this;
    }
    public AircraftBuilder FlightRange(double val){
        FlightRange=val;
        return this;
    }
    public AircraftBuilder Cost(BigDecimal val){
        Cost=val;
        return this;
    }
    public Aircraft builder(){
        return new Aircraft(this);
    }
}


    public static String RandomBIN(int x) {
        int[] a = new int[x];
        for (int i = 0; i < x; i++)
            a[i] = new Random().nextInt(10);
        StringBuilder sb = new StringBuilder();
        for (int i : a) sb.append(i);
        return sb.toString();
    }


    @Override
    public String toString() {
        return "Aircraft{" +
                "PlaneName='" + PlaneName + '\'' +
                ", SerialNumber='" + SerialNumber + '\'' +
                ", PlaneType='" + PlaneType + '\'' +
                ", CargoPayLoad=" + CargoPayLoad +"tons"+
                ", FuelTankVolume=" + FuelTankVolume +"tons"+
                ", FlightRange=" + FlightRange +"km"+
                ", Cost=" + Cost +"$"+
                '}' + "\n";
    }

    public BigDecimal getCost() {
        return Cost;
    }

    public BigDecimal getCargoPayLoad() {
        return CargoPayLoad;
    }
}


