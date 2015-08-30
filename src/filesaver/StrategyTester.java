package filesaver;

public class StrategyTester {

	public static void main(String[] args) {
		
		File javaFile = new JavaFile();
		System.out.println("javaFile : " + javaFile.printSavingStrategy());
		
		javaFile.setSavingStrategy(new SaveAsTxt());
		System.out.println("javaFile : " + javaFile.printSavingStrategy());
		
		javaFile.setSavingStrategy(new SaveAsJpg());
		System.out.println("javaFile : " + javaFile.printSavingStrategy());
		System.out.println();
		
		File imageFile = new ImageFile();
		System.out.println("imageFile : " + imageFile.printSavingStrategy());
		
		imageFile.setSavingStrategy(new SaveAsTxt());
		System.out.println("imageFile : " + imageFile.printSavingStrategy());
		
		imageFile.setSavingStrategy(new SaveAsJava());
		System.out.println("imageFile : " + imageFile.printSavingStrategy());
		System.out.println();
		
		File textFile = new TextFile();
		System.out.println("textFile : " + textFile.printSavingStrategy());
		
		textFile.setSavingStrategy(new SaveAsJava());
		System.out.println("textFile : " + textFile.printSavingStrategy());
		
		textFile.setSavingStrategy(new SaveAsJpg());
		System.out.println("textFile : " + textFile.printSavingStrategy());
		System.out.println();	
	}
}
