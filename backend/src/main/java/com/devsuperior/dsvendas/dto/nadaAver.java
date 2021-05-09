package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

public class nadaAver {
	  
		
		private Long id;
		private String name;
		
		public nadaAver() {	
			
		}

		public nadaAver(Long id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public nadaAver(Seller entity) {
			id = entity.getId();
			name = entity.getName();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}


