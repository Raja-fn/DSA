class Solution {
    public boolean uniformArray(int[] nums1) {
        return canMakeAll(nums1, 0) || canMakeAll(nums1, 1);
    }
    private boolean canMakeAll(int[] nums1, int targetParity) {
        int minOdd = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num % 2 == 1) {
                minOdd = Math.min(minOdd, num);
            }
        }
        
        for (int num : nums1) {
            if (num % 2 == targetParity) {
                continue; 
            }
            if (!(minOdd < num)) {
                return false;
            }
        }
        
        return true;
    }
}