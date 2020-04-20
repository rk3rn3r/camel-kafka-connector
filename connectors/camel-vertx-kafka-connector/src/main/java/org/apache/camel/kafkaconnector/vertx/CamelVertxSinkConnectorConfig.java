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
package org.apache.camel.kafkaconnector.vertx;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelVertxSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_VERTX_PATH_ADDRESS_CONF = "camel.sink.path.address";
    public static final String CAMEL_SINK_VERTX_PATH_ADDRESS_DOC = "Sets the event bus address used to communicate";
    public static final String CAMEL_SINK_VERTX_PATH_ADDRESS_DEFAULT = null;
    public static final String CAMEL_SINK_VERTX_ENDPOINT_PUB_SUB_CONF = "camel.sink.endpoint.pubSub";
    public static final String CAMEL_SINK_VERTX_ENDPOINT_PUB_SUB_DOC = "Whether to use publish/subscribe instead of point to point when sending to a vertx endpoint.";
    public static final String CAMEL_SINK_VERTX_ENDPOINT_PUB_SUB_DEFAULT = null;
    public static final String CAMEL_SINK_VERTX_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_VERTX_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_VERTX_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_VERTX_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_VERTX_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_VERTX_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_VERTX_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_VERTX_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_VERTX_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_VERTX_COMPONENT_HOST_CONF = "camel.component.vertx.host";
    public static final String CAMEL_SINK_VERTX_COMPONENT_HOST_DOC = "Hostname for creating an embedded clustered EventBus";
    public static final String CAMEL_SINK_VERTX_COMPONENT_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_VERTX_COMPONENT_PORT_CONF = "camel.component.vertx.port";
    public static final String CAMEL_SINK_VERTX_COMPONENT_PORT_DOC = "Port for creating an embedded clustered EventBus";
    public static final Integer CAMEL_SINK_VERTX_COMPONENT_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_VERTX_COMPONENT_TIMEOUT_CONF = "camel.component.vertx.timeout";
    public static final String CAMEL_SINK_VERTX_COMPONENT_TIMEOUT_DOC = "Timeout in seconds to wait for clustered Vertx EventBus to be ready. The default value is 60.";
    public static final Integer CAMEL_SINK_VERTX_COMPONENT_TIMEOUT_DEFAULT = 60;
    public static final String CAMEL_SINK_VERTX_COMPONENT_VERTX_CONF = "camel.component.vertx.vertx";
    public static final String CAMEL_SINK_VERTX_COMPONENT_VERTX_DOC = "To use the given vertx EventBus instead of creating a new embedded EventBus";
    public static final String CAMEL_SINK_VERTX_COMPONENT_VERTX_DEFAULT = null;
    public static final String CAMEL_SINK_VERTX_COMPONENT_VERTX_OPTIONS_CONF = "camel.component.vertx.vertxOptions";
    public static final String CAMEL_SINK_VERTX_COMPONENT_VERTX_OPTIONS_DOC = "Options to use for creating vertx";
    public static final String CAMEL_SINK_VERTX_COMPONENT_VERTX_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_VERTX_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.vertx.lazyStartProducer";
    public static final String CAMEL_SINK_VERTX_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_VERTX_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_VERTX_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.vertx.basicPropertyBinding";
    public static final String CAMEL_SINK_VERTX_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_VERTX_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_VERTX_COMPONENT_VERTX_FACTORY_CONF = "camel.component.vertx.vertxFactory";
    public static final String CAMEL_SINK_VERTX_COMPONENT_VERTX_FACTORY_DOC = "To use a custom VertxFactory implementation";
    public static final String CAMEL_SINK_VERTX_COMPONENT_VERTX_FACTORY_DEFAULT = null;

    public CamelVertxSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelVertxSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_VERTX_PATH_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_VERTX_PATH_ADDRESS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_VERTX_PATH_ADDRESS_DOC);
        conf.define(CAMEL_SINK_VERTX_ENDPOINT_PUB_SUB_CONF, ConfigDef.Type.STRING, CAMEL_SINK_VERTX_ENDPOINT_PUB_SUB_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_ENDPOINT_PUB_SUB_DOC);
        conf.define(CAMEL_SINK_VERTX_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_VERTX_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_VERTX_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_VERTX_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_VERTX_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_VERTX_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_VERTX_COMPONENT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_VERTX_COMPONENT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_COMPONENT_HOST_DOC);
        conf.define(CAMEL_SINK_VERTX_COMPONENT_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_VERTX_COMPONENT_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_COMPONENT_PORT_DOC);
        conf.define(CAMEL_SINK_VERTX_COMPONENT_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_VERTX_COMPONENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_COMPONENT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_VERTX_COMPONENT_VERTX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_VERTX_COMPONENT_VERTX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_COMPONENT_VERTX_DOC);
        conf.define(CAMEL_SINK_VERTX_COMPONENT_VERTX_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_VERTX_COMPONENT_VERTX_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_COMPONENT_VERTX_OPTIONS_DOC);
        conf.define(CAMEL_SINK_VERTX_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_VERTX_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_VERTX_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_VERTX_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_VERTX_COMPONENT_VERTX_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_VERTX_COMPONENT_VERTX_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_VERTX_COMPONENT_VERTX_FACTORY_DOC);
        return conf;
    }
}