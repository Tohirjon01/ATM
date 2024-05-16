package uz.atm.aggregate.dto.request_dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.io.Serial;
import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardHolderRequestDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Positive(message = "ID must be a positive number")
    private Long id;
    @NotNull(message = "Please create a PIN code")
    @Size(min = 4 , max = 4 , message = "The PIN code must be 4 characters long")
    private String cardPin;

    @NotNull(message = "User have to id")
    private Long userId;

    @NotNull(message = "User have to id")
    private Long cardTypeId;
}
