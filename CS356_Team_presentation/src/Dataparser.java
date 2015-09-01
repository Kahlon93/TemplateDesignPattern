
public abstract class  Dataparser {
	
	abstract void readData();
	abstract void parseData();
	
	public final void parseAndGenerateOutput() {
		
		readData();
		parseData();
		writeData();
	}
	
	public final void writeData() {
		System.out.println("Output generated!...");
	}

}
