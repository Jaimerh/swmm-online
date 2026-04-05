# SWMM-Online Backend

后端服务 - Spring Boot 2.7.5 + MyBatis-Plus + PostgreSQL

## 技术栈

- **框架**: Spring Boot 2.7.5
- **ORM**: MyBatis-Plus 3.5.2
- **数据库**: PostgreSQL
- **工具库**: Hutool 5.8.10, Guava 31.1-jre
- **JDK**: 11+

## 快速开始

### 1. 配置数据库

创建 PostgreSQL 数据库：
```sql
CREATE DATABASE swmm_db;
```

### 2. 修改配置

编辑 `src/main/resources/application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/swmm_db
    username: your_username
    password: your_password
```

### 3. 运行

```bash
cd backend
mvn spring-boot:run
```

应用将在 http://localhost:8080 启动

## 项目结构

```
backend/
├── src/main/java/com/example/swmm/
│   ├── SwmmApplication.java    # 主应用入口
│   ├── controller/             # REST API 控制器
│   ├── service/                # 业务逻辑层
│   ├── repository/             # 数据访问层 (MyBatis-Plus Mapper)
│   └── entity/                 # 数据实体类
├── src/main/resources/
│   ├── application.yml         # 应用配置
│   └── mapper/                 # MyBatis XML 映射文件 (可选)
└── pom.xml                     # Maven 配置
```

## API 设计 (待实现)

- `GET /api/projects` - 获取项目列表
- `POST /api/projects` - 创建项目
- `POST /api/projects/{id}/simulate` - 运行模拟
- `GET /api/projects/{id}/results` - 获取模拟结果

## 注意事项

- 不使用 Redis 等缓存中间件，保持架构简单
- 所有状态通过 PostgreSQL 持久化
- 代码提交前确保可编译运行
