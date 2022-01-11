docker 运行交互式的容器：
   docker run -i -t ubuntu:15.10 /bin/bash
cat /proc/version 查看当前版本信息

docker pull ubuntu 载入镜像

docker ps -a 查看所有的容器命令

docker start <容器ID> 启动一个容器

docker stop <容器id > 关闭一个容器

docker restart <容器id> 重启一个容器

docker run -itd --nanme ubuntu-test /bin/bash -d 容器启动进入后台

docker attach <id 或name> 进去退出后导致容器退出

docker exec -it <id 或name>不会导致容器关闭
docker export <id> > ubuntu.tar 导出容器

cat docker/ubuntu.tar | docker import - test/ubuntu:v1

docker rm -f <id 或name> 删除某个容器

 删除某个容器时，这个容器必须是停止的，否则会报错

docker rmi hello-world 删除一个镜像

docker run -d -P 
  -P随机指定一个端口
  -p 指定特定端口 	 


docker build -t nginx:test . 构建命令

docker run --name nginx-test1 -p 8080:80 -d nginx 启动容器




构建dockerfile


#指定镜像
FROM java:8
# 将本地文件拷贝到容器中
COPY  demo.jar .

# 构建容器后调用
ENTRYPOINT ["java", "-jar", "demo.jar"]

docker build -t demo-test .                          
docker run -d - 8888:9999 --name demo-test demo-test 