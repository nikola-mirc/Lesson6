package exercises;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MurderOfCrows {

	ArrayList<Crow> theMurder = new ArrayList<Crow>();

	public static void main(String[] args) {

		MurderOfCrows murderOfCrows = new MurderOfCrows();
		murderOfCrows.initializeCrows();
		murderOfCrows.findTheDiamond();

	}

	private void findTheDiamond() {

		playCrows();
		JOptionPane.showMessageDialog(null, "Some crow had eaten the diamond, we need get it back.");

		JLabel label1 = new JLabel("Choose your tool:", JLabel.CENTER);
		JLabel label2 = new JLabel("Good choice!", JLabel.CENTER);
		String[] options = new String[] { "butchers knife", "an axe" };
		String[] grab = new String[] { "grab a crow!" };

		JOptionPane.showOptionDialog(null, label1, null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				options, options[0]);
		playSharpen();
		JOptionPane.showOptionDialog(null, label2, null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				grab, options[0]);

		try {
			Thread.sleep(5000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		int deadCrows = 0;

		for (int i = 0; i < theMurder.size(); i++) {

			if (theMurder.get(i).getStomachContents().contains("diamond")) {

				playChopChop();
				JOptionPane.showMessageDialog(null,
						"Found the diamond! It was in " + theMurder.get(i).toString() + "'s stomach.");
				deadCrows++;

				JOptionPane.showMessageDialog(null, "And now, his watch has ended.");
				if (deadCrows == 1) {
					JOptionPane.showMessageDialog(null, "In total we had to kill " + deadCrows + " crow.");
				} else {
					JOptionPane.showMessageDialog(null, "In total we had to kill " + deadCrows + " crows.");
				}
				break;
			} else {
				playChopChop();
				JOptionPane.showMessageDialog(null, ("No diamond here. " + theMurder.get(i)).toString() + " "
						+ "is now dead in pieces. Chop another one?");
				deadCrows++;

			}

		}

	}

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	String sharpenFile = "sound/sharpen.wav";
	String chopChopFile = "sound/chopchop.wav";
	String crowsFile = "sound/crows.wav";

	void playSharpen() {
		playNoise(sharpenFile);
	}

	void playChopChop() {
		playNoise(chopChopFile);
	}

	void playCrows() {
		playNoise(crowsFile);
	}

	private void initializeCrows() {
		theMurder.add(new Crow("Rok"));
		theMurder.add(new Crow("Merle"));
		theMurder.add(new Crow("Poe"));
		theMurder.add(new Crow("Grenwyn"));
		theMurder.add(new Crow("Crawford"));
		hideTheDiamond();
	}

	private void hideTheDiamond() {
		int randomness = new Random().nextInt(theMurder.size());
		theMurder.get(randomness).getStomachContents().add("diamond");
	}
}

class Crow {
	private String name;
	private ArrayList<String> stomachContents = new ArrayList<String>();

	public Crow(String name) {
		this.name = name;
		fillCrowsStomach();
	}

	private void fillCrowsStomach() {
		for (int i = 0; i < 10; i++)
			this.stomachContents.add(getRandomCrowFood());
	}

	private String getRandomCrowFood() {
		int randomness = new Random().nextInt(4);
		if (randomness == 0)
			return "carrion";
		else if (randomness == 1)
			return "snail";
		else if (randomness == 2)
			return "acorn";
		else if (randomness == 3)
			return "spider";
		else
			return "grub";
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getStomachContents() {
		return stomachContents;
	}

	@Override
	public String toString() {
		return name;
	}

}
