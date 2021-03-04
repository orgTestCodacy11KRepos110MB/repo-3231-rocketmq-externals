/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.iot.common.configuration;

public class MqttBridgeConfigKey {
    /**
     * iot mqtt bridge broker host
     */
    public static final String MQTT_BROKER_HOST = "iot.mqtt.broker.host";
    public static final String MQTT_BROKER_HOST_DEFAULT = "127.0.0.1";

    /**
     * iot mqtt bridge broker port
     */
    public static final String MQTT_BROKER_PORT = "iot.mqtt.broker.port";
    public static final String MQTT_BROKER_PORT_DEFAULT = "1883";

    /**
     * iot mqtt bridge server bossGroup thread num
     */
    public static final String MQTT_SERVER_BOSS_GROUP_THREAD_NUM = "iot.mqtt.server.boss.group.thread.num";
    public static final String MQTT_SERVER_BOSS_GROUP_THREAD_NUM_DEFAULT = "1";

    /**
     * iot mqtt bridge server workerGroup thread num
     */
    public static final String MQTT_SERVER_WORKER_GROUP_THREAD_NUM = "iot.mqtt.server.worker.group.thread.num";
    public static final String MQTT_SERVER_WORKER_GROUP_THREAD_NUM_DEFAULT = "32";

    /**
     * iot mqtt bridge server socket backlog size
     */
    public static final String MQTT_SERVER_SOCKET_BACKLOG_SIZE = "iot.mqtt.server.socket.backlog.size";
    public static final String MQTT_SERVER_SOCKET_BACKLOG_SIZE_DEFAULT = "1024";

    /**
     * iot mqtt store rocketMQ accessKey
     */
    public static final String MQTT_ROKECTMQ_ACCESSKEY = "iot.mqtt.server.rocketmq.accessKey";
    public static final String MQTT_ROKECTMQ_ACCESSKEY_DEFAULT = "";

    /**
     * iot mqtt store rocketMQ secretKey
     */
    public static final String MQTT_ROKECTMQ_SECRETKEY = "iot.mqtt.server.rocketmq.secretkey";
    public static final String MQTT_ROKECTMQ_SECRETKEY_DEFAULT = "";

    /**
     * iot mqtt store rocketMQ NamesrvAddr
     */
    public static final String MQTT_ROKECTMQ_NAMESRVADDR = "iot.mqtt.server.rocketmq.namesrvaddr";
    public static final String MQTT_ROKECTMQ_NAMESRVADDR_DEFAULT = "";

    /**
     * iot mqtt store rocketMQ producer group
     */
    public static final String MQTT_ROKECTMQ_PRODUCER_GROUP = "iot.mqtt.server.rocketmq.producer.group";
    public static final String MQTT_ROKECTMQ_PRODUCER_GROUP_DEFAULT = "mqtt_product_group";

    /**
     * iot mqtt store rocketMQ consumer group
     */
    public static final String MQTT_ROKECTMQ_CONSUMER_GROUP = "iot.mqtt.server.rocketmq.consumer.group";
    public static final String MQTT_ROKECTMQ_CONSUMER_GROUP_DEFAULT = "mqtt_consumer_group";

}