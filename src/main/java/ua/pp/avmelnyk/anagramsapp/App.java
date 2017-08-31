package ua.pp.avmelnyk.anagramsapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main(String[] args) {
        BufferedReader br = null;
        AnagramsResearcher researcher = new AnagramsResearcher();
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {

                System.out.print("Enter first string : ");
                String firstString = br.readLine();
                System.out.print("Enter second string : ");
                String secondString = br.readLine();
                researcher.isAnagram(firstString,secondString);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (DifferentLengthException e){
            e.printStackTrace();
        }
    }


}
