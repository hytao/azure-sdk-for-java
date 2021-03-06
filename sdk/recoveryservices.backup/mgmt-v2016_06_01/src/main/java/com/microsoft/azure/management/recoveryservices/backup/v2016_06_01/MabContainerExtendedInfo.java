/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information for the container.
 */
public class MabContainerExtendedInfo {
    /**
     * The time stamp when this container was refreshed.
     */
    @JsonProperty(value = "lastRefreshedAt")
    private DateTime lastRefreshedAt;

    /**
     * The type of backup items associated with this container. Possible values
     * include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB',
     * 'Exchange', 'Sharepoint', 'DPMUnknown'.
     */
    @JsonProperty(value = "backupItemType")
    private BackupItemType backupItemType;

    /**
     * The list of backup items associated with this container.
     */
    @JsonProperty(value = "backupItems")
    private List<String> backupItems;

    /**
     * The backup policy associated with this container.
     */
    @JsonProperty(value = "policyName")
    private String policyName;

    /**
     * The latest backup status of this container.
     */
    @JsonProperty(value = "lastBackupStatus")
    private String lastBackupStatus;

    /**
     * Get the time stamp when this container was refreshed.
     *
     * @return the lastRefreshedAt value
     */
    public DateTime lastRefreshedAt() {
        return this.lastRefreshedAt;
    }

    /**
     * Set the time stamp when this container was refreshed.
     *
     * @param lastRefreshedAt the lastRefreshedAt value to set
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withLastRefreshedAt(DateTime lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
        return this;
    }

    /**
     * Get the type of backup items associated with this container. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'DPMUnknown'.
     *
     * @return the backupItemType value
     */
    public BackupItemType backupItemType() {
        return this.backupItemType;
    }

    /**
     * Set the type of backup items associated with this container. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'DPMUnknown'.
     *
     * @param backupItemType the backupItemType value to set
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withBackupItemType(BackupItemType backupItemType) {
        this.backupItemType = backupItemType;
        return this;
    }

    /**
     * Get the list of backup items associated with this container.
     *
     * @return the backupItems value
     */
    public List<String> backupItems() {
        return this.backupItems;
    }

    /**
     * Set the list of backup items associated with this container.
     *
     * @param backupItems the backupItems value to set
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withBackupItems(List<String> backupItems) {
        this.backupItems = backupItems;
        return this;
    }

    /**
     * Get the backup policy associated with this container.
     *
     * @return the policyName value
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Set the backup policy associated with this container.
     *
     * @param policyName the policyName value to set
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get the latest backup status of this container.
     *
     * @return the lastBackupStatus value
     */
    public String lastBackupStatus() {
        return this.lastBackupStatus;
    }

    /**
     * Set the latest backup status of this container.
     *
     * @param lastBackupStatus the lastBackupStatus value to set
     * @return the MabContainerExtendedInfo object itself.
     */
    public MabContainerExtendedInfo withLastBackupStatus(String lastBackupStatus) {
        this.lastBackupStatus = lastBackupStatus;
        return this;
    }

}
