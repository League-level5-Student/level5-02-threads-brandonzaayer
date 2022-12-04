package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	
	
	
	

	Thread r1 = new Thread(()->{
		Robot blue = new Robot(400, 150);
		for(int i = 0; i<360; i++) {
		blue.setPenColor(0, 129, 200);
		blue.penDown();
		blue.setSpeed(10);
		blue.turn(1);
		blue.move(1);
	}
	blue.hide();});
	Thread r2 = new Thread(()->{
		Robot yellow = new Robot(475, 225);
		for(int i = 0; i<360; i++) {
		yellow.setPenColor(252, 177, 49);
		yellow.penDown();
		yellow.setSpeed(10);
		yellow.move(1);
		yellow.turn(1);
	}
	yellow.hide();});
	Thread r3 = new Thread(()->{
		Robot black = new Robot(550, 150);
		for(int i = 0; i<360; i++) {
		black.setPenColor(0, 0, 0);
		black.penDown();
		black.setSpeed(10);
		black.turn(1);
		black.move(1);
	}
	black.hide();});
	Thread r4 = new Thread(()->{
		Robot green = new Robot(625, 225);
		for(int i = 0; i<360; i++) {
		green.setPenColor(Color.green);
		green.penDown();
		green.setSpeed(10);
		green.move(1);
		green.turn(1);
	}
	green.hide();});
	Thread r5 = new Thread(()->{
		Robot red = new Robot(700, 150);
		for(int i = 0; i<360; i++) {
		red.setPenColor(Color.red);
		red.penDown();
		red.setSpeed(10);
		red.move(1);
		red.turn(1);
	}
	red.hide();});
	
	r1.start();
	r2.start();
	r3.start();
	r4.start();
	r5.start();
}
}

