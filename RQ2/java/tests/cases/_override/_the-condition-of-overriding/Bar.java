import Foo;

public class Bar extends Foo {
    public void doThings() {}       // <---- Overriding

    public Bar doNeatThings() {}    // <---- Overriding, subsignature

    public void failed() {}         // <---- NOT overriding, because the signarture is not the same
}