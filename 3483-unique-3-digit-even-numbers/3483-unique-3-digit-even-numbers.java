class Solution {
    public int totalNumbers(int[] arr) {
        Set<Integer> set=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if (arr[i] == 0) continue;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(i==k || k==j) continue;
                    if (arr[k] % 2 != 0) continue;
                    int num=arr[i]*100+arr[j]*10+arr[k];
                    set.add(num);
                }
            }
        }
        return set.size();
    }
}