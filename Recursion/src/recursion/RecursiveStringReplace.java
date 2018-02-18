package recursion;
public class RecursiveStringReplace
{

    /**
     * replace - Replace all instances of one character by another.
     * 
     * @param  s   The string to do the replacement on.
     * @param  from   The character to be replaced.
     * @param  to   the character to change to.
     * @return     A new string with the appropriate characters replaced.
     */
    public String replace(String s, char from, char to){
        
        String result = "";

        int len = s.length();
        if (len <= 0) {
            return result;
        }
        if (from == s.charAt(0) ){
             char first =to;
             result=first + replace(s.substring(1), from, to);
             return result;
        }
        else {
            char first = s.charAt(0);
            result = first + replace(s.substring(1), from, to);
            return result;
        }
    }
}



