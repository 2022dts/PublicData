import Foo.MSG;
import Foo;

class Bar extends Foo { 
    // Overriding Foo.doThings
    public void doThings(){
        System.out.println(MSG);
    }
       
}