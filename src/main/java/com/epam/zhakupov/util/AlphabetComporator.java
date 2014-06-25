package com.epam.zhakupov.util;

import com.epam.zhakupov.entity.Aircraft;

import java.util.Comparator;

public class AlphabetComporator implements Comparator<Aircraft> {

    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getPlaneName().compareToIgnoreCase(o2.getPlaneName());

    }
}
