package org.aakash.arrays;

public class MissingNumber {
    public static void main(String[] args) {

//        int[] arr={1,2,4,5};
//        int n=5;
//        System.out.println(missing(arr,n));
        int[] arr={2,1,2,0,1};
        System.out.println(maxProfit(arr));
    }
    public static  int maxProfit(int[] prices) {

            int buyPrice=prices[0];
            int sellPrice=prices[prices.length-1];
            int flag=0;

            for(int i=0;i<prices.length;i++){
                if(i < prices.length-1 && buyPrice>prices[i+1]){
                    buyPrice=prices[i+1];

                }else {
                    flag=1;
                    break;
                }
            }
//            if(buyPrice == prices[prices.length-1]){
//                return 0;
//            }


            for(int j=prices.length-1;j>0;j--){
                if(sellPrice < prices[j-1]){
                    sellPrice= prices[j-1];
                    break;
                }else{

                    break;
                }
            }

        System.out.println(sellPrice+"  "+buyPrice);
            if(sellPrice==buyPrice){
                return 1;
            }

            return sellPrice-buyPrice;


        }



    public static int missing(int[] arr,int N){
        int xor1=0;
        int xor2=0;
        int n= N-1;
        for(int i=0;i<n;i++){
            xor1= xor1^arr[i];
            xor2= xor2^(i+1);
        }
        // we are not taking N in for loop which is last element
        xor1= xor1^N;
        return xor1^xor2;
    }



}
