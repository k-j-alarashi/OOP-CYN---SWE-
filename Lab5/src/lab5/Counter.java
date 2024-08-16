package lab5;

public class Counter {
    int count ;
    
    public Counter(){
        count = 0 ;
    }
    
    public void incremnt(){
        count++;
    }
    public void reset(){
        count = 0 ;
    }
    public int getCount(){
        return count ;
    }
}
