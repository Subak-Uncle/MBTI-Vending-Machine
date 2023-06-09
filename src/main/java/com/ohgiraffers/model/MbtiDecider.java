package com.ohgiraffers.model;

public class MbtiDecider {
    private static int iedecider = 0;
    private static int nsdecider = 0;
    private static int tfdecider = 0;
    private static int jpdecider = 0;
    public String userMBTI;
    private final MbtiDecider mbtiDecider;

    public MbtiDecider(MbtiDecider mbtiDecider) {
        this.mbtiDecider = mbtiDecider;
    }


    //    public void IEDecider(String select) {
    public void Decider(String select) {

        if (select == "I") {
            iedecider++;
        }
    }

    public void NSDecider(String select) {
        if (select == "N") {
            nsdecider++;
        }
    }

    public void TFDecider(String select) {
        if (select == "T") {
            tfdecider++;
        }
    }

    public void JPDecider(String select) {
        if (select == "J") {
            jpdecider++;
        }
    }

    public String MBTIDecider() {
        String userMBTI = "";
        String result;
        if (iedecider >= 2) {
            result = userMBTI + "I";
        } else {
            result = userMBTI + "E";
        }
        if (nsdecider >= 2) {
            result = userMBTI + "N";
        } else {
            result = userMBTI + "S";
        }
        if (tfdecider >= 2) {
            result = userMBTI + "T";
        } else {
            result = userMBTI + "F";
        }
        if (jpdecider >= 2) {
            result = userMBTI + "J";
        } else {
            result = userMBTI + "P";
        }

        return userMBTI;
    }


}
