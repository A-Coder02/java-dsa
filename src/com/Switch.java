package com;

import java.util.Objects;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String quote = in.next();
        boolean isAllowToAdvertise = false;
        boolean isStorageAccess = false;
        boolean isPaidQuote = false;

        switch (quote) {
            case "premium":
                isAllowToAdvertise = true;
            case "gold":
                isStorageAccess = true;
            case "free":
                isPaidQuote = true;
        }

        System.out.println("Allow to Advertise ? " + isAllowToAdvertise);
        System.out.println("Allow to Storage Access ? " + isStorageAccess);
        System.out.println("Allow to User ? " + isPaidQuote);

    }
}
