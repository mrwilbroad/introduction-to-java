package Tokenizing;


/**
 * When you read a sentence, your mind breaks it into tokens—individual words
 * and punctuation marks that convey meaning to you.
 * Compilers also perform tokenization.
 */

public class Sentence {



    public void word(String word){


        boolean isMatch = word.matches("/^[a-zA-Z]{1,}$/");
        System.out.printf("word \"%s\"  has only a-z?  %s%n",word,isMatch);

        String[] wrds = word.split(" ");
        System.out.printf("Length : %d%nWords include :", wrds.length);
        for(String w : wrds){
            System.out.printf("%s,", w);
        }

    }

}
