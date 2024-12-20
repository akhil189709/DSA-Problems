class Solution {
  public List<List<Integer>> finalAns = new ArrayList<>();

  public void Helper(int[] candidates, int target, int index, List<Integer> lst) {
    if (target == 0) {
      finalAns.add(new ArrayList<>(lst));
      return;
    }
    if (index == candidates.length || target < 0) {
      return;
    }

    // donot pick the current element
    Helper(candidates, target, index + 1, lst);

    // pick the element multiple times or more than once
    lst.add(candidates[index]);
    Helper(candidates, target - candidates[index], index, lst);
    lst.remove(lst.size() - 1);
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Helper(candidates, target, 0, new ArrayList<>());
    return finalAns;

  }
}