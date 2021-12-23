## Запись данных в БД через брокер сообщений Kafka

1) Перед запуском приложения необходимо убедиться, что скачано приложение APACHE KAFKA, если нет то скачать по ссылке: https://kafka.apache.org/downloads;
2) В терминале запустить сервис ZooKeeper сервис по обслуживанию несколько реплик брокера с помощью команды

`$ bin/zookeeper-server-start.sh config/zookeeper.properties`

3) В терминале запустить APACHE KAFKA 

`$ bin/kafka-server-start.sh config/server.properties`

4) Поочередно запустить ProducerApplication из пакета Producer и ConsumerApplication из пакета Consumer
5) В консоли и/или в окне браузере ввести команду:

браузер: localhost:8080/generate
консоль: curl http://localhost:8080/generate

В случае получения ответа "ОК" программа успешно выполнила копирование данных из таблицы в таблицу.

