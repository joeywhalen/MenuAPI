package com.tts.MenuAPI.Model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ItemV1 {

  private String name;
  private String description;
  private String category;
  private List<String> ingredients;
  private double price;
  private Date createdDate;
  private Date updatedDate;
  
}
