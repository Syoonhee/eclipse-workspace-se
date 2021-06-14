public class Computer {
	private CPU cpu;
	private RAM ram;
	private Board board;
	
	public Computer() {
		this.board=new Board();
		this.cpu=new CPU();
		this.ram=new RAM();
	}
	
	
}
