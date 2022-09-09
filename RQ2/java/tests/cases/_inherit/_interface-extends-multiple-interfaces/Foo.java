interface Bar<T> {
    /* ... */
}

interface Baz {
    /* ... */
}

public interface Foo extends Bar<String>, Baz {
    /* ... */
}