# 项目背景

针对目前阅读方式多样而阅读书目较难管理，提供一个可对用户进行图书阅读管理的应用，解决用户无好方式可管的烦恼，填充用户的个人读书历程，促进用户阅读习惯的养成。

主要研究内容为：

(1)完成用户阅读书目，阅读进度，阅读感受的简便记录，使用户清晰系统地了解自己    的阅读历程。

(2)进行用户阅读统计，使用户掌握自己的读书速度与阅读偏好，促进用户与他人的分享及进行阅读方向的选择。

 

# 功能需求

## 用例图

![OIGN~N$~9LGM8H@ZKH`RZ(C](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image002.jpg)

完成情况：

\- [x] 登录

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

![登录](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image004.gif)



### 录入书籍信息

用户可以手动录入书籍信息。

![录入](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image006.gif)

 

 

 

 

 

用户也可进行图书搜索。在输入框内输入书名关键字，可模糊搜索到书籍。

![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image008.gif)![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image010.gif)

![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image012.gif)

此处我们进行模拟数据的搜索。数据如下：

![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image014.jpg)

 

### 管理阅读进度

用户可以管理阅读进度，包括添加进度、修改进度和删除进度。

![更新进度](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image016.gif) 输入页码并进行保存。阅读时间自动获取系统日期。

  ![进度更新](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image018.gif)可以看到此处新增一条阅读记录。

![编辑进度](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image020.gif)在此状态下用户不可编辑文字。

   ![编辑](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image022.gif)在此状态下用户可编辑。

### 添加阅读感想

用户可以输入文字添加阅读感想。

![在读转已读](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image024.gif)

### 查看阅读记录详情

用户可以查看阅读记录详情，分为已读、在读、想读三个模块，在读模块可以查看进度记录。

![在读](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image026.gif)![已读](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image028.gif)      ![书籍详情](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image030.gif)       ![想读](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image032.gif)

### 排序阅读记录

用户按完成日期排序阅读记录。可按顺序排序，也可逆序排序。

![书籍详情](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image034.gif)     ![排序](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image036.gif)

### 查看今日赏句

用户可以摇一摇查看今日赏句。赏句摘自经典书籍。

![赏句](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image038.gif)

 

### 统计阅读记录

用户查看阅读记录统计，查看总阅读量、阅读天数、已读数目、书摘数目。  

 

![阅读记录](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image040.gif)



### 查看经典书目推荐

用户可以查看首页的经典书目推荐。

![IMG_256](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image042.gif)    ![书单](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image044.gif)

![想读书单](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image046.gif)

### 评分

用户可以对书籍进行评分。

![评分](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image048.gif)

## 使用流程

![流程图3.0](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image050.gif)

用户进入平台首先看到的是启动页面的开屏。赏句摘自经典书籍。若用户之后还行查看今日赏句可在个人管理页面再次查看。

用户若是选择进行阅读进度管理，则进入管理界面，分为想读、在读、已读模块。在“想读”模块下，用户可录入想读的书籍信息并记录“种草”原因，如从何处了解到这本书的、为什么想要阅读此书。在“在读”模块下，用户也可以直接录入书籍信息，同时进行书籍阅读进度的管理。用户也可以选择已录入的书籍，查看未完成的进度记录，对记录感想、阅读进度进行更新。在“已读”模块下，用户可以查看已完成的进度记录，对进度按照完成时间的进行排序，方便查找，同时也可更新感想，对书籍进行评分。

若是不管理阅读进度，则用户可选择是否进入推荐模块，进入则可以查看经典书目推荐，若用户对书籍感兴趣，则可以在此页面下将书籍加入“想读”模块。

同时用户也可以对已读书目即阅读记录进行统计，可以按照书籍的标签分类来统计或查看相关阅读记录，也可以按照某一时间段内的阅读书目数量进行统计。

 

# 后端

## 数据库

![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image052.jpg)

![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image054.jpg)

![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image056.jpg)

![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image058.jpg)

![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image060.jpg)

![img](file:///C:\Users\ASUS-PC\AppData\Local\Temp\msohtmlclip1\01\clip_image062.jpg)

### 接口文档

#### 微服务1--推荐书籍管理

[http://139.196.36.97:8080/sbDemo/v1/booklist-management](http://139.196.36.97:8080/sbDemo/v1/booklist-management/lists)

1.1  查看不同类型推荐书单

（根据ui从上到下是type=1-4）

接口：”/books”

方法：GET

入参：type（Byte）

出参：List<BookList>

#### 微服务2--用户管理

http://139.196.36.97:8080/sbDemo/v1/user-management

 2.1注册

接口：”/users”

方法：POST

入参：id (Long)（电话号码）

出参：int（正确为1）

2.2修改昵称

接口：”/names”

方法：POST

入参：id (Long), name (String)

出参：int（正确为1）

2.3上传头像

接口：”/portrait”

方法：POST

入参：id (Long), url (String)

出参：int（正确为1）

#### 微服务3—阅读进度管理

http://139.196.36.97:8080/sbDemo/v1/read-management

3.1录入书籍—状态state输入1

接口：”/books”

方法：POST

入参：userid (Long), bookid (Long), state (Integer), title (String), author (String), publisher (String)

出参：int（正确为1）

3.2开始阅读或完成阅读—状态state输入2或3

接口：”/lists”

方法：POST

入参：userid (Long), bookid (Long), state (Integer)

出参：int（正确为1）

3.3查看个人书单

接口：”/shelves”

方法：GET

入参：userid (Long), state (Integer)

出差：List<Read>

3.4根据isbn查找个人书单书籍

接口：”/isbns”

方法：GET

入参：userid (Long), bookid (Long)（书籍的isbn）

出参：Read

3.5根据书名模糊查找书籍

接口：”/titles”

方法：GET

入参：userid (Long), keyword (String)

出参：List<Read>

#### 微服务4—书摘管理

http://139.196.36.97:8080/sbDemo/v1/note-management

4.1录入书摘

接口：”/notes”

方法：POST

入参：userid (Long), bookid (Long), beginPage (Integer), endPage (Integer), content (String)

出参：int（正确为1）

4.2查看书摘

接口：”/lists”

方法：GET

入参：userid (Long), bookid (Long)

出参：List<Note>

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
