class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list=new ArrayList<>();
        for(String a : operations){
            if(a.equals("+")){
                int last = list.get(list.size() - 1);
                int secondlast = list.get(list.size() - 2);
                list.add(last + secondlast);
            }else if(a.equals("D")){
                list.add(2* list.get(list.size()-1));
            }else if(a.equals("C")){
                list.remove(list.size() - 1);
            }else{
                list.add(Integer.parseInt(a));
            }
        }
        int ans=0;
        for(int num:list){
            ans+=num;
        }
        return ans;
    }
}