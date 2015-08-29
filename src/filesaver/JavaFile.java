package filesaver;

public class JavaFile extends File {
	
	public JavaFile(){
		super();
		this.savingStrategy = new SaveAsJava();
	}
}
