package org.tylor.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author liubin10  2018/3/20
 */
@Data
public class UserDto {
    @NotBlank
    String userName;
    @NotBlank
    @Length(min = 5,max=128)
    String password;
}
