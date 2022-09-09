public class Foo {
    public Bar getBar(){
        Bar mBar = new Bar();
        return mBar;
    }
    
    public void foo(){
        getBar().bar();
    }
}

class Bar {
    public void bar(){
        /* ... */
    }
}