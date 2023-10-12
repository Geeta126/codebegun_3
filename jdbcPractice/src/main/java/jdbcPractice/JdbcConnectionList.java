package jdbcPractice;

import java.util.Date;

public class JdbcConnectionList {
	private String userTypeId;
	private String userType;
	private boolean activestatus;
	private Date createdDate;
	private String createduser;
	private Date updatedDate;
	private String updateduser;
	
	@Override
	public String toString() {
		return "JdbcConnectionList [userTypeId=" + userTypeId + ", userType=" + userType + ", activestatus="
				+ activestatus + ", createdDate=" + createdDate + ", createduser=" + createduser + ", updatedDate="
				+ updatedDate + ", updateduser=" + updateduser + "]";
	}
	public String getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(String userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public boolean isActivestatus() {
		return activestatus;
	}
	public void setActivestatus(boolean activestatus) {
		this.activestatus = activestatus;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreateduser() {
		return createduser;
	}
	public void setCreateduser(String createduser) {
		this.createduser = createduser;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdateduser() {
		return updateduser;
	}
	public void setUpdateduser(String updateduser) {
		this.updateduser = updateduser;
	}
	

}
