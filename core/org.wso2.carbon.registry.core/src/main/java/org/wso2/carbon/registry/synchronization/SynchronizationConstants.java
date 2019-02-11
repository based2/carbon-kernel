/*
 * Copyright (c) 2008, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.registry.synchronization;

/**
 * This class contains the various constants used by the Registry Synchronization API, and its
 * various clients.
 */
public class SynchronizationConstants {

    ////////////////////////////////////////////////////////
    // Names, prefixes and postfixes of meta files
    ////////////////////////////////////////////////////////

    /**
     * The name of the directory containing the meta information related to a check-out.
     */
    public static final String META_DIRECTORY = ".meta";

    /**
     * The prefix of a file containing meta information.
     */
    public static final String META_FILE_PREFIX = "~";

    /**
     * The extension of a file containing meta information.
     */
    public static final String META_FILE_EXTENSION = ".xml";

    /**
     * The name of the temporary file containing the meta information related to a dump.
     */
    public static final String DUMP_META_FILE_NAME = "dump";

    /**
     * The postfix of a mine file created during a conflict between the local and the remote
     * versions of a resource during an update. This reflects the version found on the local
     * filesystem.
     */
    public static final String MINE_FILE_POSTFIX = ".mine";

    /**
     * The postfix of the server file created during a conflict between the local and the remote
     * versions of a resource during an update. This reflects the version found on the remote
     * server.
     */
    public static final String SERVER_FILE_POSTFIX = ".server";

    ////////////////////////////////////////////////////////
    // Names of user input confirmation contexts.
    ////////////////////////////////////////////////////////

    /**
     * The context used when querying the user's choice before a delete operation.
     */
    public static final String DELETE_CONFIRMATION_CONTEXT = "delete";

    /**
     * The context used when querying the user's choice before a check-in operation.
     */
    @SuppressWarnings("unused")
    public static final String CHECK_IN_CONFIRMATION_CONTEXT = "checkIn";

    /**
     * The context used when querying the user's choice before an overwrite operation.
     */
    public static final String OVERWRITE_CONFIRMATION_CONTEXT = "overwrite";

    ////////////////////////////////////////////////////////
    // Other constants used.
    ////////////////////////////////////////////////////////

    /**
     * Name of system property to be set to ignore conflicts generated by the registry
     * synchronization APIs. The value of this system property defaults to false.
     */
    public static final String REGISTRY_IGNORE_CONFLICTS = "carbon.registry.ignore.conflicts";
}
