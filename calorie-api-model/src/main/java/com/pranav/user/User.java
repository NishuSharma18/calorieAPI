package com.pranav.user;


import com.pranav.api.ApiKey;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class User {

    private String userId;

    private String name;
    private String email;
    private ApiKey apiKey;
    private LocalDateTime createdAt;
}
