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

        //Задание 2
        System.out.println("========== Задание 2 ==========");
        //Поиск минимального значения
        int min = 200_000; // Выбрано 200_00 т.к. массив содержит числа от 100_000 до 200_000
        for (int i = 0; i < arrBuh.length; i++) {
            if (min > arrBuh[i]){
                min = arrBuh[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей \n", min);
        //Поиск максимального значения
        int max = 100_000; // Выбрано 100_00 т.к. массив содержит числа от 100_000 до 200_000
        for (int i = 0; i < arrBuh.length; i++) {
            if (max < arrBuh[i]){
                max = arrBuh[i];
            }
        }
        System.out.printf("Максимальная сумма трат за день составила %s рублей \n", max);

        //Задание 3
        System.out.println("========== Задание 3 ==========");
        double  average = 0;
        for (int i = 0; i < arrBuh.length; i++) {
            average += arrBuh[i];
        }
        average = average / arrBuh.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей \n", average);
    }
}