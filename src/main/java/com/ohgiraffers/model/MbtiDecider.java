package com.ohgiraffers.model;

public class MbtiDecider {



    public String userMBTI;

    private static int iedecider = 0;
    private static int nsdecider = 0;
    private static int tfdecider = 0;
    private static int jpdecider = 0;



    public void IEDecider(String select) {
        if (select == "I") {
            this.iedecider++;
        }}
    public void NSDecider(String select) {
        if (select == "N") {
            this.nsdecider++;
        }}
    public void TFDecider(String select) {
        if (select == "T") {
            this.tfdecider++;
        }
    }
    public void JPDecider(String select) {
        if (select == "J") {
            this.jpdecider++;
        }
    }

    public String MBTIDecider() {
        String userMBTI = "";
        String result;
        if (this.iedecider >= 2) {
            result = userMBTI + "I";
        } else {
            result = userMBTI + "E";
        }
        if (this.nsdecider >= 2) {
            result = userMBTI + "N";
        } else {
            result = userMBTI + "S";
        }
        if (this.tfdecider >= 2) {
            result = userMBTI + "T";
        } else {
            result = userMBTI + "F";
        }
        if (this.jpdecider >= 2) {
            result = userMBTI + "J";
        } else {
            result = userMBTI + "P";
        }

        return userMBTI;
    }


}
