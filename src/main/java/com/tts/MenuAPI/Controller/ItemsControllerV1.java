package com.tts.MenuAPI.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;

public class ItemsControllerV1 {
  @ApiOperation(value = "Get all menu items", response = Item.class,
          responseContainer = "List")
  @GetMapping("/items")
  public ResponseEntity<List<Item>> getItems() {
    return new ResponseEntity<>(new ArrayList<Item>(), HttpStatus.OK);
  }
}
