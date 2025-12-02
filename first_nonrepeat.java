
public class first_nonrepeat {
    public static void main(String[] args){
        String s="aabbcde";
        for(char c:s.toCharArray())
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.println(c); break;
            }
    }
}
/* 15th prg
  This program finds the FIRST NON-REPEATING letter in a word.

  Our word is:
      "aabbcde"

  Non-repeating means:
      The letter appears ONLY ONE TIME.

  Step 1:
  Go through each character one by one.

  For every character c:
      s.indexOf(c)      → first time it appears
      s.lastIndexOf(c)  → last time it appears

  If both positions are the SAME:
      It means the character appears ONLY ONCE.

  Let's check each letter:

      'a' → appears at 0 and 1 → repeats → skip
      'a' → skip
      'b' → appears at 2 and 3 → repeats → skip
      'b' → skip
      'c' → appears only at 4 → NON-REPEATING → this is our answer

  We stop as soon as we find the first such letter.

  Step 2:
  Print that letter.

  Final answer = 'c'
*/
