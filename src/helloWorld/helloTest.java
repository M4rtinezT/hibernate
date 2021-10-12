package helloWorld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;


/**
 * @author TJ
 * @create 2021-1003 14:53
 */
public class helloTest {
    @Test
    public void testHello(){
        //1.创建SessionFactory对象
        SessionFactory sessionFactory = null;
        //1.1创建Configuration对象 对应hibernate的基本配置信息和对象关系映射
        Configuration config = new Configuration().configure();
        //1.2创建ServiceRegistry对象 hibernate的任何配置和服务都需要在该对象注册后才能有效
        ServiceRegistry serviceRegistry =
                new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = config.buildSessionFactory(serviceRegistry);
        //2.创建Session对象
        Session session = sessionFactory.openSession();
        //3.开启事务
        Transaction transaction = session.beginTransaction();
        //4.执行保存操作
        TBookEntity tBookEntity = new TBookEntity();
        tBookEntity.setUserId(2207L);
        tBookEntity.setUstatus("true");
        tBookEntity.setUsername("TJ");
        session.save(tBookEntity);
        //5.提交事务
        transaction.commit();
        //6.关闭Session
        session.close();
        //7.关闭SessionFactory
        sessionFactory.close();
    }
}
