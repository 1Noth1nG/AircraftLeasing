package com.epam.zhakupov.entity;

import java.util.Random;

public class AircompanyFactory {
    public static Aircompany createCompany(String bussinessIdentifyNumber, String bankAccountNumber) {
        Aircompany aircompany = new Aircompany("Air Astana"
                , Aircompany.typeofOwnship.State
                , bussinessIdentifyNumber
                , "Astana Imanov street 43"
                , bankAccountNumber
                , "Tsesnabank");
        int x = new Random().nextInt(10);
        for (int i = 0; i < x; i++) {

            Aircraft plane = PlaneFactory.createRandomPlane();
            aircompany.add(plane);

        }
        return aircompany;
    }
}
