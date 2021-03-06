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
package org.apache.camel.kafkaconnector.springrabbitmq;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSpringrabbitmqSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_PATH_EXCHANGE_NAME_CONF = "camel.source.path.exchangeName";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_PATH_EXCHANGE_NAME_DOC = "The exchange name determines the exchange to which the produced messages will be sent to. In the case of consumers, the exchange name determines the exchange the queue will be bound to. Note: to use default exchange then do not use empty name, but use default instead.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_PATH_EXCHANGE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_CONNECTION_FACTORY_CONF = "camel.source.endpoint.connectionFactory";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_CONNECTION_FACTORY_DOC = "The connection factory to be use. A connection factory must be configured either on the component or endpoint.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_CONNECTION_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DISABLE_REPLY_TO_CONF = "camel.source.endpoint.disableReplyTo";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DISABLE_REPLY_TO_DOC = "Specifies whether Camel ignores the ReplyTo header in messages. If true, Camel does not send a reply back to the destination specified in the ReplyTo header. You can use this option if you want Camel to consume from a route and you do not want Camel to automatically send back a reply message because another component in your code handles the reply message. You can also use this option if you want to use Camel as a proxy between different message brokers and you want to route message from one system to another.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DISABLE_REPLY_TO_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ROUTING_KEY_CONF = "camel.source.endpoint.routingKey";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ROUTING_KEY_DOC = "The value of a routing key to use. Default is empty which is not helpful when using the default (or any direct) exchange, but fine if the exchange is a headers exchange for instance.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ROUTING_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_TEST_CONNECTION_ON_STARTUP_CONF = "camel.source.endpoint.testConnectionOnStartup";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_TEST_CONNECTION_ON_STARTUP_DOC = "Specifies whether to test the connection on startup. This ensures that when Camel starts that all the JMS consumers have a valid connection to the JMS broker. If a connection cannot be granted then Camel throws an exception on startup. This ensures that Camel is not started with failed connections. The JMS producers is tested as well.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_TEST_CONNECTION_ON_STARTUP_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ACKNOWLEDGE_MODE_CONF = "camel.source.endpoint.acknowledgeMode";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ACKNOWLEDGE_MODE_DOC = "Flag controlling the behaviour of the container with respect to message acknowledgement. The most common usage is to let the container handle the acknowledgements (so the listener doesn't need to know about the channel or the message). Set to AcknowledgeMode.MANUAL if the listener will send the acknowledgements itself using Channel.basicAck(long, boolean). Manual acks are consistent with either a transactional or non-transactional channel, but if you are doing no other work on the channel at the same other than receiving a single message then the transaction is probably unnecessary. Set to AcknowledgeMode.NONE to tell the broker not to expect any acknowledgements, and it will assume all messages are acknowledged as soon as they are sent (this is autoack in native Rabbit broker terms). If AcknowledgeMode.NONE then the channel cannot be transactional (so the container will fail on start up if that flag is accidentally set). One of: [NONE] [MANUAL] [AUTO]";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ACKNOWLEDGE_MODE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ASYNC_CONSUMER_CONF = "camel.source.endpoint.asyncConsumer";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ASYNC_CONSUMER_DOC = "Whether the consumer processes the Exchange asynchronously. If enabled then the consumer may pickup the next message from the queue, while the previous message is being processed asynchronously (by the Asynchronous Routing Engine). This means that messages may be processed not 100% strictly in order. If disabled (as default) then the Exchange is fully processed before the consumer will pickup the next message from the queue.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ASYNC_CONSUMER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_DECLARE_CONF = "camel.source.endpoint.autoDeclare";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_DECLARE_DOC = "Specifies whether the consumer should auto declare binding between exchange, queue and routing key when starting.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_DECLARE_DEFAULT = true;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_STARTUP_CONF = "camel.source.endpoint.autoStartup";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_STARTUP_DOC = "Specifies whether the consumer container should auto-startup.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_STARTUP_DEFAULT = true;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_CONF = "camel.source.endpoint.deadLetterExchange";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_DOC = "The name of the dead letter exchange";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_TYPE_CONF = "camel.source.endpoint.deadLetterExchangeType";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_TYPE_DOC = "The type of the dead letter exchange One of: [direct] [fanout] [headers] [topic]";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_TYPE_DEFAULT = "direct";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_QUEUE_CONF = "camel.source.endpoint.deadLetterQueue";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_QUEUE_DOC = "The name of the dead letter queue";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_QUEUE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_ROUTING_KEY_CONF = "camel.source.endpoint.deadLetterRoutingKey";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_ROUTING_KEY_DOC = "The routing key for the dead letter exchange";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_ROUTING_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_TYPE_CONF = "camel.source.endpoint.exchangeType";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_TYPE_DOC = "The type of the exchange One of: [direct] [fanout] [headers] [topic]";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_TYPE_DEFAULT = "direct";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCLUSIVE_CONF = "camel.source.endpoint.exclusive";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCLUSIVE_DOC = "Set to true for an exclusive consumer";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCLUSIVE_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_NO_LOCAL_CONF = "camel.source.endpoint.noLocal";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_NO_LOCAL_DOC = "Set to true for an no-local consumer";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_NO_LOCAL_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_QUEUES_CONF = "camel.source.endpoint.queues";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_QUEUES_DOC = "The queue(s) to use for consuming messages. Multiple queue names can be separated by comma. If none has been configured then Camel will generate an unique id as the queue name for the consumer.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_QUEUES_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ARGS_CONF = "camel.source.endpoint.args";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ARGS_DOC = "Specify arguments for configuring the different RabbitMQ concepts, a different prefix is required for each element: arg.consumer. arg.exchange. arg.queue. arg.binding. arg.dlq.exchange. arg.dlq.queue. arg.dlq.binding. For example to declare a queue with message ttl argument: args=arg.queue.x-message-ttl=60000";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ARGS_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_CONVERTER_CONF = "camel.source.endpoint.messageConverter";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_CONVERTER_DOC = "To use a custom MessageConverter so you can be in control how to map to/from a org.springframework.amqp.core.Message.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_CONVERTER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_PROPERTIES_CONVERTER_CONF = "camel.source.endpoint.messagePropertiesConverter";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_PROPERTIES_CONVERTER_DOC = "To use a custom MessagePropertiesConverter so you can be in control how to map to/from a org.springframework.amqp.core.MessageProperties.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_PROPERTIES_CONVERTER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AMQP_ADMIN_CONF = "camel.component.spring-rabbitmq.amqpAdmin";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AMQP_ADMIN_DOC = "Optional AMQP Admin service to use for auto declaring elements (queues, exchanges, bindings)";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AMQP_ADMIN_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_CONNECTION_FACTORY_CONF = "camel.component.spring-rabbitmq.connectionFactory";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_CONNECTION_FACTORY_DOC = "The connection factory to be use. A connection factory must be configured either on the component or endpoint.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_CONNECTION_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_TEST_CONNECTION_ON_STARTUP_CONF = "camel.component.spring-rabbitmq.testConnectionOnStartup";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_TEST_CONNECTION_ON_STARTUP_DOC = "Specifies whether to test the connection on startup. This ensures that when Camel starts that all the JMS consumers have a valid connection to the JMS broker. If a connection cannot be granted then Camel throws an exception on startup. This ensures that Camel is not started with failed connections. The JMS producers is tested as well.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_TEST_CONNECTION_ON_STARTUP_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_DECLARE_CONF = "camel.component.spring-rabbitmq.autoDeclare";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_DECLARE_DOC = "Specifies whether the consumer should auto declare binding between exchange, queue and routing key when starting. Enabling this can be good for development to make it easy to standup exchanges, queues and bindings on the broker.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_DECLARE_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_STARTUP_CONF = "camel.component.spring-rabbitmq.autoStartup";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_STARTUP_DOC = "Specifies whether the consumer container should auto-startup.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_STARTUP_DEFAULT = true;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.spring-rabbitmq.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_CONF = "camel.component.spring-rabbitmq.deadLetterExchange";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_DOC = "The name of the dead letter exchange";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_TYPE_CONF = "camel.component.spring-rabbitmq.deadLetterExchangeType";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_TYPE_DOC = "The type of the dead letter exchange One of: [direct] [fanout] [headers] [topic]";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_TYPE_DEFAULT = "direct";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_QUEUE_CONF = "camel.component.spring-rabbitmq.deadLetterQueue";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_QUEUE_DOC = "The name of the dead letter queue";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_QUEUE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_ROUTING_KEY_CONF = "camel.component.spring-rabbitmq.deadLetterRoutingKey";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_ROUTING_KEY_DOC = "The routing key for the dead letter exchange";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_ROUTING_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_ERROR_HANDLER_CONF = "camel.component.spring-rabbitmq.errorHandler";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_ERROR_HANDLER_DOC = "To use a custom ErrorHandler for handling exceptions from the message listener (consumer)";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_ERROR_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_LISTENER_CONTAINER_FACTORY_CONF = "camel.component.spring-rabbitmq.listenerContainerFactory";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_LISTENER_CONTAINER_FACTORY_DOC = "To use a custom factory for creating and configuring ListenerContainer to be used by the consumer for receiving messages";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_LISTENER_CONTAINER_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_PREFETCH_COUNT_CONF = "camel.component.spring-rabbitmq.prefetchCount";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_PREFETCH_COUNT_DOC = "Tell the broker how many messages to send to each consumer in a single request. Often this can be set quite high to improve throughput.";
    public static final Integer CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_PREFETCH_COUNT_DEFAULT = 250;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_SHUTDOWN_TIMEOUT_CONF = "camel.component.spring-rabbitmq.shutdownTimeout";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_SHUTDOWN_TIMEOUT_DOC = "The time to wait for workers in milliseconds after the container is stopped. If any workers are active when the shutdown signal comes they will be allowed to finish processing as long as they can finish within this timeout.";
    public static final Long CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_SHUTDOWN_TIMEOUT_DEFAULT = 5000L;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.spring-rabbitmq.autowiredEnabled";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_IGNORE_DECLARATION_EXCEPTIONS_CONF = "camel.component.spring-rabbitmq.ignoreDeclarationExceptions";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_IGNORE_DECLARATION_EXCEPTIONS_DOC = "Switch on ignore exceptions such as mismatched properties when declaring";
    public static final Boolean CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_IGNORE_DECLARATION_EXCEPTIONS_DEFAULT = false;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_CONVERTER_CONF = "camel.component.spring-rabbitmq.messageConverter";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_CONVERTER_DOC = "To use a custom MessageConverter so you can be in control how to map to/from a org.springframework.amqp.core.Message.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_CONVERTER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_PROPERTIES_CONVERTER_CONF = "camel.component.spring-rabbitmq.messagePropertiesConverter";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_PROPERTIES_CONVERTER_DOC = "To use a custom MessagePropertiesConverter so you can be in control how to map to/from a org.springframework.amqp.core.MessageProperties.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_PROPERTIES_CONVERTER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.spring-rabbitmq.headerFilterStrategy";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;

    public CamelSpringrabbitmqSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSpringrabbitmqSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_PATH_EXCHANGE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_PATH_EXCHANGE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SPRINGRABBITMQ_PATH_EXCHANGE_NAME_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_CONNECTION_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_CONNECTION_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_CONNECTION_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DISABLE_REPLY_TO_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DISABLE_REPLY_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DISABLE_REPLY_TO_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ROUTING_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ROUTING_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ROUTING_KEY_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_TEST_CONNECTION_ON_STARTUP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_TEST_CONNECTION_ON_STARTUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_TEST_CONNECTION_ON_STARTUP_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ACKNOWLEDGE_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ACKNOWLEDGE_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ACKNOWLEDGE_MODE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ASYNC_CONSUMER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ASYNC_CONSUMER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ASYNC_CONSUMER_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_DECLARE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_DECLARE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_DECLARE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_STARTUP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_STARTUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_AUTO_STARTUP_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_EXCHANGE_TYPE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_QUEUE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_QUEUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_QUEUE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_ROUTING_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_ROUTING_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_DEAD_LETTER_ROUTING_KEY_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_TYPE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCLUSIVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCLUSIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCLUSIVE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_NO_LOCAL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_NO_LOCAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_NO_LOCAL_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_QUEUES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_QUEUES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_QUEUES_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ARGS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ARGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_ARGS_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_CONVERTER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_CONVERTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_CONVERTER_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_PROPERTIES_CONVERTER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_PROPERTIES_CONVERTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_MESSAGE_PROPERTIES_CONVERTER_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AMQP_ADMIN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AMQP_ADMIN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AMQP_ADMIN_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_CONNECTION_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_CONNECTION_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_CONNECTION_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_TEST_CONNECTION_ON_STARTUP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_TEST_CONNECTION_ON_STARTUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_TEST_CONNECTION_ON_STARTUP_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_DECLARE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_DECLARE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_DECLARE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_STARTUP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_STARTUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTO_STARTUP_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_EXCHANGE_TYPE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_QUEUE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_QUEUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_QUEUE_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_ROUTING_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_ROUTING_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_DEAD_LETTER_ROUTING_KEY_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_ERROR_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_LISTENER_CONTAINER_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_LISTENER_CONTAINER_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_LISTENER_CONTAINER_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_PREFETCH_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_PREFETCH_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_PREFETCH_COUNT_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_SHUTDOWN_TIMEOUT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_SHUTDOWN_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_SHUTDOWN_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_IGNORE_DECLARATION_EXCEPTIONS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_IGNORE_DECLARATION_EXCEPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_IGNORE_DECLARATION_EXCEPTIONS_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_CONVERTER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_CONVERTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_CONVERTER_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_PROPERTIES_CONVERTER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_PROPERTIES_CONVERTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_MESSAGE_PROPERTIES_CONVERTER_DOC);
        conf.define(CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SPRINGRABBITMQ_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        return conf;
    }
}