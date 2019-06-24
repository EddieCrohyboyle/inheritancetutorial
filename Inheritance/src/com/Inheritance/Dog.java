package com.Inheritance;


public class Dog extends Pet {
	private boolean isGuardDog;

	public boolean isGuardDog() {
		return isGuardDog;
	}

	public void setGuardDog(boolean isGuardDog){
		this.isGuardDog = isGuardDog;
	}

	public Dog() {
		super();
	}

	@Override
	public String toString() {
		String myString = super.toString() + "Dog [isGuardDog =" + isGuardDog +"]";
				return myString;
	}

}
