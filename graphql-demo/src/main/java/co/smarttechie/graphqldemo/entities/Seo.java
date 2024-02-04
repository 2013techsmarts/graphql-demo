package co.smarttechie.graphqldemo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Seo {
	@Id
	@GeneratedValue
	private String id;
	private String metaTitle;
	private String metaKeywords;
	private String metaDescription;
	private String slug;

}
