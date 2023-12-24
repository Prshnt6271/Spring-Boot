package com.boot.project.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	 @NotNull(message = "ISBN cannot be null")
	private int isbn;
	
	@NotBlank(message = "Book Name is requried")
	private String name;
	
	@NotBlank(message = "Book Author is requried")
	private String author;
}
