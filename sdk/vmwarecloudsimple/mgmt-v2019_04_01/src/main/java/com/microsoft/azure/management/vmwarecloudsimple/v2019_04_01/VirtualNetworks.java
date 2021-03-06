/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import rx.Observable;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.VirtualNetworksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualNetworks.
 */
public interface VirtualNetworks extends HasInner<VirtualNetworksInner> {
    /**
     * Implements virtual network GET method.
     * Return virtual network by its name.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param virtualNetworkName virtual network id (vsphereId)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetwork> getAsync(String regionId, String pcName, String virtualNetworkName);

    /**
     * Implements list available virtual networks within a subscription method.
     * Return list of virtual networks in location for private cloud.
     *
     * @param regionId The region Id (westus, eastus)
     * @param pcName The private cloud name
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains virtual networks
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetwork> listAsync(final String regionId, final String pcName, final String resourcePoolName);

}
