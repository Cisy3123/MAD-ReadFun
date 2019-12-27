# 项目背景

针对目前阅读方式多样而阅读书目较难管理，提供一个可对用户进行图书阅读管理的应用，解决用户无好方式可管的烦恼，填充用户的个人读书历程，促进用户阅读习惯的养成。

主要研究内容为：

(1)完成用户阅读书目，阅读进度，阅读感受的简便记录，使用户清晰系统地了解自己的阅读历程。

(2)进行用户阅读统计，使用户掌握自己的读书速度与阅读偏好，促进用户与他人的分享及进行阅读方向的选择。

 

# 功能需求

## 用例图
![usecase](https://github.com/Cisy3123/ReadFun/blob/master/png/1.png)

完成情况：

- [x] 登录

- [x] 搜索书籍

- [x] 查看阅读记录

- [x] 查看今日赏句

- [x] 统计阅读记录

- [x] 录入书籍信息

- [ ] 查看书籍分类

- [x] 管理阅读进度

- [x] 添加进度

- [x] 修改进度

- [x] 删除进度

- [x] 添加阅读感想

- [x] 评分

- [x] 排序阅读记录

## 功能说明

### 登陆

用户可以通过手机验证码登录。

![登录](https://github.com/Cisy3123/ReadFun/blob/master/png/2.png)

### 录入书籍信息

用户可以手动录入书籍信息。

![录入](https://github.com/Cisy3123/ReadFun/blob/master/png/3.png)

用户也可进行图书搜索。在输入框内输入书名关键字，可模糊搜索到书籍。

![img](https://github.com/Cisy3123/ReadFun/blob/master/png/4.png)

![img](https://github.com/Cisy3123/ReadFun/blob/master/png/5.png)

![img](https://github.com/Cisy3123/ReadFun/blob/master/png/6.png)

此处我们进行模拟数据的搜索。数据如下：

![img](https://github.com/Cisy3123/ReadFun/blob/master/png/7.jpg)


### 管理阅读进度

用户可以管理阅读进度，包括添加进度、修改进度和删除进度。

![更新进度](https://github.com/Cisy3123/ReadFun/blob/master/png/8.png) 输入页码并进行保存。阅读时间自动获取系统日期。

  ![进度更新](https://github.com/Cisy3123/ReadFun/blob/master/png/9.png)可以看到此处新增一条阅读记录。

![编辑进度](https://github.com/Cisy3123/ReadFun/blob/master/png/10.png)在此状态下用户不可编辑文字。

   ![编辑](https://github.com/Cisy3123/ReadFun/blob/master/png/11.png)在此状态下用户可编辑。

### 添加阅读感想

用户可以输入文字添加阅读感想。

![在读转已读](https://github.com/Cisy3123/ReadFun/blob/master/png/12.png)

### 查看阅读记录详情

用户可以查看阅读记录详情，分为已读、在读、想读三个模块，在读模块可以查看进度记录。

![在读](https://github.com/Cisy3123/ReadFun/blob/master/png/13.gif)
![已读](https://github.com/Cisy3123/ReadFun/blob/master/png/14.gif)
![书籍详情](https://github.com/Cisy3123/ReadFun/blob/master/png/15.gif)
![想读](https://github.com/Cisy3123/ReadFun/blob/master/png/16.gif)

### 排序阅读记录

用户按完成日期排序阅读记录。可按顺序排序，也可逆序排序。

![书籍详情](https://github.com/Cisy3123/ReadFun/blob/master/png/15.gif)    
![排序](https://github.com/Cisy3123/ReadFun/blob/master/png/17.png)

### 查看今日赏句

用户可以摇一摇查看今日赏句。赏句摘自经典书籍。

![赏句](https://github.com/Cisy3123/ReadFun/blob/master/png/18.jpg)

 

### 统计阅读记录

用户查看阅读记录统计，查看总阅读量、阅读天数、已读数目、书摘数目。  

![阅读记录](https://github.com/Cisy3123/ReadFun/blob/master/png/19.png)

### 查看经典书目推荐

用户可以查看首页的经典书目推荐。

![IMG_256](https://github.com/Cisy3123/ReadFun/blob/master/png/20.jpg)   
![书单](https://github.com/Cisy3123/ReadFun/blob/master/png/21.png)

![想读书单](https://github.com/Cisy3123/ReadFun/blob/master/png/22.png)

### 评分

用户可以对书籍进行评分。

![评分](https://github.com/Cisy3123/ReadFun/blob/master/png/23.png)

# 代码

## 代码规范

- 类名: UpperCamelCase
- 方法名: lowerCamelCase
- 常量: CONSTANT_CASE
- 非常量: lowerCamelCase
- 参数: lowerCamelCase
- 局部变量: lowerCamelCase
- `@Override`: 合法则标注
- 变量声明: 不允许组合声明
- `if, else, for, do, while`: 必须加`{}`

## 代码扫描

### 使用Lint代码扫描工具

Lint是Android Studio提供的一个代码扫描工具，通过对代码进行静态分析，可以帮助开发者发现代码的质量问题和提出一下改进建议。

Lint工具可检查Android项目源文件是否包含潜在错误，以及在正确性、安全性、性能、易用性、便利性和国际化方面是否需要改进优化。

Lint工具会给出所有在这个项目中不规范的编码、多余的资源、可能的bug、或者其它的一些问题，然后会给出修改的建议供我们参考，虽然这些问题并不会影响App的正常运行，不过这对于项目的规范性和维护性来说是非常重要的。
