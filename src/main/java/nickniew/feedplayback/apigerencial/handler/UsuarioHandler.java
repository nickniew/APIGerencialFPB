package nickniew.feedplayback.apigerencial.handler;

import nickniew.feedplayback.apigerencial.service.exceptions.ObjectInvalidException;
import nickniew.feedplayback.apigerencial.service.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author Nickniew
 */
@RestControllerAdvice
public class UsuarioHandler {
    
        @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<String> handleUsuarioNotFoundException(ObjectNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("Usuário não encontrado: " + e.getMessage());
    }

    @ExceptionHandler(ObjectInvalidException.class)
    public ResponseEntity<String> handleUsuarioInvalidoException(ObjectInvalidException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                             .body("Usuário inválido: " + e.getMessage());
    }
    
}
