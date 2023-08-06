package lk.ijse.thogakade.Config;

import lk.ijse.thogakade.dto.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig {

    private static  SessionFactoryConfig factoryConfig;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig(){
//         sessionFactory  =new MetadataSources(new StandardServiceRegistryBuilder().
//                 configure().build())
//                 .addAnnotatedClass(Customer.class)
//                 .getMetadataBuilder()
//                 .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
//                 .build().buildSessionFactory();

        sessionFactory = new Configuration().configure().addAnnotatedClass(Customer.class).buildSessionFactory();
    }


    public static SessionFactoryConfig getInstance(){
        return (null==factoryConfig)
                ?factoryConfig=new SessionFactoryConfig():factoryConfig;

    }
    public Session getSession(){

        return sessionFactory.openSession();
    }
}
