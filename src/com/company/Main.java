package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //    int i;
        //i = 15;
        //double d = 16.9;
        //String s = "Hello, Hillel";
        //boolean b = false;



        //System.out.println("Result" +i+d);
        //System.out.println(s);
        //System.out.println(b);

        //Пример ввода текста с консоли и его использования
        Scanner scan = new Scanner(System.in); //объект, который может выполнять сканирование

     //   System.out.println("Please enter your name");

        //     String name = scan.nextLine(); // Принимает значение при нажатии на Ентер
        //   String surname = scan.nextLine();
        //   System.out.println("Hello " + name + surname);

        //Ввод чисел
        //  System.out.println("Please enter your age");

        //   int age = scan.nextInt();// Принимает значение при нажатии на Ентер

        //  System.out.println( "In 1 year your age = " + (age+1));

        System.out.println( "Please enter your age");
        int age = scan.nextInt();
        System.out.println( "In 1 year your age = " + (++age));
    //    if (age<18){
      //      System.out.println("You're young");

    }
        //else {
         //   System.out.println("You're an adult");}

}
