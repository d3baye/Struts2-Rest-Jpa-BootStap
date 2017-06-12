/*
 * Dto key class 
 * Created on 17 d�c. 2012 ( Time 15:40:00 )
 */

package org.demo.review.bean;

import java.io.Serializable;


import javax.persistence.*;

import javax.validation.constraints.* ;
import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

@Embeddable
public class ReviewKey implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="CUSTOMER_CODE", nullable=false, length=5)
    private String     customerCode ;
    
    @Column(name="BOOK_ID", nullable=false)
    private int        bookId       ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ReviewKey()
    {
        super();
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setCustomerCode( String value )
    {
        this.customerCode = value;
    }
    public String getCustomerCode()
    {
        return this.customerCode;
    }

    public void setBookId( int value )
    {
        this.bookId = value;
    }
    public int getBookId()
    {
        return this.bookId;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + ((customerCode == null) ? 0 : customerCode.hashCode());
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
		if (!(obj instanceof ReviewKey)) {
			return false;
		}
		ReviewKey other = (ReviewKey) obj;
		if (bookId != other.bookId) {
			return false;
		}
		if (customerCode == null) {
			if (other.customerCode != null) {
				return false;
			}
		} else if (!customerCode.equals(other.customerCode)) {
			return false;
		}
		return true;
	}


    

}
