//EASY ______________________________________________________________________________________________________________________________________________
function fib(n) {
  if (n < 2) return n;

  return fib(n - 1) + fib(n - 2);
}

function binarySearch(start, end, arr, element) {
  if (start > end) {
    return -1;
  }
  let mid = start + (end - start) / 2;
  if (arr[mid] === element) {
    return mid;
  }
  if (element < arr[mid]) {
    return binarySearch(start, mid - 1, arr, element);
  }
  return binarySearch(mid + 1, end, arr, element);
}

function nto1AndReverse(n) {
  if (n == 0) {
    return;
  }

  nto1(n - 1);
  console.log(n);
}

function factorial(n) {
  if (n === 1) {
    return 1;
  }

  return n * factorial(n - 1);
}

function sumOfDigits(n) {
  if (n === 0) {
    return 0;
  }
  let modded = n % 10;
  let divided = parseInt(n / 10);

  return modded + sumOfDigits(divided);
}

let result = 0;
function reverseNumber(number) {
  if (number === 0) {
    return;
  }
  result = result * 10 + (number % 10);
  reverseNumber(number / 10);
}

function palindrome(number) {
  return number === reverseNumber(number);
}

function calculateSteps(number) {
  return calculateStepsHelper(number, 0);
}

function calculateStepsHelper(number, steps) {
  if (number === 0) {
    return steps;
  }

  if (number % 2 === 0) {
    return calculateStepsHelper(number / 2, steps + 1);
  }

  return calculateStepsHelper(number - 1, steps + 1);
}

// ARRAY ______________________________________________________________________________________________________________________________________________

let list = [1, 2, 4, 5, 10, 100];

function checkSortedOrNot(arr, index) {
  if (index === arr.length - 1) {
    return true;
  }

  return arr[index] < arr[index + 1] && checkSortedOrNot(arr, index + 1);
}
