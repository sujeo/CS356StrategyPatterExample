package filesaver;

public interface Strategy {
	String printSavingMethod();
}

class SaveAsJpg implements Strategy {

	@Override
	public String printSavingMethod() {
		
		return "I am saved as .jpg";
	}
	
}

class SaveAsJava implements Strategy {

	@Override
	public String printSavingMethod() {
		
		return "I am saved as .java";
	}
}

class SaveAsTxt implements Strategy {

	@Override
	public String printSavingMethod() {
		
		return "I am saved as .txt";
	}
}