package lk.ijse.thogakade.dto.tm;



import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerTM {
    private String id;
    private String name;
    private String address;
    private Double salary;
}
