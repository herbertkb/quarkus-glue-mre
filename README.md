# quarkus-aws-schema-registry-mre

## Run

```
mvn compile quarkus:dev
```

## Schema Registry config/properties problem WORKAROUND

At runtime, set debugger breakpoints at these locations:
```
ReactiveKafkaConsumer - line 75
ReactiveKafkaProducer - line 63
```

then run this at the breakpoints:
```
kafkaConfiguration.put("dataFormat","JSON"); kafkaConfiguration.put("schemaName","Example");
```