/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MoveResourceInputType.
 */
public final class MoveResourceInputType extends ExpandableStringEnum<MoveResourceInputType> {
    /** Static value MoveResourceId for MoveResourceInputType. */
    public static final MoveResourceInputType MOVE_RESOURCE_ID = fromString("MoveResourceId");

    /** Static value MoveResourceSourceId for MoveResourceInputType. */
    public static final MoveResourceInputType MOVE_RESOURCE_SOURCE_ID = fromString("MoveResourceSourceId");

    /**
     * Creates or finds a MoveResourceInputType from its string representation.
     * @param name a name to look for
     * @return the corresponding MoveResourceInputType
     */
    @JsonCreator
    public static MoveResourceInputType fromString(String name) {
        return fromString(name, MoveResourceInputType.class);
    }

    /**
     * @return known MoveResourceInputType values
     */
    public static Collection<MoveResourceInputType> values() {
        return values(MoveResourceInputType.class);
    }
}
