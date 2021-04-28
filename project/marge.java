/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


class mar {

    int[] arr = new int[30];
    int n = 0;

    public void add(int value) {
        arr[n++] = value;
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void recmarge() {
        int[] work = new int[n];
        recmarge(work, 0, n - 1);
    }

    public void recmarge(int[] work, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        recmarge(work, start, mid);
        recmarge(work, mid + 1, end);
        marge(work, start, mid, end);
    }

    public void marge(int[] work, int start, int mid, int end) {
        int j = 0;
        int lowB = start;
        int m = mid - 1;
        int nu = start - end + 1;

        while (start <= m && mid <= end) {
            if (arr[start] < arr[mid]) {
                work[j++] = arr[start++];
            } else {
                work[j++] = arr[mid++];
            }
        }
        while (start <= m) {
            work[j++] = arr[start++];
        }
        while (mid <= end) {
            work[j++] = arr[mid++];
        }
        for (int i = 0; i < n; i++) {
            arr[lowB + i] = work[i];
        }

    }

}

public class marge {

    public static void main(String[] args) {
        mar m = new mar();
        m.add(22);
        m.add(54);
        m.add(31);
        m.add(52);
        m.add(9);
        m.add(21);
        m.add(32);
        m.add(210);

        m.display();
        System.out.println();
        m.recmarge();
        m.display();

    }

}

