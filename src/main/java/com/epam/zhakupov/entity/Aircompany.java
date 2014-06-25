package com.epam.zhakupov.entity;

import java.util.ArrayList;
import java.util.List;

public class Aircompany {
    public static typeofOwnship typeofOwnship;
    private static List<Aircraft> planes = new ArrayList<Aircraft>();
    private String name;
    private String bussinessIdentifyNumber;
    private String address;
    private String bankAccountNumber;
    private String bank;

    public Aircompany(String name, typeofOwnship typeofOwnship, String bussinessIdentifyNumber, String address, String bankAccountNumber, String bank) {
        this.name = name;
        this.typeofOwnship = typeofOwnship;
        this.bussinessIdentifyNumber = bussinessIdentifyNumber;
        this.address = address;
        this.bankAccountNumber = bankAccountNumber;
        this.bank = bank;
    }

    public static List<Aircraft> getPlanes() {
        return planes;
    }

    public void add(Aircraft plane) {
        planes.add(plane);

    }

    @Override
    public String toString() {
        return "Company{" +
                "Name='" + name + '\'' +
                ", Type of Ownship=" + typeofOwnship +
                ", Bussiness Identify Number='" + bussinessIdentifyNumber + '\'' +
                ", Address='" + address + '\'' +
                ", Bank Account Number='" + bankAccountNumber + '\'' +
                ", Bank='" + bank + '\'' +
                ",\n Planes:\n" + planes +
                '}';
    }

    public static enum typeofOwnship {State, Private}
}
