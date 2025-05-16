package asu.clicknship.Controllers;

import asu.clicknship.Models.Dummy;
import asu.clicknship.Services.DummyService;
import asu.clicknship.Utility.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class api {
    @Autowired
    DummyService service;

    @GetMapping("/get")
    public String get(){
        List<Dummy> list = service.getDummy();
        return Response.send(list);
    }

    @PostMapping("/post")
    public String post(@RequestBody @Valid Dummy dummy){
        service.addDummy(dummy);
        return "Added";
    }
}
