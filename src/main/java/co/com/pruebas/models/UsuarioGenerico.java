package co.com.pruebas.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class UsuarioGenerico {
    private final String user;
    private final String password;
}