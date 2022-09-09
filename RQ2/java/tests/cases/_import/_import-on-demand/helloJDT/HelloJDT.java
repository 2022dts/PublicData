package helloJDT;

import helloJDT.pkg.*;
import java.lang.reflect.Method;

public class HelloJDT implements JDTpkg_2 {
    String str1 = "hello JDT";
    String str2 ;

    public HelloJDT(String name){
        this.str2 = name;
    }

    public void hello(){
        System.out.println(this.str1);
    }

    public void hello(String name){
        System.out.println("This is " + name);
    }
}