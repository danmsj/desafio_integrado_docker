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
public class ResultadoEspecieVo {

	private List<EspecieVo> results;
	private String next;
	private String previous;
}
