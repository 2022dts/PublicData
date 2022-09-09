namespace X {
    export const a = 1 as const;

    export namespace Y {
        export import b = X.a; // 1
    }
}

import c = X.Y.b; // 1