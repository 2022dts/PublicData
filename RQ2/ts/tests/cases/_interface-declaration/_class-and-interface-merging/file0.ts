interface Foo {
    prop0: number,
}

class Foo {
    prop1: string = '';
}

type ReferenceProp0 = Foo['prop0'];
type ReferenceProp1 = Foo['prop1'];