import AbstractException;
public class AuthenticationException extends AbstractException {
    @Override
    public String getStatus() {
        return "UNAUTHORIZED";
    }
}