package com.igna45.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String username;
        boolean valid;

        do{
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();
            valid = true;

            boolean ok = false; // nu are spatiu
            for (int i = 0; i < username.length(); i++){
                if (username.charAt(i) == ' '){
                    ok = true; // are spatiu
                    valid = false;
                    break;
                }
            }

            if (ok == true) {
                System.out.println("Eroare: Username ul nu poate contine spatii");
                valid = false;
                continue;
            }

            if (username.length() < 6 || username.length() >12){
                System.out.println("Eroare: Username ul trebuie sa aiba intre 6 si 12 caractere");
                valid = false;
                continue;
            }

            boolean cifra = false;
            for (int i = 0; i < username.length(); i++){
                char c = username.charAt(i);
                if (c >= '0' && c <= '9'){
                    cifra = true; // are cel putin o cifra
                    break;
                }
            }

            if (cifra == false){
                System.out.println("Eroare: Username ul trebuie sa contina cel putin o cifra");
                valid = false;
            }

        }while(valid == false);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}