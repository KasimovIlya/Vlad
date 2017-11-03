import java.util.Scanner;

public class Input {

    public static String getStr() {
        Scanner read = new Scanner(System.in);
        return read.nextLine();
    }

    public static String getStr(String alert) {
        System.out.print(alert);
        return getStr();
    }

    public static int getInt() {
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }



    public static int getInt(String alert) {
        System.out.println(alert);
        return getInt();
    }

    public static Boolean getBool() {
        int choice = getInt("0 for False, 1 for True");
        return (choice == 1);
    }


    public static Boolean getBool(String alert) {
        System.out.println(alert);
        return getBool();
    }

    public static int getPositiveInt(String alert) {
        int n = Input.getInt(alert);
        return n;
    }
}
