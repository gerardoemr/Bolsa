package modelo;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ExplaboralDAO {
    private SessionFactory sessionFactory;
    
    public ExplaboralDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
   public List<Explaboral> experiencia() {
        List<Explaboral> result = null;
        // arbrimos la sesion son sessionFactory 
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            //iniciamos la transaccion, la consulta a realizar
            tx = session.beginTransaction();
            //Escribimos la consulta en HQL
            String hql = "from Explaboral";
            Query query = session.createQuery(hql);
            result = (List<Explaboral>)query.list();
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
   
    public void agrega(Explaboral exp, int idpro){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
           
           String hql = "from Profesionista where idPro = " + idpro;
            
           Query query = session.createQuery(hql);
            
           List<Profesionista> l = query.list();
            
           Profesionista pro = l.get(0);
           
           exp.setProfesionista(pro);
           
           session.persist(exp);
           
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
            
            String hql = "from Explaboral where Idexplaboral = " + id;
            
            Query query = session.createQuery(hql);
            
            List<Explaboral> l = query.list();
            
            Explaboral exp = l.get(0);
            
            session.delete(exp);
            
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
    
}
