package com.ohgiraffers.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MbtiDecider {

    private static String[] result = new String[12];

    private static int iedecider = 0;
    private static int nsdecider = 0;
    private static int tfdecider = 0;
    private static int jpdecider = 0;


    public void  decider(int index, String select) {
        result[index-1] = select;
        for (int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
            if (i == result.length) {
                System.out.println();
            }
        }
    }

    public String MBTIDecider() {
        String userMBTI = "";

        for (int i=0; i<result.length; i++){
            if (i >= 0 && i <= 2 && result[i].equals("I")) {
                iedecider++;
            } else if (i >= 3 && i <= 5 && result[i].equals("N")) {
                nsdecider++;
            } else if (i >= 6 && i <= 8 && result[i].equals("T")) {
                tfdecider++;
            } else if (i >= 9 && i <= 11 && result[i].equals("J")) {
                jpdecider++;
            }
        }

        if (iedecider >= 2) {
            userMBTI += "I";
        } else {
            userMBTI += "E";
        }
        if (nsdecider >= 2) {
            userMBTI += "N";
        } else {
            userMBTI += "S";
        }
        if (tfdecider >= 2) {
            userMBTI += "T";
        } else {
            userMBTI += "F";
        }
        if (jpdecider >= 2) {
            userMBTI += "J";
        } else {
            userMBTI += "P";
        }
        return userMBTI;
    }
}
