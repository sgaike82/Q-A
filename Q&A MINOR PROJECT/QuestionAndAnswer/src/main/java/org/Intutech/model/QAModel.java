  package org.Intutech.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.Intutech.DbUtil.Dbutil;
import org.Intutech.bean.*;

public class QAModel {
	public boolean create(Contact ct) {
		boolean flag = false;
		Connection con = Dbutil.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("insert into qa values(?,?,?,?)");
			stmt.setInt(1, ct.getId());
			stmt.setString(2, ct.getName());
			stmt.setString(3, ct.getCity());
			stmt.setString(4, ct.getPass());
		
			int count = stmt.executeUpdate();
			if(count>0) {
				flag = true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			Dbutil.closeConnection(con);
		}
		return flag;
	}
	

    public boolean validate(Contact co) {
    	
    boolean slag = false;
    Connection con = Dbutil.getConnection();
    try {
    	
    	PreparedStatement stmt=con.prepareStatement("select * from qa where name=? and pass=?");
    	ResultSet rs= stmt.executeQuery();
    	if(rs!=null) {
    		slag = true;
    	}
    	
    	
    }catch(Exception e){
    	e.printStackTrace();
    	
    }finally {
    	Dbutil.closeConnection(con);
    }

    
 
    
	return slag ;	
    	
   }



}

