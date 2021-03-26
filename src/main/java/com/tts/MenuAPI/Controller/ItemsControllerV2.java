package com.tts.MenuAPI.Controller;

import com.tts.MenuAPI.Model.ItemV2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v2")
public class ItemsControllerV2 {
  @GetMapping("/items")
  public ResponseEntity<List<ItemV2>> getItems() {
    return new ResponseEntity<>(new ArrayList<ItemV2>(), HttpStatus.OK);
  }
  @ApiOperation(value = "Get all menu items", response = ItemV2.class,
          responseContainer = "List")

}
