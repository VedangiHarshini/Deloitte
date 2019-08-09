package com.pms.deloitte.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;


@Controller
public class ProductController{
	
	@Autowired
	ProductService productService;
	

	/*@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("listProducts", this.productService.getAllProducts());
		return "product";
	}
		

	@RequestMapping(value= "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product p){
		System.out.println("#####product :"+p);
			this.productService.addProduct(p);
		return "redirect:/products";
	}
	
	

	@RequestMapping(value= "/edit/add/update", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product p){
		System.out.println("#####product updating :"+p);
			this.productService.updateProduct(p);
		return "redirect:/products";
	}
	
	
	@RequestMapping("/delete/{id}")
    public String removeProduct(@PathVariable("id") int productId){
		
        this.productService.deleteProduct(productId);
        return "redirect:/products";
    }
 
    
	
    @RequestMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") int productId, Model model){
        model.addAttribute("product", this.productService.getProductById(productId));
        model.addAttribute("listProducts", this.productService.getAllProducts());
        return "product";
    }*/
	
	@RequestMapping("/Product")
	public String getProduct(Model model)
	{
		model.addAttribute("product",new Product());
		return "product";
	}
	
	@RequestMapping("/getProduct/{pId}")
	public String getProduct() {
			return "Getting product";
		}
	
	@RequestMapping("/addProduct")
		public String saveProduct11() {
		Product product = new Product(55,"Fridge",1,9500);
		productService.addProduct(product);
		return "Adding product";
		}

	@RequestMapping("/saveProduct")
		public String saveProduct(Model model) {
		model.addAttribute("product", new Product());
		return "product";
		}

	@RequestMapping("/saveProductRecord")
		public String saveProductRecord(Model model,Product product) {
		productService.addProduct(product);
		model.addAttribute("product", new Product());
		model.addAttribute("message",product.getProductName() + ",product added successfully");
		return "product";
		}
	
	@RequestMapping("/deleteProduct/{pId}")
	public String deleteProduct(@PathVariable("pId")Integer productId) {
	
	productService.deleteProduct(productId );
	return "Deleting product";
	}
	
	/*@RequestMapping("/updateProduct")
	public String saveProduct1() {
	Product product = new Product(1050,"Car",2,70000);
	productService.updateProduct(product);
	return "Updating product";
	}*/
	
	/*@RequestMapping("/allProducts")
	public List<Product> getAllProducts() {
	
		List<Product> products = productService.getAllProducts();
		return products;
	}*/
	
	@RequestMapping("/getProductsByName/{proName}")
	public List<Product> getAllproducts(@PathVariable("proName")String productName) 
	{
	   List<Product> products = productService.searchByProductName(productName);
		return products;
	}
	
	@RequestMapping("/searchProducts/{min}/{max}")
	public List <Product> getAllProducts(
		@PathVariable("min")Integer minimum,
		@PathVariable("max")Integer maximum)
	{
	List<Product> products = productService.searchByPriceRange(minimum, maximum);
	return products;
	
	}
	
	@RequestMapping("/searchQuantityGreaterThan/{quan}")
	public List <Product> getAllProducts(@PathVariable("quan")Integer quantity){
		
		List<Product> products = productService.quantityGreaterThan(quantity);
		return products;
		
	}
	
	
}

