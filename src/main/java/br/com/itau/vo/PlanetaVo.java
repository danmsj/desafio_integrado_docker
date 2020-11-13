package br.com.itau.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlanetaVo {

	private String name;
	private String diameter;
	private String rotation_period;
	private String orbital_period;
	private String gravity;
	private String population;
	private String climate;
	private String terrain;
	private String surface_water;
	private List<String> residents;
	private List<String> films;
	private String url;
	private String created;
	private String edited;
	private List<String> planetaRelacionadoFilme;
	
}
