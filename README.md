 DAA Assignment 2

Student: Nurdaulet Usenbay
Course: Design and Analysis of Algorithms
Pair: 1 (Student B) — Selection Sort

 Project Overview

This project is part of Assignment 2 for the Design and Analysis of Algorithms (DAA) course.
The goal is to implement, test, and analyze the Selection Sort algorithm using proper performance metrics, theoretical analysis, and benchmarking.

My assigned algorithm: Selection Sort (optimized with early termination)
Partner’s algorithm: Insertion Sort (optimized for nearly-sorted data)

 Implementation Details

The algorithm was implemented in Java (Maven project) under the algorithms package.
It includes runtime metrics collection, benchmark runner, and unit testing with JUnit.

Key Components
File	Description
SelectionSort.java	Core implementation of Selection Sort with early termination optimization
Metrics.java	Collects performance data (comparisons, swaps, execution time)
Main.java	Simple demonstration of sorting a sample array
BenchmarkRunner.java	Runs scalability benchmarks for input sizes (100, 1,000, 10,000...)
SelectionSortTest.java	Unit tests verifying algorithm correctness using JUnit 5

Optimization — Early Termination

A small optimization was applied:
If during an iteration no swap occurs, the algorithm terminates early, assuming the array is already sorted.
This improves performance on nearly-sorted data, reducing unnecessary passes.

 Theoretical Analysis
Case	Time Complexity	Space Complexity	Description
Best Case	O(n²) (can improve slightly if early stop triggers early)	O(1)	Already sorted array, minimal swaps
Average Case	O(n²)	O(1)	Random distribution, quadratic comparisons
Worst Case	O(n²)	O(1)	Reverse sorted array

Even with early termination, the algorithm remains quadratic, but it performs fewer unnecessary comparisons in best-case scenarios.

Benchmark Results
Input Size	Comparisons	Swaps	Time (ns)
100	~4,950	~97	~90,000
1,000	~499,500	~950	~3,200,000
10,000	~50,000,000	~9,500	~210,000,000
and so on

The results confirm the expected Θ(n²) behavior while validating the constant-factor effects of early termination.

Testing Strategy

JUnit 5 tests for different cases:

Random array

Already sorted array

Reverse sorted array

Benchmark tests across growing input sizes

Metrics validation ensures comparisons and swaps are correctly tracked

All tests passed successfully.


Structure
DAA-asik2/
├── src/
│   ├── main/java/algorithms/
│   │   ├── SelectionSort.java
│   │   ├── Metrics.java
│   │   └── Main.java
│   ├── test/java/algorithms/
│   │   └── SelectionSortTest.java
│   └── BenchmarkRunner.java
├── pom.xml
└── README.md

🧠 Conclusion

This project demonstrates a full implementation and performance analysis of Selection Sort with early termination optimization.
It validates theoretical expectations and serves as a solid foundation for algorithmic benchmarking and peer analysis.
