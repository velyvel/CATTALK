package com.cattalkbackend.sample;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SampleService {

  private final SampleRepository sampleRepository;

  //DB 안쓰기 때문에 Transactional 어노테이션 사용하지 않는다.
  public ResponseDto makeResponseDtoData() {
    ResponseDto responseDto = new ResponseDto();
    responseDto.setCode(0000L);
    responseDto.setMessage("냥톡이라옹");
    return responseDto;
  }

  @Transactional
  public void saveToDatabase(RequestDto dto) {
    //entity 에 @NoArgsConstructor(access = AccessLevel.PROTECTED) 로 설정하여 new 생성자 만들지 않음
    Sample sample = Sample.builder()
        .code(dto.getCode())
        .message(dto.getMessage())
        .build();
    sampleRepository.save(sample);
  }
}
