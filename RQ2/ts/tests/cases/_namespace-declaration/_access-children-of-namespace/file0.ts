namespace A {
    export type A = number
}

interface A {
    A: string
}

type b = A['A']   // interface A - property A
type c = A.A      // namespace A - type alias A