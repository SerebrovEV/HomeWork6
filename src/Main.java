import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static final int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        int summSalary = 0;
        int[] ints = generateRandomArray();
        for (int i = 0; i < ints.length; i++) {
            summSalary = summSalary + ints[i];
            // System.out.println(ints[i]);
        }
        System.out.println("Сумма трат за месяц составила " + summSalary + " рублей.");
    }

    private static void task2() {
        int maxPay = 0;
        int[] ints = generateRandomArray();
        for (int i = 0; i < ints.length; i++) {
            if (maxPay < ints[i]) {
                maxPay = ints[i];
            }
            // System.out.println(i + " Выплата в месяц " + ints[i]);
            // System.out.println(i + " Выплата макс " + maxPay);
        }
        int minPay = maxPay;
        for (int i = 0; i < ints.length; i++) {
            if (minPay > ints[i]) {
                minPay = ints[i];
            }
            // System.out.println(i + " Выплата в месяц " + ints[i]);
            // System.out.println(i + " Выплата мин " + minPay);
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxPay + " рублей.");
    }

    private static void task3() {
        int summSalary = 0;
        int[] ints = generateRandomArray();
        for (int i = 0; i < ints.length; i++) {
            summSalary = summSalary + ints[i];
        }
        // System.out.println(summSalary);
        float mediumPay = (float) summSalary / ints.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumPay + " рублей.");
    }

    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    private static void task5() {
        // Создайте матрицу 3х3 (двумерный массив типа int).
        // Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
        // Постарайтесь заполнить обе диагонали в одном цикле.

        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
        for (int[] row : matrix) {

            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task6() {
       /* У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        Нам дан массив чисел: {5, 4, 3, 2, 1}
        Необходимо привести его к виду: {1, 2, 3, 4, 5}
         Решите задачу с использованием дополнительного массива.
        Напечатайте массив до преобразования и после с помощью */
        int [] arr = {5, 4, 3, 2, 1};
        int [] revArr = new int[5];
        System.out.println(Arrays.toString(arr));
        for (int i = revArr.length - 1; i >= 0; i--) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(revArr));

    }
    private static void task7() {
        int [] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >=0 ; i--) {
            if (i == 0 && )
            System.out.print(arr[i] + " ");
        }
    }
}