/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        //code
        int i,swap;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n/2;i++){
            swap=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=swap;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]);
        }

    }
}