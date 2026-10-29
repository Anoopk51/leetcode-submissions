class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        # List = [0,1]
        if n == 0 or n == 1:
            # return List[n]
            return n
        prev1= 0
        prev2 = 1
        curr = prev1 + prev2
        for i in range(2,n+1):
            # List.append(List[i-1] + List[i-2])
            curr = prev1 + prev2
            prev1 = prev2
            prev2 = curr
        return curr



       


