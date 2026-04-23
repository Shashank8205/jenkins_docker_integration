# Use official Java image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy Java file into container
COPY Grade.java .

# Compile the Java program
RUN javac Grade.java

# Run the program
CMD ["java", "Grade"]
