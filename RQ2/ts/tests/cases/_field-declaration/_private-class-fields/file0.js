class Foo {
    #bar;
    #baz = 1;

    /**
     * No more other than IdentifierName is allowed
     *
     * e.g.:
     * #'c'
     * #3
     * #[`!computed${d}`]
     *
     * These examples are all INVALID.
     */
}