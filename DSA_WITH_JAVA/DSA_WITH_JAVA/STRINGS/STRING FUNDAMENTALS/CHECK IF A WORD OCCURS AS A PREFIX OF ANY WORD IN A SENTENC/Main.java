<<<<<<< HEAD
// LEETCODE => 1455
// CHECK IF A WORD OCCURS AS A PREFIX OF ANY WORD IN A SENTENCE
// TC => O(N+M) => O(N)
// SC => O(N)

import java.util.*;
public class Main{
      static int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentences = sentence.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
    
    public static void main (String[]args){
        // String sentence = "i love eating burger";
        String sentence = "this problem is an easy problem";
        // String searchWord = "burg";
        String searchWord = "pro";
        int res = isPrefixOfWord(sentence, searchWord);
        System.out.println(res);
    }
=======
// LEETCODE => 1455
// CHECK IF A WORD OCCURS AS A PREFIX OF ANY WORD IN A SENTENCE
// TC => O(N+M) => O(N)
// SC => O(N)

import java.util.*;
public class Main{
      static int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentences = sentence.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
    
    public static void main (String[]args){
        // String sentence = "i love eating burger";
        String sentence = "this problem is an easy problem";
        // String searchWord = "burg";
        String searchWord = "pro";
        int res = isPrefixOfWord(sentence, searchWord);
        System.out.println(res);
    }
>>>>>>> f22e72f (DAY32)
}