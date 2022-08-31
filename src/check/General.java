package check;

public class General {

    public static void main(String[] args) {

//        for (int i = 0;i < 10; i+=2){
//            for (int j = 0; j < 8 - i / 2; j++){
//                System.out.print(" ");
//            }
//            for (int j = 0;j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        int num = 1;
        for (int i = 0; i < 10; i+=2){
            System.out.print("\n");
            for (int j = 0; j <= 8- i / 2;j++){
                System.out.print(" ");
            }
            for (int j = 0;j<=i;j++){
                System.out.print("*");
            }

        }
        System.out.println("");



//        int x;
//        for(x =1; x<= 5; x++){
//
//            System.out.print("");
//
//            int j;
//            for (j=1;j<=x ; j++){
//                System.out.print("*");
//            }
//
//        }
//        for (int i = 0;i <= 10; i = i + 2){
//            System.out.println("i is now"  + i);
//        }

//        int  bearNum = 99;
//
//        String word = "bottles";
//
//        while (bearNum > 0){
//
//            bearNum = bearNum - 1;
//
//            if (bearNum == 1){
//                word = "bottle";
//            }
//            System.out.println(bearNum + "" + word + "of beer on the wall ");
//            System.out.println(bearNum + "" + word +  " of beer.");
//            System.out.println(" Take one down.");
//
//        }

//        int counter = 1;
//
//        while (counter <= 7){
//            System.out.println(counter);
//            counter++;
//        }

    }

}
