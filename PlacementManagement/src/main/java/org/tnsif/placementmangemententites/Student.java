package org.tnsif.placementmangemententites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	    @Id
        private Integer id;
        private Integer roll;
        private String name;
        private String qualification;
        private String course;
        private Integer year;
        private int halticketno;
        
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	
       // to string method
		@Override
		public String toString() {
			return "Student [id=" + id + ", roll=" + roll + ", name=" + name + ", qualification=" + qualification
					+ ", course=" + course + ", year=" + year + ", halticketno=" + halticketno + "]";
		}
       public Student(Integer id, Integer roll, String name, String qualification, String course, Integer year,
    		   Integer halticketno) {
			super();
			this.id = id;
			this.roll = roll;
			this.name = name;
			this.qualification = qualification;
			this.course = course;
			this.year = year;
			this.halticketno = halticketno;
		}
	// getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getHalticketno() {
		return halticketno;
	}

	public void setHalticketno(Integer halticketno) {
		this.halticketno = halticketno;
	}
       
        
}
