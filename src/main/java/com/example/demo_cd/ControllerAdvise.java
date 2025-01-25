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
    public ResponseEntity<String> handleException(Exception e, WebRequest request) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}