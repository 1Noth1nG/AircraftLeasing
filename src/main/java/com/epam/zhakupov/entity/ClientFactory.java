package com.epam.zhakupov.entity;

import java.util.Random;

public class ClientFactory {
    public static Client createClient(String bussinessIdentifyNumber,String bankAccountNumber){
        Client client= new Client("KazAgro",typeofOwnship.State,bussinessIdentifyNumber,"Astana Imanov street 43",bankAccountNumber,"Tsesnabank");
        int x=new Random().nextInt(10);
        for (int i = 0; i < x; i++) {

           Aircraft plane=PlaneFactory.createRandomPlane();
            client.add(plane);

        }
        return client; }
}
