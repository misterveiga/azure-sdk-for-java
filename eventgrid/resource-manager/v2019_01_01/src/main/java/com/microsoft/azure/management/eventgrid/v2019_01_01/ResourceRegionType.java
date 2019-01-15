/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_01_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ResourceRegionType.
 */
public final class ResourceRegionType extends ExpandableStringEnum<ResourceRegionType> {
    /** Static value RegionalResource for ResourceRegionType. */
    public static final ResourceRegionType REGIONAL_RESOURCE = fromString("RegionalResource");

    /** Static value GlobalResource for ResourceRegionType. */
    public static final ResourceRegionType GLOBAL_RESOURCE = fromString("GlobalResource");

    /**
     * Creates or finds a ResourceRegionType from its string representation.
     * @param name a name to look for
     * @return the corresponding ResourceRegionType
     */
    @JsonCreator
    public static ResourceRegionType fromString(String name) {
        return fromString(name, ResourceRegionType.class);
    }

    /**
     * @return known ResourceRegionType values
     */
    public static Collection<ResourceRegionType> values() {
        return values(ResourceRegionType.class);
    }
}
