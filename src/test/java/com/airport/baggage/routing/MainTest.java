package com.airport.baggage.routing;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

/**
 *
 */
public class MainTest extends TestCase {

    public void testMain(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Main.main(new String [] {"src/test/data/InputTestData.txt"});
        String output=baos.toString();
        //remove \r if running test in Mac.
        assertEquals("0001 Concourse_A_Ticketing A5 A1 : 11\r\n" +
                "0002 A5 A1 A2 A3 A4 : 9\r\n" +
                "0003 A2 A1 : 1\r\n" +
                "0004 A8 A9 A10 A5 : 6\r\n" +
                "0005 A7 A8 A9 A10 A5 BaggageClaim : 12\r\n",output);
    }
}
