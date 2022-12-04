package com.vibee.jedis;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash
public class ImportInWarehouseRedis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Indexed
    private String id;
    @Indexed
    private int productId;
    @Indexed
    private String img;
    @Indexed
    private String productName;
    @Indexed
    private String barcode;
    @Indexed
    private BigDecimal inPrice;
    @Indexed
    private BigDecimal outPrice;
    @Indexed
    private int typeProductId;
    @Indexed
    private int inAmount;
    @Indexed
    private int unitId;
    @Indexed
    private String qrCode;
    @Indexed
    private int supplierId;
    @Indexed
    private String creator;
    @Indexed
    private Date rangeDates;
    @Indexed
    private String description;
    @Indexed
    private String file;
    @Indexed
    private List<ExportRedis> exportRedis;

}
