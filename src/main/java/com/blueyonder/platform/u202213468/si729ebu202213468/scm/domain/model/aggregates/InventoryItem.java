package com.blueyonder.platform.u202213468.si729ebu202213468.scm.domain.model.aggregates;

import com.blueyonder.platform.u202213468.si729ebu202213468.scm.domain.model.valueobjects.SkuIdentifier;
import com.blueyonder.platform.u202213468.si729ebu202213468.shared.domain.model.entities.AuditableModel;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Schema(description = "Represents an Inventory Item in the system")
@Entity
public class InventoryItem extends AuditableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "The unique ID of the inventory item")
    private Long id;

    @Embedded
    @Schema(description = "Unique SKU identifier")
    private SkuIdentifier skuIdentifier;

    @Enumerated(EnumType.STRING)
    @Schema(description = "The status of the inventory item")
    private InventoryItemStatus status = InventoryItemStatus.WITH_STOCK;

    @Schema(description = "Minimum quantity required for the inventory item")
    private Double minimumQuantity;

    @Schema(description = "The available quantity in stock")
    private Double availableQuantity;

    @Schema(description = "The reserved quantity for orders")
    private Double reservedQuantity = 0.0;

    @Schema(description = "The pending supply quantity")
    private Double pendingSupplyQuantity = 0.0;

    public enum InventoryItemStatus {
        WITH_STOCK,
        OUT_OF_STOCK,
        RESERVED,
        PENDING_SUPPLY
    }
}

