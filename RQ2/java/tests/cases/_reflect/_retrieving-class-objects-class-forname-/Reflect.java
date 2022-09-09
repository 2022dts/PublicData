package helloJDT.pkg;

public class Reflect {

    public static void  main(String args[]){

        try{
            Class reflectClass = Class.forName("helloJDT.pkg.Reflect");
            System.out.println(reflectClass.getName());
            System.out.println(reflectClass.getSimpleName());
        }
        catch(ClassNotFoundException e){
            System.out.println("CLASS NOT FOUND");
        }

    }
}