package interview.leetcode;

public class LowerCaseString {

    public static void main(String[] args) {

        String result = toLowerCase("KoT");
        String result2 = toLowerCaseASCII("KKot");
        System.out.println(result);
        System.out.println(result2);
    }

    private static String toLowerCase(String string) {
        StringBuilder result = new StringBuilder();

        for(char c: string.toCharArray()){
            if(Character.isUpperCase(c)) {
                char toLower = Character.toLowerCase(c);
                result.append(toLower);
            } else {
                result.append(c);
            }

        }
        return result.toString();

    }

    private static String toLowerCaseASCII(String string) {
        StringBuilder result = new StringBuilder();

        for(char c: string.toCharArray()){
            if(Character.isUpperCase(c)) {

                result.append((char)(c + 32));
            } else {
                result.append(c);
            }

        }

        return result.toString();
    }
}
