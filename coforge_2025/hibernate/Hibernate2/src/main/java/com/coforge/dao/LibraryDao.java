package com.coforge.dao;

import com.coforge.model.Library;
import com.coforge.model.com.coforge.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class LibraryDao {

    private SessionFactory sessionFactory;
    private Transaction transaction;
    private Session session;

    public LibraryDao(){
        sessionFactory= HibernateUtil.mysessionFactory();
    }

    public boolean addLibrary(Library libabry){
     session=sessionFactory.openSession();
        Library library1 = session.get(Library.class, libabry.getLibraryId());
         if(library1==null){
             transaction= session.getTransaction();
             transaction.begin();
             session.save(libabry);
             transaction.commit();
             return  true;
         }
         session.close();
        return  false;
    }
    public Library searchLibrary(int id){
        session=sessionFactory.openSession();
        Library library1 = session.get(Library.class, id);
        session.close();
        return  library1;
    }

    public List<Library> getAllLibrary() {
        session = sessionFactory.openSession();
                          //hql --hibernate query language
        Query<Library> fromLibrary = session.createQuery("from Library");
        session.close();
       return fromLibrary.list();
    }
    public boolean removeLibrary(int id){
        session=sessionFactory.openSession();
        Library library1 = session.get(Library.class, id);
        if(library1!=null){
            transaction= session.getTransaction();
            transaction.begin();
            session.remove(library1);
            transaction.commit();
            return  true;
        }
        session.close();
        return  false;

    }
public boolean updateLibrary(Library library){

    session=sessionFactory.openSession();
    Library library1 = session.get(Library.class, library.getLibraryId());
    if(library1!=null){
        transaction= session.getTransaction();
        transaction.begin();
        session.update(library1);
        transaction.commit();
        return  true;
    }
    session.close();
    return  false;
}

}
