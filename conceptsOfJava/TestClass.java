

 //uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TestClass {
    public static void main(String args[] ) throws Exception {
        
         //Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
        String line = br.readLine();
        if(line.length()==1)
        {
        	int N = Integer.parseInt(line);
        	for (int i = 0; i < 4; i++) {
        		 line = br.readLine();
        		System.out.println(N);
        	}
        	}
        }

       // System.out.println("Hello World!");
    }
}
