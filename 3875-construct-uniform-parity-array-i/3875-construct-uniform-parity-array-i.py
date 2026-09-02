class Solution:
    def uniformArray(self, nums1: list[int]) -> bool:
        countEven = 0
        countOdd = 0
        for i in nums1:
            if i%2 == 0:
                countEven += 1
            else:
                countOdd += 1
        if len(nums1)/2 <= countOdd:
            return True
        elif len(nums1)/2 <= countEven:
            return True
        else:
            return False

        