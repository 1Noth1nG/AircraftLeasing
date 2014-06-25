package com.epam.zhakupov.entity;

import java.math.BigDecimal;
import java.util.Random;

public class PlaneFactory {
    public static Aircraft createRandomPlane() {
        Aircraft plane = null;
        int x = new Random().nextInt(3);
        String a = Aircraft.RandomBIN(8);

        switch (x) {
            case 0:
                plane = new Aircraft.AircraftBuilder().
                        PlaneName("Boeing747").
                        SerialNumber(a).
                        PlaneType("Airliner").
                        CargoPayLoad(BigDecimal.valueOf(12)).
                        FuelTankVolume(20).FlightRange(18000).
                        Cost(BigDecimal.valueOf(1800)).
                        builder();
                break;
            case 1:
                plane = new Aircraft.
                        AircraftBuilder().
                        PlaneName("Boeing777").
                        SerialNumber(a).
                        PlaneType("Airliner").
                        CargoPayLoad(BigDecimal.valueOf(15)).
                        FuelTankVolume(25).FlightRange(21140).
                        Cost(BigDecimal.valueOf(2100)).
                        builder();
                break;
            case 2:
                plane = new Aircraft.AircraftBuilder().
                        PlaneName("AN-70").
                        SerialNumber(a).
                        PlaneType("Transporter").
                        CargoPayLoad(BigDecimal.valueOf(20)).
                        FuelTankVolume(30).
                        FlightRange(13000).
                        Cost(BigDecimal.valueOf(1500)).
                        builder();
        }
        return plane;
    }


}
