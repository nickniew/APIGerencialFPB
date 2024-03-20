package nickniew.feedplayback.apigerencial.handler;

import nickniew.feedplayback.apigerencial.service.exceptions.NoHandlerFoundException;
import nickniew.feedplayback.apigerencial.service.exceptions.ObjectInvalidException;
import nickniew.feedplayback.apigerencial.service.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author Nickniew
 */
@RestControllerAdvice
public class SourceHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<String> handleSourceNotFoundException(ObjectNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Usuário não encontrado: " + e.getMessage());
    }

    @ExceptionHandler(ObjectInvalidException.class)
    public ResponseEntity<String> handleSourceInvalidException(ObjectInvalidException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Usuário inválido: " + e.getMessage());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleNoHandlerFoundException(NoHandlerFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Página não encontrada: " + e.getMessage());
    }

}
