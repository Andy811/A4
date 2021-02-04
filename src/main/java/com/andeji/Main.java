package com.andeji;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import test.Implement;
import test.MyInterface;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main extends Implement implements MyInterface {
    protected String b;

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {


        int problemNum = 0;
        Scanner problemChoose = new Scanner(System.in);

        while (problemNum != -1) {
            System.out.println("選擇題目: ");
            problemNum = problemChoose.nextInt();
            switch (problemNum) {
                case 1:
                    javaA1();
                    break;
                case 2:
                    javaA2();
                    break;
                case 3:
                    javaA3();
                    break;
                case 4:
                    javaA4(args);
                    break;
                case 5:
                    javaA5();
                    break;
            }
        }


    }

    private static void javaA5() throws NoSuchAlgorithmException {
        JavaA5 a5 = new JavaA5();
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入密碼: ");
        String passworld = scanner.nextLine();
        System.out.println("選擇演算法 0=MD2、1=MD5、2=SHA-1、3=SHA-256、4=SHA-384、5=SHA-512");
        int algorithm = scanner.nextInt();
        System.out.println("是否使用salt (Y/N):");
        Scanner sc2 = new Scanner(System.in);
        String reqSalt = sc2.nextLine();
        String salt = "";
        if (reqSalt.equalsIgnoreCase("y")) {
            salt = a5.getSalt();
            System.out.println(a5.stringHash(passworld, algorithm, salt));
        }
        if (reqSalt.equalsIgnoreCase("n")) {
            salt = "";
            System.out.println(a5.stringHash(passworld, algorithm, salt));
        }

        System.out.println("salt: " + salt);
    }

    private static void javaA4(String[] args) throws IOException {
        String propertiesName = args[0];
        String fileName = args[1];
        JavaA4 a4 = new JavaA4();
        a4.a4(propertiesName, fileName);
    }

    private static void javaA3() {
        JavaA3 a3 = new JavaA3();
        a3.a3();
    }

    private static void javaA2() {
        // A2
        Implement im = new Implement();

        Main main = new Main();
        String pubString = im.pubString;  //This is public example
        String proString = main.proString; //This is protected example
        String defString;

        main.overloadMethod();
        main.overloadMethod("overload");  //this is overload example
    }

    private static void javaA1() {
        JavaA1 a1 = new JavaA1();
        a1.a1();
    }


}
