package com.epam.zhakupov.util;

import com.epam.zhakupov.entity.*;
import org.apache.log4j.Logger;

import java.math.BigDecimal;

import static com.epam.zhakupov.util.Find.findByPrice;

public class Runner {
    private static final Logger LOGGER = Logger.getLogger(Runner.class);
    private static String aircompanyBin = Aircraft.RandomBIN(12);
    private static String aircompanyBank = Aircraft.RandomBIN(10);
    private static String clientBin = Aircraft.RandomBIN(12);
    private static String clientBank = Aircraft.RandomBIN(10);

    public static void main(String[] args) throws CloneNotSupportedException {

        Aircompany company = new AircompanyFactory().createCompany(aircompanyBin, aircompanyBank);
        Client client = new ClientFactory().createClient(clientBin, clientBank);
        LOGGER.info(company);
        LOGGER.info("Cargo Capacity=" + client.getTotallCargoPayLoad() + "tons");
        LOGGER.info("Total Cost is " + client.getTotallCost() + "$");
        LOGGER.info(client);
        findByPrice(BigDecimal.valueOf(2000));

    }

}
