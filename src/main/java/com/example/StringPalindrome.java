package com.example;

public class StringPalindrome {

   public boolean isStringPalindrome(String input){
        if(input == null){
            throw new IllegalArgumentException("the given input is null");
        }
        if(input.equals(reverse(input))){
            return true;
        }else {
            return false;
        }
    }

    public String reverse(String input){
        String reverse = "";
        for(int i=input.length()-1; i>=0; i--){
            reverse=reverse+input.charAt(i);
        }
        return reverse;
    }
}
