# 1.Java API

## 1.1 Scanner 类

```java

Scanner类的功能：可以实现键盘输入数据，到程序当中。

引用类型的一般使用步骤：

1. 导包
import 包路径.类名称;
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import语句。

2. 创建
类名称 对象名 = new 类名称();

3. 使用
对象名.成员方法名()

获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();

```

## 1.2 匿名对象（Annoymous）

```java

创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称();

注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。

```

```java
        // 普通使用方式
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

        // 匿名对象的方式
       int num = new Scanner(System.in).nextInt();
       System.out.println("输入的是：" + num);

        // 使用一般写法传入参数
       Scanner sc = new Scanner(System.in);
       methodParam(sc);

        // 使用匿名对象来进行传参
       methodParam(new Scanner(System.in));
```

## 1.3 ArrayList 集合

```java

数组的长度不可以发生改变。
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
如果内容是空，得到的是空的中括号：[]

```

```java

ArrayList当中的常用方法有：

public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其他集合（今后学习）来说，add添加动作不一定成功。

public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。

public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。

```

```java

如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。

基本类型    包装类（引用类型，包装类都位于java.lang包下）
byte        Byte
short       Short
int         Integer     【特殊】
long        Long
float       Float
double      Double
char        Character   【特殊】
boolean     Boolean

从JDK 1.5+开始，支持自动装箱、自动拆箱。

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型

```

## 1.4 Math(数学工具类)

```java

java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。

public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1, 元素2, 元素3...]）
public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序。

备注：
1. 如果是数值，sort默认按照升序从小到大
2. 如果是字符串，sort默认按照字母升序
3. 如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。（今后学习）

```

```java

 java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

 public static double abs(double num)：获取绝对值。有多种重载。
 public static double ceil(double num)：向上取整。
 public static double floor(double num)：向下取整。
 public static long round(double num)：四舍五入。

 Math.PI代表近似的圆周率常量（double）。

```

## 1.5 Random

```java

Random类用来生成随机数字。使用起来也是三个步骤：

1. 导包
import java.util.Random;

2. 创建
Random r = new Random(); // 小括号当中留空即可

3. 使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
实际上代表的含义是：[0,3)，也就是0~2

```

## 1.6 Static

```java

一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它。

无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用。
静态变量：类名称.静态变量
静态方法：类名称.静态方法()

注意事项：
1. 静态不能直接访问非静态。
原因：因为在内存当中是【先】有的静态内容，【后】有的非静态内容。
“先人不知道后人，但是后人知道先人。”
2. 静态方法当中不能用this。
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。

```

```java

静态代码块的格式是：

public class 类名称 {
    static {
        // 静态代码块的内容
    }
}

特点：当第一次用到本类时，静态代码块执行唯一的一次。
静态内容总是优先于非静态，所以静态代码块比构造方法先执行。

静态代码块的典型用途：
用来一次性地对静态成员变量进行赋值。

```

```java

如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。

```

## 1.7 String

```java

java.lang.String类代表字符串。
API当中说：Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
其实就是说：程序当中所有的双引号字符串，都是String类的对象。（就算没有new，也照样是。）

字符串的特点：
1. 字符串的内容永不可变。【重点】
2. 正是因为字符串不可改变，所以字符串是可以共享使用的。
3. 字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。

创建字符串的常见3+1种方式。
三种构造方法：
public String()：创建一个空白字符串，不含有任何内容。
public String(char[] array)：根据字符数组的内容，来创建对应的字符串。
public String(byte[] array)：根据字节数组的内容，来创建对应的字符串。
一种直接创建：
String str = "Hello"; // 右边直接用双引号

注意：直接写上双引号，就是字符串对象。

```



```java

String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
备注：CharSequence意思就是说可以接受字符串类型。

```

```java

==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：

public boolean equals(Object obj)：参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false。
注意事项：
1. 任何对象都能用Object进行接收。
2. equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
推荐："abc".equals(str)    不推荐：str.equals("abc")

public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较。

```

```java

String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。

```

```java

字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。

对于基本类型来说，==是进行数值的比较。
对于引用类型来说，==是进行【地址值】的比较。

```

```java

分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

注意事项：
split方法的参数其实是一个“正则表达式”，今后学习。
今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）

```

```

字符串的截取方法：

public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
备注：[begin,end)，包含左边，不包含右边。

```



# 2.Java 集合

https://www.pdai.tech/md/java/collection/java-collection-all.html

![image-20221231172421455](../study-notes-imgs/image-20221231172421455.png)

![image-20221231172748017](../study-notes-imgs/image-20221231172748017.png)

## 2.1 Collection

### 2.1.1 ArrayList

- add：添加单个元素
- remove：删除指定元素
- contains：查找元素是否存在
- size：获取元素个数
- isEmpty：判断是否为空
- clear：清空
- addAll：添加多个元素
- containsAll：查找多个元素是否都存在
- removeAll：删除多个元素
- ![image-20221231220214075](../study-notes-imgs/image-20221231220214075.png)
- ![image-20221231220335269](../study-notes-imgs/image-20221231220335269.png)
- ![image-20221231220418560](../study-notes-imgs/image-20221231220418560.png)
- 

### 2.1.2 LinkedList

![image-20221231221221466](../study-notes-imgs/image-20221231221221466.png)

### 2.1.3 Vector

![image-20221231220902830](../study-notes-imgs/image-20221231220902830.png)

![image-20221231221044327](../study-notes-imgs/image-20221231221044327.png)

### 2.1.4 HashSet

![image-20221231221406171](../study-notes-imgs/image-20221231221406171.png)

### 2.1.5 LinkedHashSet

![image-20221231221506546](../study-notes-imgs/image-20221231221506546.png)

### 2.1.6 TreeSet

![image-20221231221626030](../study-notes-imgs/image-20221231221626030.png)

## 2.2 Map

### 2.2.1 HashMap

![image-20221231221656135](../study-notes-imgs/image-20221231221656135.png)

### 2.2.2 Hashtable

![image-20221231221729888](../study-notes-imgs/image-20221231221729888.png)

### 2.2.3 LinkedHashMap

### 2.2.4 TreeMap

![image-20221231221926163](../study-notes-imgs/image-20221231221926163.png)

### 2.2.5 Properties

![image-20221231221843162](../study-notes-imgs/image-20221231221843162.png)

## 2.3 Collections

# 3.Java多线程

## 01.线程简介



什么叫做任务及多任务，看起来是多个任务都在做，其实本质上我们的大脑在同一时间依旧只做了一件事情.

原来一条路，慢慢因为车太多，道路堵塞，效率低下，为了提高使用的效率，能够充分利用道路，于是加了多个车道。

主线程t.run()----调用run()  调用t.start()  子线程执行run()方法

在操作系统中运行的程序就叫做进程，比如你的QQ，播放器，游戏，IED等

一个进程包含 多个线程，如视频中的同时听到声音，看图像，看弹幕等

Process与Thread

进程，就是程序，程序是指令和数据的有序集合，其本身没有任何运行的含义，是一个静态的概念；

进程是执行程序的一次执行过程，他是一个动态的概念，是系统资源分配的单位

通常讲一个进程中可以包含若干个线程，当然一个进程中至少有一个线程，不然没有存在的意义，线程是CPU调度和执行的单位。

注意：很多的多线程是模拟出的，真正的多线程是指多个CPU，既多核，如服务器，如果是模拟出来的多线程，既在一个CPU的情况下，在同一个时间段，CPU只能执行一个代码，因为切换的很快，所以就有了同时执行的错局!

**线程的一些概念**

线程就是独立的执行路径

在程序运行时，即使没有自己创建线程，后台也会有多个线程如主线程，GC线程

main()称之为主线程，是系统的入口，用于执行整个程序

在一个进程中，如果开辟了多个线程，线程的运行由调度器安排调度，调度器是与操作系统紧密相关的，先后顺序是不能人为的干预的

对于同一份资源操作时，会存在资源抢夺的问题，需要加入并发控制

线程会带来额外的开销，如CPU调度时间，并发控制开销

每个线程会在自己的工作内存交互，内存控制不当会造成数据不一致



## 02.线程实现(重点)



Thread， Runnable ，Callable  创建线程3种方式

Thread classs 继承Thread类(重点)

Runnable 实现Runnable接口(重点)

Callable接口，实现Callable接口



### Thread创建线程的方法

官网的介绍案例

There are two ways to create a new thread of execution. One is to declare a class to be a subclass of `Thread`. This subclass should override the `run` method of class `Thread`. An instance of the subclass can then be allocated and started. For example, a thread that computes primes larger than a stated value could be written as follows:

------

> ```
>   class PrimeThread extends Thread {
>       long minPrime;
>       PrimeThread(long minPrime) {
>           this.minPrime = minPrime;
>       }
> 
>       public void run() {
>           // compute primes larger than minPrime
>            . . .
>       }
>   }
> 
> ```

------

The following code would then create a thread and start it running:

> ```
>   PrimeThread p = new PrimeThread(143);
>   p.start();
> 
> ```



### 方法一.继承Thread

**我们实现线程的第一种方法步骤：**

- 首先，自定义线程类继承Thread类
- 然后，重写run()方法，编写线程执行体
- 最后，创建线程对象，调用start()方法启动线程

实例代码：

```java
public class TestThread extends Thread{
    @Override
    public void run() {
        super.run();
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码-----" + i);
        }
    }

    //main 线程，主线程
    public static void main(String[] args) {
        //创建一个线程对象
        TestThread testThread = new TestThread();
        //调用start()方法开启线程
        testThread.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程---" + i);
        }
    }
}
```



注意：

1) 上述线程是两个同时进行，同时打印，但是如果调用run()方法，则没有同时执行效果

2) 线程开启并不一定是立刻执行，是由CPU来进行调度执行的。

> 写程序，参数不是直接放上去的，是需要什么参数放什么参数



> 如何将一个第三方包导入到自己的项目？
>
> - 首先，进入百度搜索commons-io并下载包
> - 然后在我们的项目目录包/src/top/下，建立一个lib文件夹，并将我们的第三方commons-io包的commons-io-2.8.0.jar拷贝到这文件夹
> - 选中lib文件夹，点击鼠标右键，选择[] Add as libray]，添加完成后，我们可以通过点击File--project struct查看到我们的包已经加入到libraies里面
> - 接下里在我们自己的项目代码里面，就可以使用这个jar包里面的类了

快捷方式：快速定位某个类可以直接输入首字符，例如TestThread2可以快速输入public TT2

多线程下载图片的思路

1. 首先写了一个WebDownloader类，里面实现了download方法，调用FileUtils类下载文件
2. 主程序继承了Thread，设置了属性 url和文件名name，并在构造器赋值初始化
3. 重写run()方法，在这里实例化下载器，并使用download下载
4. main中实例化三个线程，并执行start，启动三个进程

```java
//练习Thread, 实现多线程同步下载图片
public class TestThread2 extends Thread {
    private String url; //网络图片地址
    private String name; //保存的文件名

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    //下载图片线程的执行体
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.download(url, name);
        System.out.println("下载了文件名为:" + name);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2559010307,1947549626&fm=26&gp=0.jpg", "baidu1.jpg");
        TestThread2 t2 = new TestThread2("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1603949225766&di=199ae5b77c66e91f65f8b5b7691a6a73&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20170831%2F3e827d8be72449eb9320ec146201c65e.jpeg", "baidu2.jpg");
        TestThread2 t3 = new TestThread2("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1603949258029&di=13dc94f651973b6cbe7362ca1decdbb9&imgtype=0&src=http%3A%2F%2Fwww.uvink.com.cn%2Fuploads%2Fallimg%2F170519%2F1-1F5191541205X.jpg", "baidu3.jpg");

        t1.start();
        t2.start();
        t3.start();
    }
}


class WebDownloader {
    //下载方法
    public void download(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题!");
        }

    }
}
```

### 方法二.实现Runnable

**线程的第二种方法-实现Runnable接口 步骤：**

官网的例子

The other way to create a thread is to declare a class that implements the `Runnable` interface. That class then implements the `run` method. An instance of the class can then be allocated, passed as an argument when creating `Thread`, and started. The same example in this other style looks like the following:

------

> ```
>   class PrimeRun implements Runnable {
>       long minPrime;
>       PrimeRun(long minPrime) {
>           this.minPrime = minPrime;
>       }
> 
>       public void run() {
>           // compute primes larger than minPrime
>            . . .
>       }
>   }
> 
> ```

------

The following code would then create a thread and start it running:

> ```
>   PrimeRun p = new PrimeRun(143);
>   new Thread(p).start();
> 
> ```

Every thread has a name for identification purposes. More than one thread may have the same name. If a name is not specified when a thread is created, a new name is generated for it.

Unless otherwise noted, passing a `null` argument to a constructor or method in this class will cause a [`NullPointerException`](https://docs.oracle.com/javase/8/docs/api/java/lang/NullPointerException.html) to be thrown.



第二种方法的步骤：

1. 首先定义一个类实现Runnable接口，实现run方法，编写线程执行体
2. 创建线程对象，传入创建的类，并调用start()方法启动线程



示例代码

```java
package top.aigoo.demo1;
//创建线程方式2，实现Runnable接口，重写run方法，执行线程需要丢入Runnable实现类
public class TestThread3  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码----" + i);
        }
    }

    public static void main(String[] args) {
        //创建runnable接口的实现类对象
        TestThread3 testThread3 = new TestThread3();
        //创建线程对象，通过线程对象啦开启我们的线程，这是代理
        new Thread(testThread3).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("===我在学习多线程" + i);
        }
    }
}
```



推荐使用RUnnable方法实现线程，因为JAVA是单继承，



小结：

继承Thread类

	子类继承Thread类具备多线程能力
	
	启动线程  子类对象.start()
	
	不建议使用，避免oop单继承的局限性

实现Runnable接口

	实现接口Runnable具有多线程能力
	
	启动线程，传入模板对象+Thread对象.start()
	
	推荐使用，规避oop单继承的局限性，灵活方便，方便同一个对象多个线程使用

>**idea的try/catch快捷键**
>今天写idea的时候用到了try/catch 结果忘记了快捷键，然后搜了一下很简单
>Ctrl+Alt+T 就这么简单，也可以直接使用alt+enter

进程使用访问同一个资源会出现问题，资源死锁，

示例代码如下：

```java
public class TestThread4 implements Runnable {
    private  int tickerNum=10; //一共10张车票
    @Override
    public void run() {
        while (true){
            if (tickerNum<=0){break;}
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"拿到了第"+tickerNum--+"张票");
        }
    }

    public static void main(String[] args) {
        TestThread4 ticket = new TestThread4();
        new Thread(ticket,"小米").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛党").start();
    }
}

输出结果：
老师拿到了第8张票
小米拿到了第10张票
黄牛党拿到了第9张票
黄牛党拿到了第7张票
小米拿到了第5张票
老师拿到了第6张票
小米拿到了第2张票
老师拿到了第4张票
黄牛党拿到了第3张票
黄牛党拿到了第1张票
老师拿到了第0张票
小米拿到了第1张票
```

### 设计模式-静态代理模式

接口  Mary{  void happyMarry()  }

实际执行结婚的  class You implements Mary {  void happyMarry(){  ........}   }

婚庆公司: class WeddingCompany implements Mary(){  void hayypMarry(){ ........}}

类之间的UML结构

> 类的继承 使用 **实线空心三角形**
>
> 类的接口实现 使用  **虚线空心三角形**
>
> 

示例代码:

```java
package top.aigoo.www;
//代理模式案例，你要结婚，你可以自己结婚，也可以找代理结婚，那我们可以设置一个接口，实现结婚，然后你和代理公司
//都实现这个接口
// 静态代理模式总结
//真实对象和代理对象都要事先同一个接口 Merry{}的 happyMerry()
//代理对象要代理真实角色
//好处： 代理对象可以做很多真实对象做不了的事情，真实对象专注做自己事情

public class StaticProxy {
    public static void main(String[] args) {
        //对比线程代理模式, 静态代理模式，Thread实现Runnable接口，中间的Runnable实例也实现Runnable接口
//        new Thread(()-> System.out.println("Runnable的Lambda表达式")).start();
//        new WeddingCompany(new You()).happyMarry();
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.happyMarry();
    }
}

interface Mary {
    //人间四大喜事  久旱逢甘霖  他乡遇故知 同房花烛夜 金榜题名时
    void happyMarry();
}

class You implements Mary {
    //真是角色，你去结婚
    @Override
    public void happyMarry() {
        System.out.println("秦老师要结婚了,超级开心");
    }
}

//代理角色，帮助你结婚
class WeddingCompany implements Mary {
    //代理谁？---target 真实目标角色
    private Mary target;

    public WeddingCompany(Mary target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        before();
        this.target.happyMarry();//这是真实对象结婚
        after();
    }

    private void after() {
        System.out.println("结婚之后收尾款");
    }

    private void before() {
        System.out.println("结婚之前，布置现场");
    }
}
```



### Lamda表达式

> 为什么用Lamda表达式?
>
> - 避免匿名内部类定义过多
> - 可以让你代码看起来简洁
> - 去掉一堆没用的代码，只留下核心功能
>
> 
>
> 什么情况下用Lamda表达式?
>
> 对于函数式接口，我们可以通过Lamda表达式来创建该接口的对象。
>
> 函数式接口，是学习JDK8的关键所在，任何接口，如果只包含唯一一个抽象方法，那么他就是一个函数式接口
>
> public interface Runnable{
>
> 	public abstract void run();  //对于接口， 不管写不写public abstract 都是 public abstract
>
> }
>
> Lamda的逐渐演化史
>
> ```java
> public class LamdaShow {
>     //2.简化使用静态内部类实现
>     static class Like2 implements ILike{
>         @Override
>         public void lambda() {
>             System.out.println("i like lambda 2");
>         }
>     }
>     public static void main(String[] args) {
>         ILike like = new Like();
>         like.lambda();
>         like = new Like2();
>         like.lambda();
>         //3 简化使用局部内部类
>         class Like3 implements ILike{
>             @Override
>             public void lambda() {
>                 System.out.println("i like lambda 3");
>             }
>         }
>         like = new Like3();
>         like.lambda();
>         //4. 简化使用匿名内部类
>         like = new ILike() {
>             @Override
>             public void lambda() {
>                 System.out.println("i like lambda 4");
>             }
>         };
>         like.lambda();
> 
>         //5,jdk8，简化使用lambda表达式
>         like = ()-> { System.out.println("i like lambda 5"); };
>         like.lambda();
> 
>     }
> }
> 
> interface ILike{
>     public abstract void lambda();
> }
> 
> 
> //1.用传统的方式实现
> class Like implements ILike{
>     @Override
>     public void lambda() {
>         System.out.println("i like lambda 1");
>     }
> }
> ```
>
> 

我们这里给出六个接口，后文的全部操作都利用这六个接口来进行阐述

```java
/**多参数无返回*/
@FunctionalInterface
public interface NoReturnMultiParam {
    void method(int a, int b);
}

/**无参无返回值*/
@FunctionalInterface
public interface NoReturnNoParam {
    void method();
}

/**一个参数无返回*/
@FunctionalInterface
public interface NoReturnOneParam {
    void method(int a);
}

/**多个参数有返回值*/
@FunctionalInterface
public interface ReturnMultiParam {
    int method(int a, int b);
}

/*** 无参有返回*/
@FunctionalInterface
public interface ReturnNoParam {
    int method();
}

/**一个参数有返回值*/
@FunctionalInterface
public interface ReturnOneParam {
    int method(int a);
}
```

语法形式为 () -> {}，其中 () 用来描述参数列表，{} 用来描述方法体，-> 为 lambda运算符 ，读作(goes to)。

```java
import lambda.interfaces.*;

public class Test1 {
    public static void main(String[] args) {

        //无参无返回
        NoReturnNoParam noReturnNoParam = () -> {
            System.out.println("NoReturnNoParam");
        };
        noReturnNoParam.method();

        //一个参数无返回
        NoReturnOneParam noReturnOneParam = (int a) -> {
            System.out.println("NoReturnOneParam param:" + a);
        };
        noReturnOneParam.method(6);

        //多个参数无返回
        NoReturnMultiParam noReturnMultiParam = (int a, int b) -> {
            System.out.println("NoReturnMultiParam param:" + "{" + a +"," + + b +"}");
        };
        noReturnMultiParam.method(6, 8);

        //无参有返回值
        ReturnNoParam returnNoParam = () -> {
            System.out.print("ReturnNoParam");
            return 1;
        };

        int res = returnNoParam.method();
        System.out.println("return:" + res);

        //一个参数有返回值
        ReturnOneParam returnOneParam = (int a) -> {
            System.out.println("ReturnOneParam param:" + a);
            return 1;
        };

        int res2 = returnOneParam.method(6);
        System.out.println("return:" + res2);

        //多个参数有返回值
        ReturnMultiParam returnMultiParam = (int a, int b) -> {
            System.out.println("ReturnMultiParam param:" + "{" + a + "," + b +"}");
            return 1;
        };

        int res3 = returnMultiParam.method(6, 8);
        System.out.println("return:" + res3);
    }
}
```

我们可以通过观察以下代码来完成代码进一步简化，写出更加优雅的代码

```java
import lambda.interfaces.*;

public class Test2 {
    public static void main(String[] args) {

        //1.简化参数类型，可以不写参数类型，但是必须所有参数都不写
        NoReturnMultiParam lamdba1 = (a, b) -> {
            System.out.println("简化参数类型");
        };
        lamdba1.method(1, 2);

        //2.简化参数小括号，如果只有一个参数则可以省略参数小括号
        NoReturnOneParam lambda2 = a -> {
            System.out.println("简化参数小括号");
        };
        lambda2.method(1);

        //3.简化方法体大括号，如果方法条只有一条语句，则可以胜率方法体大括号
        NoReturnNoParam lambda3 = () -> System.out.println("简化方法体大括号");
        lambda3.method();

        //4.如果方法体只有一条语句，并且是 return 语句，则可以省略方法体大括号
        ReturnOneParam lambda4 = a -> a+3;
        System.out.println(lambda4.method(5));

        ReturnMultiParam lambda5 = (a, b) -> a+b;
        System.out.println(lambda5.method(1, 1));
    }
}

love = ()->System.out.print("我是lambda表达式");
love.love
小结:
- lambda表达式 只能有一行代码的情况才能简化成为一行，如果有多行，那么就用代码块包裹{};
- 必须是函数式接口，也就是一个接口内只有一个方法;
- 多个参数也可以去掉参数类型，要去掉就都去掉
```

### 实现Callable接口 



实现Callable接口，需要返回值类型

重写call方法，需要抛出异常

创建目标对象，

创建执行服务ExecutorService ser = Executors.netFixedThreadPool(1);

提交执行Future<Boolean> result1 = ser.submit(t1);

获取结果 boolean r1 = result1.get()

关闭服务 ser.shutdownNot();

```java
创建线程的方式三，实现callable接口
/*
好处1 可以有返回值
可以
 */
public class TestCallable implements Callable<Boolean> {
    private String url; //网络图片地址
    private String name; //保存的文件名

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    //下载图片线程的执行体
    @Override
    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.download(url, name);
        System.out.println("下载了文件名为:" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2559010307,1947549626&fm=26&gp=0.jpg", "baidu1.jpg");
        TestCallable t2 = new TestCallable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1603949225766&di=199ae5b77c66e91f65f8b5b7691a6a73&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20170831%2F3e827d8be72449eb9320ec146201c65e.jpeg", "baidu2.jpg");
        TestCallable t3 = new TestCallable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1603949258029&di=13dc94f651973b6cbe7362ca1decdbb9&imgtype=0&src=http%3A%2F%2Fwww.uvink.com.cn%2Fuploads%2Fallimg%2F170519%2F1-1F5191541205X.jpg", "baidu3.jpg");
        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> result1 = ser.submit(t1);
        Future<Boolean> result2 = ser.submit(t2);
        Future<Boolean> result3 = ser.submit(t3);
        //获取结果
        boolean rs1 = result1.get();
        boolean rs2 = result2.get();
        boolean rs3 = result3.get();

        //关闭服务
        ser.shutdown();
    }
}


class WebDownloader {
    //下载方法
    public void download(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题!");
        }

    }
}

```







## 03.线程状态

案例 龟兔赛跑的一个例子Race

需求

首先来个赛道距离，然后要离终点越来越近

判断比赛是否结束

打印出来胜利者

龟兔赛跑开始

故事中乌龟赢了。兔子需要睡觉，所以我们摸你兔子睡觉

终于，乌龟赢了比赛

示例代码

```java
public class Race implements Runnable {
    private String winner; //胜利者

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {

            if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            boolean flag = gameOver(i);
            if (flag) {
                break;
            }

            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "步");
        }
    }

    public boolean gameOver(int steps) {
        if (winner != null) {
            return true;
        }
        {
            if (steps >= 100) {
                winner = Thread.currentThread().getName();
                System.out.println("====胜利者是:" + winner);
                return true;
            }

        }
        
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();

    }
}
```



![image-20201030100117304](F:\MD格式学习笔记库\狂神JAVA-3-课堂随记.assets\image-20201030100117304.png)

5大状态

![image-20201030100241693](F:\MD格式学习笔记库\狂神JAVA-3-课堂随记.assets\image-20201030100241693.png)

### 线程停止

不推荐使用jdk提供的stop() ,destory()方法，已经废弃了，推荐线程自己停止下来，建议使用一个标志位进行终止变量当flag=false，则终止线程运行。

示例代码

```java
public class TestThreadStop implements Runnable {
    //设置进程标志位
    private boolean flag =true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("run....Thread："+i++);
        }
    }
    //设置公开的方法停止线程，转换标志位
    public void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TestThreadStop testThreadStop = new TestThreadStop();
        new Thread(testThreadStop).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
            if (i==900){
                //调用stop方法切换标志位，让线程停止
                testThreadStop.stop();
                System.out.println("线程该停止了");
            }
        }
    }
}
```

### 线程休眠

sleep()实现线程休眠，单位是当前线程阻塞的毫秒数，sleep存在异常InterruptedException; sleep时间达到后线程进入就绪状态等待cpu调度，sleep可以用来模拟网络延时，倒计时等,每一个对象都有一个锁，在sleep不会释放锁;

做一个demo 计时功能

案例一 ，模拟买票资源抢夺，当加入sleep后，线程访问同一个对象造成的死锁问题，会被放大

```java
public class TestThreadSleep implements Runnable {
    private int ticketNum = 10; //默认系统有10张火车票

    @Override
    public void run() {
        while (true){
            if (ticketNum<0){
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNum--+"张票");
        }
    }

    public static void main(String[] args) {
        TestThreadSleep testThreadSleep = new TestThreadSleep();
        new Thread(testThreadSleep,"小明").start();
        new Thread(testThreadSleep,"老师").start();
        new Thread(testThreadSleep,"黄牛党").start();
    }
}
# 执行结果
    黄牛党拿到了第10张票
老师拿到了第9张票
小明拿到了第9张票
小明拿到了第6张票
黄牛党拿到了第8张票
老师拿到了第7张票
小明拿到了第5张票
黄牛党拿到了第4张票
老师拿到了第5张票
黄牛党拿到了第2张票
小明拿到了第1张票
老师拿到了第3张票
黄牛党拿到了第0张票
小明拿到了第-1张票
老师拿到了第-2张票

Process finished with exit code 0
```

案例二 模拟倒计时

```java
public class TestThreadSleep2 {
    private static int time =10;
    public static void main(String[] args) {
        downTime(time);
    }
    public static void downTime(int time){
        while (true){
            System.out.println(time--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time<0){
                break;
            }

        }
    }
}
输入结果:
10  9  8  7  6  5  4  3  2  1  0  
```

案例三 模拟输出当前系统时间

```java
public class TestThreadSleep2 {
    private static int time =10;


    public static void main(String[] args) {
        SimpleDateFormat myDate = new SimpleDateFormat("HH:mm:ss");
        while (true){
            if (--time<0){
                break;
            }
            System.out.println(myDate.format(new Date(System.currentTimeMillis())));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
    public static void currentTime(){

    }
}
```



线程sleep()一般用来模拟网络延迟或者倒计时或者获取一些时间

### 线程礼让 yield

礼让线程，让当前正在执行的线程暂停，但不阻塞，将线程从运行状态转为继续状态，让cpu重新调度，礼让不一定成功，看CPU心情



实例代码：

```java
public class TestThreadYield {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        new Thread(myThread,"A").start();
        new Thread(myThread,"B").start();
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}

输出结果:
A--线程开始执行
B--线程开始执行
B线程停止执行
A线程停止执行
```



### 线程强制执行join

Join 合并线程，待此线程执行完成后，再执行其他线程，其他线程阻塞，可以想象成插队功能

示例代码

```java
public class NewThreadJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Vip进程在跑第"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        NewThreadJoin newThreadJoin = new NewThreadJoin();
        Thread thread = new Thread(newThreadJoin);
        thread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("main主函数在执行" + i);
            if (i==2){
                System.out.println("此时线程被强行加入");
                thread.join();
            }

        }
    }
}
```



### 观察线程状态

Thread.state  可以查看到线程的状态

NEW - RUNNABLE -BLOCKER-- WAITING ---- TIME_WAITING -----TERMINATED

> 线程中断或者结束后，一旦进入死亡状态，就不能再次启动了

```java
public class TestThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //观测线程当前
        Thread.State state = thread.getState();
        System.out.println(state);  //New之后的状态New

        thread.start();
        state = thread.getState();
        System.out.println(state);//执行了启动，这个时候state应该是Runnable

        //执行中观测状态，没0.1S观察一次
        while (thread.getState()!=Thread.State.TERMINATED){
            state = thread.getState(); //更新线程状态
            System.out.println(state);//观察状态
            Thread.sleep(100);
        }
        //执行完，获取一下状态
        state = thread.getState();
        System.out.println(state);//TERMINATED

        //thread.start(); //线程死亡后，就不能继续再start()
    }
}
```

### 线程的优先级 Priotity



java提供一个线程调度器来监控程序中启动后进入就绪状态的所有线程，线程调度器按照优先级决定应该调度那个线程来执行。

线程优先级用数字表示，范围从1-10  Thread.MIN_PRIOTITY=1 Thread.MAX_PRIOTITY=10, Thread.NORM_PRIOTITY=5

使用一下方式可改变或者获取优先级 getPriority()  setPriority(int xxx)



示例代码

```java
public class TestThreadPriority {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "-->" + Thread.currentThread().getPriority());

        MyThreadPriority priority = new MyThreadPriority();


        //默认t1优先级
        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread(priority);
            Thread t2 = new Thread(priority);
            Thread t3 = new Thread(priority);
            Thread t4 = new Thread(priority);
            Thread t5 = new Thread(priority);
            Thread t6 = new Thread(priority);
            t1.start();

            t2.setPriority(1);
            t2.start();

            t3.setPriority(4);
            t3.start();

            t4.setPriority(Thread.MAX_PRIORITY);
            t4.start();

            t5.setPriority(7);
            t5.start();

            t6.setPriority(8);
            t6.start();
        }


    }
}

class MyThreadPriority implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-->" + Thread.currentThread().getPriority());
    }
}
```



### 守护(daemon)线程

线程分为用户线程和守护线程

虚拟机必须确保用户线程执行完毕，虚拟机不用等待守护进程完毕，如后台记录操作日志，监控内存，垃圾回收等待

```java
public class TestThreadDaemon {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread t1 = new Thread(god);
        t1.setDaemon(true);
        t1.start();

        new Thread(you).start();

    }
}


class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("上帝保佑你");
        }
    }
}

class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36000; i++) {
            System.out.println("你已经开心的活着!");
        }
        System.out.println("======goodbye world=======");
    }
}
```



## 04.线程同步(同步)



对象等待池，多个需要同时访问此对象的线程都会放入对象等待吃

### 队列和锁

由于同一个进程的多个线程共享同一块存储空间，在带来方便的同时，也带来了访问的冲突，为了保证数据在方法中被访问时的正确性，在访问时加入锁机制synchronized；

队列+锁，解决线程安全 synchronized ，当一个线程获得对象的排它锁，独占资源，其他线程必须等待，使用后释放锁即可，但存在如下问题：

- 一起线程持有锁会导致其他所有需要此锁的线程挂起；
- 在多线程竞争下，加锁，释放锁会导致比较多的上下文切换和调度延时，引起性能问题
- 如果一个优先级高的线程等待一个优先级低的线程释放锁，会导致优先级导致，引起性能的问题

### 三个不安全的线程例子

例子1 买票不安全问题

```java
public class TestSyschronizedDemo {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"苦逼的我").start();
        new Thread(buyTicket,"牛逼的你们").start();
        new Thread(buyTicket,"可恶的黄牛").start();
    }
}


class BuyTicket implements Runnable{
    private int ticketNum =10; //票数
    boolean flag =true ; //还有没哟票

    @Override
    public void run() {
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void buy() throws InterruptedException {
        //买票
        if (ticketNum<0){
            flag=false;
            return;
        }

        System.out.println(Thread.currentThread().getName()+"买了-->"+ticketNum--);
        Thread.sleep(10);
    }
}
```



例子2 共同取钱不安全

```java
//取钱不安全
//取钱需要两个人去银行取钱
public class TestThreadSynchronizedDemo2 {
    public static void main(String[] args) {
        Account account = new Account(100,"结婚基金");
        Drawing you = new Drawing(account,50,"你");
        Drawing girlFriend = new Drawing(account,100,"girlFriend");

        you.start();
        girlFriend.start();
    }
}
//账户
class Account{
    int money;//余额
    String name; //卡名称

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
//银行模拟取款
class Drawing extends Thread{
    Account account;

    //去了多少钱
    int drawingMoney;

    //shou手里多少钱
    int nowMoney;
    //去银行取钱
    public Drawing( Account account,int drawingMoney,String name){
        super(name);//调用父类的name，作为线程的名字
        this.account=account;
        this.drawingMoney =drawingMoney;

    }

    @Override
    public void run() {
        //判断是否有钱
        if (account.money-drawingMoney<0){
            System.out.println(Thread.currentThread().getName() + "钱不够去不了");
            return;
        }
        //等待1秒，通过sleep来放大问题的发生性
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //卡内余额 =账户钱-取出来的钱
        account.money=account.money-drawingMoney;
        //手里面的钱
        nowMoney = nowMoney+drawingMoney;
        System.out.println(account.name+"余额为"+account.money);
        //this.getName()等价于Thread.currentThread.getName()
        System.out.println(this.getName()+"手里的钱"+nowMoney);
    }
}
```

例子3 线程不安全

```java
public class TestThreadSynchronizedDemo3 {
    public static void main(String[] args) {
        List<String > list = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
输出：9998
两个线程同时往里面添加，就把数组给替代了
```

### 线程同步方法synchronized

我们可以通过private关键字来保证数据对象只能被方法访问，所以我们需要有针对方法提出一套机制，这套机制就是synchronized关键字，他包括两种用法

synchronized 方法和synchronized快

> 同步方法  public synchronized void method(int args){}

synchronized方法控制对“对象”的访问，每个对象对应一把锁，每个synchronized方法都必须获得调用该方法的对象的锁才能执行，否则就线程会阻塞，方法一旦执行，就独占该锁，直到该方法返回才释放锁，后面被阻塞的线程才能获得这个锁，继续执行

 缺陷，若将一个大的方法申明为synchronized将会影响效率 



> 同步快  synchronized(obj){}

obj称之为同步监视器

	obj可以是任何对象，但是兑现使用共享资源作为同步监视器
	
	同步方法中无需指定同步监视器，因为同步方法的同步监视器就是this，就是这个对象本身，或者class[反射中讲]

同步监视器的执行过程

	第一个线程访问，锁定同步监视器，执行其中的代码
	
	第二个线程访问，发现同步监视器被锁定，无法访问
	
	第一个线程访问完毕，解锁同步监视器
	
	第二个线程访问，发现同步监视器没有锁，然后锁定并访问

同步方法的示例代码

```java
    //synchronized 同步方法，锁的是this
    public synchronized void buy() throws InterruptedException {

        if (ticketNum<=0){
            flag=false;
            return;
        }
        Thread.sleep(10);
        System.out.println(Thread.currentThread().getName()+"买了-->"+ticketNum--);

    }
}

```

**同步方法 synchronized默认锁的是this对象本身** 

同步代码块的示例方法

```java
    public void run() {
        //锁的对象一定是变化的量，也就是需要增删改的量
        synchronized (account) {
            //判断是否有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "钱不够去不了");
                return;
            }
            //等待1秒，通过sleep来放大问题的发生性
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //卡内余额 =账户钱-取出来的钱
            account.money = account.money - drawingMoney;
            //手里面的钱
            nowMoney = nowMoney + drawingMoney;
            System.out.println(account.name + "余额为" + account.money);
            //this.getName()等价于Thread.currentThread.getName()
            System.out.println(this.getName() + "手里的钱" + nowMoney);
        }
    }

}
```



同步List的锁定代码

```java
public class TestSynchronizedList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                synchronized (list) {
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());
    }
}
```



> **记住重点：锁的对象一定是变化的量，也就是需要增删改的量**



CopyOnWriteArrayList

```java
public class TestUGCList {

    public static void main(String[] args) {

        CopyOnWriteArrayList list = new CopyOnWriteArrayList();

        for (int i = 0; i < 10000; i++) {

            new Thread(() -> list.add(Thread.currentThread().getName())).start();

        }
        System.out.println(list.size());
    }
}

```



### 死锁问题

两个线程各自占有一些共享资源，并且互相等候其他线程占有的资源才能运行，从而导致两个或者多个线程都在等待对方释放资源，都停止执行的情形，某一个同步课同时拥有"两个以上对象的锁"时，就可能发生死锁问题

死锁的代码案例

```java
//死锁 多个线程互相抱着对方需要的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        MarkUp markUp = new MarkUp(0,"灰姑娘");
        MarkUp markUp1 = new MarkUp(1,"白雪公主");
        markUp.start();
        markUp1.start();
    }
}
//口红
class Lipstick{}
//镜子
class Mirror{}

//化妆
class MarkUp extends Thread{
    public static Lipstick lipstick= new Lipstick();
    public static Mirror mirror = new Mirror();
    int choice;
    String girl;

    public MarkUp(int choice, String girl) {
        this.choice = choice;
        this.girl = girl;
    }

    @Override
    public void run() {
        try {
            markup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void markup() throws InterruptedException {
        if (choice==0){
            synchronized (lipstick){//已获取口红的锁
                System.out.println(girl+"获取口红的锁");
                Thread.sleep(1000);
                synchronized (mirror){
                    System.out.println(girl + "获取镜子的锁");
                }
            }
        }else {
            synchronized (mirror){//已获取镜子的锁
                System.out.println(girl+"获取镜子的锁");
                Thread.sleep(2000);
                synchronized (lipstick){
                    System.out.println(girl + "获取口红的锁");
                }
            }
        }
    }
}
// 灰姑娘获取了 口红，想获取镜子，白雪公主获取了镜子，在持有情况下，想获取口红，形成死锁
//可以灰姑娘和白雪公主都把对应口红和镜子释放即可

```



死锁产生的四个必要条件

1、互斥条件，一个资源一次只能被一个进程使用

2、请求和保持条件，一个进程因为请求资源而被阻塞，对已获得的资源保持不放

3、不剥夺条件，进程已获得的资源，在未使用完之前，不能强行剥夺

4、循环等待条件，若干个进程之间形成一种头尾相接的循环等待资源关系

> 上面列出来了死锁的四个必要条件，我们只要想办法破解其中任意一个或者多个条件就可以有效的规避死锁发生



### lock锁

控制多个线程对共享资源进行访问的工具，锁提供了对共享资源的独占访问，每次只能有一个线程对lock对象枷锁，线程开始访问共享资源之前应该先获得lock对象

>class A {
>
>	private final ReentrantLock lock = new ReenTrantLock();
>	
>	public void m(){
>	
>		lock.lock();
>	
>		try{
>	
>			//保证线程安全的代码
>	
>		}finally{
>	
>			lock.unlock()
>	
>			//如果代码同步异常，要将unlock写入到finally语句块
>	
>		}
>
>}
>
>}
>
>

使用先后顺序： Lock--同步代码块---同步方法

示例代码：

```java
public class MyReentrantLockDemo {
    public static void main(String[] args) {
        MyReentrantLockDemo2 myReentrantLockDemo = new MyReentrantLockDemo2();
        new Thread(myReentrantLockDemo).start();
        new Thread(myReentrantLockDemo).start();

    }
}


class MyReentrantLockDemo2 implements Runnable {
    int ticketNum = 10;
    private final ReentrantLock lock = new ReentrantLock(); //定义一个锁

    @Override
    public void run() {
        try {
            buy();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void buy() throws InterruptedException {
        while (true) {
            lock.lock();//显示的上锁
            try {
                if (ticketNum > 0) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "买了" + ticketNum--);
                } else {
                    break;
                }
            } finally {
                lock.unlock(); //显示的解锁，java推荐在finally里面解锁
            }

        }
    }
}
```



## 线程通信

### 生产者消费者模式

JAVA提供了几个方法解决线程之间的通信问题

wait() 表示线程一直等待，直到其他线程通知，与sleep不同会释放锁

wait(long timeout) 指定等待的毫秒数

notify() 唤醒一个处于等待状态的线程

notifyAll() 唤醒同一个对象上所有调用wait方法的线程，优先级高的线程优先调度

均为object类的方法，都只能在同步方法或者同步代码块中使用，否则抛出异常lllegalMinitorStateException]



### 管程法，利用缓冲区解决

思路：

参与对象:  

	生产者(Producer): 专注生产100次商品，
	
	消费者(Consumer) 专注消费商品
	
	商品(Product) 具体商品
	
	缓冲区(SynGoodCache()  具有缓冲区大小，当缓冲器没有东西时候，对于生产者方法中，通知生产者进行生产，当生产了东西就通知消费者消费；对于消费者方法中，当有东西就进行消费，当没有东西就通知生产者进行生产

示例代码：

```java
//生产者消费者问题，使用管程法解决这个问题
//需要有生产者，消费者，商品，缓冲区及 主函数
public class TestThreadCommunication {
    public static void main(String[] args) {
        SynGoodCache sysGoodCache = new SynGoodCache();
        new Producer(sysGoodCache).start();
        new Consumer(sysGoodCache).start();
    }
}

//生产者，负责生成，
class Producer extends Thread {
    //缓冲区
    SynGoodCache sysGoodCache;


    public Producer(SynGoodCache sysGoodCache) {
        this.sysGoodCache = sysGoodCache;
    }

    //负责生成
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sysGoodCache.push(new Goods(i));
            System.out.println("生产了-->" + i + "次鸡");
        }

    }
}

//消费者，负责消费
class Consumer extends Thread {
    SynGoodCache sysGoodCache;

    public Consumer(SynGoodCache sysGoodCache) {
        this.sysGoodCache = sysGoodCache;
    }

    //负责消费
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("消费了-->第" + sysGoodCache.pop().id + "次生成的鸡");
        }
    }
}

//具体商品，鸡肉
class Goods {
    int id;

    public Goods(int id) {
        this.id = id;
    }
}

//缓冲区，负责存放生产者的东西，负责给消费者东西
class SynGoodCache {
    //缓冲区大小，所以我们需要设置一个商品的列表,存放10个商品
    Goods[] goodsCache = new Goods[10];
    int count = 0; //记录缓冲器当前使用情况

    //生产者来进行生产
    public synchronized void push(Goods goods) {
        //当前缓冲区是否已经满了，如果满了就需要通知消费者来消费，如果没满，则进行生产
        if (count == goodsCache.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有满，就将这个商品放入到缓冲区，同时将缓冲区当前计数器+1
        goodsCache[count] = goods;
        count++;
        //可以通知消费者消费了
        this.notifyAll();
        System.out.println("--------生产了----可以通知消费者消费了-----------"+"缓冲区有"+count+"之鸡");
    }

    //消费者来进行消费
    public synchronized Goods pop() {
        //当前缓冲器是否有鸡，如果有就进行消费，如果没有，那么通知生产者进行生产
        if (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果可以消费
        count--;
        Goods goods = goodsCache[count];

        //吃完了，通知生产者进行生产
        this.notifyAll();
        System.out.println("-------吃完了，通知生产者进行生产------"+"缓冲区有"+count+"之鸡");
        return goods;
    }

}
```

### 信号灯法

```java
//测试生产者消费者问题2 信号灯法，标志位解决
public class TestThreadCommunication2 {
    public static void main(String[] args) {
        TvContainer tvContainer = new TvContainer();
        new Player(tvContainer).start();
        new Audience(tvContainer).start();
    }
}

//生产者 -->演员
class Player extends Thread {
    TvContainer tvContainer;

    public Player(TvContainer tvContainer) {
        this.tvContainer = tvContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                this.tvContainer.play("《快乐大本营》");
            } else {
                this.tvContainer.play("《抖音:记录美好生活》");
            }
        }
    }
}

//消费者--->观众
class Audience extends Thread {
    TvContainer tvContainer;

    public Audience(TvContainer tvContainer) {
        this.tvContainer = tvContainer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.tvContainer.watch();
        }

    }
}

//产品--->节目
class TvContainer {
    String show;//电视节目
    //演员表扬时，观众等待 T
    //观众观察，演员等待   F
    boolean flag = true;


    public synchronized void play(String show) {
        if (!flag) {
            //如果当前为F 观众观看，演员等待，
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员表演了" + show);
        //观众进行观看
        this.notifyAll();//通知唤醒
        this.show = show;
        //重置标志位
        flag = !this.flag;
    }

    //观众观看
    public synchronized void watch() {

        if (flag) {
            //如果当前为T, 演员正在表演，观众等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观看了" + show);
        this.notifyAll();
        flag = !this.flag;
    }
}
```

### 使用线程池

背景，经常创建和销毁，使用量特别大的资源，比如并发情况下的线程，对性能影响非常大

思路，提前创建好多个线程，放入线程池中，使用时直接获取，使用完放回到池子中可以避免频繁的创建销毁，实现重复利用，类似生活中的公共交通工具。

好处：

	提高响应速度，减少创建新线程的时间
	
	降低资源的消耗。重复利用线程池中的线程，不需要每次都创建
	
	便于线程的管理
	
		corePoolSize 线程池的大小
	
		maximumPoolSize  最大线程数
	
		keepAliveTime   线程没有任务时最多保持多长时间后会终止





JDK1.5提供了线程池的API ExecutorService 和Executors

ExecutorService   真正的线程池接口，常见类为ThreadPoolExecutor

	void execute(Runnable command) 执行任务 命令，没有返回值，一般用来执行Runnable
	
	<T> Future<T> submit(Callable<T>task) 执行任务，有返回值，一般用来执行Callable
	
	void shutdown() 关闭连接池



Executors  工具类，线程池的工厂类，用于创建并返回不同类型的线程池





示例代码：

```java
//测试线程池
public class TestPool {
    public static void main(String[] args) {
        //创建服务，创建线程池
        //newFixedTHreadPool 参数为线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);

        //执行
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        //关闭连接池
        service.shutdown();
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
```
