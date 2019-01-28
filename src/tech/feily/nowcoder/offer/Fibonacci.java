package tech.feily.nowcoder.offer;

public class Fibonacci {

    /*
     * Implemented by array.
     * The advantage is that it is simple to implement, 
     * but it takes up a lot of unnecessary space.
     */
    public static int getNoByArray(int n) {
        int[] result = new int[n + 1];
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        result[1] = result[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
    
    /*
     * The method is implemented by three parameters.
     */
    public static int getNo(int n) {
        int index = 3;
        int result = 0;
        int preNumber = 1;
        int prePreNumber = 1;
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        while (index < n + 1) {
            result = preNumber + prePreNumber;
            prePreNumber = preNumber;
            preNumber = result;
            ++index;
        }
        return result;
        
    }
    
    /*
     * Recursive implementation.
     */
    public static int getNoByRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return getNoByRecursive(n - 1) + getNoByRecursive(n - 2);
    }
    
    public static void main(String[] args) {
        System.out.println(getNoByArray(0));
        System.out.println(getNoByArray(1));
        System.out.println(getNoByArray(2));
        System.out.println(getNoByArray(4));
        System.out.println("------");
        System.out.println(getNo(0));
        System.out.println(getNo(1));
        System.out.println(getNo(2));
        System.out.println(getNo(4));
        System.out.println("------");
        System.out.println(getNoByRecursive(0));
        System.out.println(getNoByRecursive(1));
        System.out.println(getNoByRecursive(2));
        System.out.println(getNoByRecursive(4));
    }
}
