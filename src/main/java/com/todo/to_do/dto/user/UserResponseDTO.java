package com.todo.to_do.dto.user;

import com.todo.to_do.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {

    private String fullName;
    private Long id;
    private LocalDateTime created_at;

    public UserResponseDTO(User entity){
        BeanUtils.copyProperties(entity, this);
    }
}
