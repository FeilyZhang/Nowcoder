package tech.feily.nowcoder.offer;

public class Add {

    public static int add(int num1, int num2) {
        if (num2 > 0) {
            while (num2 > 0) {
                num1++;
                num2--;
            }
        } else if (num2 < 0) {
            while (num2 < 0) {
                num1--;
                num2++;
            }  
        }
        return num1;
    }
    
    public static void main(String[] args) {
        System.out.println(add(4, -7));
    }
}
