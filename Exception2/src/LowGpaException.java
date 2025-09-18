public class LowGpaException extends RuntimeException
{
    @Override
    public String getMessage() {
        return ("You are older than the requested age (25 years) ");
    }
}
