package com.example.happiewatch.service;

import com.example.happiewatch.converter.ItemConverter;
import com.example.happiewatch.dto.ItemDto;
import com.example.happiewatch.entity.ItemEntity;
import com.example.happiewatch.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemService implements IItemService{

    @Autowired
    private ItemConverter itemConverter;

    @Autowired
    private ItemRepository itemRepository;


    @Override
    public List<ItemDto> display(){
        List<ItemEntity> itemEntities = (List<ItemEntity>) itemRepository.findAll();
        List<ItemDto> itemDtos=new ArrayList<>();
        for (ItemEntity a : itemEntities){
            itemDtos.add(itemConverter.toDTO(a));
        }
        return itemDtos;
    }

    @Override
    public ItemDto update(ItemDto itemDto){
        ItemEntity itemEntity =new ItemEntity();
        if (itemDto.getId() != null) {
            ItemEntity oldItemEntity = itemRepository.findOneById(itemDto.getId());
            itemEntity = itemConverter.toEntity(itemDto, oldItemEntity);
        } else {
            itemEntity = itemConverter.toEntity(itemDto);
        }
        itemEntity = itemRepository.save(itemEntity);
        return itemConverter.toDTO(itemEntity);
    }

    @Override
    public ItemDto getItemId(long id){
        ItemEntity itemEntity= itemRepository.findOneById(id);
        return itemConverter.toDTO(itemEntity);
    }

    @Override
    public void delete(long id) {
        ItemEntity newEntity=itemRepository.findOneById(id);
        itemRepository.delete(newEntity);
    }
}
