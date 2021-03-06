package cn.edu.tit.bean;

import java.io.File;

public class Teacher {

	private String ememployeeNum; // 教师工号
	private String teacherName; // 教师名
	private String teacherPassword; // 教师密码
	private String teacherGender; // 教师性别
	private String educationBackground; // 学历
	private String professionalTitles; // 职称
	private String telephone; // 电话
	private String email; // 电子邮箱
	private File faceImg; // 教师头像
	
	// setter - getter
	public String getEmemployeeNum() {
		return ememployeeNum;
	}
	public void setEmemployeeNum(String ememployeeNum) {
		this.ememployeeNum = ememployeeNum;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherPassword() {
		return teacherPassword;
	}
	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}
	public String getTeacherGender() {
		return teacherGender;
	}
	public void setTeacherGender(String teacherGender) {
		this.teacherGender = teacherGender;
	}
	public String getEducationBackground() {
		return educationBackground;
	}
	public void setEducationBackground(String educationBackground) {
		this.educationBackground = educationBackground;
	}
	public String getProfessionalTitles() {
		return professionalTitles;
	}
	public void setProfessionalTitles(String professionalTitles) {
		this.professionalTitles = professionalTitles;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public File getFaceImg() {
		return faceImg;
	}
	public void setFaceImg(File faceImg) {
		this.faceImg = faceImg;
	}
	
	
}
