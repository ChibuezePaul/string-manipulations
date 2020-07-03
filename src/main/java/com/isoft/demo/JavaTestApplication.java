package com.isoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class JavaTestApplication {
	private static int a;
	public static void main ( String[] args ) {
		SpringApplication.run ( JavaTestApplication.class , args );
		System.out.println (a);
	}
	
	public static void printDuplicateCharacters(String duplicateCharacterText){
		String trimmedDuplicateCharacterText = duplicateCharacterText.replaceAll ( "\\s" , "" );
		Set< Character > duplicatedCharacters = new HashSet<> (  );
		for ( int i = 0; i < trimmedDuplicateCharacterText.length (); i++ ) {
			char currentChar = trimmedDuplicateCharacterText.charAt ( i );
			String subString = trimmedDuplicateCharacterText.substring ( i+1 );
			if(subString.contains ( ""+currentChar ) ){
				duplicatedCharacters.add ( currentChar );
			}
		}
		duplicatedCharacters.forEach ( System.out :: println );
	}
	
	public static void printFirstNonRepeatedCharacters(String repeatedCharacterText){
		String trimmedRepeatedCharacterText = repeatedCharacterText.replaceAll ( "\\s" , "" );
		for ( int i = 0; i < trimmedRepeatedCharacterText.length (); i++ ) {
			char currentChar = trimmedRepeatedCharacterText.charAt ( i );
			String substring = trimmedRepeatedCharacterText.substring ( i+1 );
			if(!substring.contains ( ""+currentChar ) ){
				System.out.println (currentChar);
				break;
			}
		}
	}
	
	public static void printDuplicateCharactersAndCount(String duplicateCharacterText){
		String trimmedDuplicateCharacterText = duplicateCharacterText.replaceAll ( "\\s" , "" );
		Map<Character, Integer> duplicateCharactersAndCount = new HashMap<> (  );
		for ( int i = 0; i < trimmedDuplicateCharacterText.length (); i++ ) {
			char currentChar = trimmedDuplicateCharacterText.charAt ( i );
			String substring = trimmedDuplicateCharacterText.substring ( i+1 );
			int count = 1;
			if(duplicateCharactersAndCount.get ( currentChar )==null && substring.contains ( ""+currentChar ) ){
				for ( int j = 0; j <substring.length (); j++ ) {
					if ( currentChar == substring.charAt ( j ) ) {
						count++;
					}
				}
				duplicateCharactersAndCount.put ( currentChar, count );
			}
		}
		duplicateCharactersAndCount.forEach ( ( character , integer ) -> System.out.println (character + ": " + integer) );
	}
	
}