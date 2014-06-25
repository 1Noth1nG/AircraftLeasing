package com.epam.zhakupov.entity;

import java.util.ArrayList;
import java.util.Random;

public class ClientFactory {


    public static Client createClient(String bussinessIdentifyNumber, String bankAccountNumber) {
        Client client = new Client("Aeroflot"
                , Aircompany.typeofOwnship.Private
                , "Moscow,South Butovo,PUshkina 25"
                , bussinessIdentifyNumber
                , bankAccountNumber
                , "Sberbank");
        ArrayList<Aircraft> copy = new ArrayList<Aircraft>(Aircompany.getPlanes());
        int x = new Random().nextInt(copy.size()) + 1;
        for (int i = 0; i <= x; x--) {
            Random rand = new Random();
            Aircraft plane = copy.get(rand.nextInt(copy.size()));
            client.addPlane(plane);
            copy.remove(plane);
        }
        return client;
    }
}
