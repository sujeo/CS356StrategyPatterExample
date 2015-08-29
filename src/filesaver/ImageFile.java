package filesaver;

public class ImageFile extends File {

	public ImageFile(){
		super();
		this.savingStrategy = new SaveAsJpg();
	}
}
