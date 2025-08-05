package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String workouts="Valid exercises"
                        +"Burpee"
                        +"Pushup"
                        +"Situp"
                        +"Squat";

        System.out.println(workouts);

        System.out.println("Please create your workout plan\n");
        System.out.println("Burpee:");
        int burpee=scanner.nextInt();
        System.out.println("Pushup:");
        int pushup=scanner.nextInt();
        System.out.println("Situp:");
        int situp=scanner.nextInt();
        System.out.println("Squat:");
        int squat=scanner.nextInt();
        scanner.nextLine();

        Workout workout=new Workout(burpee,pushup,situp,squat);

        System.out.println("Your exercise is starting...");

        while (workout.workoutFinal()== false){
            System.out.println("Workout type(Burpee,Squat,Pushup,Situp):");
            String type=scanner.nextLine();
            System.out.println("How many of these exercises will you do?");
            int count=scanner.nextInt();
            scanner.nextLine();
            workout.exercise(type,count);
        }

        System.out.println("You have successfully completed your training...");
    }
}