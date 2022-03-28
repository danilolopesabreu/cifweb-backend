package com.github.danilolopesabreu.reverse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.cfg.reveng.DelegatingReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.ReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.TableIdentifier;

public class CustomReverseEngineeringStrategy extends DelegatingReverseEngineeringStrategy {

	public CustomReverseEngineeringStrategy(ReverseEngineeringStrategy delegate) {
		super(delegate);
	}
	
	@Override
	public String tableToClassName(TableIdentifier tableIdentifier) {
		final String nomeTabelaCamelCase = super.tableToClassName(tableIdentifier);

		final String nomeTabela = nomeTabelaCamelCase.substring(35);
		
		final Integer numeroTabela = Integer.valueOf(nomeTabela.substring(5, 8));
		
		String patchPackage = "com.github.danilolopesabreu.domain.";
		
		if( numeroTabela < 250)
			patchPackage += "parametro.";
		else
			patchPackage += "formulario.";
		
		return patchPackage+nomeTabela.substring(8);
	}
	
	@Override
	public String columnToPropertyName(TableIdentifier table, String column) {
		final Pattern pattern = Pattern.compile("[^D02TB\\d{1,3}_].*[^_P\\d{1,3}]");
		final Matcher matcher = pattern.matcher(column);
		String nomeColuna = column;
		if(matcher.find())
			nomeColuna = matcher.group(0);
		return super.columnToPropertyName(table, nomeColuna);
	}
	
	public static void main(String[] args) {
		String tabela = "D02TB201_QWERTY_ASDFG";
		
		System.out.println(Integer.valueOf(tabela.substring(5, 8)));
		
		
		String [] colunas = {"NU_QWERT_P15", "NU_QWERT_P200", "NO_QWERT", "DE_ASD"};
		
		Pattern pattern = Pattern.compile(".*[^_P\\d]");
		
		for (int i = 0; i < colunas.length; i++) {
			
			try {
				Matcher matcher = pattern.matcher(colunas[i]);
				if(matcher.find())
					System.out.println(matcher.group(0));
				else
					System.out.println("nao achou "+colunas[i]);
				
			} catch (Exception e) {
			}
		}
		
		
	}

}
