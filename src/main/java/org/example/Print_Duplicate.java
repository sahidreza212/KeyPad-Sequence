package org.example;

import java.util.Arrays;

public class Print_Duplicate {
    public static void printDuplicate(String str){

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int count = 1;
        for(int i = 1;i< arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else {
                if(count > 1){
                    System.out.println(arr[i-1] +"-->"+count);
                }
                count = 1;
            }
        }
        if(count > 1){
            System.out.println(arr[arr.length-1]+"-->"+count);

        }
    }
    public static void main(String[] args) {

        String str = "Sahid Reza";
        printDuplicate(str);
    }
}
