package com.radhio.lightoj;

import com.radhio.lightoj.DES.DESAlgorithm;

import java.util.Scanner;

/**
 * Created by Azmia Hoque Radhio on 4/3/2021.
 */

public class Main {

    static String mPlainTextInput, mKeyInput;
    static int n = 0;

    public static void main(String[] args) {
        Algorithm();
    }

    public static void Algorithm() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Text: ");
        mPlainTextInput = input.nextLine().trim();
        System.out.println("Please Enter Your Key: ");
        mKeyInput = input.nextLine().trim();
        StringBuilder textInputBuilder = new StringBuilder(mPlainTextInput);
        StringBuilder keyInputBuilder = new StringBuilder(mKeyInput);
        if (mPlainTextInput.length() < 16 && mKeyInput.length() < 16) {
            AppendText(textInputBuilder);
            AppendKey(keyInputBuilder);
            CallDESAlgo(mPlainTextInput, mKeyInput, n);
        } else if (mPlainTextInput.length() > 16 || mKeyInput.length() > 16) {
            if (mPlainTextInput.length() > 16) {
                textInputBuilder.delete(16, mPlainTextInput.length());
                mPlainTextInput = textInputBuilder.toString();
            } else if (mPlainTextInput.length() < 16) {
                AppendText(textInputBuilder);
            }
            if (mKeyInput.length() > 16) {
                keyInputBuilder.delete(16, mKeyInput.length());
                mKeyInput = keyInputBuilder.toString();
            } else if (mKeyInput.length() < 16) {
                AppendKey(keyInputBuilder);
            }
            CallDESAlgo(mPlainTextInput, mKeyInput, n);
        } else {
            CallDESAlgo(mPlainTextInput, mKeyInput, n);
        }
    }

    public static void AppendText(StringBuilder textInputBuilder) {
        while (textInputBuilder.length() < 16) {
            textInputBuilder.insert(0, "0");
            n++;
        }
        mPlainTextInput = textInputBuilder.toString();
    }

    public static void AppendKey(StringBuilder keyInputBuilder) {
        while (keyInputBuilder.length() < 16)
            keyInputBuilder.insert(0, "0");
        mKeyInput = keyInputBuilder.toString();
    }

    public static void CallDESAlgo(String text, String key, int n) {
        DESAlgorithm cipher = new DESAlgorithm();
        System.out.println("Encryption:\n==============================");
        text = cipher.encryption(text, key);
        System.out.println(
                "\nCipher Text: " + text.toUpperCase() + "\n");
        System.out.println("Decryption\n==============================");
        text = cipher.decryption(text, key);
        StringBuilder result = new StringBuilder(text);
        result.delete(0, n);
        System.out.println(
                "\nPlain Text: "
                        + result.toString().toUpperCase());
    }
}
