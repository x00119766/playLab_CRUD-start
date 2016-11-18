package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

//Product enitity managed by the orm
@Entity
  public class Product extends Model{

	//Properties

	@Id
	private Long id;
	@Constraints.Required
	private String name;
	@Constraints.Required
	private String description;
	@Constraints.Required
	private int stock;
	@Constraints.Required
	private double price;

	//default
	public Product(){


	}

	//constructor to initialise object

	public Product(Long id, String name, String description, int stock, double price) {
       	 this.id = id;
       	 this.name = name;
       	 this.description = description;
       	 this.stock = stock;
       	 this.price = price;
    		}
	
	public static Finder<Long,Product> find = new Finder<Long,Product>(Product.class);
            
    	//find all Products in the database
    	//filter product name
    	public static List<Product> findAll(){
    	    return Product.findAll();
    	}

	

 public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

        
}











