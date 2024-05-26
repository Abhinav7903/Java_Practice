

public class UglyNumber {
    public static boolean isUgly(int num) {
        if (num <= 0)
            return false;
        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;
        return num == 1;
    }

    public static void main(String[] args) {
        int num = 14;
        if (isUgly(num))
            System.out.println(num + " is an ugly number");
        else
            System.out.println(num + " is not an ugly number");
    }
}
