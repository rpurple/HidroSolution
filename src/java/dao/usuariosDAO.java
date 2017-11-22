/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Session;
import modelo.Usuarios;
import org.hibernate.Query;
import org.hibernate.Transaction;


public class usuariosDAO {
    
    public Session dao = Factory.getSessionFactory().openSession();
    
    public void inserir(Usuarios u){
        Transaction t = dao.beginTransaction();
        dao.saveOrUpdate(u);
        t.commit();
    }
    
    public int contador(){
        int id;
        String sql = "select count(ID) FROM Usuarios";
        Query q = dao.createQuery(sql);
        long count = (long)q.uniqueResult();
        Integer i = (int) (long)count;
        id = i+1;
        return id;
    }
}
