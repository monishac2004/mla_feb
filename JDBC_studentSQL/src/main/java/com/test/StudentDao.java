package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	public static Connection getCon()
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/mla";
		
		String user = "root";
		
		String pas = "root@39";
		
		Connection con = null;
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url,user,pas);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void saveStudent(Student std) {
		try {
			String sql = "insert into student(rollNo, name, clg, city)values(?,?,?,?)";
			
			Connection con = StudentDao.getCon();
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, std.getRollNo());
			pst.setString(2, std.getName());
			pst.setString(3, std.getClg());
			pst.setString(4,std.getCity());
			
			pst.execute();
			
		}
		catch (Exception e){
			
			e.printStackTrace();
			
		}
	}
	
	public List<Student> getAllStudents(){
		List<Student> stdList = new ArrayList<>();
		
		try {
			String sql = "select * from employee";
			
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				Student std = new Student();
				
				std.setRollNo(rs.getInt(1));
				std.setName(rs.getString(2));
				std.setClg(rs.getString(3));
				std.setCity(rs.getString(4));
				
				stdList.add(std);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return stdList;
	}
	
	public void updateEmployee(Student std) {
		try {
			String sql = "update student set name = ? , clg = ?, city = ? where rollNo = ?";
			
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			
			pst.setString(1, std.getName());
			pst.setString(2, std.getClg());
			pst.setString(3, std.getCity());
			pst.setInt(4, std.getRollNo());
			
			pst.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		public void deleteEmployee(int id) {
			try {
				String sql = "delete from employee where id = ?";
				
				PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
				
				pst.setInt(1, id);
				
				pst.execute();
			
		}catch(Exception e) {
			
		}
	}

}
