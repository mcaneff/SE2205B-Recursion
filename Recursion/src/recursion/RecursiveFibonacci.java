package recursion;
public class RecursiveFibonacci
{


    /**
     * basic - The simple version of fibonacci.
     * 
     * @param  n   A positive integer. 
     * @return     The nth fibonacci number.
     */
    public long basic(long n)
    {
        long result = 1;
        
        if( n <= 0)
            result = 0;
        else if (n == 1)
            result = 1;
        else
            result = basic(n-1) + basic(n-2);
        
        return result;
    }
    /**
     * better - A better version of fibonacci. (Height Limited Double Recursion)
     * 
     * @param  n   A positive integer.
     * @return     The nth fibonacci number.
     */
    public long better(long n)
    {
        long result = 0;
        if (n==0)return 0;
        if (n==1)return 1;
        
        if (n%2==0 && n>1){// F(2n)
        return better(n/2)^2 + 2*better(n/2)*better((n-1)/2);
                        
        }
        if (n%2!=0 && n>1){// F(2n+1) the odd equation
        return better(n/2)^2 + 2*better(n/2)*better((n-1)/2) + better((n-1)/2)^2;
             
        }
        return result;
        
    }


    /**
     * tailRecursive - A tail recursive version of fibonacci. 
     *              (Height limited, Two problems per level)
     * 
     * @param  n   A positive integer. 
     * @return     The nth fibonacci number.
     */
    public long tailRecursive(long n)
    {
        // IMPLEMENT THIS METHOD USING A RECURSIVE HELPER FUNCTION
        // AND RETURN AN APPROPRIATE VALUE
//>>>>>>>>> REPLACEMENT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        

        return 0;
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<        
    } 
    
     
    /**
     * helper - The tail recursive helper function.
     * 
     * @param  n   A positive integer. 
     * @param  fi  The partial result f(i).
     * @param  fi1   The partial result f(i-1).
     * @return      The nth fibonacci number.
     */

    public long helper(long n, long fi, long fi1)
    {  
        long result = 0;
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>           
     
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<        
        return result;
    }
       

    /**
     * secondMSB - Determine the value of the second most significant bit.
     * 
     * @param  n   A positive integer 
     * @return     True if the second most significant bit is 1, false otherwise.
     */    
    public boolean secondMSB(long n)
    {
         char SMSB;
        if (n == 0) {
           return false;
       }
       String binary = "";
       while (n > 0) {
           long rem = n % 2;
           binary = rem + binary;
           n = n / 2;
           Math.floor(n);
       }
        SMSB=binary.charAt(1);
        if (SMSB == 0){
        return false;}
        else return true;
    }


    /**
     * reduceBy2ndMSB - Reduce the number by removing the second most significant bit
     * from the representation.
     * 
     * @param  n   A positive integer > 1
     * @return     The integer value equivalent to removing the 2nd most significant bit
     *              from n.
     */    
    public long reduceBy2ndMSB(long n)
    {
        long result = 1;
        
        if (n == 0) {
           return 0;
       }
       String binary = "";
       while (n > 0) {
           long rem = n % 2;
           binary = rem + binary;
           n = n / 2;
           Math.floor(n);
       }
       
       int len= binary.length();
       String temp=binary.substring(2,len);
       binary= binary.substring(0,1);
       binary = binary + temp;
       result= Long.parseLong(binary);
       
       return result;
    }
    
    
}
