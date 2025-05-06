# Currency Converter (Java SPI + Docker)

A simple currency converter console application built in **Java 22**, demonstrating the use of **SPI (Service Provider Interface)** to dynamically load multiple conversion providers at runtime. The application runs inside a Docker container.

---

## Technologies Used

- Java 22
- Maven
- Java SPI
- Docker

---

## Features

- Dynamically load currency converters using Java SPI
- User can choose which converter to use (USD, EUR, etc.)
- Runs as an interactive console application inside Docker

---

##  Build & Run with Docker

###  1. Build Docker Image

```bash
docker build -t currency-converter-app .
```

### 2. Run docker image
```bash
docker run -it currency-converter-app-java22
```