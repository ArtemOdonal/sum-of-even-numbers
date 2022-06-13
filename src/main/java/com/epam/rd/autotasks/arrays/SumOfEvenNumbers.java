package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }
    public static int sum(int[] array) {

        int result = 0;
       try {
           if (array.length == 0) {
               //throw new UnsupportedOperationException();
               return 0;
           }
       }catch (NullPointerException e){
           return 0;
       }



        for (int i = 0; i < array.length; i++) {
           int pro = array[i];
            if(pro % 2 == 0 ){
                result += array[i];
            }

        }




            return result;




        //throw new UnsupportedOperationException();
    }
}
