class Solution {
  public List<List<Integer>> finalAns = new ArrayList<>();

  public void helper(int[] nums, int index, List<Integer> combinationFormedSoFar) {

    // base case
    if (index == nums.length) {
      finalAns.add(new ArrayList<>(combinationFormedSoFar));
      return;
    }
    // pick the element
    combinationFormedSoFar.add(nums[index]);
    helper(nums, index + 1, combinationFormedSoFar);
    combinationFormedSoFar.remove(combinationFormedSoFar.size() - 1);

    // donot pick the element
    helper(nums, index + 1, combinationFormedSoFar);
  }

  public List<List<Integer>> subsets(int[] nums) {
    helper(nums, 0, new ArrayList<>());
    return finalAns;
  }
}