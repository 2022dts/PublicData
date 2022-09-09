interface Foo {
    // String literal as property name
    'public': number,
    // Numeric literal as property name
    123.456: number,
    0b101: number,

    // Content of string literal cannot be the same as a numeric literal
    1e2: number,
    '100': string,
}