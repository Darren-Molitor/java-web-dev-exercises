package exercises;
public class ArrayPractice_3_7_1 {
    public static void main(String[] args) {
        int[] numbers = {1,1,2,3,5,8};
        for (int num : numbers) {
            System.out.println(num);
        }
        for (int num : numbers) {
            if ((num % 2) == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}