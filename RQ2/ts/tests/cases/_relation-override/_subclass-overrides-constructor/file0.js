class Foo {
    constructor() {
        this.foo = 0;
    }
}

class Bar extends Foo {
    constructor() {
        super();        // Necessary for use `this` later
        this.bar = 1;
    }
}