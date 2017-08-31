package ua.pp.avmelnyk.anagramsapp;
import java.util.Arrays;

public class AnagramsResearcher {

    public   boolean isAnagram(String firstString, String secondString) throws DifferentLengthException {
        char[] firstStringArray = firstString.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] secondStringArray  = secondString.toLowerCase().replaceAll("\\s", "").toCharArray();
        if (firstString.length()!= secondString.length()){
            throw new DifferentLengthException("Anagrams can't have different lengths.");
        }
        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);

        boolean result = Arrays.equals(firstStringArray,secondStringArray);
        if (result){
            System.out.println(firstString+" and " + secondString +" are anagrams");
        }
        else{
            System.out.println(firstString+" and " + secondString +" aren't anagrams");
        }
        return result;
    }
}
