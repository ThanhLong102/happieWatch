package com.example.happiewatch.service;

import com.example.happiewatch.dto.ItemDto;

import java.util.List;

public interface IItemService {
    List<ItemDto> display();

    ItemDto update(ItemDto itemDto);

    ItemDto getItemId(long id);

    void delete(long id);
}
