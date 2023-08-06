package lk.ijse.thogakade.dto;



import lombok.*;

@Data
@AllArgsConstructor
public class CartDTO {
    private String code;
    private Integer qty;
    private Double unitPrice;
}
