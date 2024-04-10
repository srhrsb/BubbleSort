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
        //Hilfsvariable um sich zu merken,
        // ob weiteres sortieren notwendig ist
        boolean sorted = false;

        //die While-Schleife läuft solange,
        //wie sorted false ist
           while(sorted != true){
               sorted = true; //das würde bedeuten,
               // dass das sortieren endet

               for(int i = 0; i < array.length-1; i++){

                   //es wird geprüft, ob der Vorgänger im Array
                   //größer ist als der Nachfolger
                   if(array[i] > array[i+1]){
                       //ja -> Werte tauschen
                       int temp = array[i+1];
                       array[i+1] = array[i];
                       array[i] = temp;

                       //es soll weiter sortiert werden
                       sorted = false;
                   }
               }
           }
           return array;
    }
}