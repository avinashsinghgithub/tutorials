/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.manhattanBuildings;

/**
 *
 * @author avinash singh
 */
public class manhattanTowerSol {
    public static void main(String args[]){
        Solution sol=new Solution();
    //int [] H={8,8,5,7,9,8,7,4,8};
        int [] H= {3,5,6,7,6,6,3,6};
        int [] m= new int[5];
        
    int ans = sol.solution(H);
    System.out.println(ans);
    }
    
    
}
