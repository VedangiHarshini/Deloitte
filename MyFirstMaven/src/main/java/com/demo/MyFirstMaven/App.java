package com.demo.MyFirstMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
        //System.out.println( "Hello World!" );
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println( "Driver loaded" );
    }
}
