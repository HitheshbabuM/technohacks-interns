import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.Random;
public class GuessNumber{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int lowerbound=1;
        int upperbound=100;
        int numberguess=random.nextInt(upperbound-lowerbound +1)+lowerbound;
        int attempts=0;
        while(true){
            System.out.println("Guess The Number:");
            int userguess=sc.nextInt();
            attempts++;
            if(userguess > numberguess){
                System.out.println("Try a lower number than your guess");
            }else if(userguess<numberguess){
             System.out.println("Try a Higher number than your guess");
            }else {
                System.out.println("Congratulations you guessed right number in "+attempts+" attempts" );
                break;
            }

        }
    }
}
