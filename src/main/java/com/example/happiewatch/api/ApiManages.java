package com.example.happiewatch.api;

import com.example.happiewatch.dto.ManagesOder;
import com.example.happiewatch.entity.Oder_ItemEntity;
import com.example.happiewatch.service.IManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/manages")
public class ApiManages {

    @Autowired
    private IManageService iManageService;

    @PostMapping(value = "/create")
    public ManagesOder createNew(@RequestBody ManagesOder managesOder) {
        return iManageService.update(managesOder);
    }

    @GetMapping(value = "/show")
    public List<Oder_ItemEntity> display(){
        return iManageService.display();
    }

    @PutMapping(value = "/update")
    public ManagesOder update(@RequestBody ManagesOder managesOder) {
        return iManageService.update(managesOder);
    }
}
