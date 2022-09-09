interface Distance {
    (x1: number, y1: number, x2: number, y2: number): number;

    comment: 'This function returns distance between two 2D points.';
}

// JS implementation
const distance: Distance = Object.assign(
    (x1: number, y1: number, x2: number, y2: number) => ((x2 - x1) ^ 2 + (y2 - y1) ^ 2) ^ 0.5,
    {comment: 'This function returns distance between two 2D points.'} as const,
)

// Usage
distance(0, 0, 1, 1);
console.log(distance.comment);