
/**
 * Write a description of class Song here.
 *
 * @author (Garrett Harper)
 * @version (8/19/2019)
 */
public class Song 
{

    private String title;
    //private int rating;
    //private double cost;
    
    public Song()
{
    //rating = 0;
    
    title  = "";
    
    //cost = 0.0;
}

    public Song(String title)
{ this.title=title;}
       
public String getTitle() {
        return title;
    }
public void setTitle(String t) {
        title = t;
    }
/*    public double getCost() {
 return cost;
}
public void setCost(double c) {
        cost = c;
}
public int getRating() {
    return rating;
}
public void setRating(int r) {
    rating = r;
}*/
}
