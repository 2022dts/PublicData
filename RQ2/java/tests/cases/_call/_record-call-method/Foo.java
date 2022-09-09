public record Foo(int y){
    public Bar mBar = Bar.bar();
}

record Bar(int x) {
    public static Bar bar(){
        /* ... */
    }    
}