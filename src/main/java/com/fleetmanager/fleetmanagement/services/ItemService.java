package com.fleetmanager.fleetmanagement.services;

import com.fleetmanager.fleetmanagement.models.Item;
import com.fleetmanager.fleetmanagement.models.dto.ItemDto;

public interface ItemService {
    Item createItem (ItemDto itemDto);
    Item updateItemInfo(Long id, ItemDto itemDto);
    Item getAnItem(Long id);
    void deleteItem(Long id);
}
