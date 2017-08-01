/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about the execution of a Job Release task on a compute
 * node.
 */
public class JobReleaseTaskExecutionInformation {
    /**
     * The time at which the task started running. Note that every time the
     * task is restarted, this value is updated.
     */
    @JsonProperty(value = "startTime", required = true)
    private DateTime startTime;

    /**
     * The time at which the Job Release task completed.
     * This property is set only if the task is in the Completed state.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The current state of the Job Release task on the compute node.
     * running - the task is currently running (including retrying). completed
     * - the task has exited, or the Batch service was unable to start the task
     * due to scheduling errors. Possible values include: 'running',
     * 'completed'.
     */
    @JsonProperty(value = "state", required = true)
    private JobReleaseTaskState state;

    /**
     * The root directory of the Job Release task on the compute node. You can
     * use this path to retrieve files created by the task, such as log files.
     */
    @JsonProperty(value = "taskRootDirectory")
    private String taskRootDirectory;

    /**
     * The URL to the root directory of the Job Release task on the compute
     * node.
     */
    @JsonProperty(value = "taskRootDirectoryUrl")
    private String taskRootDirectoryUrl;

    /**
     * The exit code of the program specified on the task command line.
     * This parameter is returned only if the task is in the completed state.
     * The exit code for a process reflects the specific convention implemented
     * by the application developer for that process. If you use the exit code
     * value to make decisions in your code, be sure that you know the exit
     * code convention used by the application process. Note that the exit code
     * may also be generated by the compute node operating system, such as when
     * a process is forcibly terminated.
     */
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /**
     * Information describing the task failure, if any.
     * This property is set only if the task is in the completed state and
     * encountered a failure.
     */
    @JsonProperty(value = "failureInfo")
    private TaskFailureInformation failureInfo;

    /**
     * The result of the task execution.
     * If the value is 'failed', then the details of the failure can be found
     * in the failureInfo property. Possible values include: 'success',
     * 'failure'.
     */
    @JsonProperty(value = "result")
    private TaskExecutionResult result;

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the JobReleaseTaskExecutionInformation object itself.
     */
    public JobReleaseTaskExecutionInformation withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the JobReleaseTaskExecutionInformation object itself.
     */
    public JobReleaseTaskExecutionInformation withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public JobReleaseTaskState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the JobReleaseTaskExecutionInformation object itself.
     */
    public JobReleaseTaskExecutionInformation withState(JobReleaseTaskState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the taskRootDirectory value.
     *
     * @return the taskRootDirectory value
     */
    public String taskRootDirectory() {
        return this.taskRootDirectory;
    }

    /**
     * Set the taskRootDirectory value.
     *
     * @param taskRootDirectory the taskRootDirectory value to set
     * @return the JobReleaseTaskExecutionInformation object itself.
     */
    public JobReleaseTaskExecutionInformation withTaskRootDirectory(String taskRootDirectory) {
        this.taskRootDirectory = taskRootDirectory;
        return this;
    }

    /**
     * Get the taskRootDirectoryUrl value.
     *
     * @return the taskRootDirectoryUrl value
     */
    public String taskRootDirectoryUrl() {
        return this.taskRootDirectoryUrl;
    }

    /**
     * Set the taskRootDirectoryUrl value.
     *
     * @param taskRootDirectoryUrl the taskRootDirectoryUrl value to set
     * @return the JobReleaseTaskExecutionInformation object itself.
     */
    public JobReleaseTaskExecutionInformation withTaskRootDirectoryUrl(String taskRootDirectoryUrl) {
        this.taskRootDirectoryUrl = taskRootDirectoryUrl;
        return this;
    }

    /**
     * Get the exitCode value.
     *
     * @return the exitCode value
     */
    public Integer exitCode() {
        return this.exitCode;
    }

    /**
     * Set the exitCode value.
     *
     * @param exitCode the exitCode value to set
     * @return the JobReleaseTaskExecutionInformation object itself.
     */
    public JobReleaseTaskExecutionInformation withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get the failureInfo value.
     *
     * @return the failureInfo value
     */
    public TaskFailureInformation failureInfo() {
        return this.failureInfo;
    }

    /**
     * Set the failureInfo value.
     *
     * @param failureInfo the failureInfo value to set
     * @return the JobReleaseTaskExecutionInformation object itself.
     */
    public JobReleaseTaskExecutionInformation withFailureInfo(TaskFailureInformation failureInfo) {
        this.failureInfo = failureInfo;
        return this;
    }

    /**
     * Get the result value.
     *
     * @return the result value
     */
    public TaskExecutionResult result() {
        return this.result;
    }

    /**
     * Set the result value.
     *
     * @param result the result value to set
     * @return the JobReleaseTaskExecutionInformation object itself.
     */
    public JobReleaseTaskExecutionInformation withResult(TaskExecutionResult result) {
        this.result = result;
        return this;
    }

}