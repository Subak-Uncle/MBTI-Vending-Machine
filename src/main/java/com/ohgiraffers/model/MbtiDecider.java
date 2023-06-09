package com.ohgiraffers.model;

public class MbtiDecider {

    private String userMBTI;

    private int iedecider = 0;
    private int nsdecider = 0;
    private int tfdecider = 0;
    private int jpdecider = 0;


    private String playerIE;
    private String playerNS;
    private String playerTF;
    private String playerJP;

    public void Decider(String select) {

        if (select == "I") {
            iedecider++;
        }
        if (select == "N") {
            nsdecider++;
        }
        if (select == "T") {
            tfdecider++;
        }
        if (select == "J") {
            jpdecider++;
        }
    }

    public String MBTIDecider(String player) {
        if (iedecider >= 2) {
            playerIE = "I";
        } else {
            playerIE = "E";
        }
        if (nsdecider >= 2) {
            playerNS = "N";
        } else {
            playerNS = "S";
        }
        if (tfdecider >= 2) {
            playerTF = "T";
        } else {
            playerTF = "F";
        }
        if (jpdecider >= 2) {
            playerJP = "J";
        } else {
            playerJP = "P";
        }
        userMBTI = playerIE + playerNS + playerTF + playerJP;
        return userMBTI;
    }


}
