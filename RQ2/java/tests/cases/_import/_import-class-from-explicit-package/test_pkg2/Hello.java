package test_pkg2;

import test_pkg1.Name;

public class Hello {
    public static void main(String[] args){
        Name name = new Name();
        System.out.println("Hello "+ name.getIt());

    }
}