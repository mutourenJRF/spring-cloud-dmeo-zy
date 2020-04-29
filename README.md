版本选择
==
spring cloud 版本
-
1. spring cloud版本地址：https://spring.io/projects/spring-cloud#learn 
2. 查看对应的springboot版本：https://spring.io/projects/spring-cloud#overview 

依赖引入
-
    <dependencyManagement>
        <dependencies>
          <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-dependencies</artifactId>
            <version>2.2.2.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
          </dependency>
          <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>Hoxton.SR4</version>
            <type>pom</type>
            <scope>import</scope>
          </dependency>
        </dependencies>
      </dependencyManagement>

devtools热部署
-
1. 引入依赖


        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-devtools</artifactId>
          <scope>runtime</scope>
          <optional>true</optional>
        </dependency>

2. 在parent添加编辑器


        <plugin>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-maven-plugin</artifactId>
         <configuration>
           <fork>true</fork>
           <additionalProperties>true</additionalProperties>
         </configuration>
       </plugin> 

3. 修改idea配置
4. 启动配置修改edit configurations
5. debug运行，run运行不可以
6. 成功一次，其他都失败了
7. 版本问题

eureka注册中心
-
1. 添加依赖

            
            客户端
          <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
          </dependency>
            服务端
         <dependency>
           <groupId>org.springframework.cloud</groupId>
           <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
         </dependency> 
2. 添加配置信息


        eureka:
          client:
            fetch-registry: true
            register-with-eureka: true
            service-url:
              defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/

3. 注解启动
        
        
        客户端：@EnableEurekaClient
        服务端：@EnableEurekaServer
        
4. eureka集群

        
        eureka互相注册
5. 消费端自动寻址


        restTemplate添加注解@LoadBalanced
6. 其他配置


        instance.instance-id 取代默认显示地址
        instance.prefer-ip-address: true 显示IP地址
        
actuator 健康检查
-
1. http://localhost:8001/actuator/health   每台机器的健康状态
2. 其他。。。

discovery服务发现
-

        
    

