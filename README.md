# 🎧 KafkaConsumer

This project is a **Spring Boot** application that functions as a **Kafka Consumer**. Its primary role is to subscribe to the location update topic, consume the coordinate messages sent by the producer, and process them (in this case, simply logging them).

---

## ⚙️ **Tech Stack**

### 🖥️ **Backend**

* **Language**: **Java 17**
* **Frameworks**:
    * **Spring Boot (v3.2.2)**
    * **Spring Web**
    * **Spring Kafka** (for consuming messages)
* **Utilities**: **Lombok**

### 🌐 **Kafka Configuration**

| Property | Value | Description |
| :--- | :--- | :--- |
| **Bootstrap Servers** | `localhost:9092` | The address of the Kafka broker. |
| **Topic Name** | `location-update-topic` | The topic being subscribed to. |
| **Group ID** | **`group-1`** | Identifier for this consumer instance within the Kafka broker. |
| **Offset Reset** | `earliest` | Instructs the consumer to start reading from the beginning of the topic if no initial offset is found. |
| **Key Deserializer** | `StringDeserializer` | Used to deserialize the message key. |
| **Value Deserializer** | `StringDeserializer` | Used to deserialize the message value. |

---

## 📢 **Functionality**

The consumption logic is handled by a single method annotated with `@KafkaListener`.

* **Listener Method**: The `updateLocation` method in **`KafkaConfig`** is configured to listen for messages from the **`location-update-topic`** and belongs to the **`group-1`** group.
* **Processing**: When a message (a location string) is received, the application logs the consumed data: **`Consumed location is {location}`**.

* **Server Port**: **`8082`**
