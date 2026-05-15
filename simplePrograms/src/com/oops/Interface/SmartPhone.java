package com.oops.Interface;

public class SmartPhone implements Camera, MusicPlayer{

	@Override
	public void takePhoto() {
		System.out.println("Click The Picture ");
	}

	@Override
	public void playMusic() {
		System.out.println("Play the music");
	}
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.takePhoto();
		s.playMusic();
	}

}
