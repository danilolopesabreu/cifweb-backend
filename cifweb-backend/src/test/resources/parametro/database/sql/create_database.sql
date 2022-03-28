/*==============================================================*/
/* DBMS name:      ORACLE Version 12c                           */
/* Created on:     08/03/2022 15:50:02                          */
/*==============================================================*/


create sequence D02.D02SQ200_NU_SQNCL_CIF_SRVCO
increment by 1
start with 1
 maxvalue 999999999;

create sequence D02.D02SQ202_NU_SQNCL_PRPRE_FRMRO
increment by 1
start with 1
 maxvalue 999;

create sequence D02.D02SQ250_NU_SQNCL_MNTNO_CIF
increment by 1
start with 1
 maxvalue 999999999;

/*==============================================================*/
/* Table: D02TB200_CIF_SERVICO                                  */
/*==============================================================*/
create table D02.D02TB200_CIF_SERVICO (
   NU_ACAO_P15          NUMBER(3)             not null,
   NU_MODO_P15          NUMBER(3)             not null,
   NU_GRUPO_P15         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO NUMBER(9)             not null,
   NU_SUBGRUPO_P15      NUMBER(3),
   NU_TIPO_P15          NUMBER(3),
   NU_SUBTIPO_P15       NUMBER(3),
   IC_SERVICO_PRINCIPAL VARCHAR2(1)          default 'N'  not null
      constraint CC_D02TB200_1 check (IC_SERVICO_PRINCIPAL in ('S','N')),
   NO_SERVICO           VARCHAR2(80)          not null,
   constraint PK_D02TB200 primary key (NU_ACAO_P15, NU_MODO_P15, NU_GRUPO_P15, NU_SEQUENCIAL_CIF_SERVICO)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB201_CIF_COMPLEMENTO                              */
/*==============================================================*/
create table D02.D02TB201_CIF_COMPLEMENTO (
   NU_ACAO_VINCULADOR_200 NUMBER(3)             not null,
   NU_MODO_VINCULADOR_200 NUMBER(3)             not null,
   NU_GRUPO_VINCULADOR_200 NUMBER(3)             not null,
   NU_SQNCL_CIF_SRVCO_VNCLR_200 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   NU_ACAO_VINCULADO_200 NUMBER(3)             not null,
   NU_MODO_VINCULADO_200 NUMBER(3)             not null,
   NU_GRUPO_VINCULADO_200 NUMBER(3)             not null,
   NU_SQNCL_CIF_SRVCO_VNCDO_200 NUMBER(9)             not null,
   NU_TIPO_VINCULO_204  NUMBER(2)             not null,
   IC_MANDATORIO        VARCHAR2(1)          default 'N'  not null
      constraint CC_D02TB201_1 check (IC_MANDATORIO in ('S','N')),
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB201 primary key (NU_ACAO_VINCULADOR_200, NU_MODO_VINCULADOR_200, NU_GRUPO_VINCULADOR_200, NU_SQNCL_CIF_SRVCO_VNCLR_200, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB202_CIF_SRVCO_PRPRE_FRMRO                        */
/*==============================================================*/
create table D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (
   NU_ACAO_200          NUMBER(3)             not null,
   NU_MODO_200          NUMBER(3)             not null,
   NU_GRUPO_200         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_200 NUMBER(9)             not null,
   NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO NUMBER(9)             not null,
   NU_TIPO_PRPRE_FORMULARIO_205 NUMBER(3)             not null,
   NU_TIPO_CONTEUDO_206 NUMBER(3)             not null,
   IC_OBRIGATORIO       VARCHAR2(1)          default 'N'  not null
      constraint CC_D02TB202_1 check (IC_OBRIGATORIO in ('S','N')),
   IC_HABILITADO        VARCHAR2(1)          default 'S'  not null
      constraint CC_D02TB202_2 check (IC_HABILITADO in ('S','N')),
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           CHAR(8)               not null,
   constraint PK_D02TB202 primary key (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB203_CIF_COREOGRAFIA                              */
/*==============================================================*/
create table D02.D02TB203_CIF_COREOGRAFIA (
   NU_ACAO_200          NUMBER(3)             not null,
   NU_MODO_200          NUMBER(3)             not null,
   NU_GRUPO_200         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_200 NUMBER(9)             not null,
   NU_FAIXA             NUMBER(4)             not null,
   NU_COREOGRAFIA       NUMBER(5)             not null,
   NU_PACOTE            NUMBER(5)            default 0  not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB203 primary key (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_FAIXA, NU_COREOGRAFIA, NU_PACOTE, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB204_TIPO_VINCULO                                 */
/*==============================================================*/
create table D02.D02TB204_TIPO_VINCULO (
   NU_TIPO_VINCULO      NUMBER(2)             not null,
   NO_TIPO_VINCULO      VARCHAR2(30)          not null,
   CO_TIPO_VINCULO      VARCHAR2(1)           not null,
   constraint PK_D02TB204 primary key (NU_TIPO_VINCULO)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB205_TIPO_PRPRE_FRMRO                             */
/*==============================================================*/
create table D02.D02TB205_TIPO_PRPRE_FRMRO (
   NU_TIPO_PROPRIEDADE_FORMULARIO NUMBER(3)             not null,
   NO_TIPO_PROPRIEDADE_FORMULARIO VARCHAR2(30)          not null,
   constraint PK_D02TB205 primary key (NU_TIPO_PROPRIEDADE_FORMULARIO)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB206_TIPO_CONTEUDO                                */
/*==============================================================*/
create table D02.D02TB206_TIPO_CONTEUDO (
   NU_TIPO_CONTEUDO     NUMBER(3)             not null,
   CO_CONTEUDO          VARCHAR2(1)          default 'N'  not null
      constraint CC_D02TB206_1 check (CO_CONTEUDO in ('N','P','E','I')),
   NO_TIPO_CONTEUDO     VARCHAR2(30)          not null,
   constraint PK_D02TB206 primary key (NU_TIPO_CONTEUDO)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB207_TIPO_EXTRACAO                                */
/*==============================================================*/
create table D02.D02TB207_TIPO_EXTRACAO (
   NU_TIPO_EXTRACAO     NUMBER(3)             not null,
   CO_TIPO_EXTRACAO     VARCHAR2(1)           not null,
   NO_TIPO_EXTRACAO     VARCHAR2(30)          not null,
   constraint PK_D02TB207 primary key (NU_TIPO_EXTRACAO)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB208_TIPO_EXTRACAO_CNDO                           */
/*==============================================================*/
create table D02.D02TB208_TIPO_EXTRACAO_CNDO (
   NU_ACAO_202          NUMBER(3)             not null,
   NU_MODO_202          NUMBER(3)             not null,
   NU_GRUPO_202         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_202 NUMBER(9)             not null,
   NU_SQNCL_CIF_PRPRE_FRMRO_202 NUMBER(9)             not null,
   NU_TIPO_EXTRACAO_207 NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB208 primary key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202, NU_TIPO_EXTRACAO_207, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB209_SALDO_RESERVA_SOCIAL                         */
/*==============================================================*/
create table D02.D02TB209_SALDO_RESERVA_SOCIAL (
   NU_TIPO_ATRZA_SALDO_RSRVA_SCL NUMBER(3)             not null,
   DE_TIPO_ATRZA_SALDO_RSRVA_SCL VARCHAR2(30),
   constraint PK_D02TB209 primary key (NU_TIPO_ATRZA_SALDO_RSRVA_SCL)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB210_SALDO_RSRVA_SCL_CNDO                         */
/*==============================================================*/
create table D02.D02TB210_SALDO_RSRVA_SCL_CNDO (
   NU_ACAO_202          NUMBER(3)             not null,
   NU_MODO_202          NUMBER(3)             not null,
   NU_GRUPO_202         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_202 NUMBER(9)             not null,
   NU_SQNCL_CIF_PRPRE_FRMRO_202 NUMBER(9)             not null,
   NU_ATRZA_SLDO_RSRVA_SCL_209 NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB210 primary key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202, NU_ATRZA_SLDO_RSRVA_SCL_209, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB211_TIPO_DETALHE_DEBITO                          */
/*==============================================================*/
create table D02.D02TB211_TIPO_DETALHE_DEBITO (
   NU_TIPO_DETALHE_DEBITO NUMBER(3)             not null,
   DE_TIPO_DETALHE_DEBITO VARCHAR2(30),
   constraint PK_D02TB211 primary key (NU_TIPO_DETALHE_DEBITO)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB212_DETALHE_DEBITO_CNDO                          */
/*==============================================================*/
create table D02.D02TB212_DETALHE_DEBITO_CNDO (
   NU_ACAO_202          NUMBER(3)             not null,
   NU_MODO_202          NUMBER(3)             not null,
   NU_GRUPO_202         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_202 NUMBER(9)             not null,
   NU_SQNCL_CIF_PRPRE_FRMRO_202 NUMBER(9)             not null,
   NU_TIPO_DETALHE_DEBITO_211 NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB212 primary key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202, NU_TIPO_DETALHE_DEBITO_211, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB213_PRIORIDADE_CONTEUDO                          */
/*==============================================================*/
create table D02.D02TB213_PRIORIDADE_CONTEUDO (
   NU_ACAO_202          NUMBER(3)             not null,
   NU_MODO_202          NUMBER(3)             not null,
   NU_GRUPO_202         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_202 NUMBER(9)             not null,
   NU_SQNCL_CIF_PRPRE_FRMRO_202 NUMBER(9)             not null,
   NU_PRIORIDADE_P55    NUMBER(5)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB213 primary key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202, NU_PRIORIDADE_P55, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB214_FNCNE_ESPECIAL_CNDO                          */
/*==============================================================*/
create table D02.D02TB214_FNCNE_ESPECIAL_CNDO (
   NU_ACAO_202          NUMBER(3)             not null,
   NU_MODO_202          NUMBER(3)             not null,
   NU_GRUPO_202         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_202 NUMBER(9)             not null,
   NU_SQNCL_CIF_PRPRE_FRMRO_202 NUMBER(9)             not null,
   NU_FUNCIONALIDADE_ESPECIAL_P21 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB214 primary key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202, NU_FUNCIONALIDADE_ESPECIAL_P21, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB215_CLASSIFICACAO_CNDO                           */
/*==============================================================*/
create table D02.D02TB215_CLASSIFICACAO_CNDO (
   NU_ACAO_202          NUMBER(3)             not null,
   NU_MODO_202          NUMBER(3)             not null,
   NU_GRUPO_202         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_202 NUMBER(9)             not null,
   NU_SQNCL_CIF_PRPRE_FRMRO_202 NUMBER(9)             not null,
   NU_CLASSIFICACAO_LNCMO_P17 NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB215 primary key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202, NU_CLASSIFICACAO_LNCMO_P17, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB216_CANAL_CONTEUDO                               */
/*==============================================================*/
create table D02.D02TB216_CANAL_CONTEUDO (
   NU_ACAO_202          NUMBER(3)             not null,
   NU_MODO_202          NUMBER(3)             not null,
   NU_GRUPO_202         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_202 NUMBER(9)             not null,
   NU_SQNCL_CIF_PRPRE_FRMRO_202 NUMBER(9)             not null,
   NU_CANAL_COMERCIALIZACAO_O15 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB216 primary key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202, NU_CANAL_COMERCIALIZACAO_O15, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB217_SISTEMA_CONTEUDO                             */
/*==============================================================*/
create table D02.D02TB217_SISTEMA_CONTEUDO (
   NU_ACAO_202          NUMBER(3)             not null,
   NU_MODO_202          NUMBER(3)             not null,
   NU_GRUPO_202         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_202 NUMBER(9)             not null,
   NU_SQNCL_CIF_PRPRE_FRMRO_202 NUMBER(9)             not null,
   NU_SEGMENTO_S12      NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB217 primary key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202, NU_SEGMENTO_S12, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB218_PRPRE_FRMRO_SNL_SALDO                        */
/*==============================================================*/
create table D02.D02TB218_PRPRE_FRMRO_SNL_SALDO (
   NU_ACAO_202          NUMBER(3)             not null,
   NU_MODO_202          NUMBER(3)             not null,
   NU_GRUPO_202         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_202 NUMBER(9)             not null,
   NU_SQNCL_CIF_PRPRE_FRMRO_202 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   NU_SINAL             NUMBER(2)            default 0  not null
      constraint CKC_NU_SINAL_D02TB218 check (NU_SINAL in (-1,1,0)),
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB218 primary key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB250_SLCTO_MANUTENCAO_CIF                         */
/*==============================================================*/
create table D02.D02TB250_SLCTO_MANUTENCAO_CIF (
   NU_ACAO_200          NUMBER(3)             not null,
   NU_MODO_200          NUMBER(3)             not null,
   NU_GRUPO_200         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_200 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB250 primary key (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB251_SLCTO_CIF_DSCRO_GERAL                        */
/*==============================================================*/
create table D02.D02TB251_SLCTO_CIF_DSCRO_GERAL (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   DE_SERVICO           VARCHAR2(200)         not null,
   DE_OBSERVACAO        VARCHAR2(200),
   constraint PK_D02TB251 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB252_SLCTO_CIF_DSCRO_ESPFA                        */
/*==============================================================*/
create table D02.D02TB252_SLCTO_CIF_DSCRO_ESPFA (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   NO_CIF               VARCHAR2(60)          not null,
   NO_ABREVIADO_CIF     VARCHAR2(25)          not null,
   NO_REDUZIDO_CIF      VARCHAR2(10)          not null,
   constraint PK_D02TB252 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB253_TIPO_EXTRACAO_SLNDO                          */
/*==============================================================*/
create table D02.D02TB253_TIPO_EXTRACAO_SLNDO (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_TIPO_EXTRACAO_207 NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB253 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_TIPO_EXTRACAO_207, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB254_RSRVA_SOCIAL_SLNDO                           */
/*==============================================================*/
create table D02.D02TB254_RSRVA_SOCIAL_SLNDO (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_ATRZA_SLDO_RSRVA_SCL_209 NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB254 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_ATRZA_SLDO_RSRVA_SCL_209, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB255_DETALHE_DEBITO_SLNDO                         */
/*==============================================================*/
create table D02.D02TB255_DETALHE_DEBITO_SLNDO (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_TIPO_DETALHE_DEBITO_211 NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB255 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_TIPO_DETALHE_DEBITO_211, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB256_TIPO_PRIORIDADE_SLNDO                        */
/*==============================================================*/
create table D02.D02TB256_TIPO_PRIORIDADE_SLNDO (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_PRIORIDADE_P55    NUMBER(5)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB256 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_PRIORIDADE_P55, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB257_FNCNE_ESPECIAL_SLNDO                         */
/*==============================================================*/
create table D02.D02TB257_FNCNE_ESPECIAL_SLNDO (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_FUNCIONALIDADE_ESPECIAL_P21 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB257 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_FUNCIONALIDADE_ESPECIAL_P21, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB258_CLASSIFICACAO_SLNDO                          */
/*==============================================================*/
create table D02.D02TB258_CLASSIFICACAO_SLNDO (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_CLASSIFICACAO_LNCMO_P17 NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB258 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, DT_INICIO_VIGENCIA, NU_CLASSIFICACAO_LNCMO_P17)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB259_SITUACAO_CIF                                 */
/*==============================================================*/
create table D02.D02TB259_SITUACAO_CIF (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   CO_SITUACAO_CIF      CHAR(1)               not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB259 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB260_CUSTO                                        */
/*==============================================================*/
create table D02.D02TB260_CUSTO (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   VR_CUSTO             NUMBER(15,2)          not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB260 primary key (NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB261_PACOTE_TARIFA                                */
/*==============================================================*/
create table D02.D02TB261_PACOTE_TARIFA (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   IC_PACOTE_TARIFA     VARCHAR2(1)          default 'N'  not null
      constraint CC_D02TB261_1 check (IC_PACOTE_TARIFA in ('S','N')),
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB261 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB262_MVMNO_ESPONTANEA                             */
/*==============================================================*/
create table D02.D02TB262_MVMNO_ESPONTANEA (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   IC_MOVIMENTACAO_ESPONTANEA VARCHAR2(1)          default 'N'  not null
      constraint CC_D02TB262_1 check (IC_MOVIMENTACAO_ESPONTANEA in ('S','N')),
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB262 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB263_SALDO                                        */
/*==============================================================*/
create table D02.D02TB263_SALDO (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_TIPO_SALDO_P48    NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   NU_SINAL             NUMBER(2)            default 0  not null
      constraint CKC_NU_SINAL_D02TB263 check (NU_SINAL in (-1,1,0)),
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB263 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_TIPO_SALDO_P48, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB264_SITUACAO_MOTIVO                              */
/*==============================================================*/
create table D02.D02TB264_SITUACAO_MOTIVO (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_SITUACAO_CONTRATO_P58 NUMBER(3)             not null,
   NU_MOTIVO_CONTRATO_P58 NUMBER(3)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   CO_COMPORTAMENTO     VARCHAR2(1)          default 'I'  not null
      constraint CKC_CO_COMPORTAMENTO_D02TB264 check (CO_COMPORTAMENTO in ('I')),
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB264 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_SITUACAO_CONTRATO_P58, NU_MOTIVO_CONTRATO_P58, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB265_CMPTO_FNCNE_ESPECIAL                         */
/*==============================================================*/
create table D02.D02TB265_CMPTO_FNCNE_ESPECIAL (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_FUNCIONALIDADE_ESPECIAL_P21 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   NU_NIVEL_ALCADA_P54  NUMBER(4)             not null,
   CO_ABRANGENCIA       VARCHAR2(1)          default 'L'  not null
      constraint CKC_CO_ABRANGENCIA_D02TB265 check (CO_ABRANGENCIA in ('A','I','L')),
   CO_COMPORTAMENTO     CHAR(1)              default 'F'
      constraint CKC_CO_COMPORTAMENTO_D02TB265 check (CO_COMPORTAMENTO is null or (CO_COMPORTAMENTO in ('A','I','F','O'))),
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB265 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_FUNCIONALIDADE_ESPECIAL_P21, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB266_CANAL                                        */
/*==============================================================*/
create table D02.D02TB266_CANAL (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_CANAL_COMERCIALIZACAO_O15 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB266 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_CANAL_COMERCIALIZACAO_O15, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB267_SISTEMA                                      */
/*==============================================================*/
create table D02.D02TB267_SISTEMA (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_SEGMENTO          NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB267 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_SEGMENTO, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB268_PRODUTO_PROPRIEDADE                          */
/*==============================================================*/
create table D02.D02TB268_PRODUTO_PROPRIEDADE (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   NU_PRODUTO_O28       NUMBER(9)             not null,
   NU_PROPRIEDADE_PRODUTO_O28 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   CO_ABRANGENCIA       VARCHAR2(1)          default 'L'  not null
      constraint CKC_CO_ABRANGENCIA_D02TB268 check (CO_ABRANGENCIA in ('A','I','L')),
   constraint PK_D02TB268 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, NU_PRODUTO_O28, NU_PROPRIEDADE_PRODUTO_O28, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

/*==============================================================*/
/* Table: D02TB269_DMNDA_SLCTO_MNTNO_CIF                        */
/*==============================================================*/
create table D02.D02TB269_DMNDA_SLCTO_MNTNO_CIF (
   NU_ACAO_250          NUMBER(3)             not null,
   NU_MODO_250          NUMBER(3)             not null,
   NU_GRUPO_250         NUMBER(3)             not null,
   NU_SEQUENCIAL_CIF_SERVICO_250 NUMBER(9)             not null,
   NU_SQNCL_SLCTO_MNTNO_CIF_250 NUMBER(9)             not null,
   DT_INICIO_VIGENCIA   DATE                  not null,
   NU_UNIDADE_DEMANDA   NUMBER(5)             not null,
   CO_USUARIO_DEMANDA   VARCHAR2(8)           not null,
   NU_DEMANDA           NUMBER(20)            not null,
   DT_FIM_VIGENCIA      DATE,
   CO_USUARIO           VARCHAR2(8)           not null,
   constraint PK_D02TB269 primary key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250, DT_INICIO_VIGENCIA)
         using index tablespace D02TSIX001
)
   tablespace D02TSDT001;

alter table D02.D02TB201_CIF_COMPLEMENTO
   add constraint FK_D02TB201_D02TB200_1 foreign key (NU_ACAO_VINCULADOR_200, NU_MODO_VINCULADOR_200, NU_GRUPO_VINCULADOR_200, NU_SQNCL_CIF_SRVCO_VNCLR_200)
      references D02.D02TB200_CIF_SERVICO (NU_ACAO_P15, NU_MODO_P15, NU_GRUPO_P15, NU_SEQUENCIAL_CIF_SERVICO);

alter table D02.D02TB201_CIF_COMPLEMENTO
   add constraint FK_D02TB201_D02TB200_2 foreign key (NU_ACAO_VINCULADO_200, NU_MODO_VINCULADO_200, NU_GRUPO_VINCULADO_200, NU_SQNCL_CIF_SRVCO_VNCDO_200)
      references D02.D02TB200_CIF_SERVICO (NU_ACAO_P15, NU_MODO_P15, NU_GRUPO_P15, NU_SEQUENCIAL_CIF_SERVICO);

alter table D02.D02TB201_CIF_COMPLEMENTO
   add constraint FK_D02TB201_D02TB204 foreign key (NU_TIPO_VINCULO_204)
      references D02.D02TB204_TIPO_VINCULO (NU_TIPO_VINCULO);

alter table D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO
   add constraint FK_D02TB202_D02TB200 foreign key (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200)
      references D02.D02TB200_CIF_SERVICO (NU_ACAO_P15, NU_MODO_P15, NU_GRUPO_P15, NU_SEQUENCIAL_CIF_SERVICO);

alter table D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO
   add constraint FK_D02TB202_D02TB205 foreign key (NU_TIPO_PRPRE_FORMULARIO_205)
      references D02.D02TB205_TIPO_PRPRE_FRMRO (NU_TIPO_PROPRIEDADE_FORMULARIO);

alter table D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO
   add constraint FK_D02TB202_D02TB206 foreign key (NU_TIPO_CONTEUDO_206)
      references D02.D02TB206_TIPO_CONTEUDO (NU_TIPO_CONTEUDO);

alter table D02.D02TB203_CIF_COREOGRAFIA
   add constraint FK_D02TB203_D02TB200 foreign key (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200)
      references D02.D02TB200_CIF_SERVICO (NU_ACAO_P15, NU_MODO_P15, NU_GRUPO_P15, NU_SEQUENCIAL_CIF_SERVICO);

alter table D02.D02TB208_TIPO_EXTRACAO_CNDO
   add constraint FK_D02TB208_D02TB202 foreign key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202)
      references D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO);

alter table D02.D02TB208_TIPO_EXTRACAO_CNDO
   add constraint FK_D02TB208_D02TB207 foreign key (NU_TIPO_EXTRACAO_207)
      references D02.D02TB207_TIPO_EXTRACAO (NU_TIPO_EXTRACAO);

alter table D02.D02TB210_SALDO_RSRVA_SCL_CNDO
   add constraint FK_D02TB210_D02TB202 foreign key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202)
      references D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO);

alter table D02.D02TB210_SALDO_RSRVA_SCL_CNDO
   add constraint FK_D02TB210_D02TB209 foreign key (NU_ATRZA_SLDO_RSRVA_SCL_209)
      references D02.D02TB209_SALDO_RESERVA_SOCIAL (NU_TIPO_ATRZA_SALDO_RSRVA_SCL);

alter table D02.D02TB212_DETALHE_DEBITO_CNDO
   add constraint FK_D02TB212_D02TB202 foreign key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202)
      references D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO);

alter table D02.D02TB212_DETALHE_DEBITO_CNDO
   add constraint FK_D02TB212_D02TB211 foreign key (NU_TIPO_DETALHE_DEBITO_211)
      references D02.D02TB211_TIPO_DETALHE_DEBITO (NU_TIPO_DETALHE_DEBITO);

alter table D02.D02TB213_PRIORIDADE_CONTEUDO
   add constraint FK_D02TB213_D02TB202 foreign key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202)
      references D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO);

alter table D02.D02TB214_FNCNE_ESPECIAL_CNDO
   add constraint FK_D02TB214_D02TB202 foreign key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202)
      references D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO);

alter table D02.D02TB215_CLASSIFICACAO_CNDO
   add constraint FK_D02TB215_D02TB202 foreign key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202)
      references D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO);

alter table D02.D02TB216_CANAL_CONTEUDO
   add constraint FK_D02TB216_D02TB202 foreign key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202)
      references D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO);

alter table D02.D02TB217_SISTEMA_CONTEUDO
   add constraint FK_D02TB217_D02TB202 foreign key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202)
      references D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO);

alter table D02.D02TB218_PRPRE_FRMRO_SNL_SALDO
   add constraint FK_D02TB218_D02TB202 foreign key (NU_ACAO_202, NU_MODO_202, NU_GRUPO_202, NU_SEQUENCIAL_CIF_SERVICO_202, NU_SQNCL_CIF_PRPRE_FRMRO_202)
      references D02.D02TB202_CIF_SRVCO_PRPRE_FRMRO (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_CIF_SRVCO_PRPRE_FRMRO);

alter table D02.D02TB250_SLCTO_MANUTENCAO_CIF
   add constraint FK_D02TB250_D02TB200 foreign key (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200)
      references D02.D02TB200_CIF_SERVICO (NU_ACAO_P15, NU_MODO_P15, NU_GRUPO_P15, NU_SEQUENCIAL_CIF_SERVICO);

alter table D02.D02TB251_SLCTO_CIF_DSCRO_GERAL
   add constraint FK_D02TB251_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB252_SLCTO_CIF_DSCRO_ESPFA
   add constraint FK_D02TB252_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB253_TIPO_EXTRACAO_SLNDO
   add constraint FK_D02TB253_D02TB207 foreign key (NU_TIPO_EXTRACAO_207)
      references D02.D02TB207_TIPO_EXTRACAO (NU_TIPO_EXTRACAO);

alter table D02.D02TB253_TIPO_EXTRACAO_SLNDO
   add constraint FK_D02TB253_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB254_RSRVA_SOCIAL_SLNDO
   add constraint FK_D02TB254_D02TB209 foreign key (NU_ATRZA_SLDO_RSRVA_SCL_209)
      references D02.D02TB209_SALDO_RESERVA_SOCIAL (NU_TIPO_ATRZA_SALDO_RSRVA_SCL);

alter table D02.D02TB254_RSRVA_SOCIAL_SLNDO
   add constraint FK_D02TB254_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB255_DETALHE_DEBITO_SLNDO
   add constraint FK_D02TB255_D02TB211 foreign key (NU_TIPO_DETALHE_DEBITO_211)
      references D02.D02TB211_TIPO_DETALHE_DEBITO (NU_TIPO_DETALHE_DEBITO);

alter table D02.D02TB255_DETALHE_DEBITO_SLNDO
   add constraint FK_D02TB255_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB256_TIPO_PRIORIDADE_SLNDO
   add constraint FK_D02TB256_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB257_FNCNE_ESPECIAL_SLNDO
   add constraint FK_D02TB257_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB258_CLASSIFICACAO_SLNDO
   add constraint FK_D02TB258_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB259_SITUACAO_CIF
   add constraint FK_D02TB259_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB260_CUSTO
   add constraint FK_D02TB260_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB261_PACOTE_TARIFA
   add constraint FK_D02TB261_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB262_MVMNO_ESPONTANEA
   add constraint FK_D02TB262_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB263_SALDO
   add constraint FK_D02TB263_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB264_SITUACAO_MOTIVO
   add constraint FK_D02TB264_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB265_CMPTO_FNCNE_ESPECIAL
   add constraint FK_D02TB265_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB266_CANAL
   add constraint FK_D02TB266_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB267_SISTEMA
   add constraint FK_D02TB267_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB268_PRODUTO_PROPRIEDADE
   add constraint FK_D02TB268_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);

alter table D02.D02TB269_DMNDA_SLCTO_MNTNO_CIF
   add constraint FK_D02TB269_D02TB250 foreign key (NU_ACAO_250, NU_MODO_250, NU_GRUPO_250, NU_SEQUENCIAL_CIF_SERVICO_250, NU_SQNCL_SLCTO_MNTNO_CIF_250)
      references D02.D02TB250_SLCTO_MANUTENCAO_CIF (NU_ACAO_200, NU_MODO_200, NU_GRUPO_200, NU_SEQUENCIAL_CIF_SERVICO_200, NU_SQNCL_SLCTO_MNTNO_CIF);


