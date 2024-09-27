package com.monjur.jobApp.model;

import java.util.List;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobPost {
  private int postId;
  private String postProfile;
  private String postDesc;
  private Integer reqExperience;
  private List<String> postTechStack;

}
