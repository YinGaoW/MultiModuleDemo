package org.dao;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Module B" );
        ServerDao serverDao = new ServerDao();
        serverDao.function();
        serverDao.function2();
        System.out.println(System.getProperty("user.dir"));
        System.out.println();
        System.out.println(8888);
    }
}
