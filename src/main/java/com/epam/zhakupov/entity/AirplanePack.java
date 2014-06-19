package com.epam.zhakupov.entity;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AirplanePack extends ArrayList<Aircraft>
{
    public BigDecimal getAllCargoPayLoad() {
        BigDecimal summ = BigDecimal.ZERO;
        for (Aircraft f : this) {
            summ = summ.add(f.getCargoPayLoad());
        }
        return summ;
    }
    public BigDecimal getAllCost(){
        BigDecimal summ=BigDecimal.ZERO;
        for (Aircraft o :this ) {
            summ=summ.add(o.getCost());
        }return summ;
    }
}

