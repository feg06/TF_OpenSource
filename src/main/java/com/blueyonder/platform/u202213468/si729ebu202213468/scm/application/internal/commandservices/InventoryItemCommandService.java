package com.blueyonder.platform.u202213468.si729ebu202213468.scm.application.internal.commandservices;

import com.blueyonder.platform.u202213468.si729ebu202213468.scm.domain.infraestructure.persistence.jpa.repositories.InventoryItemRepository;
import com.blueyonder.platform.u202213468.si729ebu202213468.scm.domain.model.aggregates.InventoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryItemCommandService {

    @Autowired
    private InventoryItemRepository inventoryItemRepository;

    public InventoryItem addInventoryItem(InventoryItem inventoryItem) {
        // Aquí puedes agregar las validaciones antes de guardarlo
        return inventoryItemRepository.save(inventoryItem);
    }
}
