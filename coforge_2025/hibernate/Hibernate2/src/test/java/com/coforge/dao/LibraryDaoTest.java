package com.coforge.dao;

import com.coforge.model.Library;
import com.coforge.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryDaoTest {

    private SessionFactory sessionFactory;
    private Transaction transaction;
    private Session session;
    private LibraryDao dao;
    Library library1;
    Library library;

    @BeforeEach
    public void init() {
        sessionFactory = HibernateUtil.mysessionFactory();
        session = sessionFactory.openSession();

        library = new Library();
        library.setLibraryId(10001);
        library.setLibraryName("art");
        library.setLibraryLocation("new delhi");

        library1 = new Library();
        library1.setLibraryId(10002);
        library1.setLibraryName("music");
        library1.setLibraryLocation("kolkotta");

        dao = new LibraryDao();
        dao.addLibrary(library);
        dao.addLibrary(library1);
    }

    @Test
    public void testAddLibrary() {
        Assertions.assertEquals(2, dao.getAllLibrary().size());
    }

    @Test
    public void testSearchLibrary() {
        Assertions.assertEquals(library1,dao.searchLibrary(10002));
    }

}
