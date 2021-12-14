package com.bit.ba01;

import org.springframework.stereotype.Component;

/*
* @Component:创建对象的，等同于<bean>的功能
*   属性:value就是对象的名称,也就是bean的id值
*       value的值是唯一的，创建的对象在整个spring容器中就一个
*   位置:在类的上面
*
* @Component(value = "myStudent")等同于
* <bean id="myStudent" class="com.bit.ba01.Student"/>
*
* spring中和@Component功能一致，创建对象的注解还有:
* 1.@Repository : 放在dao的实现类上面，表示创建dao对象，dao对象是能访问数据库的。（用在持久层类的上面的）
* 2.@Service: 放在service的实现类上面，创建service对象，service对象是做业务处理，可以有事务等功能的。（用在业务层上面）
* 3.@Controller: 放在控制器（处理器）类的上面，创建控制器对象的，控制器对象能够接收用户提交的参数，显示请求的处理结果。（用在控制器的上面的）
* 这三个注解除了语法和@Component一样，还分别有以上额外的功能**********************
* @Repository,@Service,@Controller是给项目的对象分层的。
*
*
* */
//使用value属性，指定对象的名称
//@Component(value = "myStudent")

//省略value
@Component("myStudent")

//不指定对象名称，由spring提供默认名称  :默认名称是类名的首字母小写
//@Component
public class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
