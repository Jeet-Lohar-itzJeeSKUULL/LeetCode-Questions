class Solution(object):
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [0] * n

        # Prefix Product
        result[0] = 1
        for i in range(1,n):
            result[i] = result[i - 1] * nums[i - 1]
        
        # Suffix Product
        suffix = 1
        for i in range(n - 1, -1, -1):
            result[i] = result[i] * suffix
            suffix *= nums[i]
        
        return result