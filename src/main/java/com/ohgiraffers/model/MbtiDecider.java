package com.ohgiraffers.model;

public class MbtiDecider {
    private static int iedecider = 0;
    private static int nsdecider = 0;
    private static int tfdecider = 0;
    private static int jpdecider = 0;

    public void Decider(String select) {
        if (select.equals("I")) {
            iedecider++;
        }
        if (select.equals("N")) {
            nsdecider++;
        }
        if (select.equals("T")) {
            tfdecider++;
        }
        if (select.equals("J")) {
            jpdecider++;
        }
    }

    public String MBTIDecider() {
        String userMBTI = "";

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
