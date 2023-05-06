package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testGetNombre() {

        App app = new App("Fabiano");
        assertEquals("Fabiano", app.getNombre());

    }

    public void testSetNombre() {

        App app = new App("Fabiano");
        app.setNombre("Magnus");
        assertEquals("Magnus", app.getNombre());
    }

    public void testSetEdad() {

        App app = new App("hola");
        app.setEdad(90);
        assertEquals(90, app.getEdad());
    }
}
