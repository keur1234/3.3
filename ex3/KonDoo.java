package ex3;

public class KonDoo implements MyObserver 
{
    @Override
    public void update(SorceMaKueTed o)
    {
        System.out.println("From senior live result : " + ((BallScore)o).getScoreData());
    }
}
