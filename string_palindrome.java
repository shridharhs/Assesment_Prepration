
public class string_palindrome {
    public static void main(String[] args){
        String s="madam",r="";
        for(int i=s.length()-1;i>=0;i--) r+=s.charAt(i);
        System.out.println(s.equals(r)?"Palindrome":"Not");
    }
}
/* 11th prg
  This program checks if a WORD is a PALINDROME.

  What is a palindrome?
      A word that reads the SAME forwards and backwards.
      Example: madam, level, mom

  Our word is:
      s = "madam"

  Step 1:
  Create an empty string r = ""

  Step 2:
  Build the reverse of the word:
      We take characters from the END to the BEGINNING.

      i = 4 → 'm' → r = "m"
      i = 3 → 'a' → r = "ma"
      i = 2 → 'd' → r = "mad"
      i = 1 → 'a' → r = "mada"
      i = 0 → 'm' → r = "madam"

  Now:
      s = "madam"
      r = "madam"

  Step 3:
  Compare both strings:
      If s equals r → it is a palindrome

  Step 4:
  Print the result:
      "Palindrome"

  Final answer = Palindrome
*/
