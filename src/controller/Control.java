package controller;


import model.Dictionary;
import view.IoManager;

public class Control {
//	hola prueba 
	public static final int OPTION_SPANISH_ENGLISH = 1;
	public static final int OPTION_SPANISH_FRENCH = 2;
	public static final String DICTIONARY_SPANISH_INGLESH = "ESPAÑOR INGLES";
	public static final String DICTIONARY_SPANISH_FRENCH = "ESPAÑOR FRANSES";
    IoManager io;
    Dictionary dictionarySpanishEnglish;
    Dictionary dictionarySpanishFrench;
	public Control() {
	    io = new IoManager();
	    dictionarySpanishEnglish = new Dictionary(DICTIONARY_SPANISH_INGLESH);
	    dictionarySpanishFrench= new Dictionary(DICTIONARY_SPANISH_FRENCH);
	    init();
	    mainMenu();
	   
	}
	private void init() {
		dictionarySpanishEnglish.addWordSpanishTranslation("casa", "house");
		dictionarySpanishEnglish.addWordSpanishTranslation("gato", "cat");
//		dictionarySpanishEnglish.addWordSpanishTranslation("carro", "car");
//		dictionarySpanishEnglish.addWordSpanishTranslation("palabra", "word");
	}
	 public void mainMenu() {
    	 int op=0;
    		 do {
         		try{
                 	op = io.getUserOption();
                 	switch (op) {
                 		case OPTION_SPANISH_ENGLISH:
                 			secondaryMenu(dictionarySpanishEnglish);
                 			break;            
                     	case OPTION_SPANISH_FRENCH:
                     		secondaryMenu(dictionarySpanishFrench);
                     		break;
                     	default:
                    	 	io.showErrorMessage();
                   		}  	
                 	}catch (NumberFormatException e) {
                	 	io.showErrorMessage();
                     }
           
         	} while (op != 3);
     }


	 public void secondaryMenu(Dictionary dictionary) {
		 int op=0;
		 	do {
		 		try{
		 			op = io.getUserOptionSecondary(dictionary.getDictionaryOf());
		 			switch (op) {
		 			case 1:
		 				addWordDictionary(dictionary);
		 				break;            
		 			case 2:
                		searchWordTranslation(dictionary);
                		break;
                	case 3:
                		seeNumberOfWordsInDictionary(dictionary);
                		break;
                	case 4:
                		mainMenu();
                		break;	
                	default:
                		io.showErrorMessageOptionSecondary();
              		}  	
            	}catch (NumberFormatException e) {
            			io.showErrorMessageOptionSecondary();
                }
      
    	} while (op != 4);
	 }
	 
	 private void addWordDictionary(Dictionary dictionary) {
		dictionary.addWordSpanishTranslation(io.getWord(), io.getTranslation());
	}
	 
	 private void searchWordTranslation(Dictionary dictionary) {
		String word= io.searchWordTranslation();
		if(dictionary.exictWord(word)==true) {
			io.printMessageTranslationOfWord(word,dictionary.seeTranslationSpanishToEnglish(word));
		}else {
			io.printMessageNotTranslation();
		}
	}
	
	 private void seeNumberOfWordsInDictionary(Dictionary dictionary) {
		 io.printMessageNumereWord(dictionary.getDictionaryOf(), dictionary.getTotelSpanishToEnglish());
	 }
}
