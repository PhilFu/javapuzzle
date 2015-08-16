package com.javapuzzle.library;

public class Pet {

	public final String name;
	public final String food;
	public final String sound;

	public Pet(String name, String food, String sound) {
		this.name = name;
		this.food = food;
		this.sound = sound;
	}

	public void eat() {
		System.out.println(name + ": Mmmmm, " + food);
	}

	public void play() {
		System.out.println(name + ": " + sound + " " + sound);
	}

	public void sleep() {
		System.out.println(name + ": Zzzzzzzzzzz......");
	}

	public void live() {
		new Thread() {
			@Override
			public void run() {
				while (true) {
					eat();
					play();
					sleep(); // complier will look for the method from inner
								// side, so it could not find the
								// Thread.sleep()..
					Pet.this.sleep();
				}
			}
		}.start();
	}

	public void liveTwo() {
		new Thread(new Runnable() {

			public void run() {
				while (true) {
					eat();
					play();
					sleep();
				}
			}
		}).start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pet("Fido", "beef", "Wood").liveTwo();
	}

}
