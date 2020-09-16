/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("Угадайте задуманное число");
        System.out.println("-------------------------");
        Random random = new Random();
        int myNumber = random.nextInt(5-0+1)+0 ;
        
        System.out.println("Угадай задуманное число от 1-5.");
        Scanner scanner = new Scanner(System.in);
        int gamerNumber = scanner.nextInt();
        
        if(myNumber == gamerNumber) {
            System.out.println("ты угадал");
        } else {
            System.out.println("ты не угадал: " + myNumber);
        }
            
        
        
    }
    
}
