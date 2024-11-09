package com.ghouse.apibase.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class APIBaseException {
    private String errorMessage;
    private String errorCode;
}
