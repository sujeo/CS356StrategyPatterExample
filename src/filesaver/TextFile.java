package filesaver;

public class TextFile extends File {

	public TextFile(){
		super();
		this.savingStrategy = new SaveAsJava();
	}

}
