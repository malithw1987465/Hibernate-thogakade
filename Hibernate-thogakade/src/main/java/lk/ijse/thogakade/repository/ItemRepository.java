package lk.ijse.thogakade.repository;

import lk.ijse.thogakade.config.SessionFactoryConfig;
import lk.ijse.thogakade.entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ItemRepository {
    private final Session session;

    public ItemRepository(){
        session= SessionFactoryConfig.getInstance().getSession();
    }

    public int saveItem(Item item){
        Transaction transaction=session.beginTransaction();

        try{

            int ItemId= (int) session.save(item);
            transaction.commit();
            session.close();

            return ItemId;

        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return -1;
        }

    }

//    public Customer getItem(Item id){
//
//        try{
//            return session.get(Customer.class,1);
//        }catch (Exception e){
//            e.printStackTrace();
//            throw e;
//        }
//    }

    public boolean  updateItem(Item item){
        Transaction transaction = session.beginTransaction();
        try {

            session.update(item);
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteitem(Item item){
        Transaction transaction= session.beginTransaction();

        try{
            session.delete(item);
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false; }
    }



}