// class Solution {
//     public int gcdOfOddEvenSums(int n) {
//         int oddsum=0;
//         int evensum=0;
//         int curreven=2;
//         int currodd=1;
//         for(int i = 1; i <= n; i++){
//             evensum+=curreven;
//             curreven+=2;
//             oddsum+=currodd;
//             currodd+=2;
//         }
//         return gcd(evensum, oddsum);
//     }
//     private int gcd(int a, int b){
//         while(b != 0){
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }

class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}