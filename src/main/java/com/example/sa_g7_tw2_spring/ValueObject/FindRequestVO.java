package com.example.sa_g7_tw2_spring.ValueObject;

import com.google.firestore.v1.TransactionOptions;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class FindRequestVO {
    private String account;
    private String token;
    private String message;

}
