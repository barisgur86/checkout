package kata.checkout.controller;

public class ErrorResponse {
    private String error;

    public static ErrorResponse message(String message){
        ErrorResponse response = new ErrorResponse();
        response.setError(message);
        return response;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
