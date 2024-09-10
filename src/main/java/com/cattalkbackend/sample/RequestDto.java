package com.cattalkbackend.sample;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "테스트용 DTO")
public class RequestDto {

  @Schema(description = "테스트 코드, Long", example = "0000")
  private Long code;
  @Schema(description = "테스트 값", example = "테스트코드다옹")
  private String message;
}
