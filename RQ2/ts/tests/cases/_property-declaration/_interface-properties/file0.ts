interface Point {
    x: number;
    y: number;
    z?: number,     // Semicolon and comma are both valid
    data,           // Implicitly has an `any` type
    distance: (p: Point) => number,
}