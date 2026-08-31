# 🔢 Number Theory & Mathematical Algorithms in Java

> A curated collection of 50 classic number theory, combinatorics, and algorithmic problems — from perfect numbers to segmented sieves. Built for coding interview preparation, competitive programming practice, Java programming mastery, and CS coursework.

<br>

# Java 50 Problems — Playlist

<p align="center">
  <a href="https://www.youtube.com/playlist?list=PLI5qSRER3Q8s">
    <img src="https://img.shields.io/badge/▶%20Watch%20Playlist-Java%2050%20Problems-red?style=for-the-badge&logo=youtube" alt="Watch Playlist">
  </a>
</p>

<br>

This repository works through 50 problems in seven stages: number-property checks, range-based generators, prime and divisor theory, factorials and combinatorics, the Fibonacci sequence, digit/root operations, and sieve algorithms.

Each problem includes a suggested approach and difficulty level. You will also explore less common number types such as Sunny, Spy, Duck, Neon, Fascinating, Emirp, Happy numbers, and more.

**Language:** Java
**Recommended Version:** Java 8 or above
**Dependencies:** None — Java Standard Library only
**Important Classes:** `Scanner`, `Math`, `BigInteger`, arrays, loops, and functions.

The folder layout and run commands below assume Java source files (`.java`). Each program can be compiled and executed using standard Java commands.

```bash
javac FileName.java
java FileName
```

---

## Number Classification Reference

Definitions for every number type used across the problem set below.

| Term                         | Definition                                                                                      | Example                        |
| ---------------------------- | ----------------------------------------------------------------------------------------------- | ------------------------------ |
| **Perfect**                  | Equal to the sum of its own proper divisors                                                     | `6` → 1+2+3 = 6                |
| **Strong**                   | Sum of the factorials of its digits equals the number                                           | `145` → 1!+4!+5! = 145         |
| **Armstrong (Narcissistic)** | Sum of its digits, each raised to the power of the digit count, equals the number               | `153` → 1³+5³+3³ = 153         |
| **Automorphic**              | Its square ends with the number itself                                                          | `25² = 625` (ends in 25)       |
| **Harshad (Niven)**          | Divisible by the sum of its own digits                                                          | `18` → digit sum 9, 18 ÷ 9 = 2 |
| **Neon**                     | The digit sum of its square equals the number itself                                            | `9` → 9² = 81 → 8+1 = 9        |
| **Sunny**                    | `n + 1` is a perfect square                                                                     | `3` → 3+1 = 4 = 2²             |
| **Spy**                      | Sum of its digits equals the product of its digits                                              | `123` → 1+2+3 = 6, 1×2×3 = 6   |
| **Duck**                     | Contains a `0` digit, but not as the leading digit                                              | `3021`                         |
| **Fascinating**              | For a 3+ digit number, concatenating `n`, `2n`, `3n` produces every digit from 1–9 exactly once | `192` → `192384576`            |
| **Prime**                    | Greater than 1 with no divisors other than 1 and itself                                         | `7`                            |
| **Twin Primes**              | A pair of prime numbers that differ by exactly 2                                                | `(11, 13)`                     |
| **Emirp**                    | A prime that becomes a different prime when its digits are reversed                             | `13` ↔ `31`                    |
| **Palindromic Prime**        | A prime that reads the same forwards and backwards                                              | `131`                          |
| **Happy**                    | Repeatedly summing the squares of its digits eventually reaches 1                               | `19` → 82 → 68 → 100 → 1       |
| **Abundant**                 | Sum of proper divisors exceeds the number                                                       | `12` → 1+2+3+4+6 = 16 > 12     |
| **Deficient**                | Sum of proper divisors is less than the number                                                  | `8` → 1+2+4 = 7 < 8            |
| **Fibonacci**                | Appears in the sequence where each term is the sum of the previous two terms                    | `0, 1, 1, 2, 3, 5, 8, 13…`     |

---

## Difficulty Legend

🟢 **Easy**
🟡 **Medium**
🔴 **Hard**

---

# 1. Number Property Checks

| #  | Problem                | Java Approach                                                             | Difficulty |
| -- | ---------------------- | ------------------------------------------------------------------------- | ---------- |
| 1  | Perfect Number         | Sum proper divisors up to `√n` and compare with `n`                       | 🟢 Easy    |
| 2  | Strong Number          | Calculate factorial of each digit and compare the sum with `n`            | 🟢 Easy    |
| 3  | Armstrong Number       | Calculate `Math.pow(digit, digitCount)` for every digit                   | 🟢 Easy    |
| 4  | Automorphic Number     | Check whether `String.valueOf(n * n)` ends with `String.valueOf(n)`       | 🟢 Easy    |
| 5  | Harshad (Niven) Number | Check whether `n % digitSum == 0`                                         | 🟢 Easy    |
| 6  | Neon Number            | Calculate digit sum of `n * n` and compare with `n`                       | 🟢 Easy    |
| 7  | Sunny Number           | Check whether `n + 1` is a perfect square                                 | 🟢 Easy    |
| 8  | Spy Number             | Compare the sum and product of digits                                     | 🟢 Easy    |
| 9  | Duck Number            | Convert to String and check whether it contains `0` after the first digit | 🟢 Easy    |
| 10 | Fascinating Number     | Concatenate `n`, `2n`, and `3n`, then verify digits `1–9`                 | 🟡 Medium  |

---

# 2. Range-Based Generators

| #  | Problem                       | Java Approach                                                | Difficulty |
| -- | ----------------------------- | ------------------------------------------------------------ | ---------- |
| 11 | Armstrong Numbers in a Range  | Apply the Armstrong check to every number in the range       | 🟢 Easy    |
| 12 | Perfect Numbers in a Range    | Apply the perfect-number method to every value               | 🟡 Medium  |
| 13 | Strong Numbers in a Range     | Check the factorial sum of digits for every number           | 🟢 Easy    |
| 14 | Prime Numbers in a Range      | Trial division for each number or use a sieve                | 🟢 Easy    |
| 15 | Twin Prime Pairs in a Range   | Find prime pairs where `p` and `p + 2` are prime             | 🟡 Medium  |
| 16 | Emirp Numbers in a Range      | Check prime, reverse the number, check prime again           | 🟡 Medium  |
| 17 | Palindromic Primes in a Range | Check whether the number is both prime and palindrome        | 🟡 Medium  |
| 18 | Happy Numbers in a Range      | Use a loop with a `HashSet` to detect cycles                 | 🟡 Medium  |
| 19 | Abundant Numbers in a Range   | Check whether the sum of proper divisors is greater than `n` | 🟢 Easy    |
| 20 | Deficient Numbers in a Range  | Check whether the sum of proper divisors is less than `n`    | 🟢 Easy    |

---

# 3. Prime and Divisor Theory

| #  | Problem                   | Java Approach                                                            | Difficulty |
| -- | ------------------------- | ------------------------------------------------------------------------ | ---------- |
| 21 | nth Prime Number          | Use the Sieve of Eratosthenes or incremental prime checking              | 🟡 Medium  |
| 22 | Largest Prime Factor      | Divide the number by possible factors and store the largest prime factor | 🟢 Easy    |
| 23 | Prime Factorization       | Trial division and store prime/exponent pairs                            | 🟢 Easy    |
| 24 | Count Total Divisors      | Count divisor pairs up to `√n`                                           | 🟢 Easy    |
| 25 | Sum of All Divisors       | Add divisor pairs while iterating up to `√n`                             | 🟢 Easy    |
| 26 | GCD (Euclidean Algorithm) | `gcd(a, b) = gcd(b, a % b)`                                              | 🟢 Easy    |
| 27 | LCM Using GCD             | `lcm(a, b) = Math.abs(a * b) / gcd(a, b)`                                | 🟢 Easy    |
| 28 | Euler's Totient φ(n)      | Reduce `n` using each distinct prime factor                              | 🟡 Medium  |
| 29 | Coprime Check             | Check whether `gcd(a, b) == 1`                                           | 🟢 Easy    |
| 30 | Modular Inverse           | Use the Extended Euclidean Algorithm or Fermat's Little Theorem          | 🟡 Medium  |
| 31 | `a^b mod m`               | Binary exponentiation with modulo operations                             | 🟡 Medium  |
| 32 | Binary Exponentiation     | Square-and-multiply algorithm in `O(log n)`                              | 🟡 Medium  |

---

# 4. Factorials and Combinatorics

| #  | Problem                                    | Java Approach                                             | Difficulty |
| -- | ------------------------------------------ | --------------------------------------------------------- | ---------- |
| 33 | Large Factorials (`100!`, `500!`, `1000!`) | Use `java.math.BigInteger`                                | 🟡 Medium  |
| 34 | Trailing Zeros in Factorial                | Count factors of 5 using `n/5 + n/25 + ...`               | 🟡 Medium  |
| 35 | Binomial Coefficient (nCr)                 | Use factorials with `BigInteger` or Pascal's Triangle DP  | 🟡 Medium  |
| 36 | Permutations (nPr)                         | Calculate `n! / (n-r)!` using `BigInteger` when required  | 🟢 Easy    |
| 37 | Pascal's Triangle                          | Use a 2D array or combinatorial formula                   | 🟢 Easy    |
| 38 | Catalan Numbers                            | Use `BigInteger` factorials or recurrence relation        | 🟡 Medium  |
| 39 | Bell Numbers                               | Build Bell Triangle using a 2D array                      | 🔴 Hard    |
| 40 | Stirling Numbers (Second Kind)             | Dynamic Programming: `S(n,k) = k × S(n-1,k) + S(n-1,k-1)` | 🔴 Hard    |

---

# 5. Fibonacci Sequence

| #  | Problem                               | Java Approach                                            | Difficulty |
| -- | ------------------------------------- | -------------------------------------------------------- | ---------- |
| 41 | Fibonacci Check                       | Check whether `5n² + 4` or `5n² − 4` is a perfect square | 🟢 Easy    |
| 42 | nth Fibonacci (DP)                    | Use iterative bottom-up computation in `O(n)`            | 🟢 Easy    |
| 43 | nth Fibonacci (Matrix Exponentiation) | Raise `[[1,1],[1,0]]` to the nth power in `O(log n)`     | 🔴 Hard    |
| 44 | Sum of Fibonacci Numbers in a Range   | Generate values and accumulate, or use `F(n+2) − 1`      | 🟡 Medium  |

---

# 6. Digit and Root Operations

| #  | Problem                                   | Java Approach                                           | Difficulty |
| -- | ----------------------------------------- | ------------------------------------------------------- | ---------- |
| 45 | Digital Root                              | Repeatedly calculate digit sum or use `1 + (n - 1) % 9` | 🟢 Easy    |
| 46 | Multiplicative Persistence                | Repeatedly multiply digits until a single digit remains | 🟢 Easy    |
| 47 | Integer Square Root Without `Math.sqrt()` | Use Binary Search to find `⌊√n⌋`                        | 🟡 Medium  |
| 48 | Cube Root Using Binary Search             | Binary search for `⌊∛n⌋`                                | 🟡 Medium  |

---

# 7. Sieve Algorithms

| #  | Problem               | Java Approach                                                          | Difficulty |
| -- | --------------------- | ---------------------------------------------------------------------- | ---------- |
| 49 | Sieve of Eratosthenes | Use a `boolean[]` array to mark multiples of prime numbers             | 🟡 Medium  |
| 50 | Segmented Sieve       | Generate small primes first, then process blocks of the required range | 🔴 Hard    |

---

# Java Concepts Used

Throughout these 50 problems, you will practice:

* Java Loops and Conditional Statements
* Methods and Functions
* Arrays and 2D Arrays
* Strings and String Manipulation
* `Math` Class
* `BigInteger`
* `ArrayList`
* `HashSet`
* Recursion
* Dynamic Programming
* Binary Search
* Matrix Exponentiation
* Prime Factorization
* Number Theory
* Modular Arithmetic
* Sieve Algorithms

---


## 🎯 Who Is This Repository For?

This collection is perfect for:

* Java Beginners
* Diploma and Engineering Students
* Computer Science Students
* Coding Interview Preparation
* Competitive Programming
* Data Structures and Algorithms Preparation
* Number Theory Practice
* Java Placement Preparation
* Developers looking to strengthen mathematical problem-solving skills

---

## 🚀 Goal

Master **Java programming**, **number theory**, **mathematical algorithms**, **problem-solving techniques**, and **competitive programming concepts** by solving these 50 carefully selected problems.

Start from simple number-property checks and gradually progress toward advanced topics such as:

**Prime Theory → Modular Arithmetic → Combinatorics → Dynamic Programming → Matrix Exponentiation → Segmented Sieve**
