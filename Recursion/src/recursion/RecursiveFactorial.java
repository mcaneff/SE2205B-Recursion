package recursion;

public class RecursiveFactorial
{

    /**
     * The basic recursive factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long basic(long n)
    {
        long total=n;
    if (n<1){return 1;}
    else 
        return basic(n-1)*total;

    }
     /**
     * The tail recursive version of factorial.
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long tailRecursive(long n)
    {
        if (n<0){
        return 0;}
        else {
            return helper(n,1);
        }
     
    }

    /**
     * The tail recursive helper function for factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @param  partial   The partial result that is being built up.
     * @return     n factorial.
     */

    private long helper(long N, long partial)
    {
        
        long result = 0;
        // IMPLEMENT THIS TAIL RECURSIVE METHOD
         if (N == 0 || N == 1) {
            return partial;
        } else {
            partial = partial * N;
            return result =helper(N - 1, partial);
        }
      
        //return result;
    }

}
