FROM maven:3-jdk-11 as maven

RUN apt-get update
RUN apt-get install -y git
RUN git clone https://github.com/sspeiser/violating12factors.git
RUN cd violating12factors
RUN mvn package
CMD ["java", "-jar", "target/violating12factors-0.0.1-SNAPSHOT.jar"]


