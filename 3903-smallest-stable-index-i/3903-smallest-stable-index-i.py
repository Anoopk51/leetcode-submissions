class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        index = -1
        for i in range(0,len(nums)):
            instability = max(nums[:i+1])-min(nums[i:])
            if instability <= k:
                return i
        return index
          
        