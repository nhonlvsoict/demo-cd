# Use an official Ubuntu base image
FROM mcr.microsoft.com/vscode/devcontainers/base:ubuntu-20.04

# Install dependencies
RUN apt-get update && apt-get install -y \
    openjdk-21-jdk \
    maven \
    gradle \
    curl \
    && rm -rf /var/lib/apt/lists/*

# Set environment variables for Java 21
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV PATH="${JAVA_HOME}/bin:${PATH}"

# Install any additional tools or dependencies as required by your project
# Update package list and install dependencies
RUN apt-get update && apt-get install -y \
    openjdk-21-jdk \
    maven \
    curl \
    git \
    && rm -rf /var/lib/apt/lists/*

# Verify Java and Maven installation
RUN java -version
RUN mvn -version

# Set the working directory to the project root
WORKDIR /workspace
