package com.armada.backend.controller;


import com.armada.backend.Implementation.GroceryListImpl;
import com.armada.backend.pojo.GroceryList;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/grocery")
public class GroceryListController {

    @Autowired
    private GroceryListImpl groceryListImpl;

    private Logger logger = LoggerFactory.getLogger(GroceryListController.class);

    @RequestMapping(value = "/getAllList", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public List<GroceryList> getAllList() {
        return groceryListImpl.getAllList();
    }

    @RequestMapping(value = "/updateList", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public GroceryList updateList(@RequestBody GroceryList groceryList) {
        return groceryListImpl.updateList(groceryList);
    }
}
