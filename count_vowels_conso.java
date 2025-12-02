
public class count_vowels_conso {
    public static void main(String[] args){
        String s="Hello",l=s.toLowerCase();
        int v=0,c=0;
        for(char ch:l.toCharArray()){
            if(ch>='a'&&ch<='z'){
                if("aeiou".indexOf(ch)!=-1) v++; else c++;
            }
        }
        System.out.println("V="+v+" C="+c);
    }
}
/* 12th prg
  This program counts how many VOWELS and CONSONANTS are in a word.

  Our word is:
      "Hello"

  Step 1:
  Convert the word to lowercase:
      "hello"
  (This makes checking easier.)

  Step 2:
  Create two counters:
      v = number of vowels (start 0)
      c = number of consonants (start 0)

  Step 3:
  Go through each letter one by one:

      h → is a letter → not a vowel → consonant → c++
      e → vowel → v++
      l → consonant → c++
      l → consonant → c++
      o → vowel → v++

  Step 4:
  Final count:
      vowels (v) = 2  → e, o
      consonants (c) = 3 → h, l, l

  Step 5:
  Print the result:
      V = 2   C = 3

  Final output = V=2 C=3
*/

