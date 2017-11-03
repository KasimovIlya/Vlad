import java.util.concurrent.ThreadLocalRandom;

public class ArrayTools {
// рандомное число

    public static int random_int(int range) {
        range = Math.abs(range);
        int randomNum = ThreadLocalRandom.current().nextInt(-range, range + 1);
        return randomNum;
    }

// нужен для рандомного заполнения массива
    public static class fill {

        public static void random(int[] list, int range) {
            for (int i = 0; i < list.length; i++) {
                list[i] = random_int(range);
            }
        }

        public static void from_input(int[] list) {
            System.out.println("Вводите массив из "+ list.length +" чисел");

            for (int i = 0; i < list.length; i++)
                list[i] = Input.getInt("Введите "+ i +" элемент массива");
        }
    }
// печать

    public static void print(int[] list) {
        for (int i: list) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void fill_manually_or_random(int[] list) {
        Boolean use_random = Input.getBool("Заполнить массив случайными числами");
        if (use_random) {
            fill.random(list, 1000);
            print(list);
        }
        else {
            fill.from_input(list);
        }
    }
}
