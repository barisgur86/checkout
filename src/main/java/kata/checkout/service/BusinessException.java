package kata.checkout.service;

public class BusinessException extends RuntimeException{

    public BusinessException(String message) {
        super(message);
    }
}
