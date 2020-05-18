/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.mongodb;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelMongodbSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_MONGODB_PATH_CONNECTION_BEAN_CONF = "camel.source.path.connectionBean";
    public static final String CAMEL_SOURCE_MONGODB_PATH_CONNECTION_BEAN_DOC = "Sets the connection bean reference used to lookup a client for connecting to a database.";
    public static final String CAMEL_SOURCE_MONGODB_PATH_CONNECTION_BEAN_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_CONF = "camel.source.endpoint.collection";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_DOC = "Sets the name of the MongoDB collection to bind to this endpoint";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_INDEX_CONF = "camel.source.endpoint.collectionIndex";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_INDEX_DOC = "Sets the collection index (JSON FORMAT : { field1 : order1, field2 : order2})";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_INDEX_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_CREATE_COLLECTION_CONF = "camel.source.endpoint.createCollection";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_CREATE_COLLECTION_DOC = "Create collection during initialisation if it doesn't exist. Default is true.";
    public static final Boolean CAMEL_SOURCE_MONGODB_ENDPOINT_CREATE_COLLECTION_DEFAULT = true;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_DATABASE_CONF = "camel.source.endpoint.database";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_DATABASE_DOC = "Sets the name of the MongoDB database to target";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_DATABASE_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_MONGO_CONNECTION_CONF = "camel.source.endpoint.mongoConnection";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_MONGO_CONNECTION_DOC = "Sets the connection bean used as a client for connecting to a database.";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_MONGO_CONNECTION_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_OPERATION_CONF = "camel.source.endpoint.operation";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_OPERATION_DOC = "Sets the operation this endpoint will execute against MongoDB. One of: [findById] [findOneByQuery] [findAll] [findDistinct] [insert] [save] [update] [remove] [bulkWrite] [aggregate] [getDbStats] [getColStats] [count] [command]";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_OUTPUT_TYPE_CONF = "camel.source.endpoint.outputType";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_OUTPUT_TYPE_DOC = "Convert the output of the producer to the selected type : DocumentList Document or MongoIterable. DocumentList or MongoIterable applies to findAll and aggregate. Document applies to all other operations. One of: [DocumentList] [Document] [MongoIterable]";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_OUTPUT_TYPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_MONGODB_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_CONSUMER_TYPE_CONF = "camel.source.endpoint.consumerType";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_CONSUMER_TYPE_DOC = "Consumer type.";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_CONSUMER_TYPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_MONGODB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_CURSOR_REGENERATION_DELAY_CONF = "camel.source.endpoint.cursorRegenerationDelay";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_CURSOR_REGENERATION_DELAY_DOC = "MongoDB tailable cursors will block until new data arrives. If no new data is inserted, after some time the cursor will be automatically freed and closed by the MongoDB server. The client is expected to regenerate the cursor if needed. This value specifies the time to wait before attempting to fetch a new cursor, and if the attempt fails, how long before the next attempt is made. Default value is 1000ms.";
    public static final Long CAMEL_SOURCE_MONGODB_ENDPOINT_CURSOR_REGENERATION_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_DYNAMICITY_CONF = "camel.source.endpoint.dynamicity";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_DYNAMICITY_DOC = "Sets whether this endpoint will attempt to dynamically resolve the target database and collection from the incoming Exchange properties. Can be used to override at runtime the database and collection specified on the otherwise static endpoint URI. It is disabled by default to boost performance. Enabling it will take a minimal performance hit.";
    public static final Boolean CAMEL_SOURCE_MONGODB_ENDPOINT_DYNAMICITY_DEFAULT = false;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_READ_PREFERENCE_CONF = "camel.source.endpoint.readPreference";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_READ_PREFERENCE_DOC = "Configure how MongoDB clients route read operations to the members of a replica set. Possible values are PRIMARY, PRIMARY_PREFERRED, SECONDARY, SECONDARY_PREFERRED or NEAREST One of: [PRIMARY] [PRIMARY_PREFERRED] [SECONDARY] [SECONDARY_PREFERRED] [NEAREST]";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_READ_PREFERENCE_DEFAULT = "PRIMARY";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_MONGODB_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_CONCERN_CONF = "camel.source.endpoint.writeConcern";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_CONCERN_DOC = "Configure the connection bean with the level of acknowledgment requested from MongoDB for write operations to a standalone mongod, replicaset or cluster. Possible values are ACKNOWLEDGED, W1, W2, W3, UNACKNOWLEDGED, JOURNALED or MAJORITY. One of: [ACKNOWLEDGED] [W1] [W2] [W3] [UNACKNOWLEDGED] [JOURNALED] [MAJORITY]";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_CONCERN_DEFAULT = "ACKNOWLEDGED";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_RESULT_AS_HEADER_CONF = "camel.source.endpoint.writeResultAsHeader";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_RESULT_AS_HEADER_DOC = "In write operations, it determines whether instead of returning WriteResult as the body of the OUT message, we transfer the IN message to the OUT and attach the WriteResult as a header.";
    public static final Boolean CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_RESULT_AS_HEADER_DEFAULT = false;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_STREAM_FILTER_CONF = "camel.source.endpoint.streamFilter";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_STREAM_FILTER_DOC = "Filter condition for change streams consumer.";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_STREAM_FILTER_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_ID_CONF = "camel.source.endpoint.persistentId";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_ID_DOC = "One tail tracking collection can host many trackers for several tailable consumers. To keep them separate, each tracker should have its own unique persistentId.";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_TAIL_TRACKING_CONF = "camel.source.endpoint.persistentTailTracking";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_TAIL_TRACKING_DOC = "Enable persistent tail tracking, which is a mechanism to keep track of the last consumed message across system restarts. The next time the system is up, the endpoint will recover the cursor from the point where it last stopped slurping records.";
    public static final Boolean CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_TAIL_TRACKING_DEFAULT = false;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_COLLECTION_CONF = "camel.source.endpoint.tailTrackCollection";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_COLLECTION_DOC = "Collection where tail tracking information will be persisted. If not specified, MongoDbTailTrackingConfig#DEFAULT_COLLECTION will be used by default.";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_DB_CONF = "camel.source.endpoint.tailTrackDb";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_DB_DOC = "Indicates what database the tail tracking mechanism will persist to. If not specified, the current database will be picked by default. Dynamicity will not be taken into account even if enabled, i.e. the tail tracking database will not vary past endpoint initialisation.";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_DB_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_FIELD_CONF = "camel.source.endpoint.tailTrackField";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_FIELD_DOC = "Field where the last tracked value will be placed. If not specified, MongoDbTailTrackingConfig#DEFAULT_FIELD will be used by default.";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_FIELD_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_INCREASING_FIELD_CONF = "camel.source.endpoint.tailTrackIncreasingField";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_INCREASING_FIELD_DOC = "Correlation field in the incoming record which is of increasing nature and will be used to position the tailing cursor every time it is generated. The cursor will be (re)created with a query of type: tailTrackIncreasingField greater than lastValue (possibly recovered from persistent tail tracking). Can be of type Integer, Date, String, etc. NOTE: No support for dot notation at the current time, so the field should be at the top level of the document.";
    public static final String CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_INCREASING_FIELD_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_COMPONENT_MONGO_CONNECTION_CONF = "camel.component.mongodb.mongoConnection";
    public static final String CAMEL_SOURCE_MONGODB_COMPONENT_MONGO_CONNECTION_DOC = "A connection client provided externally";
    public static final String CAMEL_SOURCE_MONGODB_COMPONENT_MONGO_CONNECTION_DEFAULT = null;
    public static final String CAMEL_SOURCE_MONGODB_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.mongodb.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_MONGODB_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_MONGODB_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_MONGODB_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.mongodb.basicPropertyBinding";
    public static final String CAMEL_SOURCE_MONGODB_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_MONGODB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelMongodbSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelMongodbSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_MONGODB_PATH_CONNECTION_BEAN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_PATH_CONNECTION_BEAN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_MONGODB_PATH_CONNECTION_BEAN_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_INDEX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_INDEX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_COLLECTION_INDEX_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_CREATE_COLLECTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_MONGODB_ENDPOINT_CREATE_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_CREATE_COLLECTION_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_DATABASE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_DATABASE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_DATABASE_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_MONGO_CONNECTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_MONGO_CONNECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_MONGO_CONNECTION_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_OUTPUT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_OUTPUT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_OUTPUT_TYPE_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_MONGODB_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_CONSUMER_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_CONSUMER_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_CONSUMER_TYPE_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_MONGODB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_CURSOR_REGENERATION_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_MONGODB_ENDPOINT_CURSOR_REGENERATION_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_CURSOR_REGENERATION_DELAY_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_DYNAMICITY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_MONGODB_ENDPOINT_DYNAMICITY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_DYNAMICITY_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_READ_PREFERENCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_READ_PREFERENCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_READ_PREFERENCE_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_MONGODB_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_CONCERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_CONCERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_CONCERN_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_RESULT_AS_HEADER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_RESULT_AS_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_WRITE_RESULT_AS_HEADER_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_STREAM_FILTER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_STREAM_FILTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_STREAM_FILTER_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_ID_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_TAIL_TRACKING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_TAIL_TRACKING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_PERSISTENT_TAIL_TRACKING_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_COLLECTION_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_DB_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_DB_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_DB_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_FIELD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_FIELD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_FIELD_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_INCREASING_FIELD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_INCREASING_FIELD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_ENDPOINT_TAIL_TRACK_INCREASING_FIELD_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_COMPONENT_MONGO_CONNECTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MONGODB_COMPONENT_MONGO_CONNECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_COMPONENT_MONGO_CONNECTION_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_MONGODB_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_MONGODB_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_MONGODB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MONGODB_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}