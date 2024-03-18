package interview.leetcode;

public class BackspaceStringCompare {

    public static void main(String[] args) {

        boolean result  = backspaceCompare("jana##", "jaja##");
        System.out.println(result);
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }

    private static boolean backspaceCompare(String str1, String str2) {
        String s1 = clearString(str1);
        String s2 = clearString(str2);

        System.out.println("s1: "+ s1);
        System.out.println("s2: "+ s2);

        return s1.equals(s2);
    }

    static String clearString(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (char c: str.toCharArray()){
            if(c == '#'){
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
