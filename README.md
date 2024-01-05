<h1 align="center">API-SDK</h1>
<p align="center"><strong>咸鱼-API 接口开放平台开发者工具包</strong></p>

### 目录结构 📝

```text
apisdk
    ├─client
    ├─config
    ├─exception
    ├─model
    │  ├─enums
    │  ├─params
    │  ├─request
    │  └─response
    ├─service
    │  └─impl
    └─utils
```

### 导航 🧭

- **[咸鱼-API 平台 🔗](https://www.freefish.love/)**

### 快速开始 🚀

**要开始使用 API-SDK，您需要按照以下简单进行操作:**

#### 1. 引入依赖坐标

```xml
<dependency>
    <groupId>com.which</groupId>
    <artifactId>api-sdk</artifactId>
    <version>0.0.2</version>
</dependency>   
```

#### 2. 前往[咸鱼-API 平台](https://www.freefish.love/) 获取开发者密钥对

#### 3. 初始化客户端ApiClient对象

- 方法 1 ：主动实例化客户端

  ```java
  String accessKey = "你的 accessKey";
  String secretKey = "你的 secretKey";
  ApiClient client = new ApiClient(accessKey, secretKey);
  ```

- 方法 2 ：通过配置文件注入对象
  - yml

    ```yml
    # API 配置
    com:
      which:
        client:
          access-key: 你的 accessKey
          secret-key: 你的 secretKey
          # 本地网关地址，可修改为自己的网关，用于本地测试，线上网关地址等，不配置默认平台的网关
         # host: http://localhost:8090/api
    ```

  - properties

    ```properties
    com.which.client.access-key=你的 accessKey
    com.which.client.secret-key=你的 secretKey
    ```

#### 4. 使用API服务

```java
@Resource
private ApiService apiService;
```

#### 5. 发起请求示例

示例：随机毒鸡汤

- 示例一 ：**通过配置文件 推荐👍**

```java
try{
        PoisonousChickenSoupResponse poisonousChickenSoup=apiService.getPoisonousChickenSoup();
        System.out.println("poisonousChickenSoup = "+poisonousChickenSoup);
        }catch(ApiException e){
        log.error(e.getMessage());
        }
```

- 示例二 ：主动注入

```java
try{
        ApiClient apiClient=new ApiClient("你的 accessKey","你的 secretKey");
        PoisonousChickenSoupResponse poisonousChickenSoup=apiService.getPoisonousChickenSoup(apiClient);
        System.out.println("poisonousChickenSoup = "+poisonousChickenSoup);
        }catch(ApiException e){
        log.error(e.getMessage());
        }
```

响应：

```json
{
  "text": "不知道你混什么圈，反正我的是混黑眼圈。"
}
```