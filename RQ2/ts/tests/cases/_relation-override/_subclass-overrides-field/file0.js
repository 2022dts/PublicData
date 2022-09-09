class Foo {
    field0 = 0

    constructor() {
        this.field1 = 10;
    }
}

class Bar extends Foo {
    field0 = 1

    constructor() {
        this.field1 = 11;
    }
}

new Bar().field0 // 1