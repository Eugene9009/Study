package Shop.DTO;

import Shop.DTO.Errors.ErrorDto;

import java.util.List;

public class ResponseForClientAddProduct {

    private Integer id;
    private List<ErrorDto> errorDtoList;

    public ResponseForClientAddProduct(Integer id, List<ErrorDto> errorDtoList) {
        this.id = id;
        this.errorDtoList = errorDtoList;
    }

    public Integer getId() {
        return id;
    }

    public List<ErrorDto> getErrorDtoList() {
        return errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClientAddProduct{" +
                "id=" + id +
                ", errorDtoList=" + errorDtoList +
                '}';
    }
}
