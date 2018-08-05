package org.sfstudy.homework.core;

import org.sfstudy.homework.exception.EmptyMultiArrayException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringSets {

    public static boolean allStringSetsIdentical(String[][] sets) throws Exception {

        if(sets.length < 1) throw new EmptyMultiArrayException("Empty multi array. Nothing to compare.");

        Set<Set<String>> setWithSets = new HashSet<>();

        for (String[] array : sets) {
            Set<String> set = new HashSet<>(Arrays.asList(array));
            setWithSets.add(set);
        }

        return setWithSets.size() == 1;
    }
}
