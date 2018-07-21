package threads.callableVsRunnable;


public class FactorialTask implements Callable<Integer> {
    // ...
    public Integer call() throws InvalidParamaterException {
 
        if(number < 0) {
            throw new InvalidParamaterException("Number should be positive");
        }
    // ...
    }
}