/*
 * Dto key class 
 * Created on 17 d�c. 2012 ( Time 15:40:00 )
 */

package org.demo.employeegroup.bean;

import java.io.Serializable;


import javax.persistence.*;

import javax.validation.constraints.* ;
import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

@Embeddable
public class EmployeeGroupKey implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="EMPLOYEE_CODE", nullable=false, length=4)
    private String     employeeCode ;
    
    @Column(name="GROUP_ID", nullable=false)
    private short      groupId      ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public EmployeeGroupKey()
    {
        super();
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setEmployeeCode( String value )
    {
        this.employeeCode = value;
    }
    public String getEmployeeCode()
    {
        return this.employeeCode;
    }

    public void setGroupId( short value )
    {
        this.groupId = value;
    }
    public short getGroupId()
    {
        return this.groupId;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeCode == null) ? 0 : employeeCode.hashCode());
		result = prime * result + groupId;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof EmployeeGroupKey)) {
			return false;
		}
		EmployeeGroupKey other = (EmployeeGroupKey) obj;
		if (employeeCode == null) {
			if (other.employeeCode != null) {
				return false;
			}
		} else if (!employeeCode.equals(other.employeeCode)) {
			return false;
		}
		if (groupId != other.groupId) {
			return false;
		}
		return true;
	}


    

}
