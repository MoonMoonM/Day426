package com.wj.test;

import com.wj.po.Person;
import com.wj.po.User;
import com.wj.uilt.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisAssociatedTest {

    @Test
    public void findPersonByIdTest(){
        SqlSession session = MybatisUtils.getSqlSession(true);
        Person person = session.selectOne("findPersonById",2);

        System.out.println(person);

        session.close();
    }

    @Test
    public void findPersonByIdTest2(){
        SqlSession session = MybatisUtils.getSqlSession(true);
        Person person = session.selectOne("findPersonById2",2);

        System.out.println(person);

        session.close();
    }

    @Test
    public void findUserTest(){
        SqlSession session = MybatisUtils.getSqlSession(true);
        User user = session.selectOne("findUserWithOrders",2);

        System.out.println(user);

        session.close();
    }
}
