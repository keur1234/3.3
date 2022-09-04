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

        while (!(TempScore.isEmpty()))
        {
            System.out.print("Enter score : " + TempScore);
            TempScore = input.nextLine();
            BallScore.setScoreData(TempScore);
        }

        System.out.print("It's time to bed");
    }
}