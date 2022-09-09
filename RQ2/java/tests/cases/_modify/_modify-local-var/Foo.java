public class Foo {
    public int counting(int i) {
        int j = i % 2;              // <--- Set
        j += 1;                     // <--- Modify
        j += 2;                     // <--- Modify
        j /= 3;                     // <--- Modify
        return j;
    }
}