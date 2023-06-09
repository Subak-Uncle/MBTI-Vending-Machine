package com.ohgiraffers.model;

public class MbtiDecider {


    private static int iedecider = 0;
    private static int nsdecider = 0;
    private static int tfdecider = 0;
    private static int jpdecider = 0;



    public void Decider(String select) {
        if (select == "I") {
            this.iedecider++;
        }
        if (select == "N") {
            this.nsdecider++;
        }
        if (select == "T") {
            this.tfdecider++;
        }
        if (select == "J") {
            this.jpdecider++;
        }
    }

    public String MBTIDecider() {
        String userMBTI = null;

        if (this.iedecider >= 2) {
            userMBTI += "I";
        } else {
            userMBTI += "E";
        }
        if (this.nsdecider >= 2) {
            userMBTI += "N";
        } else {
            userMBTI += "S";
        }
        if (this.tfdecider >= 2) {
            userMBTI += "T";
        } else {
            userMBTI += "F";
        }
        if (this.jpdecider >= 2) {
            userMBTI += "J";
        } else {
            userMBTI += "P";
        }

        return userMBTI;
    }
}
