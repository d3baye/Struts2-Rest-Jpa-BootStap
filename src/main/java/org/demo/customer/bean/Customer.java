/*
 * Dto class 
 * Created on 17 d�c. 2012 ( Time 15:39:59 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.customer.bean;

import java.io.Serializable;

import javax.persistence.*;

import javax.validation.constraints.* ;
import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

@Entity
@Table(name="CUSTOMER")
public class Customer implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="CODE", nullable=false, length=5)
    private String     code         ;


    //----------------------------------------------------------------------
    // ENTITY FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="COUNTRY_CODE", nullable=false, length=2)
    private String     countryCode  ;
    @Column(name="FIRST_NAME", length=40)
    private String     firstName    ;
    @Column(name="LAST_NAME", length=40)
    private String     lastName     ;
    @Column(name="LOGIN", nullable=false, length=20)
    private String     login        ;
    @Column(name="PASSWORD", length=20)
    private String     password     ;
    @Column(name="AGE")
    private Integer    age          ;
    @Column(name="CITY", length=45)
    private String     city         ;
    @Column(name="ZIP_CODE")
    private Integer    zipCode      ;
    @Column(name="PHONE", length=20)
    private String     phone        ;
    @Column(name="REVIEWER")
    private Short      reviewer     ;

    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Customer()
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
    //--- DATABSE MAPPING : COUNTRY_CODE ( VARCHAR ) 
    public void setCountryCode( String value )
    {
        this.countryCode = value;
    }
    public String getCountryCode()
    {
        return this.countryCode;
    }

    //--- DATABSE MAPPING : FIRST_NAME ( VARCHAR ) 
    public void setFirstName( String value )
    {
        this.firstName = value;
    }
    public String getFirstName()
    {
        return this.firstName;
    }

    //--- DATABSE MAPPING : LAST_NAME ( VARCHAR ) 
    public void setLastName( String value )
    {
        this.lastName = value;
    }
    public String getLastName()
    {
        return this.lastName;
    }

    //--- DATABSE MAPPING : LOGIN ( VARCHAR ) 
    public void setLogin( String value )
    {
        this.login = value;
    }
    public String getLogin()
    {
        return this.login;
    }

    //--- DATABSE MAPPING : PASSWORD ( VARCHAR ) 
    public void setPassword( String value )
    {
        this.password = value;
    }
    public String getPassword()
    {
        return this.password;
    }

    //--- DATABSE MAPPING : AGE ( INTEGER ) 
    public void setAge( Integer value )
    {
        this.age = value;
    }
    public Integer getAge()
    {
        return this.age;
    }

    //--- DATABSE MAPPING : CITY ( VARCHAR ) 
    public void setCity( String value )
    {
        this.city = value;
    }
    public String getCity()
    {
        return this.city;
    }

    //--- DATABSE MAPPING : ZIP_CODE ( INTEGER ) 
    public void setZipCode( Integer value )
    {
        this.zipCode = value;
    }
    public Integer getZipCode()
    {
        return this.zipCode;
    }

    //--- DATABSE MAPPING : PHONE ( VARCHAR ) 
    public void setPhone( String value )
    {
        this.phone = value;
    }
    public String getPhone()
    {
        return this.phone;
    }

    //--- DATABSE MAPPING : REVIEWER ( SMALLINT ) 
    public void setReviewer( Short value )
    {
        this.reviewer = value;
    }
    public Short getReviewer()
    {
        return this.reviewer;
    }


    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------


}
