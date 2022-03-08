package pageobjects;

public class Calculator {

    public static void main(String[] args) {

        print();

//        int sum = getSum(5, 10);
//        System.out.println(sum);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println("How are you feeling, Dasha?");
        }
    }



}
