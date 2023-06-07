package com.pojo.address;

import java.util.ArrayList;

public class Get_User_Address_Output_Pojo {
	
	public int status;
    public String message;
    public ArrayList<UserAddressList> data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<UserAddressList> getData() {
		return data;
	}
	public void setData(ArrayList<UserAddressList> data) {
		this.data = data;
	}
    

}
