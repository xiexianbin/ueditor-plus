ueditor-for-all-cdn使用配置
=====

## Build [![Build Status](https://travis-ci.org/XieXianbin/ueditor-for-all-cdn.svg?branch=master)](https://travis-ci.org/XieXianbin/ueditor-for-all-cdn)[![Issue Stats](http://www.issuestats.com/github/XieXianbin/ueditor-for-all-cdn/badge/issue)](http://www.issuestats.com/github/XieXianbin/ueditor-for-all-cdn)

## 版本说明

1. ueditor-for-all-cdn-v1.2.1-beta和v1.4。3之前的版本均对应ueditor的官方[v1.4.3版本](https://github.com/fex-team/ueditor/tree/v1.4.3 "ueditor v1.4.3 代码")

2. ueditor-for-all-cdn-v1.2.1-beta之后版本将于ueditor官方保持一致。即ueditor-for-all-cdn-v1.4.3.1版本对应ueditor的v1.4.3.1版本。

## Maven

```
<dependency>
  <groupId>cn.xiexianbin.ueditor</groupId>
  <artifactId>ueditor-for-all-cdn</artifactId>
  <version>1.4.3</version>
</dependency>
```

## 使用

Ueditor 官方使用说明：http://fex.baidu.com/ueditor/#server-jsp，ueditor-for-all-cdn提供两种配置模式：

### 1. 标准模式：

配置文件OSSKey.properties位于src/main/resources目录下（及java的classpath目录下），若不配置OSSKey.properties文件或配置useStatus=false，该功能同ueditor官方提供的功能一致；否则，将启用ue的高级功能。。


### 2. 高级模式：

即启用ueditor-for-all-cdn模式，配置及使用方法如下：


1) 把/src/ueditor1_4_3-utf8-jsp文件下的所有文件拷贝到项目的目录下（该文件来自ueditor官网修改后的版本）。


2) 到 https://github.com/XieXianbin/ueditor-for-all-cdn/releases  下载ueditor-for-all-cdn-1.2.0-beta.jar包，与从/src/lib文件夹下的jar包一同拷贝到项目的lib目录下，导入项目。


3) 将/src/OSSKey.properties拷贝到src/main/resources目录下，配置OSSKey.properties文件，修改如下：

```
## ALIYUN OSSClient Configure 

# Ueditor use or not story image to ALIYUN OSS, values true/false
# default value false
useStatus=true

# ALIYUN OSS bucket info
bucketName=ali--cdn-shenzhen
key=
secret=

# auto create Bucket to default (HangZhou) zone, values true/false
# default value false
autoCreateBucket=false

## ALIYUN OSS URL
# The Oss Client Endpoind to auth, like http://oss-cn-shenzhen.aliyuncs.com/
ossCliendEndPoint=http://oss-cn-shenzhen.aliyuncs.com/

# ossEndPoint=http://ali--cdn.oss-cn-shenzhen.aliyuncs.com/
ossEndPoint=http://ali--cdn-shenzhen.oss-cn-shenzhen.aliyuncs.com/

## ALIYUN CDN URL
# Ueditor use or not use ALIYUN CDN, values true/false
# default value false, when useCDN=true, the cdnEndPoint will used.
useCDN=false
#cdnEndPoint=http(s)://cdn.xiexianbin.cn.w.kunlunar.com/
cdnEndPoint=

# Ueditor story or not story image to local direct, values true/false
# default value false
useLocalStorager=false

# default Ueditor upload base path, from config.json, when
# useLocalStorager=false, this values will work to delete upload 
# file, default value is "upload", unuse now.
#uploadBasePath=upload

# Ueditor use or not use asynchronous model to upload image to ALIYUN OSS
# default value false
useAsynUploader=false
```

### 参看是否配置成功

http://127.0.0.1:8080/ueditor/ueditor1_4_3-utf8-jsp/jsp/controller.jsp?action=config

### action类型以及说明

* uploadimage：//执行上传图片或截图的action名称

* uploadscraw：//执行上传涂鸦的action名称

* uploadvideo：//执行上传视频的action名称

* uploadfile：//controller里,执行上传视频的action名称


### 技术支持

邮箱：me@xiexianbin.cn

QQ群：20038301


### 捐赠

本项目是个人业余时间开发和提供技术支持，欢迎捐赠！





