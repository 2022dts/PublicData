namespace X {
    export var a = 1;
    // export let b = 1;
    // export const c = 1;
}

X.a // 1

namespace X {
    export var a = 2;
    // export let b = 2;
    // export const c = 2;
}

X.a // 2