# Arrays in Java - Notes

An **Array** is a data structure that stores a collection 
of elements of the same type in contiguous memory locations.

## Key Concepts
- **Index:** Arrays are 0-indexed. First element at `0`, 
last at `size-1`.
- **Fixed Size:** Once created, size cannot be changed.
- **Memory:** Elements stored in sequential memory blocks.
- **Default Values:** int array defaults to `0`, boolean 
to `false`, String to `null`.

## Time Complexity
| Operation | Complexity |
|-----------|------------|
| Access / Update | O(1) |
| Linear Search | O(n) |
| Traversal | O(n) |

## Space Complexity
- **O(n)** — n elements store karne ke liye n memory blocks

## Syntax
````java
// Declaration & Initialization
int[] arr = new int[size];   // Approach 1
int[] arr = {1, 2, 3};       // Approach 2

// Access
arr[0] = 10;
System.out.println(arr[0]);
````