package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Funcion {

    private static void timerSchedule(int start, int seconds)  {
        while (start >= 0) {
            System.out.println(start);
            try {
                Thread.sleep(seconds*1000L);
            } catch (InterruptedException ignore) {
            }
            start--;
        }
    }

    public static void workingTimer(){
        Scanner scanner = new Scanner(System.in);
        int start = -5;
        while (start < 0){
            System.out.println("Elija el numero del temporizador en valor positivo:");
            try{
                start = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException ignore){}
        }
        int seconds = -5;
        while (seconds < 0){
            System.out.println("Elija la cantidad en segundos entre contadores en valor positivo:");
            try{
                seconds = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException ignore){}
        }
        System.out.println("Start!");
        timerSchedule(start, seconds);
        System.out.println("End");
    }
}
