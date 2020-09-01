package model;

import java.util.Comparator;


public class ComparatorWord implements Comparator<Word>{

	@Override
	public int compare(Word o1, Word o2) {
//		System.out.println("     "+o1.getSpanishWord()+" " +o2.getSpanishWord());
		return o1.getSpanishWord().compareTo(o2.getSpanishWord());
	}

}
