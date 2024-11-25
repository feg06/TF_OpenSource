package com.blueyonder.platform.u202213468.si729ebu202213468.scm.domain.model.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@Embeddable
@EqualsAndHashCode
public class SkuIdentifier {

    @Getter
    private UUID value;

    public SkuIdentifier() {    }

    public SkuIdentifier(String value) {
        this.value = UUID.fromString(value);
    }


}