public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        System.out.println("Максимальная сумма трат за день составила " +  maxPay + " рублей.");
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
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}