package com.fleetmanager.fleetmanagement.services;

import com.fleetmanager.fleetmanagement.models.Item;
import com.fleetmanager.fleetmanagement.models.dto.ItemDto;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{


    @Override
    public Item createItem(ItemDto itemDto) {
        return null;
    }

    @Override
    public Item updateItemInfo(Long id, ItemDto itemDto) {
        return null;
    }

    @Override
    public Item getAnItem(Long id) {
        return null;
    }

    @Override
    public void deleteItem(Long id) {

    }
}
