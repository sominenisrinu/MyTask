package com.my.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.sql.PreparedStatement;

public class DataUtil {
	public static Map<String, String> getBaranchDetails() {
		Map<String, String> branch = new HashMap<String, String>();
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {

			con = DBconnection.getConnection();
			String qwuery = "select id,code from branch";
			psmt = con.prepareStatement(qwuery);
			rs = psmt.executeQuery();
			while (rs.next()) {
				branch.put(rs.getString(1), rs.getString(2));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
				psmt.close();
				con.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
		return branch;

	}

	public static Map<String, String> getCollegeDetails() {
		Map<String, String> college = new HashMap<String, String>();
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {

			con = DBconnection.getConnection();
			String qwuery = "select code,name from college";
			psmt = con.prepareStatement(qwuery);
			rs = psmt.executeQuery();
			while (rs.next()) {
				college.put(rs.getString(1), rs.getString(2));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
				psmt.close();
				con.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
		return college;

	}

}
