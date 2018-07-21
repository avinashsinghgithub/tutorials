package chapter4.triangle;

//you can also use imports, for example:
//import java.util.*;
import java.util.Arrays;
//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(int[] A) {
     // write your code in Java SE 8
     long count=0;
     Arrays.sort(A);
     if(A.length<3){
         return 0;
         }
         long sideA=0;
         long sideB=0;
     for(int i=0;i<A.length-2;i++){
         if(A[i]<0){
             continue;
             }
          sideA=A[i];
          sideB=A[i+1];
         if(sideA+sideB>A[i+2]){
             count++;
             }
         }
 return (int)count;
 }
}