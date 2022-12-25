

### 19. Pow(x, n)


descriptions :
Implement pow(x, n), which calculates x raised to the power n (xn).
Example 1:
Input: 2.00000, 10
Output: 1024.00000
Example 2:
Input: 2.10000, 3
Output: 9.26100
Example 3:
Input: 2.00000, -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
Note:
-100.0 < x < 100.0
n is a 32-bit signed integer, within the range [−231, 231 − 1]

_________________
Discussion
Binary Exponentiation: given a positive power n, e.g., n = 22 (binary: 10110) = 16 (binary:
10000) + 4 (binary: 100)+ 2 (binary: 10), then pow(x, n) = x^n = x^22 = x^(16 + 4 +
2) = x^16 * x^4 * x^2. For negative powers, we just flip the sign first, and once we calculate the
value and return its reciprocal.
Time complexity: O(n);
Space complexity: O(1).