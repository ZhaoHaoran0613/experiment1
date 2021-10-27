# 一、实验目的
1. 基本掌握IntelliJ IDEA Community Edition的使用方法
2. 掌握Java源程序命名、运行方法
3. 理解、掌握创建包的方法
4. 初步了解类的实例化方法
# 二、实验要求
1. 定义包
2. 组织类
3. 定义类的属性、方法
# 三、解题思路
### **步骤一**：
&emsp;&emsp;**给出了程序的源文件（如下面的三个源文件），阅读、理解其功能、含义，分析如下三个Java源程序文件的关系，理解以下三个源文件表达的实体业务逻辑关系（源文件分别描述了银行账户、存款人员、测试类）。**
<br><br>&emsp;&emsp;我认为以下三个java源程序文件首先是存在在同一个包里，这就意味着他们是共同处理同一个事件的。三个源文件分别放置了不同类，其中两个类是代表两个不同种类的事物，第三个是一个含有主函数的测试类，主要作用是用来测试前两个类中方法是否能够正常使用。
### **步骤二**：
&emsp;&emsp;**在开发环境中组织代码并运行。**
### **步骤三**：
&emsp;&emsp;**在Customer类中新添加一个属性age，描述其年龄，并补充操作年龄的方法getAge。在测试类中调用这些方法。**
### **步骤四**：
&emsp;&emsp;**在理解上述程序的情况下，尝试从头分析并复写该程序。**
<br>&emsp;&emsp;对于该程序我有以下理解：
1. 本程序模拟了银行录入以及更改存款人信息的系统。
2. 首先建立类银行账户（Account），在里面设置属性余额（balance）。设置构造函数，能够接收输入的账户余额，设置函数getBalance获取余额，设置函数deposit用来增加余额数目，设置函数withdraw用来减少余额数目。在这其中，运用了boolean类型，进行了一下
3. 然后建立类存款人员（Customer）,在里面设置属性Account类account，字符串类型firstName，以及字符串类型lastName,和整型age。构造函数，用来接收存款人的姓名和年龄。设置函数getFirstName、getLastName分别获取姓和名,以及getAccount获取银行账户,getAge获取年龄，还设置了一个setAccount函数用来更改账户，因为一人可以有多个账户。
4. 最后设置一个测试类TestBanking用来测试前面两个类中的方法功能。设置main函数，创建新对象，通过调用前两个类里的函数来实现获取某个人员的姓名年龄，并且能够在执行一些账户交易，增加或减少一些价格，最后显示该人物的所有账户信息。
# 四、流程图

![avatar](https://github.com/Minomeis/Experiment01/blob/master/img/liucheng.jpg)
# 五、关键代码
1. Account类里面，有两个函数用来实现存钱和取钱。通过布尔类型，来判断取钱的金额是否是这个账户能负担得起的。
```java 
    public double getBalance(){
        return balance;
    }
    public boolean deposit(double amount){
        balance=balance+amount;
        return true;
    }
    public boolean withdraw(double amount){
        boolean result=true;
        if(balance<amount){
            result=false;
        }
        else{
            balance=balance-amount;
        }
        return result;
    }
```
2. Customer类里面，添加age属性，与构造函数的参数相对应。
```
private int age;
```
3. TestBanking类里，采用如下方式，将Account和Customer实例化，并将两者联系在一起。
 ```
    Customer customer;
    Account account;
    customer.setAccount(new Account(500.00));
    account=customer.getAccount();
 ```
我在后续仔细阅读代码的过程中，认为这样一个书写方式不符合我个人的思维模式，于是改成了如下形式，并且尝试运行，成功运行。

 ```
    Customer customer;
    Account account;
    account = new Account(500.00);
    customer.setAccount(account);
 ```
# 六、系统运行截图
&emsp;&emsp;下图是本实验主程序TestBanking.java的运行结果，全部功能都得以很好的实现。
![avatar](./img/001.jpg)

# 七、感想与体会
&emsp;&emsp;本次实验是我们的第一次实验，我认为这个实验总体来说并不算困难。首先是装编译器已及Java。在这上面，虽然看似简单，但是确实也是花费了不少功夫。因为，网站都是英文的，并且还有更新所以老师给的教程可能并不适用，因此，还需要自己花费时间去查找资料，并且克服各种问题，安装成功。
<br>&emsp;&emsp;对于后续的程序阅读来讲，整体比较简单，但是当到后面，自己去一行一行认真看代码的时候，就能够明显感觉到会有一点点的吃力，会有很多小的细节或者说是单词语句，是我之前为了修改程序通读时所没有注意到的，当然，随着这些问题的出现，我也及时查找了相关资料，也都顺利解决了。
<br>&emsp;&emsp;在整个学习过程中，我有很多收获。首先是内容上，通读代码，的确帮助我更好地了解了文件的整体结构形式，以及处理一件事情的大体机制。同时，还学会了新的用法，比如boolean类型，是之前没有接触过的，通过自己学习夜明白了大致。
<br>&emsp;&emsp;还有就是在学习方法上，我意识到需要我自己充足的主动性。不仅要上课认真，同时也要多加查询资料自学，并且我感觉，给别人讲解，能够很大的提升我对专有名词的熟悉程度，对于我理解代码也有很大的帮助。我希望日后我能保持这份积极性，将Java学得更好，更精，更透！
"# experiment-1" 
"# experiment-1" 
