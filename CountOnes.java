import java.util.*;

public class CountOnes
{
   public static void main(String [] args)
   {
      Scanner console = new Scanner(System.in);
   	  
      int [][] table = {
                         {1,1,1,1,1,1},
                         {1,1,1,1,1,0},
                         {1,1,1,1,1,0},
                         {1,1,1,1,0,0},
                         {1,1,1,0,0,0},
                         {1,0,0,0,0,0}
                       };
      
      int i = 5, j = 0, count = 0;
      
      while(i >= 0 && j <= 5) {
      
         if(table[i][j] == 1)
         {
            count = count + (i+1);
            j++; //move to the right
         }
         else
         {
           i--; //move up
         }
      }
      
      System.out.println("Number of 1s: " + count);
      
   }//end main

}//end class
