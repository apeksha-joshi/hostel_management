import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField stu_name;
	private JTextField stu_father;
	private JTextField stu_phone;
	private JTextField stu_age;
	private JTextField stu_gender;
	private JTextField stu_dob;
	private JTextField stu_branch;
	private JTextField stu_sem;
	private JTextField stu_address;
	private JTextField stu_doj;
	private JTextField stu_dol;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField st_name;
	private JTextField st_phone;
	private JTextField st_dept;
	private JTextField st_dob;
	private JTextField st_age;
	private JTextField st_gender;
	private JTextField st_address;
	private JTextField st_salary;
	private JTextField st_doj;
	private JTextField st_dol;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;

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
		
		JLabel lblDol = new JLabel("DOL");
		lblDol.setBounds(200, 496, 46, 14);
		add_student.add(lblDol);
		
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
		
		stu_gender = new JTextField();
		stu_gender.setBounds(372, 238, 86, 20);
		add_student.add(stu_gender);
		stu_gender.setColumns(10);
		
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
		
		stu_dol = new JTextField();
		stu_dol.setBounds(372, 493, 86, 20);
		add_student.add(stu_dol);
		stu_dol.setColumns(10);
		
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
				student.put(5, stu_gender.getText());
				student.put(6, stu_dob.getText());
				student.put(7, stu_branch.getText());
				student.put(8, stu_sem.getText());
				student.put(9, stu_address.getText());
				student.put(10, stu_doj.getText());
				student.put(11, stu_dol.getText());
				
				ho.add_student(student);
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnInsert.setBounds(268, 534, 89, 23);
		add_student.add(btnInsert);
		
		JPanel retrieve_student = new JPanel();
		contentPane.add(retrieve_student, "p3");
		retrieve_student.setLayout(null);
		
		JLabel lblEnterStudentId = new JLabel("Enter Student ID");
		lblEnterStudentId.setBounds(79, 47, 105, 14);
		retrieve_student.add(lblEnterStudentId);
		
		textField_11 = new JTextField();
		textField_11.setBounds(272, 44, 86, 20);
		retrieve_student.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnGo = new JButton("Go");
		btnGo.setBounds(511, 43, 89, 23);
		retrieve_student.add(btnGo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 96, 688, 2);
		retrieve_student.add(separator);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(180, 119, 46, 14);
		retrieve_student.add(lblName_1);
		
		JLabel lblFathersName_1 = new JLabel("Father's Name");
		lblFathersName_1.setBounds(180, 161, 96, 14);
		retrieve_student.add(lblFathersName_1);
		
		JLabel lblPhoneNumber_1 = new JLabel("Phone Number");
		lblPhoneNumber_1.setBounds(180, 203, 96, 14);
		retrieve_student.add(lblPhoneNumber_1);
		
		JLabel lblAge_1 = new JLabel("Age");
		lblAge_1.setBounds(180, 245, 46, 14);
		retrieve_student.add(lblAge_1);
		
		JLabel lblGender_1 = new JLabel("Gender");
		lblGender_1.setBounds(180, 288, 46, 14);
		retrieve_student.add(lblGender_1);
		
		JLabel lblDob_1 = new JLabel("DOB");
		lblDob_1.setBounds(180, 331, 46, 14);
		retrieve_student.add(lblDob_1);
		
		JLabel lblBranch_1 = new JLabel("Branch");
		lblBranch_1.setBounds(180, 373, 46, 14);
		retrieve_student.add(lblBranch_1);
		
		JLabel lblSem = new JLabel("Semester");
		lblSem.setBounds(180, 413, 46, 14);
		retrieve_student.add(lblSem);
		
		JLabel lblHomeAddress_1 = new JLabel("Home Address");
		lblHomeAddress_1.setBounds(180, 450, 96, 14);
		retrieve_student.add(lblHomeAddress_1);
		
		JLabel lblDoj_1 = new JLabel("DOJ");
		lblDoj_1.setBounds(180, 488, 46, 14);
		retrieve_student.add(lblDoj_1);
		
		JLabel lblDol_1 = new JLabel("DOL");
		lblDol_1.setBounds(180, 527, 46, 14);
		retrieve_student.add(lblDol_1);
		
		textField_12 = new JTextField();
		textField_12.setBounds(362, 116, 86, 20);
		retrieve_student.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(362, 158, 86, 20);
		retrieve_student.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(362, 200, 86, 20);
		retrieve_student.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(362, 242, 86, 20);
		retrieve_student.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(362, 285, 86, 20);
		retrieve_student.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(362, 328, 86, 20);
		retrieve_student.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(362, 370, 86, 20);
		retrieve_student.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(362, 410, 86, 20);
		retrieve_student.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(362, 447, 86, 20);
		retrieve_student.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(362, 485, 86, 20);
		retrieve_student.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(362, 524, 86, 20);
		retrieve_student.add(textField_22);
		textField_22.setColumns(10);
		
		JPanel update_student = new JPanel();
		contentPane.add(update_student, "p4");
		update_student.setLayout(null);
		
		JLabel lblEnterStudentId_1 = new JLabel("Enter Student ID");
		lblEnterStudentId_1.setBounds(88, 37, 113, 14);
		update_student.add(lblEnterStudentId_1);
		
		textField_23 = new JTextField();
		textField_23.setBounds(286, 34, 86, 20);
		update_student.add(textField_23);
		textField_23.setColumns(10);
		
		JButton btnGo_1 = new JButton("Go");
		btnGo_1.setBounds(523, 33, 89, 23);
		update_student.add(btnGo_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 84, 688, 2);
		update_student.add(separator_1);
		
		JLabel lblName_2 = new JLabel("Name");
		lblName_2.setBounds(180, 108, 46, 14);
		update_student.add(lblName_2);
		
		JLabel lblFathersName_2 = new JLabel("Father's Name");
		lblFathersName_2.setBounds(180, 148, 98, 14);
		update_student.add(lblFathersName_2);
		
		JLabel lblPhoneNumber_2 = new JLabel("Phone Number");
		lblPhoneNumber_2.setBounds(180, 187, 98, 14);
		update_student.add(lblPhoneNumber_2);
		
		JLabel lblAge_2 = new JLabel("Age");
		lblAge_2.setBounds(180, 225, 46, 14);
		update_student.add(lblAge_2);
		
		JLabel lblGender_2 = new JLabel("Gender");
		lblGender_2.setBounds(180, 261, 46, 14);
		update_student.add(lblGender_2);
		
		JLabel lblDob_2 = new JLabel("DOB");
		lblDob_2.setBounds(180, 299, 46, 14);
		update_student.add(lblDob_2);
		
		JLabel lblBranch_2 = new JLabel("Branch");
		lblBranch_2.setBounds(180, 338, 46, 14);
		update_student.add(lblBranch_2);
		
		JLabel lblSemester_1 = new JLabel("Semester");
		lblSemester_1.setBounds(180, 376, 46, 14);
		update_student.add(lblSemester_1);
		
		JLabel lblHomeAddress_2 = new JLabel("Home Address");
		lblHomeAddress_2.setBounds(180, 419, 98, 14);
		update_student.add(lblHomeAddress_2);
		
		JLabel lblDoj_2 = new JLabel("DOJ");
		lblDoj_2.setBounds(180, 461, 46, 14);
		update_student.add(lblDoj_2);
		
		JLabel lblDol_2 = new JLabel("DOL");
		lblDol_2.setBounds(180, 499, 46, 14);
		update_student.add(lblDol_2);
		
		textField_24 = new JTextField();
		textField_24.setBounds(377, 105, 86, 20);
		update_student.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(377, 145, 86, 20);
		update_student.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setBounds(377, 184, 86, 20);
		update_student.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(377, 222, 86, 20);
		update_student.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(377, 258, 86, 20);
		update_student.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(377, 296, 86, 20);
		update_student.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(377, 335, 86, 20);
		update_student.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(377, 373, 86, 20);
		update_student.add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setBounds(377, 416, 86, 20);
		update_student.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setBounds(377, 458, 86, 20);
		update_student.add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setBounds(377, 496, 86, 20);
		update_student.add(textField_34);
		textField_34.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(264, 531, 89, 23);
		update_student.add(btnUpdate);
		
		JPanel delete_student = new JPanel();
		contentPane.add(delete_student, "p5");
		delete_student.setLayout(null);
		
		JLabel lblEnterStudentId_2 = new JLabel("Enter Student ID");
		lblEnterStudentId_2.setBounds(90, 56, 97, 14);
		delete_student.add(lblEnterStudentId_2);
		
		textField_35 = new JTextField();
		textField_35.setBounds(287, 53, 86, 20);
		delete_student.add(textField_35);
		textField_35.setColumns(10);
		
		JButton btnUpdate_1 = new JButton("Delete");
		btnUpdate_1.setBounds(510, 52, 89, 23);
		delete_student.add(btnUpdate_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 115, 688, 2);
		delete_student.add(separator_2);
		
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
		
		st_gender = new JTextField();
		st_gender.setBounds(380, 270, 86, 20);
		add_staff.add(st_gender);
		st_gender.setColumns(10);
		
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
				faculty.put(6, st_gender.getText());
				faculty.put(7, st_address.getText());
				faculty.put(8, st_salary.getText());
				faculty.put(9, st_doj.getText());
				faculty.put(10, st_dol.getText());
				
				
				ho.add_faculty(faculty);
				}catch(Exception ex) {
					System.out.println(ex);
				}
				
			}
		});
		btnInsert_1.setBounds(270, 502, 89, 23);
		add_staff.add(btnInsert_1);
		
		JPanel retrieve_staff = new JPanel();
		contentPane.add(retrieve_staff, "p7");
		retrieve_staff.setLayout(null);
		
		JLabel lblEnterStaffId = new JLabel("Enter Staff ID");
		lblEnterStaffId.setBounds(97, 40, 114, 14);
		retrieve_staff.add(lblEnterStaffId);
		
		textField_46 = new JTextField();
		textField_46.setBounds(289, 37, 86, 20);
		retrieve_staff.add(textField_46);
		textField_46.setColumns(10);
		
		JButton btnGo_2 = new JButton("Go");
		btnGo_2.setBounds(509, 36, 89, 23);
		retrieve_staff.add(btnGo_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 96, 688, 2);
		retrieve_staff.add(separator_3);
		
		JLabel lblName_4 = new JLabel("Name");
		lblName_4.setBounds(199, 124, 46, 14);
		retrieve_staff.add(lblName_4);
		
		JLabel lblPhoneNumber_4 = new JLabel("Phone Number");
		lblPhoneNumber_4.setBounds(199, 160, 89, 14);
		retrieve_staff.add(lblPhoneNumber_4);
		
		JLabel lblDepartment_1 = new JLabel("Department");
		lblDepartment_1.setBounds(199, 202, 101, 14);
		retrieve_staff.add(lblDepartment_1);
		
		JLabel lblDob_4 = new JLabel("DOB");
		lblDob_4.setBounds(199, 241, 46, 14);
		retrieve_staff.add(lblDob_4);
		
		JLabel lblAge_4 = new JLabel("Age");
		lblAge_4.setBounds(199, 283, 46, 14);
		retrieve_staff.add(lblAge_4);
		
		JLabel lblGender_4 = new JLabel("Gender");
		lblGender_4.setBounds(199, 326, 46, 14);
		retrieve_staff.add(lblGender_4);
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setBounds(199, 373, 46, 14);
		retrieve_staff.add(lblAddress_1);
		
		JLabel lblSalary_1 = new JLabel("Salary");
		lblSalary_1.setBounds(199, 412, 46, 14);
		retrieve_staff.add(lblSalary_1);
		
		JLabel lblDoj_4 = new JLabel("DOJ");
		lblDoj_4.setBounds(199, 452, 46, 14);
		retrieve_staff.add(lblDoj_4);
		
		JLabel lblDol_4 = new JLabel("DOL");
		lblDol_4.setBounds(199, 493, 46, 14);
		retrieve_staff.add(lblDol_4);
		
		textField_47 = new JTextField();
		textField_47.setBounds(380, 121, 86, 20);
		retrieve_staff.add(textField_47);
		textField_47.setColumns(10);
		
		textField_48 = new JTextField();
		textField_48.setBounds(380, 157, 86, 20);
		retrieve_staff.add(textField_48);
		textField_48.setColumns(10);
		
		textField_49 = new JTextField();
		textField_49.setBounds(380, 199, 86, 20);
		retrieve_staff.add(textField_49);
		textField_49.setColumns(10);
		
		textField_50 = new JTextField();
		textField_50.setBounds(380, 238, 86, 20);
		retrieve_staff.add(textField_50);
		textField_50.setColumns(10);
		
		textField_51 = new JTextField();
		textField_51.setBounds(380, 280, 86, 20);
		retrieve_staff.add(textField_51);
		textField_51.setColumns(10);
		
		textField_52 = new JTextField();
		textField_52.setBounds(380, 323, 86, 20);
		retrieve_staff.add(textField_52);
		textField_52.setColumns(10);
		
		textField_53 = new JTextField();
		textField_53.setBounds(380, 370, 86, 20);
		retrieve_staff.add(textField_53);
		textField_53.setColumns(10);
		
		textField_54 = new JTextField();
		textField_54.setBounds(380, 409, 86, 20);
		retrieve_staff.add(textField_54);
		textField_54.setColumns(10);
		
		textField_55 = new JTextField();
		textField_55.setBounds(380, 449, 86, 20);
		retrieve_staff.add(textField_55);
		textField_55.setColumns(10);
		
		textField_56 = new JTextField();
		textField_56.setBounds(380, 490, 86, 20);
		retrieve_staff.add(textField_56);
		textField_56.setColumns(10);
		
		JPanel update_staff = new JPanel();
		contentPane.add(update_staff, "p8");
		update_staff.setLayout(null);
		
		JLabel lblEnterStaffId_1 = new JLabel("Enter Staff ID");
		lblEnterStaffId_1.setBounds(105, 34, 101, 14);
		update_staff.add(lblEnterStaffId_1);
		
		textField_57 = new JTextField();
		textField_57.setBounds(282, 31, 86, 20);
		update_staff.add(textField_57);
		textField_57.setColumns(10);
		
		JButton btnGo_3 = new JButton("Go");
		btnGo_3.setBounds(493, 30, 89, 23);
		update_staff.add(btnGo_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 89, 688, 2);
		update_staff.add(separator_4);
		
		JLabel lblName_5 = new JLabel("Name");
		lblName_5.setBounds(184, 115, 46, 14);
		update_staff.add(lblName_5);
		
		JLabel lblPhoneNumber_5 = new JLabel("Phone Number");
		lblPhoneNumber_5.setBounds(184, 159, 89, 14);
		update_staff.add(lblPhoneNumber_5);
		
		JLabel lblDepartmant = new JLabel("Department");
		lblDepartmant.setBounds(184, 199, 86, 14);
		update_staff.add(lblDepartmant);
		
		JLabel lblDob_5 = new JLabel("DOB");
		lblDob_5.setBounds(184, 239, 46, 14);
		update_staff.add(lblDob_5);
		
		JLabel lblAge_5 = new JLabel("Age");
		lblAge_5.setBounds(184, 282, 46, 14);
		update_staff.add(lblAge_5);
		
		JLabel lblGender_5 = new JLabel("Gender");
		lblGender_5.setBounds(184, 322, 46, 14);
		update_staff.add(lblGender_5);
		
		JLabel lblAddress_2 = new JLabel("Address");
		lblAddress_2.setBounds(184, 366, 46, 14);
		update_staff.add(lblAddress_2);
		
		JLabel lblSalary_2 = new JLabel("Salary");
		lblSalary_2.setBounds(184, 406, 46, 14);
		update_staff.add(lblSalary_2);
		
		JLabel lblDoj_5 = new JLabel("DOJ");
		lblDoj_5.setBounds(184, 447, 46, 14);
		update_staff.add(lblDoj_5);
		
		JLabel lblDol_5 = new JLabel("DOL");
		lblDol_5.setBounds(184, 487, 46, 14);
		update_staff.add(lblDol_5);
		
		textField_58 = new JTextField();
		textField_58.setBounds(382, 112, 86, 20);
		update_staff.add(textField_58);
		textField_58.setColumns(10);
		
		textField_59 = new JTextField();
		textField_59.setBounds(382, 156, 86, 20);
		update_staff.add(textField_59);
		textField_59.setColumns(10);
		
		textField_60 = new JTextField();
		textField_60.setBounds(382, 196, 86, 20);
		update_staff.add(textField_60);
		textField_60.setColumns(10);
		
		textField_61 = new JTextField();
		textField_61.setBounds(382, 236, 86, 20);
		update_staff.add(textField_61);
		textField_61.setColumns(10);
		
		textField_62 = new JTextField();
		textField_62.setBounds(382, 279, 86, 20);
		update_staff.add(textField_62);
		textField_62.setColumns(10);
		
		textField_63 = new JTextField();
		textField_63.setBounds(382, 319, 86, 20);
		update_staff.add(textField_63);
		textField_63.setColumns(10);
		
		textField_64 = new JTextField();
		textField_64.setBounds(382, 363, 86, 20);
		update_staff.add(textField_64);
		textField_64.setColumns(10);
		
		textField_65 = new JTextField();
		textField_65.setBounds(382, 403, 86, 20);
		update_staff.add(textField_65);
		textField_65.setColumns(10);
		
		textField_66 = new JTextField();
		textField_66.setBounds(382, 444, 86, 20);
		update_staff.add(textField_66);
		textField_66.setColumns(10);
		
		textField_67 = new JTextField();
		textField_67.setBounds(382, 484, 86, 20);
		update_staff.add(textField_67);
		textField_67.setColumns(10);
		
		JButton btnUpdate_2 = new JButton("Update");
		btnUpdate_2.setBounds(268, 523, 89, 23);
		update_staff.add(btnUpdate_2);
		
		JPanel delete_staff = new JPanel();
		contentPane.add(delete_staff, "p9");
		delete_staff.setLayout(null);
		
		JLabel lblEnterStaffId_2 = new JLabel("Enter Staff ID");
		lblEnterStaffId_2.setBounds(81, 41, 100, 14);
		delete_staff.add(lblEnterStaffId_2);
		
		textField_68 = new JTextField();
		textField_68.setBounds(286, 38, 86, 20);
		delete_staff.add(textField_68);
		textField_68.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(506, 37, 89, 23);
		delete_staff.add(btnDelete);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 95, 688, 2);
		delete_staff.add(separator_5);
		
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
		
		textField_69 = new JTextField();
		textField_69.setBounds(359, 90, 86, 20);
		assign_room.add(textField_69);
		textField_69.setColumns(10);
		
		textField_70 = new JTextField();
		textField_70.setBounds(359, 139, 86, 20);
		assign_room.add(textField_70);
		textField_70.setColumns(10);
		
		textField_71 = new JTextField();
		textField_71.setBounds(359, 190, 86, 20);
		assign_room.add(textField_71);
		textField_71.setColumns(10);
		
		JButton btnAssign = new JButton("Assign");
		btnAssign.setBounds(267, 277, 89, 23);
		assign_room.add(btnAssign);
		
		JPanel leave_room = new JPanel();
		contentPane.add(leave_room, "p11");
		leave_room.setLayout(null);
		
		JLabel lblEnterStudentId_3 = new JLabel("Enter student ID");
		lblEnterStudentId_3.setBounds(94, 48, 111, 14);
		leave_room.add(lblEnterStudentId_3);
		
		textField_72 = new JTextField();
		textField_72.setBounds(280, 45, 86, 20);
		leave_room.add(textField_72);
		textField_72.setColumns(10);
		
		JButton btnLeave = new JButton("Leave");
		btnLeave.setBounds(513, 44, 89, 23);
		leave_room.add(btnLeave);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(0, 100, 698, 2);
		leave_room.add(separator_6);
		
		JPanel view_room = new JPanel();
		contentPane.add(view_room, "p12");
		view_room.setLayout(null);
		
		JLabel lblEnterStudentId_4 = new JLabel("Enter Student ID");
		lblEnterStudentId_4.setBounds(94, 67, 102, 14);
		view_room.add(lblEnterStudentId_4);
		
		textField_73 = new JTextField();
		textField_73.setBounds(286, 64, 86, 20);
		view_room.add(textField_73);
		textField_73.setColumns(10);
		
		JButton btnGetDetails = new JButton("Get Details");
		btnGetDetails.setBounds(505, 63, 89, 23);
		view_room.add(btnGetDetails);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(0, 126, 688, 2);
		view_room.add(separator_7);
		
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
		
		textField_74 = new JTextField();
		textField_74.setBounds(357, 90, 86, 20);
		fees_pay.add(textField_74);
		textField_74.setColumns(10);
		
		textField_75 = new JTextField();
		textField_75.setBounds(357, 132, 86, 20);
		fees_pay.add(textField_75);
		textField_75.setColumns(10);
		
		textField_76 = new JTextField();
		textField_76.setBounds(357, 182, 86, 20);
		fees_pay.add(textField_76);
		textField_76.setColumns(10);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setBounds(274, 254, 89, 23);
		fees_pay.add(btnPay);
		
		JPanel view_fees = new JPanel();
		contentPane.add(view_fees, "p14");
		view_fees.setLayout(null);
		
		JLabel lblStudentId_1 = new JLabel("Student ID");
		lblStudentId_1.setBounds(74, 51, 112, 14);
		view_fees.add(lblStudentId_1);
		
		textField_77 = new JTextField();
		textField_77.setBounds(285, 48, 86, 20);
		view_fees.add(textField_77);
		textField_77.setColumns(10);
		
		JButton btnGo_4 = new JButton("Go");
		btnGo_4.setBounds(507, 47, 89, 23);
		view_fees.add(btnGo_4);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(0, 106, 688, 2);
		view_fees.add(separator_8);
		
		JButton btnDuesOfCurrent = new JButton("Dues of current month");
		btnDuesOfCurrent.setBounds(268, 135, 141, 23);
		view_fees.add(btnDuesOfCurrent);
	}
}
