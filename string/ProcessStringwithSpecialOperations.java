class ProcessStringwithSpecialOperations {

    public static void main(String[] args) {
        String s = s = "a#b%*";
        System.out.println(processStr(s));

    }

    public static String processStr(String s) {
        StringBuffer sb = new StringBuffer();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else if (ch == '#') {
                sb.append(sb.toString());
            } else if (ch == '%') {
                sb.reverse();
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}