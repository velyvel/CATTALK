package com.cattalkbackend.sample;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
// swagger 에 표시되는 controller 이름(name)과 설명(description)
@Tag(name = "샘플컨트롤러", description = "샘플이다옹 냠냠")
public class SampleController {
  /**
   * 리액트에서 확인하기 : cd cattalk_frontend > npm run dev
   * swagger 에서 확인하기 :http://localhost:8085/swagger-ui.html => API 문서 확인 가능
   * */

  private final SampleService sampleService;

  // read : 리턴타입 String
  @GetMapping("/api/v1/sample")
  public ResponseEntity<String> sample() {
    try{
      return new ResponseEntity<>("this_is_sample", HttpStatus.OK);
    }catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  // read :리퀘스트 없고 리턴타입 json : 서버에서 만들어준 데이터 화면에 뿌려줄 경우
  @GetMapping("/api/v1/sample_2")
  public ResponseEntity<ResponseDto> sample_2() {
    try {
      // dto 만들기
      ResponseDto responseDto = sampleService.makeResponseDtoData();
      return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  // create => 화면에서 받은 값(param 있고, 저장하기)
  @PostMapping("/api/v1/sample")
  public ResponseEntity<?> sample_3(@RequestBody RequestDto dto){
    try {
      sampleService.saveToDatabase(dto);
      return new ResponseEntity<>(HttpStatus.OK);
    }catch (Exception e){
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  // read => list read without paging

  // read => list read with paging

  // update

  // safe_delete => update

  // hard_delete => delete


}
