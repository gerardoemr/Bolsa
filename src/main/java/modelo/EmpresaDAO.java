package modelo;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmpresaDAO {
    private SessionFactory sessionFactory;
    
    public EmpresaDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
   public List<Empresa> empresas() {
        List<Empresa> result = null;
        // arbrimos la sesion son sessionFactory 
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            //iniciamos la transaccion, la consulta a realizar
            tx = session.beginTransaction();
            //Escribimos la consulta en HQL
            String hql = "from Empresa";
            Query query = session.createQuery(hql);
            result = (List<Empresa>)query.list();
            tx.commit();
        }
        catch (Exception e) {
            //si hay un problema regresamos la base aun estado antes de la consulta
            if (tx!=null){
                tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
            //cerramos la session
            session.close();
        }
        return result;
    }
   
    public void agrega(Empresa em){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.persist(em);
           
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
    }
    
    public void elimina(String id){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            
            String hql = "from Empresa where idE = " + id;
            
            Query query = session.createQuery(hql);
            
            List<Empresa> l = query.list();
            
            Empresa em = l.get(0);
            
            session.delete(em);
            
            tx.commit();
            
        }catch(Exception e){
            if (tx!=null)
            {
                tx.rollback();
            }
           e.printStackTrace(); 
        }finally{
            //cerramos la session
            session.close();
        }
    }
    
    public void actualiza(String id, String n, String of, Date fun, Short empl, String con, String pres){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            String hql = "from Empresa where idE = " + id;

            Query query = session.createQuery(hql);

            List<Empresa> l = query.list();

            Empresa em = l.get(0);
            
            //Actualiza los atributos
            if (n.length() > 0) em.setNombre(n);
            if (of.length() > 0 ) em.setOficinas(of);
            if (fun != null) em.setFundacion(fun);
            if (empl != null) em.setNumempleados(empl);
            if (con.length() > 0) em.setContacto(con);
            if (pres.length() > 0) em.setPresident(pres);
           
           session.update(em);
          
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }  
    }
    
    
    
}
