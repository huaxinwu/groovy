package com.wxh.groovy

import groovy.xml.MarkupBuilder
/**
 *  Groovy 不要访问修饰符，比如public /private 等等
 *  输出也不需要，依赖自身内置
 * @auther wxh
 * @date 2018/1/19 13:46
 */
class Example {
    static void main(String[] args){
        println("Hello world");
        // 引入groovy库类
        def  xml = new MarkupBuilder();
        // 定义标识符
        def x = 5;

        println(xml);
        println(x);
        // 变量定义可以用基本数据类型定义，也可以用def关键字来定义
        byte b = 3;
        short  s = 4;
        int i = 4;
        long l = 5;
        boolean flag = true;
        char c = 'a';
        float f = 1.2f;
        double d = 2.3d;
        Boolean bc = false;
        String str = "hello";
        // 读取文件
//        new File("111.txt").eachLine{
//            line -> println "line:$line";
//        };
        // 写入文件
//        new File('E:/','Example.txt').withWriter('utf-8') {
//            writer -> writer.writeLine 'Hello World'
//        }

        //--------------------------------------------------------
        // def适配各种类型，比如Integer，float，Double
        //--------------------------------------------------------
        // Example of an Integer using def
        def aint = 100;
        println(aint);

        // Example of an float using def
        def bfloat = 100.10;
        println(bfloat);

        // Example of an Double using def
        def cDouble = 100.101;
        println(cDouble);

        // Example of an String using def
        def dString = "HelloWorld";
        println(dString);

        Integer y = 5;

        // 字符串是字符的有序序列
        String s1 = '23';
        String s2 = "233";
        String s3 = """ 23344 """
        // 字符索引，下标
        println(s1[0]);

        // 日期函数
        Date date = new Date();
        println(date.toString());

        // 正则表达式
        def regex = ~'Groovy';
        println('Groovy' == ~ 'Groovy');

        // 异常处理
        try {
            def array = new int[3];
            array[5] = 5;
        }catch (Exception e){
            println(" catching a exception");
            println(e.toString());
            println(e.getMessage());
        }


        // 泛型
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("22");
        list.add("334");
        for(String string : list){
            println(string)
        }

        // 自定义泛型类
        ListType<Integer> listType = new ListType<>();
        listType.set(1);
        println(listType.get());

        // 特征
        Marks marks = new Student();
        marks.diplayMark();


    }

    /**
     *  方法定义
     *  获取名称
     * @return
     */
    def getName(){
        println("get name");
    }
    /**
     *  数据类型定义，加修饰符，不加会默认为public
     * @return
     */
    private int add(){
        println("add");
    }

    /**
     *  方法参数可以赋值，没有赋值，取该类型的默认值
     * @param a
     * @param b
     */
    static void sum(int a,int b = 3){
        int c = a + b;
        println(c);
    }
}
