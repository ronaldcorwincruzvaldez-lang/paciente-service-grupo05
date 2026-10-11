# Paciente Service - Grupo 5

Servicio de pacientes para el examen. Escucha en el puerto `8082` y se registra en Eureka.

## Ejecutar

Se necesita Java 25 y Maven:

```bash
mvn spring-boot:run
```

Eureka debe estar levantado en `http://localhost:8761`.

## Probar

- `GET http://localhost:8082/api/v1/pacientes/1`
- `GET http://localhost:8082/api/v1/pacientes/1/diagnosticos`

Los pacientes de ejemplo son el 1 (EPS) y el 2 (ESSALUD). El nombre registrado en Eureka es `paciente-service-grupo5` para que coincida con el Feign Client de Citas.
