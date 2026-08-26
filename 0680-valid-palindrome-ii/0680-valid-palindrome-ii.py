class Solution:
    def validPalindrome(self, s: str) -> bool:
        low = 0
        high = len(s) -1
        while(low <= high):

            if (s[low] != s[high]):

                result1 = s[:low] + s[low+1:]

                result2 = s[:high] + s[high+1:]

                return result1 == result1[::-1] or result2 == result2[::-1]
            low += 1
            high -= 1
        return True