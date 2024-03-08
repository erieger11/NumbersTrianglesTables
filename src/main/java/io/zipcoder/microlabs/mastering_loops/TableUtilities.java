package io.zipcoder.microlabs.mastering_loops;

import org.w3c.dom.ls.LSOutput;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
       return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder finishedTable1 = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                finishedTable1.append(String.format("%3d |", i*j));
            }
            finishedTable1.append("\n");
        }
        return finishedTable1.toString();
    }
}

