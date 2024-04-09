import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
          int[] a = {9,3,4,7,6,2,1};
          System.out.println( Arrays.toString(a) );
          int[] b = bubbleSort(a);
          System.out.println( Arrays.toString(b) );
    }

    /**
     * Sortiert ein Integer Array
     * @param array, welches sortiert werden soll
     * @return array, welches sortiert ist
     */
    private static int[] bubbleSort( int[] array ){
           boolean sorted = false;
           while(sorted != true){
               sorted = true;
               for(int i = 0; i < array.length-1; i++){
                   if(array[i] < array[i+1]){
                       int temp = array[i+1];
                       array[i+1] = array[i];
                       array[i] = temp;
                       sorted = false;
                   }
               }
           }
           return array;
    }
}