spring cloud 选型
=

- 服务注册 
    - eureka 2018年已经停更，新架构不建议使用
    - zookeeper 
        - dubbo 服务非常依赖zookeeper
        - 节点类型：
            - 临时节点 zk选择临时加节点作为注册节点
            - 永久节点 
            - 临时有序节点 
        - demo 失败，节点信息注册为空，不能调用
    - consul
    - 1
- 服务发现
