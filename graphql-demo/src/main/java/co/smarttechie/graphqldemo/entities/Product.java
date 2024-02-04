package co.smarttechie.graphqldemo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
public class Product {

	@Id
	@GeneratedValue
	private String id;
	private String title;
	private String displayName;
	@Column(columnDefinition = "VARCHAR(5000)")
	private String shortDesc;
	@Column(columnDefinition = "VARCHAR(5000)")
	private String longDesc;
	private Double listPrice;
	private Double salePrice;
	private String upc;
	private String mpn;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Set<Review> reviews;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Set<TechSpecs> techSpecs;

}
