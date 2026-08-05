package org.example;

public class PrintSequence {
    public static String printSequence(String str[] ,String input){
         String output = "";
         int n = input.length();
         for(int i = 0;i<n;i++){

             char ch = Character.toUpperCase(input.charAt(i));
             if(ch == ' '){
                 output = output +'0';
             }else {
                  int position = ch - 'A';
                  output = output+str[position];
             }
         }
         return output;
    }
    public static void main(String[] args) {
        String str[] = {
                "2","22","222","3","33","333",
                "4","44","444","5","55","555",
                "6","66","666","7","77","777","7777",
                "8","88","888","9","99","999","9999"
        };
        String input = "mamun HassaN";
        System.out.println(printSequence(str,input));
    }
}
