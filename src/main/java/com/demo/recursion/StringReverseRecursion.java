package com.demo.recursion;

public class StringReverseRecursion {
	
	public static void main(String[] args) {
        String input = "Joshwin";
        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    
    
//    oshwin + J
//    shwin + o
//    hwin + s
//    win + h
//    in + w
//    n + i
//  "" + n

}
