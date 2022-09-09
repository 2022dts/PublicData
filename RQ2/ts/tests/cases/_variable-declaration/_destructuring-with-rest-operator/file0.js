let {a, b, ...r} = {a: 1, b: 2, c: 3, d: 4};
// `r` equals to { c: 3, d: 4 }

let [x, y, ...z] = [1, 2, 3, 4]
// `z` equals to 3:4