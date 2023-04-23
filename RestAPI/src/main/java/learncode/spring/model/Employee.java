package learncode.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="empId",length = 50)
	private Long empId;
	@Column(name="empNo",length = 50)
	private String empNo;
	@Column(name="empName", length = 50)
	private String empName;
	public Employee() {
		super();
	}
	public Employee(Long empId, String empNo, String empName) {
		super();
		this.empId = empId;
		this.empNo = empNo;
		this.empName = empName;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
