package com.javainterview.stringmanipulation.chinmay;

/*
 * Program to convert leading characters in a sentence to upper case
 */
public class UppercaseSentence {

	public static void main(String[] args) {

		String sentence = "this is a sentence with lower case words";

		String uppercaseSentence = getUpperCaseSentence(sentence);

		System.out.println("Uppercase sentence: " + uppercaseSentence);
	}

	private static String getUpperCaseSentence(String sentence) {

		StringBuffer uppercaseSentence = new StringBuffer();

		String[] sentenceArray = sentence.split(" ");

		if (sentenceArray.length > 0) {
			for (int i = 0; i < sentenceArray.length; i++) {
				String newString = sentenceArray[i].replace(String.valueOf(sentenceArray[i].charAt(0)),
						String.valueOf(sentenceArray[i].charAt(0)).toUpperCase());
				uppercaseSentence.append(newString + " ");
			}
		}

		return uppercaseSentence.toString();
	}

}
