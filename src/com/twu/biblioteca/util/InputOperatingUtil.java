package com.twu.biblioteca.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by marry on 7/21/15.
 */
public class InputOperatingUtil {
    public static String getInput() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return bufferedReader.readLine();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
