package lab5.mirea;

public class Solution {
    public static String task1(int k) {
        int total = 0;
        int num = 0;

        if (k == 1) {
            return "1";
        }

        else {
            for (int i = 1; total < k; i++) {
                total += i;
                num = i;
            }
            return task1(k - 1) + " " + num;
        }
    }

    public static String task2(int k) {

        if (k == 1){
            return "1";
        }

        else{
            return task2(k - 1) + " " + k;
        }
    }

    public static String task3(int a, int b) {

        if (a == b){
            return Integer.toString(a);
        }

        else if (a < b){
            return a + " " + task3(a + 1, b);
        }

        else{
            return a + " " + task3(a - 1, b);
        }

    }

    public static void main(String[] args) {
        System.out.println("Треугольная последовательность:");
        System.out.println(task1(13));
        System.out.println();

        System.out.println("От 1 до n:");
        System.out.println(task2(10));
        System.out.println();

        System.out.println("От A до B:");
        System.out.println(task3(5, 10));
        System.out.println();

        System.out.println("От B до A:");
        System.out.println(task3(10, 5));
        System.out.println();
    }
}

