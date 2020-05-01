package Loops;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            System.out.println(i + " squared = " + (i*i));
        }

        for (int i=2; i<=6; i++) {
            System.out.println(i + " squared = " + (i*i));
        }

        for (int i = 1; i<10; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int x = 2;
        while (x<200){
            System.out.println(x + " ");
            x *= x;
        }
        System.out.println();
    }
    }