/*
 * Dto key class 
 * Created on 17 d�c. 2012 ( Time 15:39:59 )
 */

package org.demo.bookorderitem.bean;

import java.io.Serializable;


import javax.persistence.*;

import javax.validation.constraints.* ;
import org.hibernate.validator.constraints.* ;

import java.math.BigDecimal;

import javax.persistence.*;

@Embeddable
public class BookOrderItemKey implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="BOOK_ORDER_ID", nullable=false)
    private int        bookOrderId  ;
    
    @Column(name="BOOK_ID", nullable=false)
    private int        bookId       ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public BookOrderItemKey()
    {
        super();
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setBookOrderId( int value )
    {
        this.bookOrderId = value;
    }
    public int getBookOrderId()
    {
        return this.bookOrderId;
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
		result = prime * result + bookOrderId;
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
		if (!(obj instanceof BookOrderItemKey)) {
			return false;
		}
		BookOrderItemKey other = (BookOrderItemKey) obj;
		if (bookId != other.bookId) {
			return false;
		}
		if (bookOrderId != other.bookOrderId) {
			return false;
		}
		return true;
	}


    

}
