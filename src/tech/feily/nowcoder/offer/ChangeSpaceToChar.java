package tech.feily.nowcoder.offer;

public class ChangeSpaceToChar {
    
    public static String replaceSpace(StringBuffer str) {
        char[] ch = str.toString().toCharArray();
        String result = "";
        for (char c : ch) {
            if (c == ' ') {
                result += "%20";
            } else {
                result += String.valueOf(c);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy.")));
        System.out.println(replaceSpace(new StringBuffer(" We Are Happy.")));
        System.out.println(replaceSpace(new StringBuffer(" We Are Happy. ")));
        System.out.println(replaceSpace(new StringBuffer(" We  Are Happy. ")));
    }
}
