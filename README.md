## System Details
- Spring boot version: 2.5.3
- Java version: 11
- Maven
- Base URL: `http://localhost:8080/rest/v2/`

## Runnign the Project

- Check for maven, JAVA 11 and Springboot in the system and install
- Go to the root folder of the project and run `mvn spring-boot:run`


## API Doc

GET: `/countries`
- Wil return a list of all countries in JSON format

GET: `/country/{id}`
- Wil return a specific country respective to the passed in JSON `id` else returns null

DELETE: `/country/{id}`
- Will delete the specific country respective the passed `id`

POST: `/country`
- To create and update a country (pass `null` or `0` for id when creating a country | To update pass proper `id` as well)
- input body example
  {
    "id":"2",  # for creation "id":"0",
    "countryCode": "CAN",
    "countryName": "Canada",
    "population": "37590000",
    "covidPositives": "1440000"
  }

GET: `/countries/search`
- wil return a list of countries relating to the searched keyword based on either country code or country name
- input parameter example
  country -> Lan
