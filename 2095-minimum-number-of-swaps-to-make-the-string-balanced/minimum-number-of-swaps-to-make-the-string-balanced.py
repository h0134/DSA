class Solution:
    def minSwaps(self, s: str) -> int:
        balance = 0
        min_balance = 0
        for char in s:
            if char == '[':
                balance += 1
            else:
                balance -= 1
            min_balance = min(min_balance, balance)

        ans = -min_balance
        return (ans + 1) // 2
        