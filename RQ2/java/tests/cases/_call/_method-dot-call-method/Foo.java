public class Foo{
    public void foo(){
        /* ... */
    }
}

class Bar{
    public void bar(){
        Foo mFoo = new Foo();
        mFoo.foo();
    }
}