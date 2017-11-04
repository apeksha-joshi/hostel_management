import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.ListIterator;
public class main_class {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		db_config.connect_to_database();
		
		gui gui_class = new gui();
		gui_class.start_app();
		//hostel_operations hs = new hostel_operations();
		//hs.faculty_incharge_rooms("1");
		//show create table *table_name* without *..ok:)thanks!cool
		//
				
		
		/*hostel_operations ho = new hostel_operations();
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Apeksha");
		student.put(2, "Suhas");
		student.put(3, "8892658583");
		student.put(4, "18");
		student.put(5, "F");
		student.put(6, "27/04/1997");
		student.put(7, "CSE");
		student.put(8, "6");
		student.put(9, "big string");
		student.put(10, "30/10/2017");
		
//		ho.add_student(student);
		
//		System.out.println("students registered are "+ho.get_all_students());
		ListIterator<HashMap<Integer, String>> litr=ho.get_all_students().listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
	    }*/
		
		//we need to put the result back to hashmap
		
		
		
		/* 
		 * key points to remember, always make hashmap for data to be inserted
		 * hashmap of structure <integer,String>
		 * let the integers start from 1
		 * the order of values shd be same as the order of "insert into ..." query values
	 	*/
		//Wish for the best..!! guess shd write iterator
		
		
	}

}
