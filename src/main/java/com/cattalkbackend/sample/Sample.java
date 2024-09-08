package com.cattalkbackend.sample;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
@Data
@Accessors(chain = true)
@Table(name = "sample")
public class SampleEntity {

  @Id
  private Long id;

  @Column(name = "code")
  private Long code;

  @Column(name = "message")
  private String message;
}
