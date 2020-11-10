package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        int loop = 1;
        int i = 0;
        System.out.println("-----------------------------------------------------");
        System.out.println("You can add up to 10 tasks!");
        System.out.println("You have 0/10!");
        System.out.println("-----------------------------------------------------");

        while (loop == 1) {
            System.out.println("1) Manage tasks");
            System.out.println("2) Exit");
            int input = sc.nextInt();
            if (input < 1) {
                System.out.println("Invalid input, please choose a correct option:");
                input = sc.nextInt();
            }
            if (input > 2) {
                System.out.println("Invalid input, please choose a correct option:");
                input = sc.nextInt();
            }
            if (input == 2) {
                System.exit(0);
            }
            if (input == 1) {
                System.out.println("1) Create a new task");
                System.out.println("2) Update a task");
                System.out.println("3) Destroy a task");
                System.out.println("4) Back to main menu");
            }
            int input2 = sc.nextInt();
            if (input2 < 1) {
                System.out.println("Invalid input, please choose a correct option:");
                input2 = sc.nextInt();
            }
            if (input2 > 4) {
                System.out.println("Invalid input, please choose a correct option:");
                input2 = sc.nextInt();
            }
            if (input2 == 1) {
                System.out.println("Enter name of the task:");
                sc.nextLine();
                array[i] = sc.nextLine();
                int tasksdone = i + 1;
                System.out.println("-----------------------------------------------------");
                System.out.println("You can add up to 10 tasks!");
                System.out.println("You have" + " " + tasksdone + "/" + "10!");
                System.out.println("#" + i + " " + "-" + " " + array[i]);
                i = i + 1;
            }
            if (input2 == 2) {
                System.out.println("Choose the index of the task you want to update:");
                int input3 = sc.nextInt();
                if (input3 < 0) {
                    System.out.println("Invalid input, please choose a correct option:");
                    input3 = sc.nextInt();
                }
                if (input3 > 10) {
                    System.out.println("Invalid input, please choose a correct option:");
                    input3 = sc.nextInt();
                }
                if (input3 > i - 1) {
                    System.out.println("This task does not exist, please choose a correct option:");
                    input3 = sc.nextInt();
                }
                System.out.println("Enter name of the task:");
                sc.nextLine();
                array[input3] = sc.nextLine();
                System.out.println(array[input3]);
            }
        }
    }
}