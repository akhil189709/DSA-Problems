class Solution {
  public int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    int ind = n - 1;
    int r = n - 1;
    int l = 0;

    while (l <= r) {
      int squareOfRight = nums[r] * nums[r];
      int squareOfLeft = nums[l] * nums[l];
      if (squareOfRight > squareOfLeft) {
        res[ind] = squareOfRight;
        r--;
      } else {
        res[ind] = squareOfLeft;
        l++;
      }
      ind--;
    }
    return res;

  }
}