package ex3;
import java.util.*;

public class BallScore implements SorceMaKueTed
{
    private final ArrayList<MyObserver> ScoreList;
    private String ScoreData;   

    public BallScore()
    {
        this.ScoreList = new ArrayList<MyObserver>();
    
    }

    public void setScoreData(String sData)
    {
        ScoreData = sData;
        notifyObserver();
    }

    public String getScoreData()
    {
        return ScoreData;
    }

    @Override
    public void register (MyObserver observer)
    {
        ScoreList.add(observer);
    }

    @Override
    public void notifyObserver()
    {
        for (int j = 0; j < ScoreList.size(); j++)
        {
            ScoreList.get(j).update(this);
        }
    }

}
