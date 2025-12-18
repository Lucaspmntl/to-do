package com.todo.to_do.dto.user;

import com.todo.to_do.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserRequestDTO {

    @NotBlank
    @Size(min = 10, max = 80)
    private String fullName;

    @NotBlank
    @Size(min = 8, max = 20)
    private String password;

    @NotBlank
    @Email
    private String email;

    public RegisterUserRequestDTO(User entity){
        BeanUtils.copyProperties(entity, this);
    }
}
