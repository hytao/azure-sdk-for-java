/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HanaProvisioningStatesEnum.
 */
public final class HanaProvisioningStatesEnum extends ExpandableStringEnum<HanaProvisioningStatesEnum> {
    /** Static value Accepted for HanaProvisioningStatesEnum. */
    public static final HanaProvisioningStatesEnum ACCEPTED = fromString("Accepted");

    /** Static value Creating for HanaProvisioningStatesEnum. */
    public static final HanaProvisioningStatesEnum CREATING = fromString("Creating");

    /** Static value Updating for HanaProvisioningStatesEnum. */
    public static final HanaProvisioningStatesEnum UPDATING = fromString("Updating");

    /** Static value Failed for HanaProvisioningStatesEnum. */
    public static final HanaProvisioningStatesEnum FAILED = fromString("Failed");

    /** Static value Succeeded for HanaProvisioningStatesEnum. */
    public static final HanaProvisioningStatesEnum SUCCEEDED = fromString("Succeeded");

    /** Static value Deleting for HanaProvisioningStatesEnum. */
    public static final HanaProvisioningStatesEnum DELETING = fromString("Deleting");

    /** Static value Migrating for HanaProvisioningStatesEnum. */
    public static final HanaProvisioningStatesEnum MIGRATING = fromString("Migrating");

    /**
     * Creates or finds a HanaProvisioningStatesEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding HanaProvisioningStatesEnum
     */
    @JsonCreator
    public static HanaProvisioningStatesEnum fromString(String name) {
        return fromString(name, HanaProvisioningStatesEnum.class);
    }

    /**
     * @return known HanaProvisioningStatesEnum values
     */
    public static Collection<HanaProvisioningStatesEnum> values() {
        return values(HanaProvisioningStatesEnum.class);
    }
}
