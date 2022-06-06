package Cycle4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Set line of array");
        int line = input.nextInt();
        System.out.println("Set columns of array");
        int column =  input.nextInt();
        int twoArr[] [] = new int [line] [column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Insert elements in line ");
                twoArr[i][j] = input.nextInt();
            }

        }
        System.out.println(Arrays.toString(twoArr[0]));
        for (int b=0;b<twoArr[0].length;b++) {
            System.out.println(twoArr[0][b]*3);

        }


            }
        }



