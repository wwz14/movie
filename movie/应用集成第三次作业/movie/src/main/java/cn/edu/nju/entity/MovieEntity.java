package cn.edu.nju.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MoiveEntity
 *
 */
@Entity
@Table(name = "moive_info", schema = "movie", catalog = "")
public class MovieEntity implements Serializable {

	
	private String moive_name;
	private String tag;
	public MovieEntity() {
		
	}
	
    @Id
    @Column(name = "movie_name", nullable = false)
	public String getMoive_name() {
		return moive_name;
	}

	public void setMoive_name(String moive_name) {
		this.moive_name = moive_name;
	}
 
	@Basic
    @Column(name = "tag", nullable = false)
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
    
    
 
}
