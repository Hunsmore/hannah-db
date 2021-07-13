package com.hunsmore.hannahdb;

import java.util.Scanner;

public class BareConsoleApp {
    public static void main(String[] args) {
        String prompt = "hannah-db> ";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            if ("q".equals(line) || "quit".equals(line) || "exit".equals(line)) {
                System.out.println("bye!");
                break;
            }
        }
    }
}
