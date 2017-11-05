import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import net.proteanit.sql.DbUtils;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;

public class gui extends JFrame {

	private String search_str = null;
	private JPanel contentPane;
	private JTextField stu_name;
	private JTextField stu_father;
	private JTextField stu_phone;
	private JTextField stu_age;
	private JTextField stu_dob;
	private JTextField stu_branch;
	private JTextField stu_sem;
	private JTextField stu_address;
	private JTextField stu_doj;
	private JTextField stu1_name;
	private JTextField stu2_name;
	private JTextField stu3_name;
	private JTextField st_name;
	private JTextField st_phone;
	private JTextField st_dept;
	private JTextField st_dob;
	private JTextField st_age;
	private JTextField st_address;
	private JTextField st_salary;
	private JTextField st_doj;
	private JTextField st_dol;
	private JTextField st1_name;
	private JTextField st2_name;
	private JTextField st3_name;
	private JTextField room_id;
	private JTextField room_hid;
	private JTextField room2_name;
	private JTextField room3_hid;
	private JTextField fee_id;
	private JTextField fees_mon_yr;
	private JTextField fees_pay_date;
	private JTextField fee2_name;
	private JTable table_ret_stu;
	private JTable table_ret_st;
    DefaultTableModel dm;
    private JTable table_up_stu;
    
    private JTextField st2_id;
    private JTextField st2_name2;
    private JTextField st2_phone;
    private JTextField st2_dept;
    private JTextField st2_dob;
    private JTextField st2_age;
    private JTextField st2_gender;
    private JTextField st2_address;
    private JTextField st2_salary;
    private JTextField st2_doj;
    private JTextField st2_dol;
    private JTable table_up_st;
    private JTextField stu2_id;
    private JTextField stu2_name2;
    private JTextField stu2_father;
    private JTextField stu2_phone;
    private JTextField stu2_age;
    private JTextField stu2_gender;
    private JTextField stu2_dob;
    private JTextField stu2_branch;
    private JTextField stu2_semester;
    private JTextField stu2_address;
    private JTextField stu2_doj;
    private JTextField stu2_dol;
    private JTable table_del_stu;
    private JTextField stu3_id;
    private JTable table_del_st;
    private JTextField st3_id;
    private JTable table_room;
    private JTextField room2_id;
    private JTextField room3_no;
    private JTable table_room2;
    private JTable table_fees;
    private JComboBox stu_gender;
    private JComboBox st_gender;
    private JComboBox room_no;
   
	/**
	 * Launch the application.
	 */
	public void start_app() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	/*private void createColumns() throws Exception {
		dm=(DefaultTableModel)table_up_stu.getModel();
		dm.addColumn("ID");
		dm.addColumn("Name");
		dm.addColumn("Father's Name");
		dm.addColumn("Phone Number");
		dm.addColumn("Age");
		dm.addColumn("Gender");
		dm.addColumn("DOB");
		dm.addColumn("Branch");
		dm.addColumn("Semester");
		dm.addColumn("Home Address");
		dm.addColumn("doj");
		dm.addColumn("dol");
	}*/
	

	
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 649);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnStudent = new JMenu("Student");
		menuBar.add(mnStudent);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p2");
			}
		});
		mnStudent.add(mntmAdd);
		
		JMenuItem mntmRetrieve = new JMenuItem("Retrieve");
		mntmRetrieve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p3");
			}
		});
		mnStudent.add(mntmRetrieve);
		
		JMenuItem mntmUpdate = new JMenuItem("Update");
		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p4");
			}
		});
		mnStudent.add(mntmUpdate);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mntmDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p5");
			}
		});
		mnStudent.add(mntmDelete);
		
		JMenu mnStaff = new JMenu("Staff");
		menuBar.add(mnStaff);
		
		JMenuItem mntmAdd_1 = new JMenuItem("Add");
		mntmAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p6");
			}
		});
		mnStaff.add(mntmAdd_1);
		
		JMenuItem mntmRetrieve_1 = new JMenuItem("Retrieve");
		mntmRetrieve_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p7");
			}
		});
		mnStaff.add(mntmRetrieve_1);
		
		JMenuItem mntmUpdate_1 = new JMenuItem("Update");
		mntmUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p8");
			}
		});
		mnStaff.add(mntmUpdate_1);
		
		JMenuItem mntmDelete_1 = new JMenuItem("Delete");
		mntmDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p9");
			}
		});
		mnStaff.add(mntmDelete_1);
		
		JMenu mnRoom = new JMenu("Room");
		menuBar.add(mnRoom);
		
		JMenuItem mntmAssign = new JMenuItem("Assign");
		mntmAssign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p10");
			}
		});
		mnRoom.add(mntmAssign);
		
		JMenuItem mntmLeave = new JMenuItem("Leave");
		mntmLeave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p11");
			}
		});
		mnRoom.add(mntmLeave);
		
		JMenuItem mntmView = new JMenuItem("View");
		mntmView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p12");
			}
		});
		mnRoom.add(mntmView);
		
		JMenu mnFeeDetails = new JMenu("Fee Details");
		menuBar.add(mnFeeDetails);
		
		JMenuItem mntmPay = new JMenuItem("Pay");
		mntmPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p13");
			}
		});
		mnFeeDetails.add(mntmPay);
		
		JMenuItem mntmView_1 = new JMenuItem("View");
		mntmView_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p14");
			}
		});
		mnFeeDetails.add(mntmView_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel first = new JPanel();
		contentPane.add(first, "p1");
		first.setLayout(null);
		
		JLabel lblHostelManagement = new JLabel("Hostel Management");
		lblHostelManagement.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblHostelManagement.setBounds(252, 256, 188, 28);
		first.add(lblHostelManagement);
		
		JPanel add_student = new JPanel();
		contentPane.add(add_student, "p2");
		add_student.setLayout(null);
		
		JLabel lblEnterStudentDetails = new JLabel("Enter Student Details");
		lblEnterStudentDetails.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblEnterStudentDetails.setBounds(243, 11, 182, 21);
		add_student.add(lblEnterStudentDetails);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(200, 70, 46, 14);
		add_student.add(lblName);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setBounds(200, 112, 111, 14);
		add_student.add(lblFathersName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(200, 158, 111, 14);
		add_student.add(lblPhoneNumber);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(200, 199, 46, 14);
		add_student.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(200, 241, 46, 14);
		add_student.add(lblGender);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(200, 281, 46, 14);
		add_student.add(lblDob);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setBounds(200, 324, 46, 14);
		add_student.add(lblBranch);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setBounds(200, 368, 46, 14);
		add_student.add(lblSemester);
		
		JLabel lblHomeAddress = new JLabel("Home Address");
		lblHomeAddress.setBounds(200, 407, 102, 14);
		add_student.add(lblHomeAddress);
		
		JLabel lblDoj = new JLabel("DOJ");
		lblDoj.setBounds(200, 450, 46, 14);
		add_student.add(lblDoj);
		
		stu_name = new JTextField();
		stu_name.setBounds(372, 67, 86, 20);
		add_student.add(stu_name);
		stu_name.setColumns(10);
		
		stu_father = new JTextField();
		stu_father.setBounds(372, 109, 86, 20);
		add_student.add(stu_father);
		stu_father.setColumns(10);
		
		stu_phone = new JTextField();
		stu_phone.setBounds(372, 155, 86, 20);
		add_student.add(stu_phone);
		stu_phone.setColumns(10);
		
		stu_age = new JTextField();
		stu_age.setBounds(372, 196, 86, 20);
		add_student.add(stu_age);
		stu_age.setColumns(10);
		
		stu_dob = new JTextField();
		stu_dob.setBounds(372, 278, 86, 20);
		add_student.add(stu_dob);
		stu_dob.setColumns(10);
		
		stu_branch = new JTextField();
		stu_branch.setBounds(372, 321, 86, 20);
		add_student.add(stu_branch);
		stu_branch.setColumns(10);
		
		stu_sem = new JTextField();
		stu_sem.setBounds(372, 365, 86, 20);
		add_student.add(stu_sem);
		stu_sem.setColumns(10);
		
		stu_address = new JTextField();
		stu_address.setBounds(372, 404, 86, 20);
		add_student.add(stu_address);
		stu_address.setColumns(10);
		
		stu_doj = new JTextField();
		stu_doj.setBounds(372, 444, 86, 20);
		add_student.add(stu_doj);
		stu_doj.setColumns(10);
		
		
		
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db_config.connect_to_database();
				
				try {
				hostel_operations ho = new hostel_operations();
				HashMap<Integer, String> student = new HashMap<Integer, String>();
				student.put(1, stu_name.getText());
				student.put(2, stu_father.getText());
				student.put(3, stu_phone.getText());
				student.put(4, stu_age.getText());
				student.put(5, (String) stu_gender.getItemAt(stu_gender.getSelectedIndex()));
				student.put(6, stu_dob.getText());
				student.put(7, stu_branch.getText());
				student.put(8, stu_sem.getText());
				student.put(9, stu_address.getText());
				student.put(10, stu_doj.getText());
				
				
				ho.add_student(student);
				
				JOptionPane.showMessageDialog(null, "Data Inserted");
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p10");
				stu_name.setText("");
				stu_father.setText("");
				stu_phone.setText("");
				stu_age.setText("");
				//stu_gender.setText("");
				stu_dob.setText("");
				stu_branch.setText("");
				stu_sem.setText("");
				stu_address.setText("");
				stu_doj.setText("");
				
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Failed");
				}
			}
		});
		btnInsert.setBounds(276, 508, 89, 23);
		add_student.add(btnInsert);
		String gender[] = {"M","F"};
		stu_gender = new JComboBox(gender);
		
			
		stu_gender.setBounds(372, 238, 86, 20);
		add_student.add(stu_gender);
		
		JPanel retrieve_student = new JPanel();
		contentPane.add(retrieve_student, "p3");
		retrieve_student.setLayout(null);
		
		JLabel lblEnterStudentId = new JLabel("Enter Student Name");
		lblEnterStudentId.setBounds(79, 47, 105, 14);
		retrieve_student.add(lblEnterStudentId);
		
		stu1_name = new JTextField();
		stu1_name.setBounds(272, 44, 86, 20);
		retrieve_student.add(stu1_name);
		stu1_name.setColumns(10);
		
		
		
		JButton btnGo = new JButton("Go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db_config.connect_to_database();
			
				try {
						ResultSet rs = db_config.getData_operation(stu1_name.getText(),"student");
						table_ret_stu.setModel(DbUtils.resultSetToTableModel(rs));
						stu1_name.setText("");
						
				}catch(Exception e1) {
					System.out.println("error"+e1);
				}
			}
		});
		btnGo.setBounds(511, 43, 89, 23);
		retrieve_student.add(btnGo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 96, 688, 2);
		retrieve_student.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 124, 668, 255);
		retrieve_student.add(scrollPane);
		
		table_ret_stu = new JTable();
		scrollPane.setViewportView(table_ret_stu);
		
		JPanel update_student = new JPanel();
		contentPane.add(update_student, "p4");
		update_student.setLayout(null);
		
		JLabel lblEnterStudentId_1 = new JLabel("Enter Student Name");
		lblEnterStudentId_1.setBounds(88, 37, 113, 14);
		update_student.add(lblEnterStudentId_1);
		
		stu2_name = new JTextField();
		stu2_name.setBounds(286, 34, 86, 20);
		update_student.add(stu2_name);
		stu2_name.setColumns(10);
		
		JButton btnGo_1 = new JButton("Go");
		btnGo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db_config.connect_to_database();
				search_str = stu2_name.getText();
				try {
						ResultSet rs = db_config.getData_operation(stu2_name.getText(),"student");
						table_up_stu.setModel(DbUtils.resultSetToTableModel(rs));
						stu2_name.setText("");
						
				}catch(Exception e1) {
					System.out.println("error"+e1);
				}
			}
		});
		btnGo_1.setBounds(523, 33, 89, 23);
		update_student.add(btnGo_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 84, 688, 2);
		update_student.add(separator_1);
		
		JPanel stu_up_details = new JPanel();
		stu_up_details.setBounds(10, 289, 668, 279);
		update_student.add(stu_up_details);
		stu_up_details.setLayout(null);
		stu_up_details.setVisible(false);
		
		
		
		
		
		//createColumns();
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(407, 229, 89, 23);
		stu_up_details.add(btnUpdate);
		
		JLabel lblName_1 = new JLabel("Student ID");
		lblName_1.setBounds(34, 29, 46, 14);
		stu_up_details.add(lblName_1);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(34, 59, 46, 14);
		stu_up_details.add(lblNewLabel);
		
		JLabel lblFathersName_1 = new JLabel("Father's Name");
		lblFathersName_1.setBounds(34, 90, 89, 14);
		stu_up_details.add(lblFathersName_1);
		
		JLabel lblPhoneNumber_1 = new JLabel("Phone Number");
		lblPhoneNumber_1.setBounds(34, 128, 89, 14);
		stu_up_details.add(lblPhoneNumber_1);
		
		JLabel lblAge_1 = new JLabel("Age");
		lblAge_1.setBounds(34, 167, 46, 14);
		stu_up_details.add(lblAge_1);
		
		JLabel lblGender_1 = new JLabel("Gender");
		lblGender_1.setBounds(34, 201, 46, 14);
		stu_up_details.add(lblGender_1);
		
		JLabel lblDob_1 = new JLabel("DOB");
		lblDob_1.setBounds(34, 233, 46, 14);
		stu_up_details.add(lblDob_1);
		
		stu2_id = new JTextField();
		stu2_id.setBounds(183, 26, 86, 20);
		stu_up_details.add(stu2_id);
		stu2_id.setColumns(10);
		
		stu2_name2 = new JTextField();
		stu2_name2.setBounds(183, 56, 86, 20);
		stu_up_details.add(stu2_name2);
		stu2_name2.setColumns(10);
		
		stu2_father = new JTextField();
		stu2_father.setBounds(183, 87, 86, 20);
		stu_up_details.add(stu2_father);
		stu2_father.setColumns(10);
		
		stu2_phone = new JTextField();
		stu2_phone.setBounds(183, 125, 86, 20);
		stu_up_details.add(stu2_phone);
		stu2_phone.setColumns(10);
		
		stu2_age = new JTextField();
		stu2_age.setBounds(183, 164, 86, 20);
		stu_up_details.add(stu2_age);
		stu2_age.setColumns(10);
		
		stu2_gender = new JTextField();
		stu2_gender.setBounds(183, 198, 86, 20);
		stu_up_details.add(stu2_gender);
		stu2_gender.setColumns(10);
		
		stu2_dob = new JTextField();
		stu2_dob.setBounds(183, 230, 86, 20);
		stu_up_details.add(stu2_dob);
		stu2_dob.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Branch");
		lblNewLabel_1.setBounds(346, 29, 46, 14);
		stu_up_details.add(lblNewLabel_1);
		
		JLabel lblSemester_1 = new JLabel("Semester");
		lblSemester_1.setBounds(346, 59, 46, 14);
		stu_up_details.add(lblSemester_1);
		
		JLabel lblNewLabel_2 = new JLabel("Home Address");
		lblNewLabel_2.setBounds(346, 90, 46, 14);
		stu_up_details.add(lblNewLabel_2);
		
		JLabel lblDoj_1 = new JLabel("DOJ");
		lblDoj_1.setBounds(346, 128, 46, 14);
		stu_up_details.add(lblDoj_1);
		
		JLabel lblDol_1 = new JLabel("DOL");
		lblDol_1.setBounds(346, 167, 46, 14);
		stu_up_details.add(lblDol_1);
		
		stu2_branch = new JTextField();
		stu2_branch.setBounds(504, 26, 86, 20);
		stu_up_details.add(stu2_branch);
		stu2_branch.setColumns(10);
		
		stu2_semester = new JTextField();
		stu2_semester.setBounds(504, 56, 86, 20);
		stu_up_details.add(stu2_semester);
		stu2_semester.setColumns(10);
		
		stu2_address = new JTextField();
		stu2_address.setBounds(504, 87, 86, 20);
		stu_up_details.add(stu2_address);
		stu2_address.setColumns(10);
		
		stu2_doj = new JTextField();
		stu2_doj.setBounds(504, 125, 86, 20);
		stu_up_details.add(stu2_doj);
		stu2_doj.setColumns(10);
		
		stu2_dol = new JTextField();
		stu2_dol.setBounds(504, 164, 86, 20);
		stu_up_details.add(stu2_dol);
		stu2_dol.setColumns(10);
		
		table_up_stu = new JTable();
		table_up_stu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stu_up_details.setVisible(true);
				stu2_id.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 0).toString());
				stu2_name2.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 1).toString());
				stu2_father.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 2).toString());
				stu2_phone.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 3).toString());
				stu2_age.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 4).toString());
				stu2_gender.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 5).toString());
				stu2_dob.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 6).toString());
				stu2_branch.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 7).toString());
				stu2_semester.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 8).toString());
				stu2_address.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 9).toString());
				stu2_doj.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 10).toString());
				stu2_dol.setText(table_up_stu.getValueAt(table_up_stu.getSelectedRow(), 11).toString());
			}
		});
		table_up_stu.setBounds(10, 97, 668, 181);
		update_student.add(table_up_stu);
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					db_config.connect_to_database();
				
				
				
				String query = "update student set student_id = '"+stu2_id.getText()+"', name = '"+stu2_name2.getText()+"',father_name = '"+stu2_father.getText()+"',phone_number = '"+stu2_phone.getText()+"',age = '"+stu2_age.getText()+"',gender = '"+stu2_gender.getText()+"',dob = '"+stu2_dob.getText()+"',branch = '"+stu2_branch.getText()+"',semester = '"+stu2_semester.getText()+"',home_address = '"+stu2_address.getText()+"',doj = '"+stu2_doj.getText()+"',dol = '"+stu2_dol.getText()+"'where student_id='"+stu2_id.getText()+"'";
				db_config.update_operation(query);
				
				ResultSet rs = db_config.getData_operation(stu2_name2.getText(),"student");
				table_up_stu.setModel(DbUtils.resultSetToTableModel(rs));
				//stu2_name.setText("");
				
				//System.out.println("value of he table is "+table_up_stu);
				/*dm.setValueAt(stu2_id.getText(), table_up_stu.getSelectedRow(), 0);
				dm.setValueAt(stu2_name2.getText(), table_up_stu.getSelectedRow(), 1);
				dm.setValueAt(stu2_father.getText(), table_up_stu.getSelectedRow(), 2);
				dm.setValueAt(stu2_phone.getText(), table_up_stu.getSelectedRow(), 3);
				dm.setValueAt(stu2_age.getText(), table_up_stu.getSelectedRow(), 4);
				dm.setValueAt(stu2_gender.getText(), table_up_stu.getSelectedRow(), 5);
				dm.setValueAt(stu2_dob.getText(), table_up_stu.getSelectedRow(), 6);
				dm.setValueAt(stu2_branch.getText(), table_up_stu.getSelectedRow(), 7);
				dm.setValueAt(stu2_semester.getText(), table_up_stu.getSelectedRow(), 8);
				dm.setValueAt(stu2_address.getText(), table_up_stu.getSelectedRow(), 9);
				dm.setValueAt(stu2_doj.getText(), table_up_stu.getSelectedRow(), 10);
				dm.setValueAt(stu2_dol.getText(), table_up_stu.getSelectedRow(), 11);*/
				JOptionPane.showMessageDialog(null, "Data Updated");
				stu2_id.setText("");
				stu2_name2.setText("");
				stu2_father.setText("");
				stu2_phone.setText("");
				stu2_age.setText("");
				stu2_gender.setText("");
				stu2_dob.setText("");
				stu2_branch.setText("");
				stu2_semester.setText("");
				stu2_address.setText("");
				stu2_doj.setText("");
				stu2_dol.setText("");
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Update Failed");
				}
			}
		});
		
		JPanel delete_student = new JPanel();
		contentPane.add(delete_student, "p5");
		delete_student.setLayout(null);
		
		JLabel lblEnterStudentId_2 = new JLabel("Enter Student Name");
		lblEnterStudentId_2.setBounds(90, 56, 97, 14);
		delete_student.add(lblEnterStudentId_2);
		
		stu3_name = new JTextField();
		stu3_name.setBounds(287, 53, 86, 20);
		delete_student.add(stu3_name);
		stu3_name.setColumns(10);
		
		JButton btnUpdate_1 = new JButton("Get Details");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db_config.connect_to_database();
				
				try {
						ResultSet rs = db_config.getData_operation(stu3_name.getText(),"student");
						table_del_stu.setModel(DbUtils.resultSetToTableModel(rs));
						stu3_name.setText("");
						
				}catch(Exception e1) {
					System.out.println("error"+e1);
				}
			}
		});
		btnUpdate_1.setBounds(510, 52, 89, 23);
		delete_student.add(btnUpdate_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 115, 688, 2);
		delete_student.add(separator_2);
		
		JPanel stu_del_details = new JPanel();
		stu_del_details.setBounds(20, 352, 658, 181);
		delete_student.add(stu_del_details);
		stu_del_details.setLayout(null);
		stu_del_details.setVisible(false);
		
		table_del_stu = new JTable();
		table_del_stu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				stu_del_details.setVisible(true);
				stu3_id.setText(table_del_stu.getValueAt(table_del_stu.getSelectedRow(), 0).toString());
			}
		});
		table_del_stu.setBounds(10, 128, 668, 213);
		delete_student.add(table_del_stu);
		
		
		
		JLabel lblStudentId_2 = new JLabel("Student ID");
		lblStudentId_2.setBounds(206, 41, 46, 14);
		stu_del_details.add(lblStudentId_2);
		
		stu3_id = new JTextField();
		stu3_id.setBounds(391, 38, 86, 20);
		stu_del_details.add(stu3_id);
		stu3_id.setColumns(10);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				db_config.connect_to_database();
				String query = "update student set dol = NOW() where student_id ='"+stu3_id.getText()+"';";
				db_config.update_operation(query);
				
				ResultSet rs3 = db_config.delete_operation(stu3_id.getText(),"student");
				table_del_stu.setModel(DbUtils.resultSetToTableModel(rs3));
				JOptionPane.showMessageDialog(null, "Deleted");
				stu3_id.setText("");
				}
				catch(Exception exe) {
					//JOptionPane.showMessageDialog(null, "Could not Delete");
					System.out.println(exe);
				}
			}
		});
		btnDelete_1.setBounds(300, 111, 89, 23);
		stu_del_details.add(btnDelete_1);
		
		JPanel add_staff = new JPanel();
		contentPane.add(add_staff, "p6");
		add_staff.setLayout(null);
		
		JLabel lblEnterStaffDetails = new JLabel("Enter Staff Details");
		lblEnterStaffDetails.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblEnterStaffDetails.setBounds(253, 11, 171, 21);
		add_staff.add(lblEnterStaffDetails);
		
		JLabel lblName_3 = new JLabel("Name");
		lblName_3.setBounds(191, 75, 46, 14);
		add_staff.add(lblName_3);
		
		JLabel lblPhoneNumber_3 = new JLabel("Phone Number");
		lblPhoneNumber_3.setBounds(191, 112, 100, 14);
		add_staff.add(lblPhoneNumber_3);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(191, 151, 100, 14);
		add_staff.add(lblDepartment);
		
		JLabel lblDob_3 = new JLabel("DOB");
		lblDob_3.setBounds(191, 190, 46, 14);
		add_staff.add(lblDob_3);
		
		JLabel lblAge_3 = new JLabel("Age");
		lblAge_3.setBounds(191, 231, 46, 14);
		add_staff.add(lblAge_3);
		
		JLabel lblGender_3 = new JLabel("Gender");
		lblGender_3.setBounds(191, 273, 46, 14);
		add_staff.add(lblGender_3);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(191, 312, 46, 14);
		add_staff.add(lblAddress);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(191, 355, 46, 14);
		add_staff.add(lblSalary);
		
		JLabel lblDoj_3 = new JLabel("DOJ");
		lblDoj_3.setBounds(191, 398, 46, 14);
		add_staff.add(lblDoj_3);
		
		JLabel lblDol_3 = new JLabel("DOL");
		lblDol_3.setBounds(191, 447, 46, 14);
		add_staff.add(lblDol_3);
		
		st_name = new JTextField();
		st_name.setBounds(380, 72, 86, 20);
		add_staff.add(st_name);
		st_name.setColumns(10);
		
		st_phone = new JTextField();
		st_phone.setBounds(380, 109, 86, 20);
		add_staff.add(st_phone);
		st_phone.setColumns(10);
		
		st_dept = new JTextField();
		st_dept.setBounds(380, 148, 86, 20);
		add_staff.add(st_dept);
		st_dept.setColumns(10);
		
		st_dob = new JTextField();
		st_dob.setBounds(380, 187, 86, 20);
		add_staff.add(st_dob);
		st_dob.setColumns(10);
		
		st_age = new JTextField();
		st_age.setBounds(380, 228, 86, 20);
		add_staff.add(st_age);
		st_age.setColumns(10);
		
		st_address = new JTextField();
		st_address.setBounds(380, 309, 86, 20);
		add_staff.add(st_address);
		st_address.setColumns(10);
		
		st_salary = new JTextField();
		st_salary.setBounds(380, 352, 86, 20);
		add_staff.add(st_salary);
		st_salary.setColumns(10);
		
		st_doj = new JTextField();
		st_doj.setBounds(380, 395, 86, 20);
		add_staff.add(st_doj);
		st_doj.setColumns(10);
		
		st_dol = new JTextField();
		st_dol.setBounds(380, 444, 86, 20);
		add_staff.add(st_dol);
		st_dol.setColumns(10);
		
		JButton btnInsert_1 = new JButton("Insert");
		btnInsert_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
db_config.connect_to_database();
				
				try {
				hostel_operations ho = new hostel_operations();
				HashMap<Integer, String> faculty = new HashMap<Integer, String>();
				faculty.put(1, st_name.getText());
				faculty.put(2, st_phone.getText());
				faculty.put(3, st_dept.getText());
				faculty.put(4, st_dob.getText());
				faculty.put(5, st_age.getText());
				faculty.put(6, (String) st_gender.getItemAt(st_gender.getSelectedIndex()));
				faculty.put(7, st_address.getText());
				faculty.put(8, st_salary.getText());
				faculty.put(9, st_doj.getText());
				faculty.put(10, st_dol.getText());
				
				
				ho.add_faculty(faculty);
				JOptionPane.showMessageDialog(null, "Data Inserted");
				CardLayout c =(CardLayout)(contentPane.getLayout());
				c.show(contentPane,"p10");
				
				st_name.setText("");
				st_phone.setText("");
				st_dept.setText("");
				st_dob.setText("");
				st_age.setText("");
				//st_gender.setText("");
				st_address.setText("");
				st_salary.setText("");
				st_doj.setText("");
				st_dol.setText("");
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Failed");
				}
				
			}
		});
		btnInsert_1.setBounds(270, 502, 89, 23);
		add_staff.add(btnInsert_1);
		
		String st_gend [] = {"M","F"};
		 st_gender = new JComboBox(st_gend);
		st_gender.setBounds(380, 270, 86, 20);
		add_staff.add(st_gender);
		
		JPanel retrieve_staff = new JPanel();
		contentPane.add(retrieve_staff, "p7");
		retrieve_staff.setLayout(null);
		
		JLabel lblEnterStaffId = new JLabel("Enter Staff Name");
		lblEnterStaffId.setBounds(97, 40, 114, 14);
		retrieve_staff.add(lblEnterStaffId);
		
		st1_name = new JTextField();
		st1_name.setBounds(289, 37, 86, 20);
		retrieve_staff.add(st1_name);
		st1_name.setColumns(10);
		
		JButton btnGo_2 = new JButton("Go");
		btnGo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db_config.connect_to_database();
				try {
					ResultSet rs = db_config.getData_operation(st1_name.getText(),"faculty");
					table_ret_st.setModel(DbUtils.resultSetToTableModel(rs));
					st1_name.setText("");
			}catch(Exception e1) {
				System.out.println("error"+e1);
			}
			}
		});
		btnGo_2.setBounds(509, 36, 89, 23);
		retrieve_staff.add(btnGo_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 96, 688, 2);
		retrieve_staff.add(separator_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 131, 668, 267);
		retrieve_staff.add(scrollPane_1);
		
		table_ret_st = new JTable();
		scrollPane_1.setViewportView(table_ret_st);
		
		JPanel update_staff = new JPanel();
		contentPane.add(update_staff, "p8");
		update_staff.setLayout(null);
		
		JLabel lblEnterStaffId_1 = new JLabel("Enter Staff Name");
		lblEnterStaffId_1.setBounds(105, 34, 101, 14);
		update_staff.add(lblEnterStaffId_1);
		
		st2_name = new JTextField();
		st2_name.setBounds(282, 31, 86, 20);
		update_staff.add(st2_name);
		st2_name.setColumns(10);
		
		JButton btnGo_3 = new JButton("Go");
		btnGo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db_config.connect_to_database();
				try {
					ResultSet rs = db_config.getData_operation(st2_name.getText(),"faculty");
					table_up_st.setModel(DbUtils.resultSetToTableModel(rs));
					st2_name.setText("");
			}catch(Exception e1) {
				System.out.println("error"+e1);
			}
			}
		});
		btnGo_3.setBounds(493, 30, 89, 23);
		update_staff.add(btnGo_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 89, 688, 2);
		update_staff.add(separator_4);
		
		
				
				/*table_up_st.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						stu2_id.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 0).toString());
						stu2_name2.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 1).toString());
						stu2_father.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 2).toString());
						stu2_phone.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 3).toString());
						stu2_age.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 4).toString());
						stu2_gender.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 5).toString());
						stu2_dob.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 6).toString());
						stu2_branch.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 7).toString());
						stu2_semester.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 8).toString());
						stu2_address.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 9).toString());
						stu2_doj.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 10).toString());
						stu2_dol.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 11).toString());
					}
				});*/
		
		JPanel staff_up_details = new JPanel();
		staff_up_details.setBounds(10, 300, 668, 234);
		update_staff.add(staff_up_details);
		staff_up_details.setLayout(null);
		staff_up_details.setVisible(false);
		
		JLabel lblStaffId = new JLabel("Staff ID");
		lblStaffId.setBounds(25, 11, 46, 14);
		staff_up_details.add(lblStaffId);
		
		JLabel lblName_2 = new JLabel("Name");
		lblName_2.setBounds(25, 47, 46, 14);
		staff_up_details.add(lblName_2);
		
		JLabel lblPhoneNumber_2 = new JLabel("Phone Number");
		lblPhoneNumber_2.setBounds(25, 85, 91, 14);
		staff_up_details.add(lblPhoneNumber_2);
		
		JLabel lblDepartment_1 = new JLabel("Department");
		lblDepartment_1.setBounds(25, 121, 46, 14);
		staff_up_details.add(lblDepartment_1);
		
		JLabel lblDob_2 = new JLabel("DOB");
		lblDob_2.setBounds(25, 153, 46, 14);
		staff_up_details.add(lblDob_2);
		
		JLabel lblAge_2 = new JLabel("Age");
		lblAge_2.setBounds(25, 194, 46, 14);
		staff_up_details.add(lblAge_2);
		
		st2_id = new JTextField();
		st2_id.setBounds(183, 8, 86, 20);
		staff_up_details.add(st2_id);
		st2_id.setColumns(10);
		
		st2_name2 = new JTextField();
		st2_name2.setBounds(183, 44, 86, 20);
		staff_up_details.add(st2_name2);
		st2_name2.setColumns(10);
		
		st2_phone = new JTextField();
		st2_phone.setBounds(183, 82, 86, 20);
		staff_up_details.add(st2_phone);
		st2_phone.setColumns(10);
		
		st2_dept = new JTextField();
		st2_dept.setBounds(183, 118, 86, 20);
		staff_up_details.add(st2_dept);
		st2_dept.setColumns(10);
		
		st2_dob = new JTextField();
		st2_dob.setBounds(183, 150, 86, 20);
		staff_up_details.add(st2_dob);
		st2_dob.setColumns(10);
		
		st2_age = new JTextField();
		st2_age.setBounds(183, 191, 86, 20);
		staff_up_details.add(st2_age);
		st2_age.setColumns(10);
		
		JLabel lblGender_2 = new JLabel("Gender");
		lblGender_2.setBounds(361, 11, 46, 14);
		staff_up_details.add(lblGender_2);
		
		JLabel lblHomeAddress_2 = new JLabel("Home Address");
		lblHomeAddress_2.setBounds(361, 47, 107, 14);
		staff_up_details.add(lblHomeAddress_2);
		
		JLabel lblSalary_1 = new JLabel("Salary");
		lblSalary_1.setBounds(361, 85, 46, 14);
		staff_up_details.add(lblSalary_1);
		
		JLabel lblDoj_2 = new JLabel("DOJ");
		lblDoj_2.setBounds(361, 121, 46, 14);
		staff_up_details.add(lblDoj_2);
		
		JLabel lblDol_2 = new JLabel("DOL");
		lblDol_2.setBounds(361, 153, 46, 14);
		staff_up_details.add(lblDol_2);
		
		JButton btnUpdate_2 = new JButton("Update");
		btnUpdate_2.setBounds(440, 190, 89, 23);
		staff_up_details.add(btnUpdate_2);
		
		st2_gender = new JTextField();
		st2_gender.setBounds(508, 8, 86, 20);
		staff_up_details.add(st2_gender);
		st2_gender.setColumns(10);
		
		st2_address = new JTextField();
		st2_address.setBounds(508, 44, 86, 20);
		staff_up_details.add(st2_address);
		st2_address.setColumns(10);
		
		st2_salary = new JTextField();
		st2_salary.setBounds(508, 79, 86, 20);
		staff_up_details.add(st2_salary);
		st2_salary.setColumns(10);
		
		st2_doj = new JTextField();
		st2_doj.setBounds(508, 118, 86, 20);
		staff_up_details.add(st2_doj);
		st2_doj.setColumns(10);
		
		st2_dol = new JTextField();
		st2_dol.setBounds(508, 150, 86, 20);
		staff_up_details.add(st2_dol);
		st2_dol.setColumns(10);
		
		table_up_st = new JTable();
		table_up_st.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				staff_up_details.setVisible(true);
				st2_id.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 0).toString());
				st2_name2.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 1).toString());
				st2_phone.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 2).toString());
				st2_dept.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 3).toString());
				st2_dob.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 4).toString());
				st2_age.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 5).toString());
				st2_gender.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 6).toString());
				st2_address.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 7).toString());
				st2_salary.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 8).toString());
				
				st2_doj.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 9).toString());
				st2_dol.setText(table_up_st.getValueAt(table_up_st.getSelectedRow(), 10).toString());
			}
		});
		table_up_st.setBounds(10, 102, 668, 190);
		update_staff.add(table_up_st);
		btnUpdate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					db_config.connect_to_database();
					
					ResultSet rs = db_config.getData_operation(st2_name2.getText(),"faculty");
					table_up_st.setModel(DbUtils.resultSetToTableModel(rs));
				String query = "update faculty set faculty_id = '"+st2_id.getText()+"',name = '"+st2_name2.getText()+"',phone_number = '"+st2_phone.getText()+"',department = '"+st2_dept.getText()+"',dob = '"+st2_dob.getText()+"',age = '"+st2_age.getText()+"',gender = '"+st2_gender.getText()+"',address = '"+st2_address.getText()+"',salary = '"+st2_salary.getText()+"',doj = '"+st2_doj.getText()+"',dol = '"+st2_dol.getText()+"'where faculty_id='"+st2_id.getText()+"'";
				db_config.update_operation(query);
				
				ResultSet rs2 = db_config.getData_operation(st2_name2.getText(),"faculty");
				table_up_st.setModel(DbUtils.resultSetToTableModel(rs2));
				JOptionPane.showMessageDialog(null, "Data Updated");
				st2_id.setText("");
				st2_name2.setText("");
				st2_phone.setText("");
				st2_dept.setText("");
				st2_dob.setText("");
				st2_age.setText("");
				st2_gender.setText("");
				st2_address.setText("");
				st2_salary.setText("");
				st2_doj.setText("");
				st2_dol.setText("");
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Update Failed");
				}
			}
		});
		
		JPanel delete_staff = new JPanel();
		contentPane.add(delete_staff, "p9");
		delete_staff.setLayout(null);
		
		JLabel lblEnterStaffId_2 = new JLabel("Enter Staff Name");
		lblEnterStaffId_2.setBounds(81, 41, 100, 14);
		delete_staff.add(lblEnterStaffId_2);
		
		st3_name = new JTextField();
		st3_name.setBounds(286, 38, 86, 20);
		delete_staff.add(st3_name);
		st3_name.setColumns(10);
		
		JButton btnDelete = new JButton("Get Details");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db_config.connect_to_database();
				try {
					ResultSet rs = db_config.getData_operation(st3_name.getText(),"faculty");
					table_del_st.setModel(DbUtils.resultSetToTableModel(rs));
					st3_name.setText("");
			}catch(Exception e1) {
				System.out.println("error"+e1);
			}
			}
		});
		btnDelete.setBounds(506, 37, 89, 23);
		delete_staff.add(btnDelete);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 95, 688, 2);
		delete_staff.add(separator_5);
		JPanel st_del_details = new JPanel();
		st_del_details.setBounds(20, 329, 658, 210);
		delete_staff.add(st_del_details);
		st_del_details.setLayout(null);
		st_del_details.setVisible(false);
		
		table_del_st = new JTable();
		table_del_st.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				st_del_details.setVisible(true);
				st3_id.setText(table_del_st.getValueAt(table_del_st.getSelectedRow(), 0).toString());
			}
		});
		table_del_st.setBounds(10, 108, 668, 210);
		delete_staff.add(table_del_st);
		
		
		
		JLabel lblStaffName = new JLabel("Staff ID");
		lblStaffName.setBounds(200, 82, 46, 14);
		st_del_details.add(lblStaffName);
		
		st3_id = new JTextField();
		st3_id.setBounds(372, 79, 86, 20);
		st_del_details.add(st3_id);
		st3_id.setColumns(10);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					db_config.connect_to_database();
					String query = "update faculty set dol = NOW() where faculty_id ='"+st3_id.getText()+"';";
					db_config.update_operation(query);
					
					ResultSet rs3 = db_config.delete_operation(st3_id.getText(),"faculty");
					table_del_st.setModel(DbUtils.resultSetToTableModel(rs3));
					JOptionPane.showMessageDialog(null, "Deleted");
					st3_id.setText("");
					}
					catch(Exception exe) {
						//JOptionPane.showMessageDialog(null, "Could not Delete");
						System.out.println(exe);
					}
			}
		});
		btnDelete_2.setBounds(271, 140, 89, 23);
		st_del_details.add(btnDelete_2);
		
		JPanel assign_room = new JPanel();
		contentPane.add(assign_room, "p10");
		assign_room.setLayout(null);
		
		JLabel lblRoomAllocation = new JLabel("Room Allocation");
		lblRoomAllocation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblRoomAllocation.setBounds(258, 23, 187, 21);
		assign_room.add(lblRoomAllocation);
		
		JLabel lblHostelId = new JLabel("Student ID");
		lblHostelId.setBounds(199, 93, 89, 14);
		assign_room.add(lblHostelId);
		
		JLabel lblRoomNumber = new JLabel("Hostel ID");
		lblRoomNumber.setBounds(199, 142, 46, 14);
		assign_room.add(lblRoomNumber);
		
		JLabel lblRoomNumber_1 = new JLabel("Room Number");
		lblRoomNumber_1.setBounds(199, 193, 89, 14);
		assign_room.add(lblRoomNumber_1);
		
		
		room_id = new JTextField();
		room_id.setBounds(359, 90, 86, 20);
		assign_room.add(room_id);
		room_id.setColumns(10);
		
		room_hid = new JTextField();
		room_hid.setBounds(359, 139, 86, 20);
		assign_room.add(room_hid);
		room_hid.setColumns(10);
		
		
		
		JButton btnAssign = new JButton("Assign");
		btnAssign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db_config.connect_to_database();
				try {
				hostel_operations ho = new hostel_operations();
				HashMap<Integer, String> room = new HashMap<Integer, String>();
				room.put(1, room_id.getText());
				room.put(2, room_hid.getText());
				
				room.put(3,  (String)room_no.getItemAt(room_no.getSelectedIndex()));
				ho.allot_room(room);
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnAssign.setBounds(267, 277, 89, 23);
		assign_room.add(btnAssign);
		
		//try {
		//hostel_operations ho = new hostel_operations();
		//ho.room_no(room_hid.getText());
		//}catch(Exception e) {
		//	System.out.println(e);
		//}
		 room_no = new JComboBox( );
		room_no.setBounds(359, 190, 86, 20);
		assign_room.add(room_no);
		
		JPanel leave_room = new JPanel();
		contentPane.add(leave_room, "p11");
		leave_room.setLayout(null);
		
		JLabel lblEnterStudentId_3 = new JLabel("Enter student Name");
		lblEnterStudentId_3.setBounds(94, 48, 111, 14);
		leave_room.add(lblEnterStudentId_3);
		
		room2_name = new JTextField();
		room2_name.setBounds(280, 45, 86, 20);
		leave_room.add(room2_name);
		room2_name.setColumns(10);
		
		JButton btnLeave = new JButton("Get Details");
		btnLeave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db_config.connect_to_database();
				
				try {
						ResultSet rs = db_config.getData_operation(room2_name.getText(),"room");
						table_room.setModel(DbUtils.resultSetToTableModel(rs));
						room2_name.setText("");
						
				}catch(Exception e1) {
					System.out.println("error"+e1);
				}
			}
		});
		btnLeave.setBounds(513, 44, 89, 23);
		leave_room.add(btnLeave);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(0, 100, 698, 2);
		leave_room.add(separator_6);
		
		JPanel room_details = new JPanel();
		room_details.setBounds(10, 338, 668, 208);
		leave_room.add(room_details);
		room_details.setLayout(null);
		room_details.setVisible(false);
		
		table_room = new JTable();
		table_room.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				room_details.setVisible(true);
				room2_id.setText(table_room.getValueAt(table_room.getSelectedRow(), 0).toString());
			}
		});
		table_room.setBounds(10, 113, 668, 217);
		leave_room.add(table_room);
		
		
		
		JLabel lblStudentId_3 = new JLabel("Student ID");
		lblStudentId_3.setBounds(200, 48, 46, 14);
		room_details.add(lblStudentId_3);
		
		room2_id = new JTextField();
		room2_id.setBounds(383, 45, 86, 20);
		room_details.add(room2_id);
		room2_id.setColumns(10);
		
		JButton btnLeave_1 = new JButton("Leave");
		btnLeave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
					db_config.connect_to_database();
					String query = "update student set dol = NOW() where student_id ='"+room2_id.getText()+"';";
					db_config.update_operation(query);
					
					ResultSet rs3 = db_config.delete_operation(room2_id.getText(),"student");
					table_room.setModel(DbUtils.resultSetToTableModel(rs3));
					JOptionPane.showMessageDialog(null, "Left");
					room2_id.setText("");
					}
					catch(Exception exe) {
						JOptionPane.showMessageDialog(null, "Could not Delete");
						//System.out.println(exe);
					}
			}
		});
		btnLeave_1.setBounds(281, 107, 89, 23);
		room_details.add(btnLeave_1);
		
		JPanel view_room = new JPanel();
		contentPane.add(view_room, "p12");
		view_room.setLayout(null);
		
		JLabel lblEnterStudentId_4 = new JLabel("Enter Hostel ID");
		lblEnterStudentId_4.setBounds(92, 42, 102, 14);
		view_room.add(lblEnterStudentId_4);
		
		room3_hid = new JTextField();
		room3_hid.setBounds(287, 39, 86, 20);
		view_room.add(room3_hid);
		room3_hid.setColumns(10);
		
		JButton btnGetDetails = new JButton("Get Details");
		btnGetDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					db_config.connect_to_database();
					String query="SELECT a.hostel_id, a.room_no, s.student_id, s.name, s.phone_number, f.name FROM room_allot_student a, student s, room r, faculty f WHERE a.hostel_id = r.hostel_id AND a.room_no = r.room_no AND a.student_id = s.student_id AND r.faculty_id = f.faculty_id AND a.hostel_id ="+room3_hid.getText()+" and a.room_no="+room3_no.getText()+";";
					
					ResultSet rs =db_config.room_op(query);
					
					table_room2.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception exe) {
				//JOptionPane.showMessageDialog(null, "Error");
				System.out.println(exe);
			   }
			}
		});
		btnGetDetails.setBounds(505, 63, 89, 23);
		view_room.add(btnGetDetails);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(0, 157, 688, 2);
		view_room.add(separator_7);
		
		JLabel lblEnterRoomNumber = new JLabel("Enter Room Number");
		lblEnterRoomNumber.setBounds(92, 97, 127, 14);
		view_room.add(lblEnterRoomNumber);
		
		room3_no = new JTextField();
		room3_no.setBounds(287, 94, 86, 20);
		view_room.add(room3_no);
		room3_no.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 170, 668, 225);
		view_room.add(scrollPane_2);
		
		table_room2 = new JTable();
		scrollPane_2.setViewportView(table_room2);
		
		JPanel fees_pay = new JPanel();
		contentPane.add(fees_pay, "p13");
		fees_pay.setLayout(null);
		
		JLabel lblFeesPayment = new JLabel("Fees Payment");
		lblFeesPayment.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblFeesPayment.setBounds(262, 24, 181, 21);
		fees_pay.add(lblFeesPayment);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(193, 93, 95, 14);
		fees_pay.add(lblStudentId);
		
		JLabel lblMonthyear = new JLabel("Month-Year");
		lblMonthyear.setBounds(193, 135, 95, 14);
		fees_pay.add(lblMonthyear);
		
		JLabel lblPaymentDate = new JLabel("Payment Date");
		lblPaymentDate.setBounds(193, 185, 95, 14);
		fees_pay.add(lblPaymentDate);
		
		fee_id = new JTextField();
		fee_id.setBounds(357, 90, 86, 20);
		fees_pay.add(fee_id);
		fee_id.setColumns(10);
		
		fees_mon_yr = new JTextField();
		fees_mon_yr.setBounds(357, 132, 86, 20);
		fees_pay.add(fees_mon_yr);
		fees_mon_yr.setColumns(10);
		
		fees_pay_date = new JTextField();
		fees_pay_date.setBounds(357, 182, 86, 20);
		fees_pay.add(fees_pay_date);
		fees_pay_date.setColumns(10);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db_config.connect_to_database();
				
				try {
				hostel_operations ho = new hostel_operations();
				HashMap<Integer, String> fees = new HashMap<Integer, String>();
				fees.put(1, fee_id.getText());
				fees.put(2, fees_mon_yr.getText());
				fees.put(3, fees_pay_date.getText());
				
				
				ho.pay_fees(fees);
				
			}catch(Exception ex) {
				System.out.println(ex);
			}
			}
		});
		
			
		btnPay.setBounds(274, 254, 89, 23);
		fees_pay.add(btnPay);
		
		JPanel view_fees = new JPanel();
		contentPane.add(view_fees, "p14");
		view_fees.setLayout(null);
		
		JLabel lblStudentId_1 = new JLabel("Student Name");
		lblStudentId_1.setBounds(74, 51, 112, 14);
		view_fees.add(lblStudentId_1);
		
		fee2_name = new JTextField();
		fee2_name.setBounds(285, 48, 86, 20);
		view_fees.add(fee2_name);
		fee2_name.setColumns(10);
		
		JButton btnGo_4 = new JButton("Go");
		btnGo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db_config.connect_to_database();
				
				try {
						ResultSet rs = db_config.getData_operation(fee2_name.getText(),"student_fees");
						table_fees.setModel(DbUtils.resultSetToTableModel(rs));
						fee2_name.setText("");
						
				}catch(Exception e1) {
					System.out.println("error"+e1);
				}
			}
		});
		btnGo_4.setBounds(507, 47, 89, 23);
		view_fees.add(btnGo_4);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(0, 106, 688, 2);
		view_fees.add(separator_8);
		
		JButton btnDuesOfCurrent = new JButton("Dues of current month");
		btnDuesOfCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db_config.connect_to_database();
				
				try {
						String query ="SELECT sf.student_id, s.name, s.phone_number FROM student s, student_fees sf WHERE payment_date = \"\" AND monthly_status LIKE  '%NOW()%';";
						//ResultSet rs = db_config.fees(query);
						//table_fees.setModel(DbUtils.resultSetToTableModel(rs));
						fee2_name.setText("");
						
				}catch(Exception e1) {
					System.out.println("error"+e1);
				}
			}
		});
		btnDuesOfCurrent.setBounds(268, 135, 141, 23);
		view_fees.add(btnDuesOfCurrent);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 207, 668, 250);
		view_fees.add(scrollPane_3);
		
		table_fees = new JTable();
		scrollPane_3.setViewportView(table_fees);
	}
}
