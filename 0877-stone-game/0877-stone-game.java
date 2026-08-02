class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int alice=0;
        int bob=0;
        return true;
        // return game(piles, 0, n - 1, alice, bob);
    }
    private boolean game(int piles[], int i, int j, int alice,int bob){
        while(i<j){
            if(piles[i]>piles[j]){
                alice += piles[i];
                i++;
            }else{
                alice+=piles[j];
                j--;
            }

            if(piles[i]>piles[j]){
                bob += piles[i];
                i++;
            }else{
                bob+=piles[j];
                j--;
            }
        }
        return alice>bob;
    }
}