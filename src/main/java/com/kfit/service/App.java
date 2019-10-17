package com.kfit.service;



import com.kfit.mybatis.entry.Demo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author byway
 */
public class App {
    public static void main(String[] args) {

        String resource = "mybatis-config.xml";

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //使用sqlSession直接查询
        //true 不开启事务，自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        Demo demo = sqlSession.selectOne("com.kfit.mybatis.mapper.DemoMapper.getById",1L);
        System.out.println(demo);

        List<Demo> demos = sqlSession.selectList("com.kfit.mybatis.mapper.DemoMapper.getAll");
        System.out.println(demos);

    }

}
