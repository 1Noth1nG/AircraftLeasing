package com.epam.zhakupov.util;

import com.epam.zhakupov.entity.Aircompany;
import com.epam.zhakupov.entity.Aircraft;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Find {
    private static final Logger LOG = Logger.getLogger(Find.class);

    public static List<Aircraft> findByPrice(BigDecimal o1) {
        List<Aircraft> findList = new ArrayList<Aircraft>();
        List<Aircraft> planesList = Aircompany.getPlanes();
        for (Aircraft aircraft : planesList) {
            if (aircraft.getCost().intValue() <= o1.intValue())
                findList.add(aircraft);
        }
        LOG.info(findList);
        return findList;

    }

}
