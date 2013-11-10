package com.my.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.my.model.Branch;
import com.my.model.College;
import com.my.util.DBconnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class MaintenanceServiceImpl implements MaintenanceService {

	@Override
	public boolean addBranch(Branch branch) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connection con = null;
		try {

			con = (Connection) DBconnection.getConnection();
			PreparedStatement pStmt = (PreparedStatement) con
					.prepareStatement("insert into branch(code,branchname) values (?, ?)");
			pStmt.setString(1, branch.getCode());
			pStmt.setString(2, branch.getBranchName());
			int rtn = pStmt.executeUpdate();
			if (rtn == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public boolean deleteBranch(long Id) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = (Connection) DBconnection.getConnection();
			PreparedStatement pStmt = (PreparedStatement) con
					.prepareStatement("delete from branch where id=?");

			pStmt.setLong(1, Id);
			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception ex) {

			}
		}
		return false;
	}

	@Override
	public boolean updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = (Connection) DBconnection.getConnection();
			PreparedStatement pStmt = (PreparedStatement) con
					.prepareStatement("update branch set code=?, branchname=? "
							+ "where branc_id=?");
			pStmt.setString(1, branch.getCode());
			pStmt.setString(2, branch.getBranchName());

			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception ex) {

			}
		}
		return false;
	}

	@Override
	public Branch getBranch(long Id) {
		// TODO Auto-generated method stub
		Connection con = null;
		Branch branch = new Branch();
		try {
			con = (Connection) DBconnection.getConnection();
			PreparedStatement pStmt = (PreparedStatement) con
					.prepareStatement("select * from user where branch_id=?");
			pStmt.setLong(1, Id);
			ResultSet rSet = pStmt.executeQuery();

			if (rSet.next()) {

				branch.setCode(rSet.getString("code"));
				branch.setBranchName(rSet.getString("branchname"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception ex) {

			}
		}

		return branch;
	}

	@Override
	public boolean addCollege(College college) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connection con = null;
		try {

			con = (Connection) DBconnection.getConnection();
			PreparedStatement pStmt = (PreparedStatement) con
					.prepareStatement("insert into college(code,name,address,city,state,postcode) values (?, ?, ?, ?, ?, ?)");
			pStmt.setString(1, college.getCode());
			pStmt.setString(2, college.getName());
			pStmt.setString(3, college.getAddress());
			pStmt.setString(4, college.getCity());
			pStmt.setString(5, college.getState());
			pStmt.setString(6, college.getPostCode());

			int rtn = pStmt.executeUpdate();
			if (rtn == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public boolean deleteCollege(long Id) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = (Connection) DBconnection.getConnection();
			PreparedStatement pStmt = (PreparedStatement) con
					.prepareStatement("delete from student where id=?");

			pStmt.setLong(1, Id);
			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception ex) {

			}
		}
		return false;
	}

	@Override
	public boolean updateCollege(College college) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = (Connection) DBconnection.getConnection();
			PreparedStatement pStmt = (PreparedStatement) con
					.prepareStatement("update college set code=?,name=?, address=?,city=?,state=?,postcode=?"
							+ "where college_id=?");
			pStmt.setString(1, college.getCode());
			pStmt.setString(2, college.getName());
			pStmt.setString(3, college.getAddress());
			pStmt.setString(4, college.getCity());
			pStmt.setString(5, college.getState());
			pStmt.setString(6, college.getPostCode());
			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception ex) {

			}
		}
		return false;
	}

	@Override
	public College getCollege(long Id) {
		// TODO Auto-generated method stub
		Connection con = null;
		College college = new College();
		try {
			con = (Connection) DBconnection.getConnection();
			PreparedStatement pStmt = (PreparedStatement) con
					.prepareStatement("select * from college where college_id=?");
			pStmt.setLong(1, Id);
			ResultSet rSet = pStmt.executeQuery();

			if (rSet.next()) {

				college.setCode(rSet.getString("code"));
				college.setName(rSet.getString("name"));
				college.setAddress(rSet.getString("address"));
				college.setCity(rSet.getString("city"));
				college.setState(rSet.getString("state"));
				college.setPostCode(rSet.getString("city"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception ex) {

			}
		}

		return college;
	}

	@Override
	public List<Branch> getAllBranches() {
		Connection conn = null;
		List<Branch> branches = new ArrayList<Branch>();
		try {
			conn = (Connection) DBconnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rSet = stmt.executeQuery("select * from branch");
			while (rSet.next()) {
				Branch branch = new Branch();
				branch.setCode(rSet.getString("code"));
				branch.setBranchName(rSet.getString("branchname"));

				branches.add(branch);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}

		return branches;
	}

	@Override
	public List<College> getAllColleges() {
		Connection conn = null;
		List<College> colleges = new ArrayList<College>();
		try {
			conn = (Connection) DBconnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rSet = stmt.executeQuery("select * from college");
			while (rSet.next()) {
				College college = new College();
				college.setCode(rSet.getString("code"));
				college.setName(rSet.getString("name"));
				college.setAddress(rSet.getString("address"));
				college.setCity(rSet.getString("city"));
				college.setState(rSet.getString("state"));
				college.setPostCode(rSet.getString("postcode"));

				colleges.add(college);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {

			}
		}

		return colleges;
	}

}
