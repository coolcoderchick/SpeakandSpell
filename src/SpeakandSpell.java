import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class SpeakandSpell {
	public static void main(String[] args) throws FileNotFoundException {
		String correctWord=Dictionary.getrandomword();
		speak("Spell "+ correctWord);
		String userWord;
		userWord=JOptionPane.showInputDialog("");
		if(userWord.equalsIgnoreCase(correctWord))
			speak("correct");
		else
			speak("incorrect");
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
