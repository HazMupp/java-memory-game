import java.util.*;
public class MemoryPlayer extends Player
{
    int playerPoints = 0;

    public MemoryPlayer()   {
        

    }
    
    public void addPoint(){
        playerPoints++;
    }
    
    public int getPoints(){
        return playerPoints;
    }

    


}
