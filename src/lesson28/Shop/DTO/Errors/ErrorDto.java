package Shop.DTO.Errors;

public class ErrorDto {
    private ErrorCode errorCode;
    private String description;

    public ErrorDto(ErrorCode errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ErrorDto{" +
                "errorCode=" + errorCode +
                ", description='" + description + '\'' +
                '}';
    }
}
