package com.epam.zhakupov.entity;

import com.epam.zhakupov.util.AlphabetComporator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;


public class Client {
    private ArrayList<Aircraft> leasingPlanes = new ArrayList<Aircraft>();
    private String name;
    private Aircompany.typeofOwnship typeofOwnship;
    private String bussinessIdentifyNumber;
    private String address;
    private String bankAccountNumber;
    private String bank;

    public Client(String name, Aircompany.typeofOwnship typeofOwnship, String address, String bussinessIdentifyNumber, String bankAccountNumber, String bank) {
        this.name = name;
        this.typeofOwnship = typeofOwnship;
        this.address = address;
        this.bussinessIdentifyNumber = bussinessIdentifyNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Client{" +
                ", name='" + name + '\'' +
                ", typeofOwnship=" + typeofOwnship +
                ", bussinessIdentifyNumber='" + bussinessIdentifyNumber + '\'' +
                ", address='" + address + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", bank='" + bank + '\'' +
                "\nleasingPlanes=" + leasingPlanes +
                '}';
    }

    public void addPlane(Aircraft plane) {
        leasingPlanes.add(plane);
        Collections.sort(leasingPlanes, new AlphabetComporator());
    }

    public BigDecimal getTotallCost() {
        BigDecimal summ = BigDecimal.ZERO;
        for (Aircraft o : leasingPlanes) {
            summ = summ.add(o.getCost());
        }
        return summ;
    }

    public BigDecimal getTotallCargoPayLoad() {
        BigDecimal summ = BigDecimal.ZERO;
        for (Aircraft f : leasingPlanes) {
            summ = summ.add(f.getCargoPayLoad());
        }
        return summ;
    }


}
