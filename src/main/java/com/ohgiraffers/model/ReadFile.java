package com.ohgiraffers.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadFile {
    private static final ReadFile readfile = new ReadFile();

    private ReadFile() {
    }

    public static ReadFile getReadfile() {
        return readfile;
    }

    public String readUserDB() throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("./userDB.txt", StandardCharsets.UTF_8));
        String str;
        StringBuilder db = new StringBuilder();

        while ((str = reader.readLine()) != null) {
            if (db.toString().equals("")) {
                db.append(str);
                continue;
            }
            db.append(",").append(str);
        }

        reader.close();
        return db.toString();
    }
}