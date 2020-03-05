# SpringCloud
SpringCloud Demo

#Environment
zookeeper
kafka

#Step

##spring-cloud-bus
1. configure `zookeeper` and `kafka`.
2. config server and config client add `spring-cloud-starter-bus-kafka` dependency.
3. config server exposes the `/actuator/bus-refresh` endpoint. 
4. if needed,config server exposes the `/actuator/bus-env` endpoint. 

