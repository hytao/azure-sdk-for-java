/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.OperationStatus;
import java.util.List;
import com.microsoft.azure.management.appservice.v2016_08_01.ErrorEntity;
import org.joda.time.DateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An operation on a resource.
 */
public class OperationInner {
    /**
     * Operation ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The current status of the operation. Possible values include:
     * 'InProgress', 'Failed', 'Succeeded', 'TimedOut', 'Created'.
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /**
     * Any errors associate with the operation.
     */
    @JsonProperty(value = "errors")
    private List<ErrorEntity> errors;

    /**
     * Time when operation has started.
     */
    @JsonProperty(value = "createdTime")
    private DateTime createdTime;

    /**
     * Time when operation has been updated.
     */
    @JsonProperty(value = "modifiedTime")
    private DateTime modifiedTime;

    /**
     * Time when operation will expire.
     */
    @JsonProperty(value = "expirationTime")
    private DateTime expirationTime;

    /**
     * Applicable only for stamp operation ids.
     */
    @JsonProperty(value = "geoMasterOperationId")
    private UUID geoMasterOperationId;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public OperationStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errors value.
     *
     * @return the errors value
     */
    public List<ErrorEntity> errors() {
        return this.errors;
    }

    /**
     * Set the errors value.
     *
     * @param errors the errors value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withErrors(List<ErrorEntity> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the createdTime value.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime value.
     *
     * @param createdTime the createdTime value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the modifiedTime value.
     *
     * @return the modifiedTime value
     */
    public DateTime modifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Set the modifiedTime value.
     *
     * @param modifiedTime the modifiedTime value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withModifiedTime(DateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * Get the expirationTime value.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set the expirationTime value.
     *
     * @param expirationTime the expirationTime value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withExpirationTime(DateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Get the geoMasterOperationId value.
     *
     * @return the geoMasterOperationId value
     */
    public UUID geoMasterOperationId() {
        return this.geoMasterOperationId;
    }

    /**
     * Set the geoMasterOperationId value.
     *
     * @param geoMasterOperationId the geoMasterOperationId value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withGeoMasterOperationId(UUID geoMasterOperationId) {
        this.geoMasterOperationId = geoMasterOperationId;
        return this;
    }

}