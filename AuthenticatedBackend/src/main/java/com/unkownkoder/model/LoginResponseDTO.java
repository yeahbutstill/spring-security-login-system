package com.unkownkoder.model;

import com.unkownkoder.entity.ApplicationUser;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Getter
@Setter
public class LoginResponseDTO {

    @NotNull
    private ApplicationUser user;

    @NotBlank
    @NotEmpty
    private String jwt;

}
