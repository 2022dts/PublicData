class Foo {
    method0() {
        console.log('Foo')
    }

    get a() {
        return 0;
    }
}

class Bar extends Foo {
    method0() {
        console.log('Bar')
    }

    get a() {
        return 1;
    }
}

new Bar().method0() // 'Bar'
new Bar().a // 1