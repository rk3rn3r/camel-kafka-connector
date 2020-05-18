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
package org.apache.camel.kafkaconnector.etcdstats;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelEtcdstatsSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_ETCDSTATS_PATH_PATH_CONF = "camel.sink.path.path";
    public static final String CAMEL_SINK_ETCDSTATS_PATH_PATH_DOC = "The path the endpoint refers to";
    public static final String CAMEL_SINK_ETCDSTATS_PATH_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_RECURSIVE_CONF = "camel.sink.endpoint.recursive";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_RECURSIVE_DOC = "To apply an action recursively.";
    public static final Boolean CAMEL_SINK_ETCDSTATS_ENDPOINT_RECURSIVE_DEFAULT = false;
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_SERVICE_PATH_CONF = "camel.sink.endpoint.servicePath";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_SERVICE_PATH_DOC = "The path to look for for service discovery";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_SERVICE_PATH_DEFAULT = "/services/";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_TIMEOUT_CONF = "camel.sink.endpoint.timeout";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_TIMEOUT_DOC = "To set the maximum time an action could take to complete.";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_URIS_CONF = "camel.sink.endpoint.uris";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_URIS_DOC = "To set the URIs the client connects.";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_URIS_DEFAULT = "http://localhost:2379,http://localhost:4001";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ETCDSTATS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_TIME_TO_LIVE_CONF = "camel.sink.endpoint.timeToLive";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_TIME_TO_LIVE_DOC = "To set the lifespan of a key in milliseconds.";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_TIME_TO_LIVE_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_ETCDSTATS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_ETCDSTATS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_PASSWORD_DOC = "The password to use for basic authentication.";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters.";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_USER_NAME_CONF = "camel.sink.endpoint.userName";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_USER_NAME_DOC = "The user name to use for basic authentication.";
    public static final String CAMEL_SINK_ETCDSTATS_ENDPOINT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_CONFIGURATION_CONF = "camel.component.etcd-stats.configuration";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_CONFIGURATION_DOC = "Component configuration.";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_RECURSIVE_CONF = "camel.component.etcd-stats.recursive";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_RECURSIVE_DOC = "To apply an action recursively.";
    public static final Boolean CAMEL_SINK_ETCDSTATS_COMPONENT_RECURSIVE_DEFAULT = false;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_SERVICE_PATH_CONF = "camel.component.etcd-stats.servicePath";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_SERVICE_PATH_DOC = "The path to look for for service discovery";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_SERVICE_PATH_DEFAULT = "/services/";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_TIMEOUT_CONF = "camel.component.etcd-stats.timeout";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_TIMEOUT_DOC = "To set the maximum time an action could take to complete.";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_URIS_CONF = "camel.component.etcd-stats.uris";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_URIS_DOC = "To set the URIs the client connects.";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_URIS_DEFAULT = "http://localhost:2379,http://localhost:4001";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.etcd-stats.lazyStartProducer";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ETCDSTATS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_TIME_TO_LIVE_CONF = "camel.component.etcd-stats.timeToLive";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_TIME_TO_LIVE_DOC = "To set the lifespan of a key in milliseconds.";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_TIME_TO_LIVE_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.etcd-stats.basicPropertyBinding";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_ETCDSTATS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_PASSWORD_CONF = "camel.component.etcd-stats.password";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_PASSWORD_DOC = "The password to use for basic authentication.";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.etcd-stats.sslContextParameters";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters.";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.etcd-stats.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_ETCDSTATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_USER_NAME_CONF = "camel.component.etcd-stats.userName";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_USER_NAME_DOC = "The user name to use for basic authentication.";
    public static final String CAMEL_SINK_ETCDSTATS_COMPONENT_USER_NAME_DEFAULT = null;

    public CamelEtcdstatsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelEtcdstatsSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_ETCDSTATS_PATH_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_PATH_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_PATH_PATH_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_RECURSIVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ETCDSTATS_ENDPOINT_RECURSIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_RECURSIVE_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_SERVICE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_ENDPOINT_SERVICE_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_SERVICE_PATH_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_URIS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_ENDPOINT_URIS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_URIS_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ETCDSTATS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_TIME_TO_LIVE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_ENDPOINT_TIME_TO_LIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_TIME_TO_LIVE_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ETCDSTATS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ETCDSTATS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_ENDPOINT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_ENDPOINT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_ENDPOINT_USER_NAME_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_RECURSIVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ETCDSTATS_COMPONENT_RECURSIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_RECURSIVE_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_SERVICE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_COMPONENT_SERVICE_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_SERVICE_PATH_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_COMPONENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_URIS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_COMPONENT_URIS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_URIS_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ETCDSTATS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_TIME_TO_LIVE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_COMPONENT_TIME_TO_LIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_TIME_TO_LIVE_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ETCDSTATS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ETCDSTATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_ETCDSTATS_COMPONENT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ETCDSTATS_COMPONENT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ETCDSTATS_COMPONENT_USER_NAME_DOC);
        return conf;
    }
}