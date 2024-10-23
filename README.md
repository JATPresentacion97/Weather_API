# Weather Information API

## Overview

This project is a Spring Boot RESTful API that provides weather information using the OpenWeatherMap API. It allows users to search for current weather data by city and caches results to minimize API calls. The API also supports retrieving historical weather data (optional).

### Features

- Search weather by city
- Cache results to minimize API calls
- Optional: Retrieve historical weather data from a database

## Technologies

- Java 17
- Spring Boot 3.x
- Gradle
- OpenWeatherMap API
- Ehcache for caching
- Optional: Spring Data JPA (for historical data storage)

## Requirements

- JDK 17+
- Gradle
- OpenWeatherMap API Key (sign up at [https://openweathermap.org/api](https://openweathermap.org/api))

## Setup

1. Clone the repository:

  ```bash
  git clone https://github.com/your-repo/weather-api.git

2. Navigate to the project directory:

  ```bash
  cd weather-api
  ```

3. Update the src/main/resources/application.properties file with your OpenWeatherMap API key:

  ```bash
openweather.api.key=YOUR_OPENWEATHERMAP_API_KEY
  ```

4. Build the project:

  ```bash
./gradlew build
  ```

5. Run the project:

  ```bash
./gradlew bootRun
  ```

6. The API will be available at http://localhost:8080.

## API Endpoints

### Get Current Weather by City
- **Endpoint**: `/weather/{city}`
- **Method**: `GET`
- **Description**: Fetches the current weather data for the specified city.

#### Example:

  ```bash
  GET /weather/London
  ```

#### Response:

  ```bash
  {
    "city": "London",
    "description": "Cloudy",
    "temperature": 14.5,
    "humidity": 82
  }
  ```

## Caching
The API uses Ehcache to cache responses based on the city name. This reduces the number of API calls to the OpenWeatherMap service and improves performance.

## Historical Data (Optional)
You can enable the historical weather data feature by setting up a database (e.g., H2 or MySQL) and configuring Spring Data JPA.

## Postman Collection
A Postman collection is provided in the postman/weather-api.postman_collection.json file. You can import this collection into Postman to test the API.

## License
This project is licensed under the MIT License.
