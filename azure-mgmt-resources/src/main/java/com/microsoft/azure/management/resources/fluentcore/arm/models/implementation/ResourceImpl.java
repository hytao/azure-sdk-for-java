/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.resources.fluentcore.arm.models.implementation;

import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.CreatableImpl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class ResourceImpl<
        FluentModelT,
        InnerModelT extends com.microsoft.azure.Resource,
        FluentModelImplT extends ResourceImpl<FluentModelT, InnerModelT, FluentModelImplT>>
	extends
        CreatableImpl<FluentModelT, InnerModelT>
	implements
        Resource {


    protected ResourceImpl(String key, InnerModelT innerObject) {
        super(key, innerObject);
        
        // Initialize tags
        if(innerObject.getTags() == null) {
            innerObject.setTags(new TreeMap<String, String>());
        }
    }

    /*******************************************
     * Getters
     *******************************************/

    @Override
    public String region() {
        return this.inner().location();
    }

    @Override
    public Map<String, String> tags() {
        Map<String, String> tags = this.inner().getTags();
        if(tags == null) {
            tags = new TreeMap<String, String>();
        }
        return Collections.unmodifiableMap(tags);
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    /**************************************************
     * Tag setters
     **************************************************/

    @SuppressWarnings("unchecked")
    public final FluentModelImplT withTags(Map<String, String> tags) {
        this.inner().setTags(new HashMap<>(tags));
        return (FluentModelImplT) this;
    }

    @SuppressWarnings("unchecked")
    public final FluentModelImplT withTag(String name, String value) {
        this.inner().getTags().put(name, value);
        return (FluentModelImplT) this;
    }

    @SuppressWarnings("unchecked")
    public final FluentModelImplT withoutTag(String name) {
        this.inner().getTags().remove(name);
        return (FluentModelImplT) this;
    }

    /**********************************************
     * Region setters
     **********************************************/

    @SuppressWarnings("unchecked")
    public final FluentModelImplT withRegion(String regionName) {
        this.inner().setLocation(regionName);
        return (FluentModelImplT) this;
    }

    public final FluentModelImplT withRegion(Region region) {
        return this.withRegion(region.toString());
    }
}