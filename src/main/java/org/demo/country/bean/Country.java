/*
 * Dto class 
 * Created on 17 d�c. 2012 ( Time 15:39:59 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.country.bean;

import java.io.Serializable;

import javax.persistence.*;

import javax.validation.constraints.* ;
import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

@Entity
@Table(name="COUNTRY")
public class Country implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="CODE", nullable=false, length=2)
    private String     code         ;


    //----------------------------------------------------------------------
    // ENTITY FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="NAME", length=45)
    private String     name         ;

    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Country()
    {
        super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setCode( String value )
    {
        this.code = value;
    }
    public String getCode()
    {
        return this.code;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABSE MAPPING : NAME ( VARCHAR ) 
    public void setName( String value )
    {
        this.name = value;
    }
    public String getName()
    {
        return this.name;
    }


    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------


}
