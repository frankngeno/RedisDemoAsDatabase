This is a model project with sample implementation of RESTApis with RedisDB to persist data.

Requirements
For building and running the application you need:
JDK 17<br />

Building
Maven is the main tool for build & dependency management.<br />
You will be able to run maven commands via the maven wrapper in the root of this project, e.g. mvn spring-boot:run.<br />
mvn spring-boot:clean - Deletes the build directory.<br />
mvn spring-boot:build - Assembles and tests this project.<br />

Start application. <br />

mvn spring-boot:run --> Starts the application on your local environment as a normal SpringBoot app.<br />

Use postman or any tool to test the CRUD operations. <br />

Remember to use this dependency  <!-- to connect from application to redis server -->.<br />
        <dependency>
            <groupId>redis.clients</groupId>
            <artifactId>jedis</artifactId>
        </dependency>
DO NOT INCLUDE VERSION for it to run.<br />
