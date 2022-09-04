package ex3;
import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String TempScore = " ";

        BallScore BallScore = new BallScore();
        KonDoo KonDoo1 = new KonDoo();
        KonDoo KonDoo2 = new KonDoo();
        BallScore.register(KonDoo1);
        BallScore.register(KonDoo2);

        while (true)
        {
            TempScore = " ";
            System.out.print("\nEnter score :" + TempScore);
            TempScore = input.nextLine();
            if (TempScore == "") break;
            BallScore.setScoreData(TempScore);
            
        }
        input.close(); 
        System.out.print("It's time to sleep");

    }
}