package filesaver;

public interface Strategy {
	String performSaving();
}

class SaveAsJpg implements Strategy {

	@Override
	public String performSaving() {
		
		return "I am saved as .jpg";
	}
}

class SaveAsJava implements Strategy {

	@Override
	public String performSaving() {
		
		return "I am saved as .java";
	}
}

class SaveAsTxt implements Strategy {

	@Override
	public String performSaving() {
		
		return "I am saved as .txt";
	}
}