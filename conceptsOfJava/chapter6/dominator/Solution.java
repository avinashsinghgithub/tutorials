package chapter6.dominator;

//you can also use imports, for example:
import java.util.*;

//you can use System.out.println for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(int[] A) {
     // write your code in Java SE 8
 ArrayList<Integer> stack=new ArrayList<Integer>();
 int pointer =-1;
 for(int i=0;i<A.length;i++){
     if(stack.isEmpty()){
         stack.add(A[i]);
         pointer++;
     }else{
         int topNum=stack.get(pointer);
         if(topNum!=A[i]){
             stack.remove(pointer);
             pointer--;
             }else{
                 stack.add(A[i]);
                 pointer++;
                 }
         }
 }
 if(pointer!=-1){
     int pos=-1;
     for(int i=0;i<A.length;i++){
         if(A[i]==stack.get(pointer)){
             pos=i;
             }
         }
    return pos;
     }else{
         return -1;
         }
}
}