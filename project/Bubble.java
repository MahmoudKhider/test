/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


public class Bubble {

    public static void main(String[] args) {

        int[] arr = {2, 8, 22, 2, 1, 6, 7, 8, 9};

        for (int x = 0; x < arr.length; x++) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                } else {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        
                    } 
                }

            }

        }
        for(int i =0 ; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
