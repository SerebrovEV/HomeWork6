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
        task8();
        task9();
    }

    private static final int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        int summSalary = 0;
        int[] ints = generateRandomArray();
        for (int i = 0; i <= ints.length - 1; i++) {
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
        int[] arr = {5, 4, 3, 2, 1};
        int[] revArr = new int[5];
        System.out.println(Arrays.toString(arr));
        for (int i = revArr.length - 1; i >= 0; i--) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(revArr));

    }

    private static void task7() {
        /* Решите предыдущее задание, но без использования дополнительного массива.
        Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        Выведите результат программы в консоль тем же способом.
        Уточнения: Это задание не на сортировку.
       Не использовать Arrays.sort() и другие способы сортировок.
        Числа в порядке убывания даны исключительно для указания направления чтения.
        Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
        Критерии оценки:
– Задание решено без применения дополнительного массива.
– В консоль выведен результат программы до преобразований массива.
– В консоль выведен результат программы после преобразований массива.
– Программа выводит корректный результат при смене значений внутри массива. */
        int[] arr = {5, 4, 3, 2, 1};
        int j = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 2; i++) {
            int a = arr[i];
            int b = arr[j];
            arr[i] = b;
            arr[j] = a;
            j--;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    private static void task8() {
       /* Задача, которая используется/бывает/встречается на собеседованиях.
        Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        Необходимо найти два числа, сумма которых равна −2.
        Напечатать эти числа в консоль.
                Подсказка
        Может потребоваться отсортировать массив с помощью Arrays.sort(arr).
                Критерии оценки
– Найдены два числа, удовлетворяющие условию задачи.
– При изменении значений массива в консоль выводится корректный результат.
– В консоль выведен результат решения задания. */

        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = -2;
        boolean result = false;
        for (int i = 0; i <= arr.length - 1 && !result; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Сумма " + arr[i] + " и " + arr[j] + " равна -2");
                    result = true;
                    break;
                }
            }
        }
    }

    private static void task9() {
        /* Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.
        Критерии оценки
– Найдены все пары чисел, удовлетворяющие условию задачи.
– При изменении значений массива в консоль выводится корректный результат.
– В консоль выведен результат решения задания. */
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = -2;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Сумма " + arr[i] + " и " + arr[j] + " равна -2");
                }
            }
        }
    }
}