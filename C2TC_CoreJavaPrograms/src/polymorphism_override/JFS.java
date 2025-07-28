package polymorphism_override;

public class JFS extends PLTraining {

	@Override
	public void session(String language) {
		System.out.println(language + "The session going for "+ language + " in core java");
	}
}
