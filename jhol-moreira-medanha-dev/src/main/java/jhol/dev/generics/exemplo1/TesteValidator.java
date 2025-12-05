package jhol.dev.generics.exemplo1;

public class TesteValidator {
	
	public static void main(String[] args) {
		
		 Validator<String> emailVal = new EmailValidator();
		 
		 System.out.println(emailVal.isValid("alex@gmail.com"));
		 
		 System.out.println(emailVal.isValid("alexgmail.com"));
		 
		 
		 Validator<Integer> numValidator = new NumberValidator();
		 System.out.println("Numero valido? " + numValidator.isValid(10));
		 System.out.println("Numero valido? " + numValidator.isValid(-10));
				 
		 
	}

}
