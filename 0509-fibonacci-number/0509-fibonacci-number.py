class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        List = [0,1]
        if n == 0 or n == 1:
            return List[n]
        
        for i in range(2,n+1):
            List.append(List[i-1] + List[i-2])
        return List[n]


       


