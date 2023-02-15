package co.develhope.firstapi5.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@ToString
public class CarDTO {
    @NotBlank(message = "Mandatory!")
    private String id;
    @NotBlank(message = "Mandatory!")
    private String modelName;
    private double price;
public CarDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

}
