package com.radhio.lightoj;

import com.radhio.lightoj.DES.DESAlgorithm;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    //main() method
    public static void main(String[] args)
    {
        Algorithm();
    }

    public static void Algorithm(){
        String text = "123456ABCD132536";
        String key = "AABB09182736CCDD";

        DESAlgorithm cipher = new DESAlgorithm();

        System.out.println("Encryption:\n");
        String encryptedText = cipher.encrypt(text, key);
        System.out.println("\nCipher Text: " + encryptedText.toUpperCase() + "\n");
        System.out.println("Decryption\n");
        String decryptedText = cipher.decrypt(text, key);
        System.out.println("\nPlain Text: " + decryptedText.toUpperCase());
    }
}
