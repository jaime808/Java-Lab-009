public class StringPlayground {
    public static int countParentheses(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')'){
                count--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s1 = "((3 + 7) * 2)";
        String s2 = "((a + b) * (c - d))";
        String s3 = ")(())(";

        System.out.println("Count for s1: " + countParentheses(s1));
        System.out.println("Count for s2: " + countParentheses(s2));
        System.out.println("Count for s3: " + countParentheses(s3));
    }
}