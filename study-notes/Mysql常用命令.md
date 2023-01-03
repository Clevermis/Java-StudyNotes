# **DDL**

## **数据库操作**

##  1).**查询所有数据库**

```
show databases ;
```



## **2).** **查询当前数据库**

```
select database() ;
```



## **3).** **创建数据库**

```
create database [ if not exists ] 数据库名 [ default charset 字符集 ] [ collate 排序 

规则 ] ;
```



```
create database itheima default charset utf8mb4;
```



## **4).** **删除数据库**

```
drop database [ if exists ] 数据库名 ;
```



## **5).** **切换数据库**

```
use 数据库名 ;  
```



## **表操作**-查询创建

## **1).** **查询当前数据库所有表**

```
show tables; 
```



## **2).** **查看指定表结构**

```
desc 表名 ;
```



## **3).** **查询指定表的建表语句**

```
show create table 表名 ; 
```



## **4).** **创建表结构**

```
CREATE TABLE 表名( 

字段1 字段1类型 [ COMMENT 字段1注释 ], 

字段2 字段2类型 [COMMENT 字段2注释 ], 

字段3 字段3类型 [COMMENT 字段3注释 ], 

...... 

字段n 字段n类型 [COMMENT 字段n注释 ] 

) [ COMMENT 表注释 ] ; 
```

```
create table tb_user( 

id int comment '编号', 

name varchar(50) comment '姓名', 

age int comment '年龄', 

gender varchar(1) comment '性别' 

) comment '用户表'; 
```

## **表操作-修改**

## 1). 添加字段

```
ALTER TABLE 表名 ADD 字段名 类型 (长度) [ COMMENT 注释 ] [ 约束 ]; 
```

为emp表增加一个新的字段”昵称”为nickname，类型为varchar(20)

```
ALTER TABLE emp ADD nickname varchar(20) COMMENT '昵称'; 
```



## 2). 修改数据类型

```
ALTER TABLE 表名 MODIFY 字段名 新数据类型 (长度);
```



## 3). 修改字段名和字段类型

```
ALTER TABLE 表名 CHANGE 旧字段名 新字段名 类型 (长度) [ COMMENT 注释 ] [ 约束 ];
```

将emp表的nickname字段修改为username，类型为varchar(30)

```
ALTER TABLE emp CHANGE nickname username varchar(30) COMMENT '昵称';
```



## 4). 删除字段

```
ALTER TABLE 表名 DROP 字段名; 
```

将emp表的字段username删除

```
ALTER TABLE emp DROP username; 
```



## 5). 修改表名

将emp表的表名修改为 employee

```
ALTER TABLE emp RENAME TO employee; 
```

## **表操作-删除**

## 1). 删除表

```
DROP TABLE [ IF EXISTS ] 表名;
```



## 2). 删除指定表, 并重新创建表

```
TRUNCATE TABLE 表名;
```



# **DML**

## **1).** **给指定字段添加数据**

```
INSERT INTO 表名 (字段名1, 字段名2, ...) VALUES (值1, 值2, ...);
```

案例: 给employee表所有的字段添加数据 ；

```
insert into employee(id,workno,name,gender,age,idcard,entrydate) 

values(1,'1','Itcast','男',10,'123456789012345678','2000-01-01');
```



## **2).** **给全部字段添加数据**

```
INSERT INTO 表名 VALUES (值1, 值2, ...); 
```

案例：插入数据到employee表，具体的SQL如下：

```
insert into employee values(2,'2','张无忌','男',18,'123456789012345670','2005-01- 

01'); 
```



## **3).** **批量添加数据**

```
INSERT INTO 表名 (字段名1, 字段名2, ...) VALUES (值1, 值2, ...), (值1, 值2, ...), (值 

1, 值2, ...) ; 
```

```
INSERT INTO 表名 VALUES (值1, 值2, ...), (值1, 值2, ...), (值1, 值2, ...) ; 
```

 字符串和日期型数据应该包含在引号中。

• 插入的数据大小，应该在字段的规定范围内。

## 修改数据

```
UPDATE 表名 SET 字段名1 = 值1 , 字段名2 = 值2 , .... [ WHERE 条件 ] ; 
```

 修改id为1的数据, 将name修改为小昭, gender修改为 女

```
update employee set name = '小昭' , gender = '女' where id = 1;
```

将所有的员工入职日期修改为 2008-01-01

```
update employee set entrydate = '2008-01-01'; 
```

修改语句的条件可以有，也可以没有，如果没有条件，则会修改整张表的所有数据。

## 删除数据

```sql
DELETE FROM 表名 [ WHERE 条件 ] ;
```

注意事项:

• DELETE 语句的条件可以有，也可以没有，如果没有条件，则会删除整张表的所有数

据。

• DELETE 语句不能删除某一个字段的值(可以使用UPDATE，将该字段值置为NULL即 

可)。





# **DQL**

DQL 查询语句，语法结构如下：

```
SELECT  字段列表 
FROM    表名列表 
WHERE   条件列表 
GROUP BY  分组字段列表 
HAVING   分组后条件列表 
ORDER BY  排序字段列表 
LIMIT   分页参数 
```



## **基础查询**

```
SELECT 字段1, 字段2, 字段3 ... FROM 表名 ; 

SELECT * FROM 表名 ;
```



## **字段设置别名**

```
SELECT 字段1 [ AS 别名1 ] , 字段2 [ AS 别名2 ] ... FROM 表名; 

SELECT 字段1 [ 别名1 ] , 字段2 [ 别名2 ] ... FROM 表名; 
```



## **** **去除重复记录**

```
SELECT DISTINCT 字段列表 FROM 表名; 
```

查询公司员工的上班地址有哪些(不要重复) 

```
select distinct workaddress '工作地址' from emp;
```

 

## **条件查询**

## **语法**

```
SELECT 字段列表 FROM 表名 WHERE 条件列表 ;
```



## **聚合函数**

```
SELECT 聚合函数(字段列表) FROM 表名 ; 
```

NULL值是不参与所有聚合函数运算的。

## **分组查询**

```
SELECT 字段列表 FROM 表名 [ WHERE 条件 ] GROUP BY 分组字段名 [ HAVING 分组后过滤条件 ]; 
```



## **排序查询**

```
SELECT 字段列表 FROM 表名 ORDER BY 字段1 排序方式1 , 字段2 排序方式2 ;
```



## **分页查询**

```
SELECT 字段列表 FROM 表名 LIMIT 起始索引, 查询记录数 ; 
```



# **DCL**

**管理用户**

## 1). 查询用户

```
select * from mysql.user; 
```



## 2). 创建用户

```
CREATE USER '用户名'@'主机名' IDENTIFIED BY '密码'; 
```



## 3). 修改用户密码

```
ALTER USER '用户名'@'主机名' IDENTIFIED WITH mysql_native_password BY '新密码' ; 
```



## 4). 删除用户

```
DROP USER '用户名'@'主机名' ;
```

**权限控制**

## 1). 查询权限

```
SHOW GRANTS FOR '用户名'@'主机名' ; 
```



## 2). 授予权限

```
GRANT 权限列表 ON 数据库名.表名 TO '用户名'@'主机名'; 
```



## 3). 撤销权限

```
REVOKE 权限列表 ON 数据库名.表名 FROM '用户名'@'主机名'; 
```



# **函数**

## A. concat : 字符串拼接

```
select concat('Hello' , ' MySQL'); 
```



## B. lower : 全部转小写

```
select lower('Hello');
```



## upper : 全部转大写

```
select upper('Hello'); 
```



## lpad : 左填充

```
select lpad('01', 5, '-'); 
```



##  rpad : 右填充

```
select rpad('01', 5, '-'); 
```



## trim : 去除空格

```
select trim(' Hello MySQL ');
```



## substring : 截取子字符串

```
select substring('Hello MySQL',1,5);
```

**数值函数**

## A. ceil：向上取整

```
select ceil(1.1);
```



##  floor：向下取整

```
select floor(1.9);
```



##  mod：取模

```
select mod(7,4);
```



##  rand：获取随机数

 

```
select rand(); 
```



##  round：四舍五入

```
select round(2.344,2); 
```

**日期函数**

##  curdate：当前日期

```
select curdate();
```



##  curtime：当前时间

```
select curtime(); 
```



## now：当前日期和时间

```
select now(); 
```



## YEAR , MONTH , DAY：当前年、月、日

```
select YEAR(now()); 

select MONTH(now()); 

select DAY(now()); 
```



## date_add：增加指定的时间间隔

```
select date_add(now(), INTERVAL 70 YEAR );
```



## datediff：获取两个日期相差的天数

```
select datediff('2021-10-01', '2021-12-01'); 
```

查询所有员工的入职天数，并根据入职天数倒序排序。

思路： 入职天数，就是通过当前日期 - 入职日期，所以需要使用datediff函数来完成。

```
select name, datediff(curdate(), entrydate) as 'entrydays' from emp order by entrydays desc; 
```



## **流程函数**

```
select if(false, 'Ok', 'Error');

select ifnull('Ok','Default'); 

select ifnull('','Default'); 

select ifnull(null,'Default'); 
```







