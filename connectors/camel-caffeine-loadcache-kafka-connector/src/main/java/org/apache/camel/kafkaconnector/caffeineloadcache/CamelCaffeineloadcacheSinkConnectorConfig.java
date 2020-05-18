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
package org.apache.camel.kafkaconnector.caffeineloadcache;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCaffeineloadcacheSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_CAFFEINELOADCACHE_PATH_CACHE_NAME_CONF = "camel.sink.path.cacheName";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_PATH_CACHE_NAME_DOC = "the cache name";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_PATH_CACHE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_ACTION_CONF = "camel.sink.endpoint.action";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_ACTION_DOC = "To configure the default cache action. If an action is set in the message header, then the operation from the header takes precedence.";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_ACTION_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_CONF = "camel.sink.endpoint.cache";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_DOC = "To configure an already instantiated cache to be used";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_LOADER_CONF = "camel.sink.endpoint.cacheLoader";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_LOADER_DOC = "To configure a CacheLoader in case of a LoadCache use";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_LOADER_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_CONF = "camel.sink.endpoint.createCacheIfNotExist";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_DOC = "Configure if a cache need to be created if it does exist or can't be pre-configured.";
    public static final Boolean CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_DEFAULT = true;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EVICTION_TYPE_CONF = "camel.sink.endpoint.evictionType";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EVICTION_TYPE_DOC = "Set the eviction Type for this cache One of: [size_based] [time_based]";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EVICTION_TYPE_DEFAULT = "SIZE_BASED";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_ACCESS_TIME_CONF = "camel.sink.endpoint.expireAfterAccessTime";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_ACCESS_TIME_DOC = "Set the expire After Access Time in case of time based Eviction (in seconds)";
    public static final Integer CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_ACCESS_TIME_DEFAULT = 300;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_WRITE_TIME_CONF = "camel.sink.endpoint.expireAfterWriteTime";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_WRITE_TIME_DOC = "Set the expire After Access Write in case of time based Eviction (in seconds)";
    public static final Integer CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_WRITE_TIME_DEFAULT = 300;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_INITIAL_CAPACITY_CONF = "camel.sink.endpoint.initialCapacity";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_INITIAL_CAPACITY_DOC = "Set the initial Capacity for the cache";
    public static final Integer CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_INITIAL_CAPACITY_DEFAULT = 10000;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_CONF = "camel.sink.endpoint.key";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_DOC = "To configure the default action key. If a key is set in the message header, then the key from the header takes precedence.";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_MAXIMUM_SIZE_CONF = "camel.sink.endpoint.maximumSize";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_MAXIMUM_SIZE_DOC = "Set the maximum size for the cache";
    public static final Integer CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_MAXIMUM_SIZE_DEFAULT = 10000;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_REMOVAL_LISTENER_CONF = "camel.sink.endpoint.removalListener";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_REMOVAL_LISTENER_DOC = "Set a specific removal Listener for the cache";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_REMOVAL_LISTENER_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_COUNTER_CONF = "camel.sink.endpoint.statsCounter";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_COUNTER_DOC = "Set a specific Stats Counter for the cache stats";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_COUNTER_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_ENABLED_CONF = "camel.sink.endpoint.statsEnabled";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_ENABLED_DOC = "To enable stats on the cache";
    public static final Boolean CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_TYPE_CONF = "camel.sink.endpoint.keyType";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_TYPE_DOC = "The cache key type, default java.lang.Object";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_VALUE_TYPE_CONF = "camel.sink.endpoint.valueType";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_VALUE_TYPE_DOC = "The cache value type, default java.lang.Object";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_VALUE_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_ACTION_CONF = "camel.component.caffeine-loadcache.action";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_ACTION_DOC = "To configure the default cache action. If an action is set in the message header, then the operation from the header takes precedence.";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_ACTION_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_CONF = "camel.component.caffeine-loadcache.cache";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_DOC = "To configure an already instantiated cache to be used";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_LOADER_CONF = "camel.component.caffeine-loadcache.cacheLoader";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_LOADER_DOC = "To configure a CacheLoader in case of a LoadCache use";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_LOADER_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_CONF = "camel.component.caffeine-loadcache.createCacheIfNotExist";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_DOC = "Configure if a cache need to be created if it does exist or can't be pre-configured.";
    public static final Boolean CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_DEFAULT = true;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EVICTION_TYPE_CONF = "camel.component.caffeine-loadcache.evictionType";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EVICTION_TYPE_DOC = "Set the eviction Type for this cache One of: [size_based] [time_based]";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EVICTION_TYPE_DEFAULT = "SIZE_BASED";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_ACCESS_TIME_CONF = "camel.component.caffeine-loadcache.expireAfterAccessTime";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_ACCESS_TIME_DOC = "Set the expire After Access Time in case of time based Eviction (in seconds)";
    public static final Integer CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_ACCESS_TIME_DEFAULT = 300;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_WRITE_TIME_CONF = "camel.component.caffeine-loadcache.expireAfterWriteTime";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_WRITE_TIME_DOC = "Set the expire After Access Write in case of time based Eviction (in seconds)";
    public static final Integer CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_WRITE_TIME_DEFAULT = 300;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_INITIAL_CAPACITY_CONF = "camel.component.caffeine-loadcache.initialCapacity";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_INITIAL_CAPACITY_DOC = "Set the initial Capacity for the cache";
    public static final Integer CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_INITIAL_CAPACITY_DEFAULT = 10000;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_CONF = "camel.component.caffeine-loadcache.key";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_DOC = "To configure the default action key. If a key is set in the message header, then the key from the header takes precedence.";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.caffeine-loadcache.lazyStartProducer";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_MAXIMUM_SIZE_CONF = "camel.component.caffeine-loadcache.maximumSize";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_MAXIMUM_SIZE_DOC = "Set the maximum size for the cache";
    public static final Integer CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_MAXIMUM_SIZE_DEFAULT = 10000;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_REMOVAL_LISTENER_CONF = "camel.component.caffeine-loadcache.removalListener";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_REMOVAL_LISTENER_DOC = "Set a specific removal Listener for the cache";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_REMOVAL_LISTENER_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_COUNTER_CONF = "camel.component.caffeine-loadcache.statsCounter";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_COUNTER_DOC = "Set a specific Stats Counter for the cache stats";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_COUNTER_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_ENABLED_CONF = "camel.component.caffeine-loadcache.statsEnabled";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_ENABLED_DOC = "To enable stats on the cache";
    public static final Boolean CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.caffeine-loadcache.basicPropertyBinding";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CONFIGURATION_CONF = "camel.component.caffeine-loadcache.configuration";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CONFIGURATION_DOC = "Sets the global component configuration";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_TYPE_CONF = "camel.component.caffeine-loadcache.keyType";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_TYPE_DOC = "The cache key type, default java.lang.Object";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_VALUE_TYPE_CONF = "camel.component.caffeine-loadcache.valueType";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_VALUE_TYPE_DOC = "The cache value type, default java.lang.Object";
    public static final String CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_VALUE_TYPE_DEFAULT = null;

    public CamelCaffeineloadcacheSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCaffeineloadcacheSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_PATH_CACHE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_PATH_CACHE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_CAFFEINELOADCACHE_PATH_CACHE_NAME_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_ACTION_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_LOADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_LOADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CACHE_LOADER_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_CREATE_CACHE_IF_NOT_EXIST_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EVICTION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EVICTION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EVICTION_TYPE_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_ACCESS_TIME_CONF, ConfigDef.Type.INT, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_ACCESS_TIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_ACCESS_TIME_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_WRITE_TIME_CONF, ConfigDef.Type.INT, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_WRITE_TIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_EXPIRE_AFTER_WRITE_TIME_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_INITIAL_CAPACITY_CONF, ConfigDef.Type.INT, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_INITIAL_CAPACITY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_INITIAL_CAPACITY_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_MAXIMUM_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_MAXIMUM_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_MAXIMUM_SIZE_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_REMOVAL_LISTENER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_REMOVAL_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_REMOVAL_LISTENER_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_COUNTER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_COUNTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_COUNTER_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_STATS_ENABLED_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_KEY_TYPE_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_VALUE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_VALUE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_ENDPOINT_VALUE_TYPE_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_ACTION_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_LOADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_LOADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CACHE_LOADER_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CREATE_CACHE_IF_NOT_EXIST_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EVICTION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EVICTION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EVICTION_TYPE_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_ACCESS_TIME_CONF, ConfigDef.Type.INT, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_ACCESS_TIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_ACCESS_TIME_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_WRITE_TIME_CONF, ConfigDef.Type.INT, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_WRITE_TIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_EXPIRE_AFTER_WRITE_TIME_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_INITIAL_CAPACITY_CONF, ConfigDef.Type.INT, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_INITIAL_CAPACITY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_INITIAL_CAPACITY_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_MAXIMUM_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_MAXIMUM_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_MAXIMUM_SIZE_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_REMOVAL_LISTENER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_REMOVAL_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_REMOVAL_LISTENER_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_COUNTER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_COUNTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_COUNTER_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_STATS_ENABLED_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_KEY_TYPE_DOC);
        conf.define(CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_VALUE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_VALUE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CAFFEINELOADCACHE_COMPONENT_VALUE_TYPE_DOC);
        return conf;
    }
}