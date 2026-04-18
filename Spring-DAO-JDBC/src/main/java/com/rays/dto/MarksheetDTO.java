package com.rays.dto;

public class MarksheetDTO {

	private long id;
	private String student;
	private String rollNo;
	private long physics;
	private long chemistry;
	private long maths;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public long getPhysics() {
		return physics;
	}

	public void setPhysics(long physics) {
		this.physics = physics;
	}

	public long getChemistry() {
		return chemistry;
	}

	public void setChemistry(long chemistry) {
		this.chemistry = chemistry;
	}

	public long getMaths() {
		return maths;
	}

	public void setMaths(long maths) {
		this.maths = maths;
	}

}
