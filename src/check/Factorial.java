package check;

import java.util.ArrayList;
import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        int [] arrayOfNumbers = {2,3,1,5,7,9};
        System.out.println(maxArray(arrayOfNumbers));
        int [] arr = {3,4,5,8};
        System.out.println(minArray(arr));

        int [] arrOfNum = {2,3,1,5,4};
//        System.out.println(evaluate(arrOfNum));

        ArrayList<Integer> list= new ArrayList<>();
        list.add(6);
        list.add(4);
        System.out.println(calculateMaxTotalOf(list));    }
    private static int count = 0;
    public int divisor(int myNumber) {
        int number = myNumber;
        for (int i = 1;i < number;i++){
            if (number % i == 0){
                count++;
                System.out.println(count);

            }
//            if (count == 2){
//                System.out.println("it is prime");
//            }


        }


        return number;
    }

    public static int maxArray(int[] myArray){
        int maxNumber = 0;
        for (int i = 0;i < myArray.length;i++){
            if (myArray[i] > maxNumber){
                maxNumber = myArray[i];
            }

        }

        return maxNumber;
    }

    public static int minArray(int [] myArray){
        int minNumber = 0;
        for (int i = 0; i < myArray.length;i++){
            if ( myArray[i] > minNumber ){
                minNumber = myArray[i];
            }
        }
        return minNumber;
    }

    public static int calculateMaxTotalOf(ArrayList<Integer> arr){
        int total=0;
       for (int counter=0;counter<arr.size();counter++){
           for (int count=0; count<arr.size(); count++){
               arr.remove((Integer) count);
               total+= arr.indexOf(count);
           }
       }
        int maxTotal=4;
        if (maxTotal>total){
            return total;
        }
        else return 0;


    }

//    public static int evaluate(int[] arr){
//        int[] newArray = new int[arr.length -1];
//        int sum = 0;
//        for (int i = 0;i < arr.length;i++){
//            //add from index 1- arr.length - 1;
//            newArray[i-1] = arr[i];
//        }
//        return sum;
//    }

}
