// Problem: 8. String to Integer (atoi)
// Approach:
// 1. Skip leading spaces
// 2. Handle sign
// 3. Convert digits while checking overflow
// Complexity: O(n)

class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        long ans = 0;
        int sign = 1;

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // 2. Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // 3. Convert digits
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            // Overflow check
            if (ans > Integer.MAX_VALUE / 10 ||
               (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return (int)(ans * sign);
    }
}
