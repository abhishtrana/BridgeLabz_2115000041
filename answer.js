// 1. Generate 10 random 3-digit numbers and find 2nd largest and 2nd smallest without sorting
function findSecondLargestSmallest() {
  let numbers = Array.from(
    { length: 10 },
    () => Math.floor(Math.random() * 900) + 100
  );
  console.log("Generated Numbers:", numbers);

  let max = -Infinity,
    secondMax = -Infinity;
  let min = Infinity,
    secondMin = Infinity;

  for (let num of numbers) {
    if (num > max) {
      secondMax = max;
      max = num;
    } else if (num > secondMax && num !== max) {
      secondMax = num;
    }

    if (num < min) {
      secondMin = min;
      min = num;
    } else if (num < secondMin && num !== min) {
      secondMin = num;
    }
  }
  console.log("2nd Largest:", secondMax, "2nd Smallest:", secondMin);
}

// 2. Sorting the array and finding 2nd largest and 2nd smallest
function sortedSecondLargestSmallest() {
  let numbers = Array.from(
    { length: 10 },
    () => Math.floor(Math.random() * 900) + 100
  );
  numbers.sort((a, b) => a - b);
  console.log("Sorted Numbers:", numbers);
  console.log(
    "2nd Smallest:",
    numbers[1],
    "2nd Largest:",
    numbers[numbers.length - 2]
  );
}

// 3. Prime Factorization stored in an array
function primeFactors(n) {
  let factors = [];
  for (let i = 2; i <= n; i++) {
    while (n % i === 0) {
      factors.push(i);
      n /= i;
    }
  }
  console.log("Prime Factors:", factors);
}

// 4. Find three numbers whose sum is zero
function findTriplets(arr) {
  let triplets = [];
  for (let i = 0; i < arr.length - 2; i++) {
    for (let j = i + 1; j < arr.length - 1; j++) {
      for (let k = j + 1; k < arr.length; k++) {
        if (arr[i] + arr[j] + arr[k] === 0) {
          triplets.push([arr[i], arr[j], arr[k]]);
        }
      }
    }
  }
  console.log("Triplets with sum zero:", triplets);
}

// 5. Find numbers with repeated digits between 0-100
function findRepeatedDigits() {
  let repeated = [];
  for (let i = 10; i < 100; i++) {
    let str = i.toString();
    if (str[0] === str[1]) {
      repeated.push(i);
    }
  }
  console.log("Repeated digit numbers:", repeated);
}

// 6. Simulate a die roll and track occurrences until a number reaches 10 times
function rollDieGame() {
  let rolls = {};
  let maxRolls = 10;
  while (true) {
    let roll = Math.floor(Math.random() * 6) + 1;
    rolls[roll] = (rolls[roll] || 0) + 1;
    if (Object.values(rolls).some((count) => count === maxRolls)) break;
  }
  console.log("Die roll results:", rolls);
  console.log(
    "Max Rolled:",
    Object.keys(rolls).reduce((a, b) => (rolls[a] > rolls[b] ? a : b))
  );
  console.log(
    "Min Rolled:",
    Object.keys(rolls).reduce((a, b) => (rolls[a] < rolls[b] ? a : b))
  );
}

// 7. Generate 50 birth months and group by month
function birthMonthDistribution() {
  let months = {};
  for (let i = 0; i < 50; i++) {
    let month = Math.floor(Math.random() * 12) + 1;
    months[month] = (months[month] || 0) + 1;
  }
  console.log("Birth Month Distribution:", months);
}

// Run the functions
testNumber = Math.floor(Math.random() * 100) + 1;
findSecondLargestSmallest();
sortedSecondLargestSmallest();
primeFactors(testNumber);
findTriplets([-1, 0, 1, 2, -1, -4]);
findRepeatedDigits();
rollDieGame();
birthMonthDistribution();
