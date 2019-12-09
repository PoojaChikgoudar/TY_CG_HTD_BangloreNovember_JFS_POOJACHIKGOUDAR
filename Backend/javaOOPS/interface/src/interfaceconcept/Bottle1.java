package interfaceconcept;

public interface Bottle1 {
	void open();
	void close();
	default void juice() {
		System.out.println("juice name is");
	}
	static void drink() {
		System.out.println("drinking");
	}

}
