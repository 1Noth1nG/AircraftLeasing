package com.epam.zhakupov.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

enum typeofOwnship{State,Private}
public class Client {
    private String name;
    private typeofOwnship TypeofOwnship;
    private String BussinessIdentifyNumber;
    private String Adress;
    private String BankAccountNumber;
    private String Bank;
    private List<Aircraft> planes = new ArrayList<Aircraft>();

    public Client(String name, typeofOwnship typeofOwnship, String bussinessIdentifyNumber, String adress, String bankAccountNumber, String bank) {
        this.name = name;
        TypeofOwnship = typeofOwnship;
        BussinessIdentifyNumber = bussinessIdentifyNumber;
        Adress = adress;
        BankAccountNumber = bankAccountNumber;
        Bank = bank;
    }
    public void add(Aircraft plane) {
        planes.add(plane);

    }
    public BigDecimal getAllCargoPayLoad() {
        BigDecimal summ = BigDecimal.ZERO;
        for (Aircraft f : planes) {
            summ = summ.add(f.getCargoPayLoad());
        }
        return summ;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", TypeofOwnship=" + TypeofOwnship +
                ", BussinessIdentifyNumber='" + BussinessIdentifyNumber + '\'' +
                ", Adress='" + Adress + '\'' +
                ", BankAccountNumber='" + BankAccountNumber + '\'' +
                ", Bank='" + Bank + '\'' +
                ",\n Planes:\n" + planes +
                '}';
    }

    public BigDecimal getAllCost(){
        BigDecimal summ=BigDecimal.ZERO;
        for (Aircraft o :planes ) {
            summ=summ.add(o.getCost());
        }return summ;
    }
}
