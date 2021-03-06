/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VMwareCbt protected disk details.
 */
public class VMwareCbtProtectedDiskDetails {
    /**
     * The disk id.
     */
    @JsonProperty(value = "diskId", access = JsonProperty.Access.WRITE_ONLY)
    private String diskId;

    /**
     * The disk name.
     */
    @JsonProperty(value = "diskName", access = JsonProperty.Access.WRITE_ONLY)
    private String diskName;

    /**
     * The disk path.
     */
    @JsonProperty(value = "diskPath", access = JsonProperty.Access.WRITE_ONLY)
    private String diskPath;

    /**
     * A value indicating whether the disk is the OS disk.
     */
    @JsonProperty(value = "isOSDisk", access = JsonProperty.Access.WRITE_ONLY)
    private String isOSDisk;

    /**
     * The disk capacity in bytes.
     */
    @JsonProperty(value = "capacityInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long capacityInBytes;

    /**
     * The log storage account ARM Id.
     */
    @JsonProperty(value = "logStorageAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String logStorageAccountId;

    /**
     * The key vault secret name of the log storage account.
     */
    @JsonProperty(value = "logStorageAccountSasSecretName", access = JsonProperty.Access.WRITE_ONLY)
    private String logStorageAccountSasSecretName;

    /**
     * The ARM Id of the seed managed disk.
     */
    @JsonProperty(value = "seedManagedDiskId", access = JsonProperty.Access.WRITE_ONLY)
    private String seedManagedDiskId;

    /**
     * The ARM Id of the target managed disk.
     */
    @JsonProperty(value = "targetManagedDiskId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetManagedDiskId;

    /**
     * The disk type. Possible values include: 'Standard_LRS', 'Premium_LRS',
     * 'StandardSSD_LRS'.
     */
    @JsonProperty(value = "diskType")
    private DiskType diskType;

    /**
     * Get the disk id.
     *
     * @return the diskId value
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Get the disk name.
     *
     * @return the diskName value
     */
    public String diskName() {
        return this.diskName;
    }

    /**
     * Get the disk path.
     *
     * @return the diskPath value
     */
    public String diskPath() {
        return this.diskPath;
    }

    /**
     * Get a value indicating whether the disk is the OS disk.
     *
     * @return the isOSDisk value
     */
    public String isOSDisk() {
        return this.isOSDisk;
    }

    /**
     * Get the disk capacity in bytes.
     *
     * @return the capacityInBytes value
     */
    public Long capacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * Get the log storage account ARM Id.
     *
     * @return the logStorageAccountId value
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * Get the key vault secret name of the log storage account.
     *
     * @return the logStorageAccountSasSecretName value
     */
    public String logStorageAccountSasSecretName() {
        return this.logStorageAccountSasSecretName;
    }

    /**
     * Get the ARM Id of the seed managed disk.
     *
     * @return the seedManagedDiskId value
     */
    public String seedManagedDiskId() {
        return this.seedManagedDiskId;
    }

    /**
     * Get the ARM Id of the target managed disk.
     *
     * @return the targetManagedDiskId value
     */
    public String targetManagedDiskId() {
        return this.targetManagedDiskId;
    }

    /**
     * Get the disk type. Possible values include: 'Standard_LRS', 'Premium_LRS', 'StandardSSD_LRS'.
     *
     * @return the diskType value
     */
    public DiskType diskType() {
        return this.diskType;
    }

    /**
     * Set the disk type. Possible values include: 'Standard_LRS', 'Premium_LRS', 'StandardSSD_LRS'.
     *
     * @param diskType the diskType value to set
     * @return the VMwareCbtProtectedDiskDetails object itself.
     */
    public VMwareCbtProtectedDiskDetails withDiskType(DiskType diskType) {
        this.diskType = diskType;
        return this;
    }

}
