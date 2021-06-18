public class GajunAudio implements GajunVolume, GajunOnOff {
	public void play() {
		System.out.println("play");
	}

	@Override
	public void on() {
		System.out.println("Audio.on()");
		
	}

	@Override
	public void off() {
		System.out.println("Audio.off()");
		
	}

	@Override
	public void up() {
		System.out.println("Audio.up()");
		
	}

	@Override
	public void down() {
		System.out.println("Audio.down()");
		
	}
}
