1) Show the contents of the array of integers 5 7 4 9 8 5 6 3 each time  insertion sort changes it while sorting the array into ascending order. You can draw diagrams or paste in screenshots from your implementation.

 

Initial Array: [5, 7, 4, 9, 8, 5, 6, 3]



Pass 1:
Start with the first element (5). Since it's the only element, it's already considered sorted.
Array: [5, 7, 4, 9, 8, 5, 6, 3]

Pass 2:
Compare 7 with 5 and swap if necessary to form a sorted subarray of length 2.
Array: [5, 7, 4, 9, 8, 5, 6, 3]

Pass 3:
Compare 4 with 7 (already sorted) and then 4 with 5. Swap 4 with 5.
Array: [4, 5, 7, 9, 8, 5, 6, 3]

Pass 4:
Compare 9 with the elements in the sorted subarray [4, 5, 7]. Insert 9 into its correct position.
Array: [4, 5, 7, 9, 8, 5, 6, 3]

Pass 5:
Compare 8 with the elements in the sorted subarray [4, 5, 7, 9]. Insert 8 into its correct position.
Array: [4, 5, 7, 8, 9, 5, 6, 3]

Pass 6:
Compare 5 with the elements in the sorted subarray [4, 5, 7, 8, 9]. Insert 5 into its correct position.
Array: [4, 5, 5, 7, 8, 9, 6, 3]

Pass 7:
Compare 6 with the elements in the sorted subarray [4, 5, 5, 7, 8, 9]. Insert 6 into its correct position.
Array: [4, 5, 5, 6, 7, 8, 9, 3]

Pass 8:
Compare 3 with the elements in the sorted subarray [4, 5, 5, 6, 7, 8, 9]. Insert 3 into its correct position.
Array: [3, 4, 5, 5, 6, 7, 8, 9]

Final Sorted Array: [3, 4, 5, 5, 6, 7, 8, 9]
