<<<<<<< HEAD
//Moves Zeros At the end
//TC ==> O(N)
//SC ==> 0(1)
import java.util.*;

public class MovesZero{
    static void movesZero(int[]array, int n){
        int count =0;
        for(int i = 0 ; i < n ; i++){
            if(array[i]==1){
                //if(array[i]!=0){} ==>Same thingd
                int temp = array[i];
                array[i]= array[count];
                array[count]=temp;
                count++;
            }
        } 
    }
    public static void main(String[] args){
        int[]array = {1,0,1,0,1,0,1,0};
        int n = array.length;
        movesZero(array,n);
        for(int x: array){
            System.out.print( x +" ");
        }
    }
=======
//Moves Zeros At the end
//TC ==> O(N)
//SC ==> 0(1)
import java.util.*;

public class MovesZero{
    static void movesZero(int[]array, int n){
        int count =0;
        for(int i = 0 ; i < n ; i++){
            if(array[i]==1){
                //if(array[i]!=0){} ==>Same thingd
                int temp = array[i];
                array[i]= array[count];
                array[count]=temp;
                count++;
            }
        } 
    }
    public static void main(String[] args){
        int[]array = {1,0,1,0,1,0,1,0};
        int n = array.length;
        movesZero(array,n);
        for(int x: array){
            System.out.print( x +" ");
        }
    }
>>>>>>> f22e72f (DAY32)
}