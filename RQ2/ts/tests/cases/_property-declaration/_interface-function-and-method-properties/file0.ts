/**
 * This is not an actual case that can be implemented in JS
 * level, just for syntax demostration.
 */
interface Foo {
    (x: number, y: number): number;

    /**
     * Call signature, which lacks return-type annotation,
     * implicitly has an 'any' return type.
     * (This is a TSError in strict mode)
     *
     * This equals to (): any.
     */
    ();

    <T>(x: T, y: T): T;

    <T, U>(a: T[], f: (x: T) => U): U[];

    new<T, U, R>(p0: T, p1: U): R;

    foo(x: number, y: number): number;

    'async'(): string;

    123(): number;
}