package com.blueyonder.platform.u202213468.si729ebu202213468.scm.domain.interfaces.rest.resource;

import com.blueyonder.platform.u202213468.si729ebu202213468.scm.application.internal.commandservices.InventoryItemCommandService;
import com.blueyonder.platform.u202213468.si729ebu202213468.scm.domain.model.aggregates.InventoryItem;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventory-items")
public class InventoryItemResource {

    @Autowired
    private InventoryItemCommandService commandService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create a new Inventory Item", description = "This endpoint creates a new inventory item with the given details.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Inventory Item successfully created"),
            @ApiResponse(responseCode = "400", description = "Invalid input data"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    public InventoryItem createInventoryItem(@RequestBody InventoryItem inventoryItem) {
        return commandService.addInventoryItem(inventoryItem);
    }
}