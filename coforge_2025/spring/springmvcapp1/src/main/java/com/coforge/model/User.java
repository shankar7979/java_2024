package com.coforge.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class User {

 @NotNull(message = "userid can not be null")
 @Min(value = 10000,message = "user id must be minimum 10000")
 @Max(value = 50000,message = "user id must be maximum 50000")
 private Integer userId;

 @NotBlank(message = "user name is blank")
 @NotNull(message = "user name is null")
 @Size(min = 5, max = 20, message = "name length must of 5 - 20 character")
 private   String userName;

 @NotNull(message = "user age can not be null")
 @Min(value = 10, message = "age must be minimum 10 years ")
 @Max(value = 60, message = "age must be maximum 60 years ")
 private Integer userAge;

 @Size(min = 1, message = "select hobbies")
 private List<String>  hobbies;

}
