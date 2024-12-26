package com.example.springbootone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company_details")
@Data // @data= getter+setter+tostring+equalandhashcode

@NoArgsConstructor
@AllArgsConstructor
public class Company {

	@Id
	@Column(name = "company_companyCode")
	private String companyCode;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "company_email")
	private String companyEmail;
	
	@Column(name = "company_phoneNumber")
	private Integer phoneNumber;

}

//ctrl+shift+o---------used to add import for new one and remove extra imports
//ctrl+space------------used to for recommdation with package name also
//ctrl+shift+f-----------used to code formate the java and html files
//ctrl+shift+t-----------used to serach the java classes
//ctrl+shift+r-----------used to search the jsp and html files
//f3-----------------goto the current class or method
//ctrl+t--------goto implementation method