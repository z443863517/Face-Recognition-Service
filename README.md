# Face-Recognition-Service
#人像结构化识别及检索系统

v1.0
此系统用于人像获取，识别功能，检索识别记录。


1. 项目结构： 

    * -face-recognition-parent 
        *  --face-recognition-common 
        *  --face-recognition-core 
            *    --face-recognition-pojo 
            *    --face-recognition-dao 
            *    --face-recognition-service 
            *    --face-recognition-web 
   
2. 启动 :
    *  port：8082
    * Test url :http://localhost:8082/page/login 
    
3. 部署方法：
    * 将本项目下载到本地，配置好maven远程仓储，使用maven命令 mvn clean install 打包出 face-recognition-web.war
再将war解压到tomcat webapp/root目录，启动tomcat 即可。