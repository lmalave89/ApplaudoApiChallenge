package exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class GetExceptions extends SerenityManagedException {

    public static final String FAILED_REFERENCE = "Failed for execute the Get method";

    public GetExceptions(String message, Throwable testErrorException) {
        super(message + FAILED_REFERENCE, testErrorException);
    }
}
