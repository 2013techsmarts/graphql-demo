package co.smarttechie.graphqldemo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author DGraphTech
 *
 */
@Entity
@Setter
@Getter
public class Review {

	@Id
	@GeneratedValue
	private String id;
	private String reviewTitle;
	private String reviewText;
	private String submittedBy;
	private int rating;

}
