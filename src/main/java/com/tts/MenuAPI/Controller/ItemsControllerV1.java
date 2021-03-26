package com.tts.MenuAPI.Controller;

import com.tts.MenuAPI.Model.ItemV1;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value="menuitems", description="Operations pertaining to Menu Items")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved menu items"),
        @ApiResponse(code = 401, message = "You are not authorized to view the menu items")
})

@RestController
@RequestMapping("/v1")
public class ItemsControllerV1 {
  @GetMapping("/items")
  public ResponseEntity<List<ItemV1>> getItems() {
    return new ResponseEntity<>(new ArrayList<ItemV1>(), HttpStatus.OK);
  }
  @ApiOperation(value = "Get all menu items", response = ItemV1.class,
          responseContainer = "List");
}
