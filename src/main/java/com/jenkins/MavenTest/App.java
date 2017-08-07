package com.jenkins.MavenTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println(App.add(12, 22));
    }
    
    public static int add (int a, int b){
    	
    	return a + b;
    }
}
