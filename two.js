const add = (a, b) => a + b;
const subtract = (a, b) => a - b;
const multiply = (a, b) => a * b;
const divide = (a, b) => (b !== 0 ? a / b : "Error: Division by zero");

const x = 20;
const y = 4;

console.log("Addition (" + x + " + " + y + "): " + add(x, y));
console.log("Subtraction (" + x + " - " + y + "): " + subtract(x, y));
console.log("Multiplication (" + x + " * " + y + "): " + multiply(x, y));
console.log("Division (" + x + " / " + y + "): " + divide(x, y));
console.log("Division by Zero (" + x + " / 0): " + divide(x, 0));
