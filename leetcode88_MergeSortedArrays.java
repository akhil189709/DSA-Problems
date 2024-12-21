class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] combinedArray = new int[n + m];
    for (int i = 0; i < m; i++)
      combinedArray[i] = nums1[i];
    for (int j = 0; j < n; j++)
      combinedArray[m + j] = nums2[j];
    for (int i = 0; i < combinedArray.length; i++)
      nums1[i] = combinedArray[i];
    Arrays.sort(nums1);
  }
}
