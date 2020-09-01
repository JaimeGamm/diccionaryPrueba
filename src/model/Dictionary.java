package model;

import structures.BinaryTree;

public class Dictionary {
	
	private static final int START_VARIABLE= 0;
	
	private int totelSpanishToEnglish;
	private String dictionaryOf;
	private BinaryTree<Word> listWord;
	private ComparatorWord comparatorWord;

	
	public Dictionary(String dictionaryOf) {
		comparatorWord=new ComparatorWord();
		listWord= new BinaryTree<>(comparatorWord);
		totelSpanishToEnglish=START_VARIABLE;
		this.dictionaryOf = dictionaryOf;
	
	}
	
	public void addWordSpanishTranslation(String spanishWord,String translation) {
		listWord.insert(new Word(spanishWord, translation));
		totelSpanishToEnglish++;
	}
	
	public String seeTranslationSpanishToEnglish(String spanishWord) {
		return listWord.search(new Word(spanishWord,null)).getTranslation();
	}
	public boolean exictWord(String spanishWord) {
		return listWord.exist(new Word(spanishWord,null));
	}
	public int getTotelSpanishToEnglish() {
		return totelSpanishToEnglish;
	}
	public void setTotelSpanishToEnglish(int totelSpanishToEnglish) {
		this.totelSpanishToEnglish = totelSpanishToEnglish;
	}

	public String getDictionaryOf() {
		return dictionaryOf;
	}

	public void setDictionaryOf(String dictionaryOf) {
		this.dictionaryOf = dictionaryOf;
	}
	
	
//	public void print() {
//		System.out.println("contenido            "+listWord.showleft()+ "  "+ listWord.showRight());
//	}
	
}
