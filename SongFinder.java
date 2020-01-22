
/**
 * Write a description of class SongFinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class SongFinder
{
   public static int findTitle(Song[] songs, String target)
   {
     String word = "";
      for (int i = 0; i < songs.length; i++)
      {
       word = songs[i].getTitle();
       if (word.equals(target))
       {
        return -1;   
       }
       else return - 1;
       
     }
     return -1;
   }
}