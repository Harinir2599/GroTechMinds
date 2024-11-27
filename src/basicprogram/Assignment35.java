package basicprogram;

import java.util.Arrays;

public class Assignment35 {
public static void main(String[] args) {
	String s1 = "Java is fun ";
	String[] splitted_word = s1.split(" ");
	for(int i=0;i<splitted_word.length;i++) {
		System.out.println(splitted_word[i]);
	}
	
	String s2 = "Java,Python,C++ ";
	String[] splitted_word_comma = s2.split("[,]");
	for(int i=0;i<splitted_word_comma.length;i++) {
		System.out.println(splitted_word_comma[i]);
	}
	String s3 = "Java is fun to learn";
	String[] split_word_3 = s3.split(" ",3);
	for(int i=0;i<split_word_3.length;i++) {
		System.out.println(split_word_3[i]);
	}
	String[] count_words=s3.split(" ");
	System.out.println("Number of words->"+count_words.length);
}
}
