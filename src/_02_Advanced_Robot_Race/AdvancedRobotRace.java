package _02_Advanced_Robot_Race;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		int speed1 = rand1.nextInt(100);
		int speed2 = rand2.nextInt(100);
		int speed3 = rand3.nextInt(100);
		ArrayList<String> places = new ArrayList<String>();
		Thread r1 = new Thread(()->{
			Robot one = new Robot(600, 500);
			while(one.getY() != 100) {
				one.setSpeed(speed1);
				one.move(1);
			}
			places.add("Racer 1");
			});
		Thread r2 = new Thread(()->{
			Robot two = new Robot(300, 500);
			while(two.getY() != 100) {
				two.setSpeed(speed2);
				two.move(1);
			}
			places.add("Racer 2");
			});
		Thread r3 = new Thread(()->{
			Robot three = new Robot(500, 500);
			while(three.getY() != 100) {
				three.setSpeed(speed3);
				three.move(1);
			}
			places.add("Racer 3");
			});
		r1.start();
		r2.start();
		r3.start();
		JOptionPane.showMessageDialog(null, places.get(0) + " wins!");
	}
}
