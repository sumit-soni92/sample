import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Delete;

public class EmployeeDeleteController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.addAnnotatedClass(Employee.class).configure();
		
	    SessionFactory sf = cfg.buildSessionFactory();
	    
	    Session ss = sf.openSession();
	    
	    Transaction tx = ss.beginTransaction();
	    
	    Employee ee = new Employee(104, "Kunal");
	    
	    ss.delete(ee);
	    
	    System.out.println(ee);
	    
	    tx.commit();
	    
	    ss.close();
		

	}

}
