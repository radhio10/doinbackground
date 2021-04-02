package com.radhio.lightoj;

import com.radhio.lightoj.DES.DESAlgorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Algorithm();
    }

    public static void Algorithm() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Text: ");
        String textInput = input.nextLine().trim();
        System.out.println("Please Enter Your Key: ");
        String keyInput = input.nextLine().trim();
        int n = 0;
        if (textInput.length() < 16 || keyInput.length() < 16) {
            StringBuilder textInputBuilder = new StringBuilder(textInput);
            StringBuilder keyInputBuilder = new StringBuilder(keyInput);
            while (textInputBuilder.length() < 16) {
                textInputBuilder.insert(0, "0");
                n++;
            }
            textInput = textInputBuilder.toString();
            while (keyInputBuilder.length() < 16)
                keyInputBuilder.insert(0, "0");
            keyInput = keyInputBuilder.toString();
            CallDESAlgo(textInput, keyInput, n);
        } else {
            CallDESAlgo(textInput, keyInput, n);
        }
    }

    public static void CallDESAlgo(String text, String key, int n) {
        DESAlgorithm cipher = new DESAlgorithm();
        System.out.println("Encryption:\n");
        text = cipher.encrypt(text, key);
        System.out.println(
                "\nCipher Text: " + text.toUpperCase() + "\n");
        System.out.println("Decryption\n");
        text = cipher.decrypt(text, key);
        StringBuilder result = new StringBuilder(text);
        result.delete(0, n);
        System.out.println(
                "\nPlain Text: "
                        + result.toString().toUpperCase());
    }
    //        String text = "123456ABCD132534";
//        String key = "AABB09182736CCDD";
}
