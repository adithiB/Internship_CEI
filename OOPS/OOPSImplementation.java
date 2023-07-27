
// Abstraction 

abstract class RemoteControl {
	
	public abstract void changeChannel(int channel);
	public abstract void increaseVolume();
	public abstract void decreaseVolume();
	
}

// Encapsulation and Inheritance

class TVRemoteControl extends RemoteControl {
	
	private int currentChannel;
	private int currentVolume;
	
	public TVRemoteControl() {
		currentChannel = 1; 
		currentVolume = 50; 
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentChannel(int channel) {
		currentChannel = channel;
		System.out.println("Channel changed to " + channel);
	}

	public void setCurrentVolume(int volume) {
		currentVolume = volume;
		System.out.println("Volume changed to " + volume);
	}

 // Polymorphism 
 
	public void changeChannel(int channel) {
		setCurrentChannel(channel);
	}

	public void increaseVolume() {
		setCurrentVolume(currentVolume + 1);
	}

	public void decreaseVolume() {
		setCurrentVolume(currentVolume - 1);
	}
	
}

// Inheritance

class PaperWeight extends RemoteControl {
	
	public void changeChannel(int channel) {
		System.out.println("Paper weight cannot change channels.");
	}

	public void increaseVolume() {
		System.out.println("Paper weight cannot increase volume.");
	}

	public void decreaseVolume() {
		System.out.println("Paper weight cannot decrease volume.");
	}
}

// Main 

public class OOPSImplementation {
	
 public static void main(String[] args) {
	 
     RemoteControl tvRemote = new TVRemoteControl();
     tvRemote.changeChannel(4);
     tvRemote.increaseVolume();
     tvRemote.decreaseVolume();

     RemoteControl paperWeight = new PaperWeight();
     paperWeight.changeChannel(5);
     paperWeight.increaseVolume();
     paperWeight.decreaseVolume();
 	}
 
}

