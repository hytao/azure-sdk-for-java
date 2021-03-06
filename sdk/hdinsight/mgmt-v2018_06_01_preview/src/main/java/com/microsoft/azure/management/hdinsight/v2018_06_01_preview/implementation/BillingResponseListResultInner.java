/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.VmSizeCompatibilityFilterV2;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.BillingResources;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response for the operation to get regional billingSpecs for a
 * subscription.
 */
public class BillingResponseListResultInner {
    /**
     * The virtual machine sizes to include or exclude.
     */
    @JsonProperty(value = "vmSizes")
    private List<String> vmSizes;

    /**
     * The virtual machine filtering mode. Effectively this can enabling or
     * disabling the virtual machine sizes in a particular set.
     */
    @JsonProperty(value = "vmSizeFilters")
    private List<VmSizeCompatibilityFilterV2> vmSizeFilters;

    /**
     * The billing and managed disk billing resources for a region.
     */
    @JsonProperty(value = "billingResources")
    private List<BillingResources> billingResources;

    /**
     * Get the virtual machine sizes to include or exclude.
     *
     * @return the vmSizes value
     */
    public List<String> vmSizes() {
        return this.vmSizes;
    }

    /**
     * Set the virtual machine sizes to include or exclude.
     *
     * @param vmSizes the vmSizes value to set
     * @return the BillingResponseListResultInner object itself.
     */
    public BillingResponseListResultInner withVmSizes(List<String> vmSizes) {
        this.vmSizes = vmSizes;
        return this;
    }

    /**
     * Get the virtual machine filtering mode. Effectively this can enabling or disabling the virtual machine sizes in a particular set.
     *
     * @return the vmSizeFilters value
     */
    public List<VmSizeCompatibilityFilterV2> vmSizeFilters() {
        return this.vmSizeFilters;
    }

    /**
     * Set the virtual machine filtering mode. Effectively this can enabling or disabling the virtual machine sizes in a particular set.
     *
     * @param vmSizeFilters the vmSizeFilters value to set
     * @return the BillingResponseListResultInner object itself.
     */
    public BillingResponseListResultInner withVmSizeFilters(List<VmSizeCompatibilityFilterV2> vmSizeFilters) {
        this.vmSizeFilters = vmSizeFilters;
        return this;
    }

    /**
     * Get the billing and managed disk billing resources for a region.
     *
     * @return the billingResources value
     */
    public List<BillingResources> billingResources() {
        return this.billingResources;
    }

    /**
     * Set the billing and managed disk billing resources for a region.
     *
     * @param billingResources the billingResources value to set
     * @return the BillingResponseListResultInner object itself.
     */
    public BillingResponseListResultInner withBillingResources(List<BillingResources> billingResources) {
        this.billingResources = billingResources;
        return this;
    }

}
