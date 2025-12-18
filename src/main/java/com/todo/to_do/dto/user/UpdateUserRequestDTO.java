package com.todo.to_do.dto.user;

import com.todo.to_do.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
public class UpdateUserRequestDTO {

    @Size(min = 10, max = 80)
    private String fullName;

    @Size(min = 8, max = 20)
    private String password;

    @Email
    private String email;

    public UpdateUserRequestDTO(User entity){
        BeanUtils.copyProperties(entity, this);
    }
}
