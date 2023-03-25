package com.programs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceRegEx {

    public static void main(String[] args) {
        String sentence = "This is a sentence with repeated words, words like sentence and words";
        
        // Regular expression to match any repeated word
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        
        // Compile the regular expression to be case-insensitive
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        // Replace each repeated word with the first instance of the word
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            sentence = sentence.replaceAll("\\b" + matcher.group(1) + "\\b(?!\\s*(\\S+\\s+)*\\2)", matcher.group(1));
        }
        
        System.out.println(sentence);
    }

}
/*
 * In this program, we first define a string sentence that contains repeated
 * words. We then define a regular expression regex that matches any repeated
 * word using the backreference \1 to refer to the first capturing group, which
 * is any word character (\w+) followed by one or more whitespace characters
 * (\s+) and then the same word character as the first capturing group (\1)
 * surrounded by word boundaries (\b).
 * 
 * We then compile the regular expression to be case-insensitive by passing the
 * Pattern.CASE_INSENSITIVE flag as the second argument to the Pattern.compile
 * method.
 * 
 * Next, we create a Matcher object and use it to find all occurrences of the
 * regular expression in the sentence. For each match, we use the replaceAll
 * method of the String class to replace all occurrences of the repeated word
 * with the very first instance of the word found in the sentence. We use a
 * negative lookahead to make sure that we only replace exact repeated words and
 * not words that happen to contain repeated characters.
 * 
 * Finally, we print out the updated sentence with no repeated words.
 * 
 * Example output:
 */