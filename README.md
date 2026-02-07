# Searching-Algorithms-Techniques
A comprehensive collection of searching algorithms implemented in Java, covering fundamental and advanced techniques used in data science and computer science applications.

### 📂 Algorithms Covered

Linear Search

Binary Search

Uniform Binary Search

Fibonacci Search

Interpolation Search


| Algorithm                 | Description                                                             | Best Case | Average Case     | Worst Case   |
| ------------------------- | ----------------------------------------------------------------------- | --------- | ---------------- | ------------ |
| **Linear Search**         | Checks each element one by one until the target is found or array ends  | **O(1)**  | **O(n)**         | **O(n)**     |
| **Binary Search**         | Divides a **sorted array** into halves repeatedly to find the element   | **O(1)**  | **O(log n)**     | **O(log n)** |
| **Uniform Binary Search** | Binary search with **precomputed mid positions** to reduce comparisons  | **O(1)**  | **O(log n)**     | **O(log n)** |
| **Fibonacci Search**      | Uses **Fibonacci numbers** to divide the array instead of mid           | **O(1)**  | **O(log n)**     | **O(log n)** |
| **Interpolation Search**  | Estimates position based on **value distribution** (like a number line) | **O(1)**  | **O(log log n)** | **O(n)**     |

If a search algorithm does not use recursion or extra arrays → Space Complexity is O(1)

## 1️⃣ Linear Search:

Linear Search checks each element one by one until the target value is found or the list ends.

#### ⚙️ How It Works:
Start from index 0
Compare each element with the target
Stop when found or array ends

#### ✅ Best Used When: 
Small datasets
Unsorted arrays

#### 🖼 Screenshot:
<img width="447" height="78" alt="image" src="https://github.com/user-attachments/assets/48b32ee3-3f06-494a-bbc2-8f3f5b832b3a" />


## 2️⃣ Binary Search

Binary Search works on sorted arrays by repeatedly dividing the search space in half.

#### ⚙️ How It Works
Find the middle element
If target < middle → search left
If target > middle → search right

#### ✅ Best Used When
Large datasets
Sorted data

#### 🖼 Screenshot
<img width="443" height="81" alt="image" src="https://github.com/user-attachments/assets/7303d3b6-c358-4b23-ab24-33e9fe9b97bf" />


## 3️⃣ Uniform Binary Search

Uniform Binary Search is a variation of Binary Search that uses fixed step sizes instead of recalculating mid every time.

#### ⚙️ How It Works
Pre-calculate jump steps
Move left or right uniformly
Reduce computation overhead

#### ✅ Best Used When
Systems where division operations are expensive

#### 🖼 Screenshot
<img width="443" height="77" alt="image" src="https://github.com/user-attachments/assets/783fe645-3242-4832-9635-81fdfa61a8bb" />


## 4️⃣ Fibonacci Search

Fibonacci Search divides the array using Fibonacci numbers instead of midpoints.

#### ⚙️ How It Works
Find smallest Fibonacci number ≥ array size
Compare element at Fibonacci offset
Reduce range using Fibonacci sequence

#### ✅ Best Used When
Large sorted datasets
Memory access optimization

#### 🖼 Screenshot
<img width="432" height="80" alt="image" src="https://github.com/user-attachments/assets/61150250-9143-46eb-9537-8a068e61cb94" />

## 5️⃣ Interpolation Search

Interpolation Search improves Binary Search by estimating the likely position of the target value.

#### ⚙️ How It Works
Calculates probable index using value distribution
Works best when data is uniformly distributed

#### ✅ Best Used When
Sorted & uniformly distributed datasets

#### 🖼 Screenshot
<img width="447" height="77" alt="image" src="https://github.com/user-attachments/assets/c9927602-9e67-42b9-a0ba-8fd57f90c755" />


| Situation              | Best Algorithm       |
| ---------------------- | -------------------- |
| Unsorted array         | Linear Search        |
| Sorted array           | Binary Search        |
| Uniform data           | Interpolation Search |
| Large data, low memory | Fibonacci Search     |

### Clone the repository
git clone https://github.com/USERNAME/REPOSITORY_NAME.git

### Go into the project folder
cd REPOSITORY_NAME

#### Example:
[
git clone https://github.com/Charanm008/Searching-Algorithms-Techniques.git
cd Searching-Algorithms-Techniques
]
#### Running the file:
[
javac FileName.java
java FileName
]
