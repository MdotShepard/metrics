package com.example.metrics.controller;

import com.example.metrics.model.TModel;
import com.example.metrics.service.TService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/test")
public class TController {

    @Autowired
    TService tService;

    @GetMapping(path = "/getTestModel")
    public ResponseEntity getTestModel() {
        return new ResponseEntity(tService.getTestModel(), HttpStatus.OK);
    }

    @PostMapping(path = "/postTestModel")
    public ResponseEntity saveTestModel(@RequestBody final TModel tModel) {
        return new ResponseEntity(tService.saveTestModel(tModel), HttpStatus.OK);
    }

}
