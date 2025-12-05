package jhol.dev.generics.exemplo1;

public class EmailValidator implements Validator<String> {

	@Override
	public boolean isValid(String email) {
		return email.contains("@");
	}

}
