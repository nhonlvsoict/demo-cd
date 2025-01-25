@ControllerAdvise
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    // todo: write javadoc for this method
    /**
     * Global exception handler for all exceptions.
     * 
     * @param e the exception to handle
     * @return a response entity with the exception message and status code 500
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception e, WebRequest request) {
        ProblemDetails problemDetails = ProblemDetails.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        return createResponseEntity(problemDetails, null, HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}