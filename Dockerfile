# Use OpenJDK 11 as base image
FROM  amazoncorretto:8u402-alpine3.19 


#RUN apk update && apk add sudo


# Set the working directory in the container
WORKDIR /app 

COPY ./target/*.jar ./ 

#RUN  sudo chmod +x mvnw && sudo ./mvnw clean install


# Copy the packaged JAR file into the container at /app
# COPY target/Assignment_5-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that your Spring Boot application uses
EXPOSE 5000 

# Run the Spring Boot application when the container launches
CMD ["java", "-jar", "target/Assignment_5-0.0.1-SNAPSHOT.jar"]
