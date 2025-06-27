package model.excecoes;

public class SalarioInvalidoException extends Exception{

	private static final long serialVersionUID = 1L;

	public SalarioInvalidoException(String msg) {
		super(msg);
	}
	
}
