package com.radhio.lightoj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BoringApartments();
    }

    public static void BoringApartments(){
        Scanner mScanner = new Scanner(System.in);
        int task = mScanner.nextInt();
        if (task <= 36 && task >=1) {
            for (int i = 1; i <= task ; i++) {
                int taskNumber = mScanner.nextInt();
                if (taskNumber>=1 && taskNumber<=9999){
                    if (taskNumber%10 == 1){
                        System.out.println(TotalPressedCharacter(taskNumber));
                    }
                    else if (taskNumber%10 == 2){
                        System.out.println(TotalPressedCharacter(taskNumber)+10);
                    }
                    else if (taskNumber%10 == 3){
                        System.out.println(TotalPressedCharacter(taskNumber)+20);
                    }
                    else if (taskNumber%10 == 4){
                        System.out.println(TotalPressedCharacter(taskNumber)+30);
                    }
                    else if (taskNumber%10 == 5){
                        System.out.println(TotalPressedCharacter(taskNumber)+40);
                    }
                    else if (taskNumber%10 == 6){
                        System.out.println(TotalPressedCharacter(taskNumber)+50);
                    }
                    else if (taskNumber%10 == 7){
                        System.out.println(TotalPressedCharacter(taskNumber)+60);
                    }
                    else if (taskNumber%10 == 8){
                        System.out.println(TotalPressedCharacter(taskNumber)+70);
                    }
                    else if (taskNumber%10 == 9){
                        System.out.println(TotalPressedCharacter(taskNumber)+80);
                    }
                }
            }
        }
    }
    static int TotalPressedCharacter(int x)
    {
        String cha = String.valueOf(x);
        int  count = 0;
        for(int n = 0; n < cha.length(); n++) {
            if (n == 0){
                count = 1;
            }
            else if (n == 1){
                count = count + 2;
            }
            else if (n == 2){
                count = count + 3;
            }
            else if (n == 3){
                count = count + 4;
            }
        }
        return count;
    }
}
