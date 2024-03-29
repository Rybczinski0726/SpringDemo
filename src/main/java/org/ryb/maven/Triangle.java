package org.ryb.maven;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean{

    private List<Point> points;
    
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Point A: " + getPointA().getX() + "," + getPointA().getY());
        System.out.println("Point B: " + getPointB().getX() + "," + getPointB().getY());
        System.out.println("Point C: " + getPointC().getX() + "," + getPointC().getY());
    }

    // @Override
    // public void setApplicationContext(ApplicationContext context) throws BeansException {
    //     this.context = context;
    // }

    // @Override
    // public void setBeanName(String beanName) {
    //     System.out.println("Bean name is " + beanName);
    // }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitiailingBean method called for triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean method called for triangle");
    }

    public void myInit() {
        System.out.println("MyInit method called");
    }

    public void myDestroy() {
        System.out.println("MyDestroy method called");
    }

}