package com.example.happiewatch.api;

import com.example.happiewatch.dto.ItemDto;
import com.example.happiewatch.service.IItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/watch")
public class ApiItem {
    private final IItemService iItemService;

    public ApiItem(IItemService iItemService) {
        this.iItemService = iItemService;
    }

    @PostMapping(value = "/create")
    public ItemDto createNew(@RequestBody ItemDto itemDto) {
        return iItemService.update(itemDto);
    }

    @GetMapping(value = "/show")
    public List<ItemDto> display(){
        return iItemService.display();
    }

    @GetMapping(value = "/search/id={id}")
    public ItemDto getWatchById(@PathVariable("id")long id){
        return iItemService.getItemId(id);
    }

    @PutMapping(value = "/update")
    public ItemDto update(@RequestBody ItemDto itemDto) {
        return iItemService.update(itemDto);
    }

    @DeleteMapping(value = "/delete/id={id}")
    public void deleteNew(@PathVariable("id") long id) {
        iItemService.delete(id);
    }
}
