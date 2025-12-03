# Programming Test – Java Solutions

This repository contains solutions for 4 simple programming problems implemented in **Java**.

## Language
- **Language Used:** Java (JDK 8+)
- All programs are console-based and can be compiled and run using `javac` and `java`.

## Files

1. `Program1.java`  
   - Problem-1: Calculator using a class.
   - Inputs: `a` (double), `b` (double), `operation` (String: add, sub, mul, div or + - * /).
   - Outputs: Result of the operation.

2. `Program2.java`  
   - Problem-2: With input `a`, prints the first `a` odd numbers.
   - Example: a = 4 → 1, 3, 5, 7

3. `Program3.java`  
   - Problem-3: With input `a`, prints odd number series based on rules:
     - If `a` is odd → prints first `a` odd numbers.
     - If `a` is even → prints first `a - 1` odd numbers.

4. `Program4.java`  
   - Problem-4: Given a fixed list `[1,2,8,9,12,46,76,82,15,20,30]`, it counts how many numbers are multiples of each number from 1 to 9.
   - Output format:
     `{1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}`

## How to Compile and Run

```bash
# Compile
javac Program1.java Program2.java Program3.java Program4.java

# Run each program
java Program1
java Program2
java Program3
java Program4
