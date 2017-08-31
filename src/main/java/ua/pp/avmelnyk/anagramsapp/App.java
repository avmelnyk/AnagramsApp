package ua.pp.avmelnyk.anagramsapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App 
{
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {

                System.out.print("Enter first string : ");
                String firstString = br.readLine();
                System.out.print("Enter second string : ");
                String secondString = br.readLine();

                boolean result = isAnagram(firstString,secondString);
                if (result){
                    System.out.println(firstString+" and " + secondString +" are anagrams");
                }
                else{
                    System.out.println(firstString+" and " + secondString +" aren't anagrams");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static  boolean isAnagram(String firstString, String secondString){
        char[] firstStringArray = firstString.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] secondStringArray  = secondString.toLowerCase().replaceAll("\\s", "").toCharArray();
        if (firstString.length()!= secondString.length()){
            System.out.println("length is different");
            return  false;
        }
        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);
        return Arrays.equals(firstStringArray,secondStringArray);
    }
}
