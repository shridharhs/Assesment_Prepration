
public class reverse_string {
    public static void main(String[] args){
        String s="hello",r="";
        for(int i=s.length()-1;i>=0;i--) r+=s.charAt(i);
        System.out.println(r);
    }
}
/* 13th prg
  This program REVERSES a word.

  Our word is:
      "hello"

  Step 1:
  Create an empty string:
      r = ""

  Step 2:
  Start from the LAST character of the word
  and move to the FIRST character.

      i = 4 → 'o' → r = "o"
      i = 3 → 'l' → r = "ol"
      i = 2 → 'l' → r = "oll"
      i = 1 → 'e' → r = "olle"
      i = 0 → 'h' → r = "olleh"

  Step 3:
  Print the reversed word.

  Final answer = "olleh"
*/
