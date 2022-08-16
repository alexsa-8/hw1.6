public class Main {
    static int[] arr = generateRandomArray();

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
        System.out.println("\nЗадание 1");
        double sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Задание 2
        System.out.println("\nЗадание 2");
        int min = 200_000;
        int max = 100_000;
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        //Задание 3
        System.out.println("\nЗадание 3");
        double average;
        average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        //Задание 4
        System.out.println("\nЗадание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char a;
        int n = reverseFullName.length;
        for (int i = 0; i < n / 2; i++) {
            a = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = a;
        }
        for (char element:reverseFullName){
            System.out.print(element);
        }
    }
}