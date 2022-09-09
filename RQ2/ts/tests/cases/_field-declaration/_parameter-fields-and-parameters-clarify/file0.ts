class Foo {
    constructor(public a, b, c) {
        /**
         * `a` is modified by `public`, thus becomes a field,
         * which makes following commented expresssion unnecessary.
         */
        // this.a = a;

        /**
         * JS style implicit field declaration.
         */
        // @ts-ignore
        this.b = b;

        /**
         * `c` can only be referenced as parameter.
         */
        console.log(c);
    }
}