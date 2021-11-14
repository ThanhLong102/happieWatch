package com.example.happiewatch.api;

import com.example.happiewatch.dto.OderDto;
import com.example.happiewatch.entity.OderEntity;
import com.example.happiewatch.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/oder")
public class ApiOder {
    @Autowired
    private IOderService iOderService;

    @PostMapping(value = "/create")
    public OderDto createNew(@RequestBody OderDto oderDto) {
        return iOderService.create(oderDto);
    }

    @GetMapping(value = "/show")
    public List<OderEntity> display(){
        return iOderService.display();
    }

    @DeleteMapping(value = "/delete/code={code}")
    public void deleteNew(@PathVariable("code") String code) {
        iOderService.delete(code);
    }
}
