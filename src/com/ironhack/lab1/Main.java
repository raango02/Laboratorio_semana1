package com.ironhack.lab1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6};
        difference(array);
        smallest_elements(array);

        System.out.println("Enter the value of x: ");
        Scanner sc = new Scanner(System.in);
        int var = Integer.valueOf(sc.nextLine());
        System.out.println("Enter the value of y: ");
        Scanner sc2 = new Scanner(System.in);
        int var2 = Integer.valueOf(sc.nextLine());

        operation(var, var2);
    }

    static void difference(int arr[]){
        int mayor, menor;
        mayor = menor = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr [i] > mayor) {
                mayor = arr[i];
            }
            if(arr[i]<menor) {
                menor = arr[i];
            }
        }
        System.out.println("The difference between the big number and the little number is : "+(mayor-menor));
    }

    static void smallest_elements(int arr[])
    {
        int first, second, arr_size = arr.length;
        if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }

        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                    "smallest element");
        else
            System.out.println("The smallest element is " +
                    first + " and second Smallest" +
                    " element is " + second);
    }
    static void operation(double valor1, double valor2){
        BigDecimal num1 =  BigDecimal.valueOf(valor1);
        BigDecimal num2 =  BigDecimal.valueOf(valor2);
        BigDecimal num3 = new BigDecimal("4");
        BigDecimal num4 = new BigDecimal("5");

        BigDecimal result1 = num1.multiply(num1);//X elevado a 2

        BigDecimal result2 = num3.add(num2);//Multiplicacion de 4*y
        BigDecimal result3 = result2.divide(num4);//Dividir 4y entre 5
        BigDecimal result4 = result3.subtract(num1);//Restamos result3 entre x
        BigDecimal result5 = result4.multiply(result4);//Elevamos a 2 todo lo del parentesis
        BigDecimal  result = result1.add(result5);//Sumamos lo de fuera del parentesis con lo de dentro
        //System.out.println(result2);

        System.out.println("The result of the operation is "+result);

    }

}