package chapter3.passingCars;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(int[] A) {
     // write your code in Java SE 8
     long count=0;
     
     for(int i=0;i<A.length-1;i++){
         for(int j=i+1;j<A.length;j++){
             if(A[i]<A[j]){
                 count++;
                 }
             }
         }
     if(count>1000000000){
         return -1;
         }else{
             return (int)count;
             }    
 }
}