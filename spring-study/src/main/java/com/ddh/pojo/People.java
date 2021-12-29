package com.ddh.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class People {


    private String name;
    /*
    * 1.默认是按类型进行注入，而且要求这个对象必须存在
    * 2.直接在属性上使用（可以省略set方法），也可以在set 方法上使用
    * 3.如果@Autowired自动装配环境比较复杂，使用一个@Autowired　注解无法完成时，我们可以使用@Qualifier(value="xxx")去配置一
    * 个@Autowired的使用，指定一个唯一的bean 对象注入
    * @Autowired（required = false）说明这个对象可以为空
    * ＠Resource默认是byName 注入的，如果找不到名字,则byType 注入，如果两个都找不到就会报错
    * */
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
