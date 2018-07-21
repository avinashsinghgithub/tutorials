/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.manhattanBuildings;
import java.util.ArrayList;
/**
 *
 * @author avinash singh
 */
// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution { //class in all small letters
    public int solution(int[] H) {
        // write your code in Java SE 8
        Stack stackForBuildings= new Stack();
        int blocksneeded =0;
        
        int length=H.length;
        for(int i=0;i<length;i++){ ///for is all small letters
            
        
        if(stackForBuildings.isEmpty())
        {
            blocksneeded++;
            stackForBuildings.push(H[i]);
        }else{
            boolean isThere=stackForBuildings.peek(H[i]);
            if(isThere){
            	continue;
            }
            int popped =stackForBuildings.pop();
            stackForBuildings.push(popped);
            
            if(popped<H[i]){
                //stackForBuildings.push(popped);
                stackForBuildings.push(H[i]);
                blocksneeded++;
                }
                else{
                    while(!stackForBuildings.isEmpty()){
                    int popped2=stackForBuildings.pop();
                    if(popped2>H[i]){
                    continue;
                    }else if(popped2==H[i]){
                    	stackForBuildings.push(popped2);
                        break;
                        }else
                        	stackForBuildings.push(popped2);
                    		stackForBuildings.push(H[i]);
                        	blocksneeded++;
                    		break;
                    }
                    if(stackForBuildings.isEmpty()){
                    	stackForBuildings.push(H[i]);
                    	blocksneeded++;
                    }
                    }
            }
            
        }
        return blocksneeded;
    }
}
class Stack {

public ArrayList stack ;
public int pointer;
public Stack (){
    this.stack= new ArrayList<Integer>();
    this.pointer=-1;

} 
    void push(int entry){
        stack.add(entry);
        pointer++;
    }
    int pop(){
    int element=0;
    if(pointer !=-1){
    element =(int)stack.remove(pointer);
    pointer--;
    }
    return element;
    }
    
    boolean peek(int element){
    int index =stack.indexOf(element);
    if(index==pointer)
    return true;
    else
    	return false;
    }
    
    boolean isEmpty(){
    if (pointer==-1){
        return true;
    }
    else{
        return false;
    }
    }
}



















