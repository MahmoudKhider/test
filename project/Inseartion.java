/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author محمود علي خضر
 */
public class Inseartion {

    public static void main(String[] args) {

  
        int[] arr = {1, 7, 9, 8, 6, 5, 2};
        int val, j;
        for (int i = 1; i < arr.length; i++) {
            val = arr[i];
            j = i;

            while (arr[j - 1] > val && j > 0) {
                arr[j] = arr[j - 1];
                j--;

            }
            arr[j] = val;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
