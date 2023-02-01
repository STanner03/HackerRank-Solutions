'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function plusMinus(arr) {
    // Write your code here
    let gt = 0
    let et = 0
    let lt = 0
    let newArr = arr.map((a) => {
        if (a > 0) {
            gt++
        } else if (
            a < 0
        ) {
            lt++
        } else {
            et++
        }
    })
    console.log((gt/arr.length).toFixed(6)) 
    console.log((lt/arr.length).toFixed(6))
    console.log((et/arr.length).toFixed(6))
}

function main() {
    const n = parseInt(readLine().trim(), 10);

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    plusMinus(arr);
}