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

| # | Problem | Java Approach | Difficulty |
|---:|---|---|---|
| 1 | Perfect Number | Sum proper divisors up to `√n` and compare with `n` | 🟢 Easy |
| 2 | Armstrong Number | Calculate `Math.pow(digit, digitCount)` for every digit | 🟢 Easy |
| 3 | Strong Number | Calculate factorial of each digit and compare the sum with `n` | 🟢 Easy |
| 4 | Automorphic Number | Check whether the square of a number ends with the number itself | 🟢 Easy |
| 5 | Harshad Number | Check whether `n % digitSum == 0` | 🟢 Easy |
| 6 | Kaprekar Number | Split the square into parts and check whether their sum equals `n` | 🟡 Medium |
| 7 | Disarium Number | Check whether the sum of powered digits equals the original number | 🟡 Medium |
| 8 | Happy Number | Repeatedly sum squared digits and detect whether the process reaches `1` | 🟡 Medium |
| 9 | Smith Number | Compare the digit sum of the number with the digit sum of its prime factors | 🟡 Medium |
| 10 | Keith Number | Generate the Keith sequence and check whether the number reappears | 🔴 Hard |

# 2. More Number Properties

| # | Problem | Java Approach | Difficulty |
|---:|---|---|---|
| 11 | Neon Number | Calculate digit sum of `n * n` and compare with `n` | 🟢 Easy |
| 12 | Spy Number | Compare the sum and product of digits | 🟢 Easy |
| 13 | Duck Number | Convert to String and check whether it contains `0` after the first digit | 🟢 Easy |
| 14 | Sunny Number | Check whether `n + 1` is a perfect square | 🟢 Easy |
| 15 | Pronic Number | Check whether the number is the product of two consecutive integers | 🟢 Easy |
| 16 | Palindrome Number | Check whether a number reads the same forward and backward | 🟢 Easy |
| 17 | Reverse a Number | Reverse the digits of a given number without using String methods | 🟢 Easy |
| 18 | Digital Root | Repeatedly calculate the sum of digits until a single digit remains | 🟢 Easy |
| 19 | GCD of Two Numbers | Find the greatest common divisor of two numbers using Euclid's algorithm | 🟢 Easy |
| 20 | LCM of Two Numbers | Find the least common multiple of two numbers using GCD | 🟢 Easy |

# 3. Prime and Divisor Theory

| # | Problem | Java Approach | Difficulty |
|---:|---|---|---|
| 21 | Prime Factorization | Find all prime factors of a given number using trial division | 🟢 Easy |
| 22 | Number of Divisors | Count divisor pairs up to `√n` | 🟢 Easy |
| 23 | Sum of Divisors | Calculate the sum of all positive divisors of a number | 🟢 Easy |
| 24 | Sieve of Eratosthenes | Find all prime numbers up to `N` using the Sieve algorithm | 🟡 Medium |
| 25 | Segmented Sieve | Find prime numbers within a large range `[L, R]` | 🔴 Hard |
| 26 | Twin Primes | Find all pairs of prime numbers differing by 2 in a given range | 🟡 Medium |
| 27 | Goldbach Pairs | Find pairs of prime numbers whose sum equals a given even number | 🟡 Medium |
| 28 | Kth Prime | Find the Kth prime number efficiently | 🟡 Medium |
| 29 | Prime Gap | Find the largest gap between consecutive primes up to `N` | 🟡 Medium |
| 30 | Fast Exponentiation | Calculate `a^b` efficiently using exponentiation by squaring | 🟡 Medium |

# 4. Modular Arithmetic and Number Theory

| # | Problem | Java Approach | Difficulty |
|---:|---|---|---|
| 31 | Modular Exponentiation | Calculate `(a^b) % m` efficiently for large values | 🟡 Medium |
| 32 | Extended Euclidean Algorithm | Find `X` and `Y` satisfying `AX + BY = GCD(A,B)` | 🟡 Medium |
| 33 | Modular Inverse | Find the multiplicative inverse of `A` modulo `M` | 🟡 Medium |
| 34 | Euler Totient Function | Calculate the number of integers less than `N` that are coprime with `N` | 🟡 Medium |
| 35 | Chinese Remainder Theorem | Solve a system of modular congruences | 🔴 Hard |
| 36 | Trailing Zeros in Factorial | Count the trailing zeros in `N!` without calculating the factorial | 🟡 Medium |
| 37 | Last Non-Zero Digit of Factorial | Find the last non-zero digit of `N!` | 🔴 Hard |
| 38 | Binomial Coefficient | Calculate `C(N,K)` efficiently | 🟡 Medium |
| 39 | Catalan Number | Calculate the Nth Catalan number | 🟡 Medium |
| 40 | Fibonacci Matrix Exponentiation | Find the Nth Fibonacci number in `O(log N)` time | 🔴 Hard |

# 5. Huge Number Operations

| # | Problem | Java Approach | Difficulty |
|---:|---|---|---|
| 41 | Huge Number Addition | Add two numbers containing thousands of digits without `BigInteger` | 🟡 Medium |
| 42 | Huge Number Multiplication | Multiply two arbitrarily large numbers without `BigInteger` | 🔴 Hard |
| 43 | Huge Number Division | Divide two very large numbers represented as Strings | 🔴 Hard |
| 44 | Huge Number Palindrome | Check whether a very large number is a palindrome | 🟢 Easy |
| 45 | Huge Number Reverse | Reverse an arbitrarily large number represented as a String | 🟢 Easy |
| 46 | Next Greater Number | Find the smallest greater number using exactly the same digits | 🟡 Medium |
| 47 | Unique Digit Numbers | Count numbers from 1 to `N` that contain no repeated digits | 🔴 Hard |
| 48 | Count Digit Occurrences | Count how many times a particular digit occurs from 1 to `N` | 🟡 Medium |
| 49 | Sum of Digits in Range | Find the total sum of digits of all numbers from `L` to `R` | 🟡 Medium |
| 50 | Digit DP | Count numbers satisfying digit-based conditions using Digit DP | 🔴 Hard |

---

## Java Concepts Used

Throughout these 50 projects, you will practice:

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

Master **Java programming**, **number theory**, **mathematical algorithms**, **problem-solving techniques**, and **competitive programming concepts** by solving these 50 carefully selected projects.

Start from simple number-property checks and gradually progress toward advanced topics such as:

**Prime Theory → Modular Arithmetic → Huge Number Operations → Dynamic Programming → Matrix Exponentiation → Digit DP**

