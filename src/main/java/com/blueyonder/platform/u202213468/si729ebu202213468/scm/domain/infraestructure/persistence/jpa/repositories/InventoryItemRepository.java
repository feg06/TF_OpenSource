package com.blueyonder.platform.u202213468.si729ebu202213468.scm.domain.infraestructure.persistence.jpa.repositories;

import com.blueyonder.platform.u202213468.si729ebu202213468.scm.domain.model.aggregates.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {

}