package hello;

interface Photo {
    /* ... */
}

public record BaseService(int x, String y) implements Photo{
    /* ... */
}