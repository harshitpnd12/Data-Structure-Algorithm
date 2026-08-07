import java.util.*;

class Solution {

    private static final int[][] FACTOR = {
    {0,0,0,0}, // 0
    {0,0,0,0}, // 1
    {1,0,0,0}, // 2
    {0,1,0,0}, // 3
    {2,0,0,0}, // 4
    {0,0,1,0}, // 5
    {1,1,0,0}, // 6
    {0,0,0,1}, // 7
    {3,0,0,0}, // 8
    {0,2,0,0}  // 9
};

    public String smallestNumber(String num, long t) {

        int[] need = new int[4];
        int[] prime = {2,3,5,7};

        for (int i = 0; i < 4; i++) {
            while (t % prime[i] == 0) {
                need[i]++;
                t /= prime[i];
            }
        }

        if (t != 1) return "-1";

        Map<Integer,Integer> factorCount = compress(need);

        if (countDigits(factorCount) > num.length()) {
            return build(factorCount, num.length() + 1);
        }

        int[] prefix = new int[4];
        int firstZero = num.indexOf('0');
        if (firstZero == -1) {
            firstZero = num.length();
            addString(prefix, num);
            if (contains(prefix, need)) return num;
        } else {
            addString(prefix, num.substring(0, firstZero));
        }

        for (int i = num.length() - 1; i >= 0; i--) {

    if (i <= firstZero) {          // <-- changed from i < firstZero
        int d = num.charAt(i) - '0';
        remove(prefix, d);

        for (int nd = d + 1; nd <= 9; nd++) {
            if (nd == 0) continue;

            int[] remain = new int[4];
            for (int k = 0; k < 4; k++) {
                remain[k] = Math.max(0,
                        need[k] - prefix[k] - FACTOR[nd][k]);
            }

            Map<Integer,Integer> m = compress(remain);
            int req = countDigits(m);
            int space = num.length() - i - 1;

            if (req <= space) {
                StringBuilder ans = new StringBuilder();
                ans.append(num,0,i);
                ans.append((char)('0'+nd));

                for (int j = 0; j < space-req; j++)
                    ans.append('1');

                ans.append(buildDigits(m));
                return ans.toString();
            }
        }
    }
}

        return build(factorCount, num.length() + 1);
    }

    private void addString(int[] cnt,String s){
        for(char c:s.toCharArray()){
            int d=c-'0';
            add(cnt,d);
        }
    }

    private void add(int[] cnt,int d){
        for(int i=0;i<4;i++) cnt[i]+=FACTOR[d][i];
    }

    private void remove(int[] cnt,int d){
        for(int i=0;i<4;i++) cnt[i]-=FACTOR[d][i];
    }

    private boolean contains(int[] have,int[] need){
        for(int i=0;i<4;i++)
            if(have[i]<need[i]) return false;
        return true;
    }

    private Map<Integer,Integer> compress(int[] c){

        Map<Integer,Integer> res=new TreeMap<>();

        int c8=c[0]/3;
        int r2=c[0]%3;

        int c9=c[1]/2;
        int r3=c[1]%2;

        int c4=r2/2;
        int c2=r2%2;

        int c6=0;

        if(c2==1 && r3==1){
            c2=0;
            r3=0;
            c6=1;
        }

        if(r3==1 && c4==1){
            c2=1;
            c6=1;
            r3=0;
            c4=0;
        }

        if(c2>0) res.put(2,c2);
        if(r3>0) res.put(3,r3);
        if(c4>0) res.put(4,c4);
        if(c[2]>0) res.put(5,c[2]);
        if(c6>0) res.put(6,c6);
        if(c[3]>0) res.put(7,c[3]);
        if(c8>0) res.put(8,c8);
        if(c9>0) res.put(9,c9);

        return res;
    }

    private int countDigits(Map<Integer,Integer> map){
        int s=0;
        for(int v:map.values()) s+=v;
        return s;
    }

    private String buildDigits(Map<Integer,Integer> map){
        StringBuilder sb=new StringBuilder();
        for(int d=2;d<=9;d++){
            int k=map.getOrDefault(d,0);
            while(k-->0) sb.append((char)('0'+d));
        }
        return sb.toString();
    }

    private String build(Map<Integer,Integer> map,int len){
        String tail=buildDigits(map);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len-tail.length();i++) sb.append('1');
        sb.append(tail);
        return sb.toString();
    }
}