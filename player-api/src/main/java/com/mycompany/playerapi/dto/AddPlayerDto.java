package com.mycompany.playerapi.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;

@Data
@EqualsAndHashCode(callSuper = true)
public class AddPlayerDto extends BasePlayerDto {

    @ApiModelProperty(position = 5, example = "Ivan")
    @NotBlank
    private String playerName;

    @ApiModelProperty(position = 6, example = "1000000000000000000")
    @NotBlank
    private BigInteger playerPrice;

    @ApiModelProperty(position = 7, example = "http://...")
    @NotBlank
    private String image;

}
