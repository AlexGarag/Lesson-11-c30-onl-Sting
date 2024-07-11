package by.tmc.c30.lesson11string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 3 string: ");
//        String[] stringArray = scanner.nextLine().split(" ");
        String[] stringArray = {"scanner", "Hello, Dolly!", "combination"};
        System.out.println();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("\'" + stringArray[i] + "\', the length of the string is " + stringArray[i].length() + " characters");
        }
        System.out.println();
//        for(int i = stringArray.length-1 ; i > 0 ; i--){ // сортировка строк по длине
//            for(int j = 0 ; j < i ; j++){
//                if( stringArray[j].length() > stringArray[j+1].length() ){
//                    String tmp = stringArray[j];
//                    stringArray[j] = stringArray[j+1];
//                    stringArray[j+1] = tmp;
//                }
//            }
//        }
        Arrays.sort(stringArray, Comparator.comparing(String::length));
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        // с палиндромом решать не стал - не интересно :)
    }
}
