package com.itheima.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/**
 *
 *  BeanPostProcessor接口作用：
 *
 *          如果我们想在Spring容器中完成bean实例化、配置以及其他初始化方法前后要添加一些自己逻辑处理。
 *      我们需要定义一个或多个BeanPostProcessor接口实现类，然后注册到Spring IoC容器中。
 *
 *
 *
 *      1、接口中的两个方法都要将传入的bean返回，而不能返回null，如果返回的是null那么我们通过getBean方法将得不到目标。
 *      2、ApplicationContext会自动检测在配置文件中实现了BeanPostProcessor接口的所有bean，
 *          并把它们注册为后置处理器，然后在容器创建bean的适当时候调用它，
 *          因此部署一个后置处理器同部署其他的bean并没有什么区别。
 *          而使用BeanFactory实现的时候，bean 后置处理器必须通过代码显式地去注册，
 *           在IoC容器继承体系中的ConfigurableBeanFactory接口中定义了注册方法
 * */
//初始化前后处理器
public class MyPostProcessor implements BeanPostProcessor {
    //初始化前处理
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;// 这里必须return bean
    }

    //初始化后处理
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;// 这里必须return bean
    }
}
