// class Solution {
//     public String generateTag(String caption) {
//         StringBuilder sb = new StringBuilder();
//         sb.append('#');
//         int left=0;
//         int right=caption.length();
//         while(left<right){
//             if(sb.length()==100){
//                 break;
//             }
//             if(left==0){
//                 char c=Character.toLowerCase(caption.charAt(left));
//                 sb.append(c);
//                 left++;
//             }
//             if(caption.charAt(left)==' '){
//                 left++;
//                 char c=Character.toUpperCase(caption.charAt(left));
//                 sb.append(c);
//             }else{
//                 sb.append(caption.charAt(left));
//             }   
//             left++; 
//         }
//         return sb.toString();
//     }
// }
class Solution {
    public String generateTag(String caption) {
        StringBuilder sb = new StringBuilder("#");
        boolean newWord = false;

        for (int i = 0; i < caption.length() && sb.length() < 100; i++) {
            char ch = caption.charAt(i);

            if (ch == ' ') {
                newWord = true;
                continue;
            }

            if (!Character.isLetter(ch)) {
                continue;
            }

            if (sb.length() == 1) {   // first word
                sb.append(Character.toLowerCase(ch));
                newWord = false;
            } else if (newWord) {
                sb.append(Character.toUpperCase(ch));
                newWord = false;
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }

        return sb.length() > 100 ? sb.substring(0, 100) : sb.toString();
    }
}