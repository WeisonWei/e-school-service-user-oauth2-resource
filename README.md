# e-school-service-user
e-school-service-user

## 1 init mongodb
docker exec -it f68db3938d99 sh
mongo
use admin
db.auth("root","123123")
show dbs
use userService
db.userService.insert({"name":"Weison"})
db.createUser({user:"us-app",pwd:"123456",roles:[{role:"dbOwner",db:"userService"}]})
#db.createUser({user:"us-app",pwd:"123456",roles:[{role:"dbOwner",db:"userService"}],mechanisms : ["SCRAM-SHA-256"] })
db.dropUser("us-app")

## 访问步骤
获取授权码code --> [GET]http://localhost:8082/oauth/authorize?client_id=client&response_type=code
拿到授权码code --> https://www.baidu.com/?code=sfPklW
获取token --> [POST]http://client:secret@localhost:8082/oauth/token [form-data] {code:授权码,grant_type:authorization_code}
拿到access_token --> 
```java
{
    "access_token": "67db6d91-3461-4716-a3fd-8133216326c7",
    "token_type": "bearer",
    "expires_in": 34891,
    "scope": "app"
}
```
附：默认的端点 URL

    /oauth/authorize：授权端点
    /oauth/token：令牌端点
    /oauth/confirm_access：用户确认授权提交端点
    /oauth/error：授权服务错误信息端点
    /oauth/check_token：用于资源服务访问的令牌解析端点
    /oauth/token_key：提供公有密匙的端点，如果你使用 JWT 令牌的话

