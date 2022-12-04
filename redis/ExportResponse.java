package com.vibee.model.response.redis;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExportResponse {
    private BigDecimal inPrice;
    private BigDecimal outPrice;
    private int unit;

}
