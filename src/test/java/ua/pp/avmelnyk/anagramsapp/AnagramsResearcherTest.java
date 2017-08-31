package ua.pp.avmelnyk.anagramsapp;


import junit.framework.TestCase;
import org.junit.Test;


public class AnagramsResearcherTest
    extends TestCase
{
    @Test
    public void testAnagramsResearcher() throws DifferentLengthException {
        AnagramsResearcher researcher = new AnagramsResearcher();
        assertEquals(true,researcher.isAnagram("SiLeNt CAT", "LisTen AcT"));
        assertEquals(true,researcher.isAnagram("DORMITORY","Dirty Room"));
        assertEquals(false,researcher.isAnagram("joyea", "enjoy"));
        assertEquals(false,researcher.isAnagram("Toss", "Shot"));

    }
}
