abstract class Foo {
    abstract propLike: () => void;

    abstract foo(): void;

    // TS Modifiers, must precede the `abstract` keyword
    public abstract bar(p: number): string;

    protected abstract baz(): void;

    // TSError: 'private' modifier cannot be used with 'abstract' modifier.
    private abstract syntaxError(): void;
}