/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.management.network.v2019_08_01.P2SVpnConnectionHealth;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class P2SVpnConnectionHealthImpl extends WrapperImpl<P2SVpnConnectionHealthInner> implements P2SVpnConnectionHealth {
    private final NetworkManager manager;
    P2SVpnConnectionHealthImpl(P2SVpnConnectionHealthInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String sasUrl() {
        return this.inner().sasUrl();
    }

}
