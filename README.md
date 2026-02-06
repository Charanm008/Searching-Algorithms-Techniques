# Searching-Algorithms-Techniques
A comprehensive collection of searching algorithms implemented in Java, covering fundamental and advanced techniques used in data science and computer science applications.

| Algorithm                 | Description                                                             | Best Case | Average Case     | Worst Case   |
| ------------------------- | ----------------------------------------------------------------------- | --------- | ---------------- | ------------ |
| **Linear Search**         | Checks each element one by one until the target is found or array ends  | **O(1)**  | **O(n)**         | **O(n)**     |
| **Binary Search**         | Divides a **sorted array** into halves repeatedly to find the element   | **O(1)**  | **O(log n)**     | **O(log n)** |
| **Uniform Binary Search** | Binary search with **precomputed mid positions** to reduce comparisons  | **O(1)**  | **O(log n)**     | **O(log n)** |
| **Fibonacci Search**      | Uses **Fibonacci numbers** to divide the array instead of mid           | **O(1)**  | **O(log n)**     | **O(log n)** |
| **Interpolation Search**  | Estimates position based on **value distribution** (like a number line) | **O(1)**  | **O(log log n)** | **O(n)**     |

If a search algorithm does not use recursion or extra arrays → Space Complexity is O(1)

#🔹 Linear Search:-
Goes left → right,
No sorting needed,
Best for small or unsorted data
📍 Example: Searching a name in a short list

#🔹 Binary Search:-
Requires sorted array,
Cuts search space into half,
Very fast for large data
📍 Used in databases, libraries, APIs

#🔹 Uniform Binary Search:-
Optimized binary search,
Avoids repeated mid calculation,
Rarely used but interview relevant
📍 Mostly theoretical / embedded systems

#🔹 Fibonacci Search:-
Uses Fibonacci sequence instead of mid,
Works well when memory access is expensive,
Similar speed to binary search
📍 Used in systems with slow memory access

#🔹 Interpolation Search:-
Predicts where the element should be,
Extremely fast when data is uniformly distributed,
Can degrade badly for uneven data
📍 Phone directories, large numeric datasets

| Situation              | Best Algorithm       |
| ---------------------- | -------------------- |
| Unsorted array         | Linear Search        |
| Sorted array           | Binary Search        |
| Uniform data           | Interpolation Search |
| Large data, low memory | Fibonacci Search     |

