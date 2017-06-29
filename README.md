# JWT Generator

Quick utility that uses Auth0 libraries to generate a JWT to use with Kong.

## Usage:
Compile and run it sending the secret to use (ultrasecret) by default:
```bash
mvn clean package 
java -jar -Djwt.secret=another target/jwt-generator-0.0.1-SNAPSHOT.jar
```

Curl sending the username:
```bash
curl -i -X GET -H "X-Consumer-Username: reuben" localhost:8080/token
```