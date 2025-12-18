package com.todo.to_do.dto.task;

import com.todo.to_do.entity.Task;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterTaskRequestDTO {

    @NotBlank
    @Size(max = 40)
    private String name;

    @Size(max = 150)
    private String description;

    @NotBlank
    private LocalDateTime deadLineDate;

    public RegisterTaskRequestDTO(Task entity){
        BeanUtils.copyProperties(entity, this);
    }
}
