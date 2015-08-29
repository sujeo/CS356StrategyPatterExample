package filesaver;

public class File {
	
	public Strategy savingStrategy;
	
	public File() {
		
	}
	
	public void setSavingStrategy(Strategy newStrategy){
		savingStrategy = newStrategy;
	}
	
	public String printSavingStrategy(){
		return savingStrategy.performSaving();
	}
}
