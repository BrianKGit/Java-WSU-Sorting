
public class SearchingMethods {
   	  
   //binary search using recursion
   public static int binarySearch( Comparable list[], Comparable key, int left, int right) {
      
      int middle = (left + right) / 2;
      
      int foundIndex = -1;
      
      if( key.compareTo(list[middle]) == 0){
         foundIndex = middle;
      }
      else if( key.compareTo(list[middle]) < 0){
         if( left <= middle-1){
            foundIndex = binarySearch( list, key, left, middle-1);// further search on the left
         }
      }   
      else {
         if(right >= middle+1){
            foundIndex = binarySearch( list, key, middle+1, right);//further search on the right
         }
      }
      
      return foundIndex;
      
   }//end binarySearch()
          
          
          
	 
}//end class

