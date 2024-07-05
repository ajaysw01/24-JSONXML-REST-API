package com.aj.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@XmlRootElement
public class Book {

	private Integer id;
	private String name;
	private Double price;

}
