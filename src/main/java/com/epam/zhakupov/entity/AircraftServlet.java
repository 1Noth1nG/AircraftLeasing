package com.epam.zhakupov.entity;

import java.io.IOException;
import java.io.PrintWriter;

public class AircraftServlet extends javax.servlet.http.HttpServlet {
    private static String aircompanyBin = Aircraft.RandomBIN(12);
    private static String aircompanyBank = Aircraft.RandomBIN(10);
    private static String clientBin = Aircraft.RandomBIN(12);
    private static String clientBank = Aircraft.RandomBIN(10);
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out=response.getWriter();
        Aircompany company = new AircompanyFactory().createCompany(aircompanyBin, aircompanyBank);
        Client client = new ClientFactory().createClient(clientBin, clientBank);
        out.println(company);
        out.println(client);

    }
}
