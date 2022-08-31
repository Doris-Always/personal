package check;

import java.util.ArrayList;

public class NumberProblems {
    private int count = 0;
    public int factorOfNumbers(int num) {
        //am trying to get the number of factors a number has
        //to achieve this,i have to 1) initialise a counter,
        //2)use a loop to check how many number was able to divide the number
        //3)once a number can divide,counter++
        //4)return count
//        int count = 0;
        for (int i = 1;i <= num;i++){
            if (num % i == 0){
                count++;
            }
        }
        return count;
    }

    public boolean primeNumber(int num){

     int returnedCount = factorOfNumbers(num);
        if (returnedCount == 2){
            return true;
        }
        return false;
    }

    public static void maxSumOfArray(int[] myarray ){
        int sum = 0;
        int singleSum = 0;
        int max = 0;
        int min = 12000000;

        ArrayList<Integer> singleSumList = new ArrayList<Integer>();
        for (int i = 0;i < myarray.length;i++){
            sum +=myarray[i];
        }

        for (int j = 0;j < myarray.length;j++){
            singleSum = sum - myarray[j];
            singleSumList.add(singleSum);
        }

        for (int x = 0;x <singleSumList.size();x++){
            if (singleSumList.get(x) > max){
                max = singleSumList.get(x);
            }
            if (singleSumList.get(x) < min){
                min = singleSumList.get(x);
            }
        }

        System.out.println("the maximum is:"+ " "+ max +" the minimum is"+" " + min);
    }

    public static void maxArray(int[] myArray){
        int maxNumber = 0;
        int minNumber = 2100000;
        for (int i = 0;i < myArray.length;i++){
            if (myArray[i] > maxNumber){
                maxNumber = myArray[i];
            }

            if (myArray[i] < minNumber){
                minNumber = myArray[i];
            }

        }

        System.out.println(maxNumber + " is maximum number " + minNumber + " is the minimum number");;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,1};
        maxArray(arr);

        maxSumOfArray(arr);
    }

}
