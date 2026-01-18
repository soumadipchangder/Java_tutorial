package assignment_matrix;

import java.util.*;

class SearchSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        int key = sc.nextInt();

        int i = 0, j = c - 1;
        boolean found = false;

        while(i < r && j >= 0) {
            if(a[i][j] == key) {
                System.out.println("Found at (" + i + ", " + j + ")");
                found = true;
                break;
            }
            else if(a[i][j] > key)
                j--;
            else
                i++;
        }

        if(!found)
            System.out.println("Not Found");
        sc.close();
    }
}
