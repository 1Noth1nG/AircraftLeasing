package com.epam.zhakupov.entity;

import java.math.BigDecimal;
import java.util.Random;

public class Aircraft {
    private String planeName;
    private String serialNumber;
    private String planeType;
    private BigDecimal cargoPayLoad;
    private double fuelTankVolume;
    private double flightRange;
    private BigDecimal cost;

    public Aircraft(AircraftBuilder Builder) {
        planeName = Builder.planeName;
        serialNumber = Builder.serialNumber;
        planeType = Builder.PlaneType;
        cargoPayLoad = Builder.CargoPayLoad;
        fuelTankVolume = Builder.FuelTankVolume;
        flightRange = Builder.FlightRange;
        cost = Builder.Cost;
    }

    public static String RandomBIN(int x) {
        int[] a = new int[x];
        for (int i = 0; i < x; i++)
            a[i] = new Random().nextInt(10);
        StringBuilder sb = new StringBuilder();
        for (int i : a) sb.append(i);
        return sb.toString();
    }

    public String getPlaneName() {
        return planeName;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "Plane Name='" + planeName + '\'' +
                ", Serial Number='" + serialNumber + '\'' +
                ", Plane Type='" + planeType + '\'' +
                ", Cargo Pay Load=" + cargoPayLoad + "tons" +
                ", Fuel Tank Volume=" + fuelTankVolume + "tons" +
                ", Flight Range=" + flightRange + "km" +
                ", Cost=" + cost + "$" +
                '}' + "\n";
    }

    public BigDecimal getCost() {
        return cost;
    }

    public BigDecimal getCargoPayLoad() {
        return cargoPayLoad;
    }

    public static class AircraftBuilder {
        private String planeName = null;
        private String serialNumber = null;
        private String PlaneType = null;
        private BigDecimal CargoPayLoad = BigDecimal.ZERO;
        private double FuelTankVolume = 0;
        private double FlightRange = 0;
        private BigDecimal Cost = BigDecimal.ZERO;

        public AircraftBuilder PlaneName(String val) {
            planeName = val;
            return this;
        }

        public AircraftBuilder SerialNumber(String val) {
            serialNumber = val;
            return this;
        }

        public AircraftBuilder PlaneType(String val) {
            PlaneType = val;
            return this;
        }

        public AircraftBuilder CargoPayLoad(BigDecimal val) {
            CargoPayLoad = val;
            return this;
        }

        public AircraftBuilder FuelTankVolume(double val) {
            FuelTankVolume = val;
            return this;
        }

        public AircraftBuilder FlightRange(double val) {
            FlightRange = val;
            return this;
        }

        public AircraftBuilder Cost(BigDecimal val) {
            Cost = val;
            return this;
        }

        public Aircraft builder() {
            return new Aircraft(this);
        }
    }
}


