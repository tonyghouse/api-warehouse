package com.ghouse.apiwarehouse.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class APIWarehouseException {
    private String errorMessage;
    private String errorCode;
}
