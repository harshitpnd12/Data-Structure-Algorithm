public class SubsetSumProblem {
    public static void main(String[] args) {
        int arr[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        return subsetSum(0, arr, sum);
    }

    private static boolean subsetSum(int i, int arr[], int sum) {

        if (sum == 0)
            return true;

        if (i == arr.length)
            return false;

        boolean skip = subsetSum(i + 1, arr, sum);

        boolean pick = false;
        if (arr[i] <= sum) {
            pick = subsetSum(i + 1, arr, sum - arr[i]);
        }

        return pick || skip;
    }
}
