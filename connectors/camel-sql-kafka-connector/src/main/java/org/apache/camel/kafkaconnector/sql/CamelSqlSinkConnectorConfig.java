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
package org.apache.camel.kafkaconnector.sql;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSqlSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SQL_PATH_QUERY_CONF = "camel.sink.path.query";
    public static final String CAMEL_SINK_SQL_PATH_QUERY_DOC = "Sets the SQL query to perform. You can externalize the query by using file: or classpath: as prefix and specify the location of the file.";
    public static final String CAMEL_SINK_SQL_PATH_QUERY_DEFAULT = null;
    public static final String CAMEL_SINK_SQL_ENDPOINT_ALLOW_NAMED_PARAMETERS_CONF = "camel.sink.endpoint.allowNamedParameters";
    public static final String CAMEL_SINK_SQL_ENDPOINT_ALLOW_NAMED_PARAMETERS_DOC = "Whether to allow using named parameters in the queries.";
    public static final Boolean CAMEL_SINK_SQL_ENDPOINT_ALLOW_NAMED_PARAMETERS_DEFAULT = true;
    public static final String CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_CONF = "camel.sink.endpoint.dataSource";
    public static final String CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_DOC = "Sets the DataSource to use to communicate with the database.";
    public static final String CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_REF_CONF = "camel.sink.endpoint.dataSourceRef";
    public static final String CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_REF_DOC = "Sets the reference to a DataSource to lookup from the registry, to use for communicating with the database.";
    public static final String CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_REF_DEFAULT = null;
    public static final String CAMEL_SINK_SQL_ENDPOINT_OUTPUT_CLASS_CONF = "camel.sink.endpoint.outputClass";
    public static final String CAMEL_SINK_SQL_ENDPOINT_OUTPUT_CLASS_DOC = "Specify the full package and class name to use as conversion when outputType=SelectOne.";
    public static final String CAMEL_SINK_SQL_ENDPOINT_OUTPUT_CLASS_DEFAULT = null;
    public static final String CAMEL_SINK_SQL_ENDPOINT_OUTPUT_HEADER_CONF = "camel.sink.endpoint.outputHeader";
    public static final String CAMEL_SINK_SQL_ENDPOINT_OUTPUT_HEADER_DOC = "Store the query result in a header instead of the message body. By default, outputHeader == null and the query result is stored in the message body, any existing content in the message body is discarded. If outputHeader is set, the value is used as the name of the header to store the query result and the original message body is preserved.";
    public static final String CAMEL_SINK_SQL_ENDPOINT_OUTPUT_HEADER_DEFAULT = null;
    public static final String CAMEL_SINK_SQL_ENDPOINT_OUTPUT_TYPE_CONF = "camel.sink.endpoint.outputType";
    public static final String CAMEL_SINK_SQL_ENDPOINT_OUTPUT_TYPE_DOC = "Make the output of consumer or producer to SelectList as List of Map, or SelectOne as single Java object in the following way: a) If the query has only single column, then that JDBC Column object is returned. (such as SELECT COUNT( ) FROM PROJECT will return a Long object. b) If the query has more than one column, then it will return a Map of that result. c) If the outputClass is set, then it will convert the query result into an Java bean object by calling all the setters that match the column names. It will assume your class has a default constructor to create instance with. d) If the query resulted in more than one rows, it throws an non-unique result exception. StreamList streams the result of the query using an Iterator. This can be used with the Splitter EIP in streaming mode to process the ResultSet in streaming fashion. One of: [SelectOne] [SelectList] [StreamList]";
    public static final String CAMEL_SINK_SQL_ENDPOINT_OUTPUT_TYPE_DEFAULT = "SelectList";
    public static final String CAMEL_SINK_SQL_ENDPOINT_SEPARATOR_CONF = "camel.sink.endpoint.separator";
    public static final String CAMEL_SINK_SQL_ENDPOINT_SEPARATOR_DOC = "The separator to use when parameter values is taken from message body (if the body is a String type), to be inserted at # placeholders. Notice if you use named parameters, then a Map type is used instead. The default value is comma";
    public static final String CAMEL_SINK_SQL_ENDPOINT_SEPARATOR_DEFAULT = ",";
    public static final String CAMEL_SINK_SQL_ENDPOINT_BATCH_CONF = "camel.sink.endpoint.batch";
    public static final String CAMEL_SINK_SQL_ENDPOINT_BATCH_DOC = "Enables or disables batch mode";
    public static final Boolean CAMEL_SINK_SQL_ENDPOINT_BATCH_DEFAULT = false;
    public static final String CAMEL_SINK_SQL_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_SQL_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SQL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SQL_ENDPOINT_NOOP_CONF = "camel.sink.endpoint.noop";
    public static final String CAMEL_SINK_SQL_ENDPOINT_NOOP_DOC = "If set, will ignore the results of the SQL query and use the existing IN message as the OUT message for the continuation of processing";
    public static final Boolean CAMEL_SINK_SQL_ENDPOINT_NOOP_DEFAULT = false;
    public static final String CAMEL_SINK_SQL_ENDPOINT_USE_MESSAGE_BODY_FOR_SQL_CONF = "camel.sink.endpoint.useMessageBodyForSql";
    public static final String CAMEL_SINK_SQL_ENDPOINT_USE_MESSAGE_BODY_FOR_SQL_DOC = "Whether to use the message body as the SQL and then headers for parameters. If this option is enabled then the SQL in the uri is not used. Note that query parameters in the message body are represented by a question mark instead of a # symbol.";
    public static final Boolean CAMEL_SINK_SQL_ENDPOINT_USE_MESSAGE_BODY_FOR_SQL_DEFAULT = false;
    public static final String CAMEL_SINK_SQL_ENDPOINT_ALWAYS_POPULATE_STATEMENT_CONF = "camel.sink.endpoint.alwaysPopulateStatement";
    public static final String CAMEL_SINK_SQL_ENDPOINT_ALWAYS_POPULATE_STATEMENT_DOC = "If enabled then the populateStatement method from org.apache.camel.component.sql.SqlPrepareStatementStrategy is always invoked, also if there is no expected parameters to be prepared. When this is false then the populateStatement is only invoked if there is 1 or more expected parameters to be set; for example this avoids reading the message body/headers for SQL queries with no parameters.";
    public static final Boolean CAMEL_SINK_SQL_ENDPOINT_ALWAYS_POPULATE_STATEMENT_DEFAULT = false;
    public static final String CAMEL_SINK_SQL_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_SQL_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_SQL_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_SQL_ENDPOINT_PARAMETERS_COUNT_CONF = "camel.sink.endpoint.parametersCount";
    public static final String CAMEL_SINK_SQL_ENDPOINT_PARAMETERS_COUNT_DOC = "If set greater than zero, then Camel will use this count value of parameters to replace instead of querying via JDBC metadata API. This is useful if the JDBC vendor could not return correct parameters count, then user may override instead.";
    public static final Integer CAMEL_SINK_SQL_ENDPOINT_PARAMETERS_COUNT_DEFAULT = null;
    public static final String CAMEL_SINK_SQL_ENDPOINT_PLACEHOLDER_CONF = "camel.sink.endpoint.placeholder";
    public static final String CAMEL_SINK_SQL_ENDPOINT_PLACEHOLDER_DOC = "Specifies a character that will be replaced to in SQL query. Notice, that it is simple String.replaceAll() operation and no SQL parsing is involved (quoted strings will also change).";
    public static final String CAMEL_SINK_SQL_ENDPOINT_PLACEHOLDER_DEFAULT = "#";
    public static final String CAMEL_SINK_SQL_ENDPOINT_PREPARE_STATEMENT_STRATEGY_CONF = "camel.sink.endpoint.prepareStatementStrategy";
    public static final String CAMEL_SINK_SQL_ENDPOINT_PREPARE_STATEMENT_STRATEGY_DOC = "Allows to plugin to use a custom org.apache.camel.component.sql.SqlPrepareStatementStrategy to control preparation of the query and prepared statement.";
    public static final String CAMEL_SINK_SQL_ENDPOINT_PREPARE_STATEMENT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SQL_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_SQL_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_SQL_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_SQL_ENDPOINT_TEMPLATE_OPTIONS_CONF = "camel.sink.endpoint.templateOptions";
    public static final String CAMEL_SINK_SQL_ENDPOINT_TEMPLATE_OPTIONS_DOC = "Configures the Spring JdbcTemplate with the key/values from the Map";
    public static final String CAMEL_SINK_SQL_ENDPOINT_TEMPLATE_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_SQL_ENDPOINT_USE_PLACEHOLDER_CONF = "camel.sink.endpoint.usePlaceholder";
    public static final String CAMEL_SINK_SQL_ENDPOINT_USE_PLACEHOLDER_DOC = "Sets whether to use placeholder and replace all placeholder characters with sign in the SQL queries.";
    public static final Boolean CAMEL_SINK_SQL_ENDPOINT_USE_PLACEHOLDER_DEFAULT = true;
    public static final String CAMEL_SINK_SQL_COMPONENT_DATA_SOURCE_CONF = "camel.component.sql.dataSource";
    public static final String CAMEL_SINK_SQL_COMPONENT_DATA_SOURCE_DOC = "Sets the DataSource to use to communicate with the database.";
    public static final String CAMEL_SINK_SQL_COMPONENT_DATA_SOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SQL_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.sql.lazyStartProducer";
    public static final String CAMEL_SINK_SQL_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SQL_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SQL_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.sql.basicPropertyBinding";
    public static final String CAMEL_SINK_SQL_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_SQL_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_SQL_COMPONENT_USE_PLACEHOLDER_CONF = "camel.component.sql.usePlaceholder";
    public static final String CAMEL_SINK_SQL_COMPONENT_USE_PLACEHOLDER_DOC = "Sets whether to use placeholder and replace all placeholder characters with sign in the SQL queries. This option is default true";
    public static final Boolean CAMEL_SINK_SQL_COMPONENT_USE_PLACEHOLDER_DEFAULT = true;

    public CamelSqlSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSqlSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SQL_PATH_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_PATH_QUERY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SQL_PATH_QUERY_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_ALLOW_NAMED_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_ENDPOINT_ALLOW_NAMED_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_ALLOW_NAMED_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_REF_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_REF_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_SQL_ENDPOINT_DATA_SOURCE_REF_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_OUTPUT_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_ENDPOINT_OUTPUT_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_OUTPUT_CLASS_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_OUTPUT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_ENDPOINT_OUTPUT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_OUTPUT_HEADER_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_OUTPUT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_ENDPOINT_OUTPUT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_OUTPUT_TYPE_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_SEPARATOR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_ENDPOINT_SEPARATOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_SEPARATOR_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_BATCH_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_ENDPOINT_BATCH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_BATCH_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_NOOP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_ENDPOINT_NOOP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_NOOP_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_USE_MESSAGE_BODY_FOR_SQL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_ENDPOINT_USE_MESSAGE_BODY_FOR_SQL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_USE_MESSAGE_BODY_FOR_SQL_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_ALWAYS_POPULATE_STATEMENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_ENDPOINT_ALWAYS_POPULATE_STATEMENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_ALWAYS_POPULATE_STATEMENT_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_PARAMETERS_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SINK_SQL_ENDPOINT_PARAMETERS_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_PARAMETERS_COUNT_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_PLACEHOLDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_ENDPOINT_PLACEHOLDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_PLACEHOLDER_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_PREPARE_STATEMENT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_ENDPOINT_PREPARE_STATEMENT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_PREPARE_STATEMENT_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_TEMPLATE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_ENDPOINT_TEMPLATE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_TEMPLATE_OPTIONS_DOC);
        conf.define(CAMEL_SINK_SQL_ENDPOINT_USE_PLACEHOLDER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_ENDPOINT_USE_PLACEHOLDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_ENDPOINT_USE_PLACEHOLDER_DOC);
        conf.define(CAMEL_SINK_SQL_COMPONENT_DATA_SOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SQL_COMPONENT_DATA_SOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_COMPONENT_DATA_SOURCE_DOC);
        conf.define(CAMEL_SINK_SQL_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SQL_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_SQL_COMPONENT_USE_PLACEHOLDER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SQL_COMPONENT_USE_PLACEHOLDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SQL_COMPONENT_USE_PLACEHOLDER_DOC);
        return conf;
    }
}