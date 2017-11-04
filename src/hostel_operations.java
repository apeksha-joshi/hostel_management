import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
public class hostel_operations {
private static db_config db_ops = new db_config();
	
	/*insert student into the db*/
	public void add_student(HashMap<Integer, String> student) throws SQLException{
		String insert_query = "INSERT INTO `hostel_management`.`student` (`name`, `father_name`, `phone_number`, `age`, `gender`, `dob`, `branch`, `semester`, `home_address`, `doj`,`dol`) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
		System.out.println("insert query is "+insert_query);
		db_ops.insert_data(insert_query, student);
	}
	
	public ArrayList<HashMap<Integer, String>> get_all_students() throws Exception{
		ArrayList<HashMap<Integer, String>> result_map = new ArrayList<HashMap<Integer,String>>();
		String get_students = "Select * from student;";
		ResultSet rs = db_ops.execute_query(get_students);
		result_map = resultSet_to_hashMap(rs);
		return result_map;
	}
	
	private static ArrayList<HashMap<Integer, String>> resultSet_to_hashMap(ResultSet rs) throws Exception{
		int row_index = 1;
		ArrayList<HashMap<Integer, String>> result_set = new ArrayList<HashMap<Integer,String>>();
		while(rs.next()){
			int col_index = rs.getMetaData().getColumnCount();
			HashMap<Integer, String> temp_var = new HashMap<Integer, String>();
			for (int j=1;j<=col_index;j++){
				temp_var.put(j, String.valueOf(rs.getObject(j)));
			}
			result_set.add(temp_var);
			row_index++;
		}
		return result_set;
	}
	
	public void add_faculty(HashMap<Integer, String> faculty) throws SQLException{
		String insert_query = "INSERT INTO  `hostel_management`.`faculty` (`name` ,`phone_number` ,`department` ,`dob`,`age`,`gender` ,`address`,`salary` ,`doj` ,`dol`)VALUES (?,?,?,?,?,?,?,?,?,?);";
				
		System.out.println("insert query is "+insert_query);
		db_ops.insert_data(insert_query, faculty);
	}
}

	//ok juswet  malkel  it like na?waiwhere is retrieve student?