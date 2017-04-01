
import java.util.Scanner;

/**
 *
 * @author yas
 */
public class Solotion {
    public static void main(String[] args) {
        System.out.println("please enter a number : ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int array [] = new int[input] ;
        for (int i = 0; i < input; i++) {
            array[i] = in.nextInt();
        }
        float sum = 0 ;
        float mean ;
        float median ;
        for (int i = 0; i < input; i++) {
            sum +=array[i] ;
        }
        mean = sum / input ;
        int arr[] = new int[input];
        arr = sort(array);
        if(input%2==0){
           
            median =  (arr[(input/2)+1] + arr[input/2])/2;
        }
        else{
            median = arr[input/2];
        }
       System.out.println("mean : " + mean);
       System.out.println("median : " + median);
    }
    
    public static int [] sort(int []array){
        int n = array.length;
       for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    array[j] = array[j]+array[j+1]-(array[j+1]=array[j]);
                }
            }
        
    }
    return array ;
}
}

