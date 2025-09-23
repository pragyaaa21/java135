package unit3;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               System.out.print(a[i][j]+" ");
           }
       }
    }
}
