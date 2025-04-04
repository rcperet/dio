package exception;

public class ParametrosInvalidosException extends RuntimeException {

	private static final long serialVersionUID = -277865238149542821L;

	public ParametrosInvalidosException(String message) {
		super(message);
	}

	public ParametrosInvalidosException(Throwable cause) {
		super(cause);
	}

	public ParametrosInvalidosException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParametrosInvalidosException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
