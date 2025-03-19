// 1. Generate 5 Random 3-digit numbers and find min & max
function findMinMax() {
  let numbers = Array.from(
    { length: 5 },
    () => Math.floor(Math.random() * 900) + 100
  );
  console.log("Generated numbers:", numbers);
  console.log("Min:", Math.min(...numbers));
  console.log("Max:", Math.max(...numbers));
}
findMinMax();

// 2. Check if the given day and month fall between March 20 and June 20
function isSpringSeason(day, month) {
  const date = new Date(2025, month - 1, day);
  const start = new Date(2025, 2, 20);
  const end = new Date(2025, 5, 20);
  console.log(date >= start && date <= end);
}

// 3. Check if a given year is a Leap Year
function isLeapYear(year) {
  if (
    year >= 1000 &&
    year <= 9999 &&
    ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0)
  ) {
    console.log(year + " is a Leap Year");
  } else {
    console.log(year + " is not a Leap Year");
  }
}

// 4. Simulate a coin flip
function flipCoin() {
  console.log(Math.random() < 0.5 ? "Heads" : "Tails");
}
flipCoin();

// 5. Read a single digit number and write the number in words
function numberToWord(num) {
  const words = [
    "Zero",
    "One",
    "Two",
    "Three",
    "Four",
    "Five",
    "Six",
    "Seven",
    "Eight",
    "Nine",
  ];
  console.log(words[num] || "Invalid input");
}

// 6. Read a Number and Display the week day
function getWeekDay(num) {
  const days = [
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
  ];
  console.log(days[num - 1] || "Invalid input");
}

// 7. Read a Number 1, 10, 100, etc., and display unit, ten, hundred...
function displayPlaceValue(num) {
  const placeValues = {
    1: "Unit",
    10: "Ten",
    100: "Hundred",
    1000: "Thousand",
  };
  console.log(placeValues[num] || "Invalid input");
}

// 8. Perform arithmetic operations and find max and min
function arithmeticOperations(a, b, c) {
  let results = [a + b * c, c + a / b, (a % b) + c, a * b + c];
  console.log("Max:", Math.max(...results), "Min:", Math.min(...results));
}

// 9. Number to word using case
function numberToWordCase(num) {
  switch (num) {
    case 0:
      console.log("Zero");
      break;
    case 1:
      console.log("One");
      break;
    case 2:
      console.log("Two");
      break;
    case 3:
      console.log("Three");
      break;
    case 4:
      console.log("Four");
      break;
    case 5:
      console.log("Five");
      break;
    case 6:
      console.log("Six");
      break;
    case 7:
      console.log("Seven");
      break;
    case 8:
      console.log("Eight");
      break;
    case 9:
      console.log("Nine");
      break;
    default:
      console.log("Invalid input");
  }
}

// 10. Unit conversion
function unitConversion(value, from, to) {
  const conversionRates = {
    "feet-inch": 12,
    "inch-feet": 1 / 12,
    "feet-meter": 0.3048,
    "meter-feet": 3.28084,
  };
  console.log(value * (conversionRates[`${from}-${to}`] || 1));
}

// 11. Table of powers of 2
function powerOfTwo(n) {
  for (let i = 0; i <= n; i++) {
    console.log(`2^${i} =`, Math.pow(2, i));
  }
}

// 12. Find nth harmonic number
function harmonicNumber(n) {
  let sum = 0;
  for (let i = 1; i <= n; i++) {
    sum += 1 / i;
  }
  console.log(sum);
}

// 13. Check if a number is prime
function isPrime(num) {
  if (num < 2) return false;
  for (let i = 2; i * i <= num; i++) {
    if (num % i === 0) return false;
  }
  return true;
}

// 14. Prime numbers in a range
function primeNumbersInRange(start, end) {
  for (let i = start; i <= end; i++) {
    if (isPrime(i)) console.log(i);
  }
}

// 15. Compute factorial
function factorial(n) {
  return n === 0 ? 1 : n * factorial(n - 1);
}

// 16. Prime factorization
function primeFactors(n) {
  let i = 2;
  while (i * i <= n) {
    while (n % i === 0) {
      console.log(i);
      n /= i;
    }
    i++;
  }
  if (n > 1) console.log(n);
}

// 17. Find magic number (binary search-like approach)
function findMagicNumber(n) {
  let low = 1,
    high = 100;
  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (mid === n) {
      console.log("Magic Number Found:", mid);
      return;
    } else if (mid < n) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
}

// 18. Flip coin till either heads or tails wins 11 times
function flipCoinTillEleven() {
  let heads = 0,
    tails = 0;
  while (heads < 11 && tails < 11) {
    Math.random() < 0.5 ? heads++ : tails++;
  }
  console.log(heads === 11 ? "Heads wins!" : "Tails wins!");
}

// 19. Gambler game
function gambler() {
  let money = 100,
    goal = 200,
    bets = 0,
    wins = 0;
  while (money > 0 && money < goal) {
    bets++;
    if (Math.random() < 0.5) {
      money++;
      wins++;
    } else {
      money--;
    }
  }
  console.log("Bets:", bets, "Wins:", wins);
}

gambler();

// 1. Temperature Conversion using Case Statement
function temperatureConversion(choice, temp) {
  switch (choice) {
    case "CtoF":
      if (temp >= 0 && temp <= 100) {
        console.log(`${temp}°C = ${((temp * 9) / 5 + 32).toFixed(2)}°F`);
      } else {
        console.log("Temperature out of range");
      }
      break;
    case "FtoC":
      if (temp >= 32 && temp <= 212) {
        console.log(`${temp}°F = ${(((temp - 32) * 5) / 9).toFixed(2)}°C`);
      } else {
        console.log("Temperature out of range");
      }
      break;
    default:
      console.log("Invalid choice");
  }
}

// 2. Check if two numbers are palindromes
function isPalindrome(num) {
  let strNum = num.toString();
  return strNum === strNum.split("").reverse().join("");
}

// 3. Check if a number is prime
function isPrime(num) {
  if (num < 2) return false;
  for (let i = 2; i * i <= num; i++) {
    if (num % i === 0) return false;
  }
  return true;
}

// 3b. Check if a prime number's palindrome is also prime
function checkPrimePalindrome(num) {
  if (isPrime(num)) {
    let reversed = parseInt(num.toString().split("").reverse().join(""));
    console.log(`Palindrome of ${num} is ${reversed}`);
    console.log(
      isPrime(reversed) ? "Palindrome is also prime" : "Palindrome is not prime"
    );
  } else {
    console.log("Number is not prime");
  }
}
