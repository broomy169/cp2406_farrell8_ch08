/**
 * Created by Graeme on 1/09/2016.
 */
public class TwelveInts {
    public static void main(String[] args) {
        int[] numbers = {2,3,1,43,534,21,7,5,8,12};

        for (int x : numbers){
            System.out.print(x + ", ");
        }

        System.out.println();

        for (int i = numbers.length -1; i >= 0; --i){
            System.out.print(numbers[i] + ", ");
        }
    }
}
