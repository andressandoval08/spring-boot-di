package com.bolsaideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsaideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsaideas.springboot.di.app.models.domain.Producto;
import com.bolsaideas.springboot.di.app.models.service.IServicio;
import com.bolsaideas.springboot.di.app.models.service.MiServicio;
import com.bolsaideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("MiServicioSimple")
	public IServicio registrarServicio() {
		return new MiServicio();
	}
	
	@Bean("MiServicioComplejo")
	@Primary
	public IServicio registrarServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("ItemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto = new Producto("Camara sony", 100);
		Producto producto1 = new Producto ("Guayos golty", 140);
		
		ItemFactura linea1 = new ItemFactura(producto, 1);
		ItemFactura linea2 = new ItemFactura(producto1,4);
		
		return Arrays.asList(linea1,linea2);
	}
	
	@Bean("ItemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto = new Producto("Monitor lg led 20", 250);
		Producto producto1 = new Producto ("Notebook Asus", 800);
		Producto producto2 = new Producto ("Escritorio", 400);
		
		ItemFactura linea1 = new ItemFactura(producto, 5);
		ItemFactura linea2 = new ItemFactura(producto1,3);
		ItemFactura linea3 = new ItemFactura(producto2,5);
		
		return Arrays.asList(linea1,linea2, linea3);
	}
}
