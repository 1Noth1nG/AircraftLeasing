package com.epam.zhakupov;
import com.epam.zhakupov.entity.*;

public class Runner {
private static String a= Aircraft.RandomBIN(12);
    private static String b= Aircraft.RandomBIN(10);
    public static void main(String[] args) {

   Client company=new ClientFactory().createClient(a, b);
        System.out.println(company);
        System.out.println("Cargo Capacity="+company.getAllCargoPayLoad()+"tons");
        System.out.println("Total Cost is "+company.getAllCost()+"$");
    }

}
