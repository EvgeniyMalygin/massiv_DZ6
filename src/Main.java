import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Задание 1
        System.out.println("========== Задание 1 ==========");
        int [] arrBuh = generateRandomArray();
        int summaMonth = 0;
        for (int i = 0; i < arrBuh.length; i++) {
            summaMonth += arrBuh[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей \n", summaMonth);


    }

}