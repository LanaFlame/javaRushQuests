package com.javarush.task.pro.task13.task1312;

import java.util.Scanner;
import java.util.Arrays;
class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder bigline = new StringBuilder();
        int counter = 0;
        while (sc.hasNext())
        {
            bigline.append(sc.nextLine()).append(" ");
            counter++;
        }
        String[] numbers = bigline.toString().split(" ");
        String[][] matrix = new String[counter][numbers.length/counter];
        int k=0;
        for (int i=0; i<counter; i++){
            for (int j=0 ; j<(numbers.length/counter); j++){
                matrix[i][j] = numbers[k];
                k++;
            }
        }
        int n = numbers.length/counter;
        int p = n-1;
        String[][] matrix2 = new String[numbers.length/counter][counter];
        for (int i=0; i<counter; i++){
            for (int j=0 ; j<(numbers.length/counter); j++){
                matrix2[i][j] = matrix[p][i];
                System.out.print(matrix2[i][j]+" ");
                p--;
            }
            System.out.println();
        }

    }
}
