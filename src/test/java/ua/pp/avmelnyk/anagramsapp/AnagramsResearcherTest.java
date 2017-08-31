package ua.pp.avmelnyk.anagramsapp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AnagramsResearcherTest
    extends TestCase
{

    public AnagramsResearcherTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AnagramsResearcherTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
