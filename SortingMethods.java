@SuppressWarnings("unchecked")

public class SortingMethods {
    
   //quick sort method to sort an array of comparable objects
   public static void quickSort( Comparable [] list, int left, int right ){
   
      if(left < right) {
         int q = partition(list, left, right);
         quickSort(list, left, q);
         quickSort(list, q+1, right);
      }
      
   }//end quick sort method
   
   //partition method
   public static int partition( Comparable [] list, int left, int right ){
      
      Comparable x = list[left]; //pivot
      int i = left - 1;
      int j = right + 1;
      
      while(true){
         
         j--;
         while( list[j].compareTo(x) > 0 ) {
            j--;
         }
         
         i++;
         while( list[i].compareTo(x) > 0 ) {
            i++;
         }
         
         if(i < j){ //swap list[i] with list[j]
            Comparable temp = list[j];
            list[j] = list[i];
            list[i] = temp;
         }
         else{
            return j;
         }
      
      }//end outer while
      
   }//end partition
   
   
   
   
	  
	  	 
}//end class

