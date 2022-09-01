package com.lixiuchun.mybatis;

import com.lixiuchun.mapper.EmployeeMapper;
import com.lixiuchun.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest01 {



    @Test
    public void test01(){

        //1.加载配置文件 （配置文件放在resources下）
        //(方法一)
        //InputStream resourceAsStream = MybatisTest01.class.getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        //(方法二)
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //2.构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //3.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();


        //接口代理开发模式
        //4.EmployeeMapper代理
        //使用sqlSession对接口进行代理，使用代理类执行接口中的方法
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);


        //5.执行方法
        List<Employee> employees = mapper.selectEmployeeList();

        employees.forEach(System.out::println);
    }


    @Test
    public void test02(){

        //1.加载配置文件 （配置文件放在resources下）
        //(方法一)
        //InputStream resourceAsStream = MybatisTest01.class.getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        //(方法二)
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //2.构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //3.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Object o = sqlSession.selectOne("com.lixiuchun.mapper.EmployeeMapper.selectEmployeeList");//使用本方式没必要写EmployeeMapper.xml
        System.out.println(o);

    }






}
