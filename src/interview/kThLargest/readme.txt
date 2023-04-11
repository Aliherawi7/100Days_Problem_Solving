

### KthLargest


descriptions:
Design a class to find the k-th largest element in a stream
Note that it is the kth largest element in the sorted order,
not the kth distance element.

implement KthLargest class:
1: KthLargest (int k, int[] nums) initializes the object with the
integer k and the stream of integers nums.
2: in add(int value) appends the integer value to the stream and
returns the element in the stream.

Ex:
input: ["KthLargest","add", "add", "add", "add"]
[[3, [4,5,8,2]], [3],[5], [10], [9], [4]]
output:
[null, 4, ,5, 5, 8, 8]
