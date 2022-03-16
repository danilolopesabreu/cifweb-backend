package br.gov.caixa.sid02.infraestrutura.parametro.daoimpl;

import javax.enterprise.context.ApplicationScoped;

import br.gov.caixa.sid02.dominio.parametro.modelo.CifComplemento;
import br.gov.caixa.sid02.dominio.parametro.repository.CifComplementoRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CifComplementoRepositoryImpl implements PanacheRepository<CifComplemento>, CifComplementoRepository{

}
