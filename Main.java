package com.logix;

import java.util.Scanner;

public class Main {
    //bubble sort
    public static void helper(int[] arr,int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    }
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     int []arr = new int[n];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }
//     Main h = new Main();
      helper(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

      //binary conversion
//      int p = sc.nextInt();
//      int sum = 0;
//      int bin = 1;
//      while(p!=0){
//          if(p%10==1){
//              sum = sum + bin;
//          }
//          bin*=2;
//          p/=10;
//      }
//      System.out.println(sum);
      //principle rate time
        //Simple interest
//        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt();
//        float r = sc.nextFloat();
//        int t = sc.nextInt();
//        float si = (p*r*t)/100;
//        System.out.println("Simple interest will be" + si);

    }
}
