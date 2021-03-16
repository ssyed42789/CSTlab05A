/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author ssyed
 */
public class Lab05 {

    
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println(isPalindrome("bhjjhb"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("lakjsasdagvdlkajsd"));
        System.out.println(isPalindrome("Sami"));
        System.out.println(isPalindrome("yu9821msjhf"));
    }
    public static boolean isPalindrome(String word){
       int i = 0;
       int j = word.length() -1;
       
       while(j > i){
           if (word.charAt(i) != word.charAt(j)){
               return false;
           }
           i = i + 1;
           j = j - 1;
           
       }
        return true;
    }
    
}

