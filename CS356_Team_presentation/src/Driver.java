
public class Driver {

	public static void main (String[] args) {
		
		CSVFile csv = new CSVFile();
		csv. parseAndGenerateOutput();
		
		DatabaseFile db = new DatabaseFile();
		db. parseAndGenerateOutput();
		
	}
}
