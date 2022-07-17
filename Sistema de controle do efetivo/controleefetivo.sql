--
-- PostgreSQL database dump
--

-- Dumped from database version 14.0
-- Dumped by pg_dump version 14.0

-- Started on 2022-02-03 13:05:00

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 210 (class 1259 OID 41116)
-- Name: curso; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.curso (
    idcurso integer NOT NULL,
    nome character varying,
    local character varying,
    periodo character varying,
    situacao character varying
);


ALTER TABLE public.curso OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 41115)
-- Name: curso_idcurso_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.curso_idcurso_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.curso_idcurso_seq OWNER TO postgres;

--
-- TOC entry 3377 (class 0 OID 0)
-- Dependencies: 209
-- Name: curso_idcurso_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.curso_idcurso_seq OWNED BY public.curso.idcurso;


--
-- TOC entry 216 (class 1259 OID 41148)
-- Name: ferias; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ferias (
    idferias integer NOT NULL,
    tipo character varying,
    aquisitivo character varying,
    periodo character varying,
    situacao character varying,
    idfuncionario integer
);


ALTER TABLE public.ferias OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 41147)
-- Name: ferias_idferias_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.ferias_idferias_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.ferias_idferias_seq OWNER TO postgres;

--
-- TOC entry 3378 (class 0 OID 0)
-- Dependencies: 215
-- Name: ferias_idferias_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.ferias_idferias_seq OWNED BY public.ferias.idferias;


--
-- TOC entry 212 (class 1259 OID 41125)
-- Name: funcao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.funcao (
    idfuncao integer NOT NULL,
    descricao character varying
);


ALTER TABLE public.funcao OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 41124)
-- Name: funcao_idfuncao_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.funcao_idfuncao_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.funcao_idfuncao_seq OWNER TO postgres;

--
-- TOC entry 3379 (class 0 OID 0)
-- Dependencies: 211
-- Name: funcao_idfuncao_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.funcao_idfuncao_seq OWNED BY public.funcao.idfuncao;


--
-- TOC entry 214 (class 1259 OID 41134)
-- Name: funcionario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.funcionario (
    idfuncionario integer NOT NULL,
    nome character varying,
    cpf character varying,
    celular character varying,
    email character varying,
    endereco character varying,
    idfuncao integer
);


ALTER TABLE public.funcionario OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 41133)
-- Name: funcionario_idfuncionario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.funcionario_idfuncionario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.funcionario_idfuncionario_seq OWNER TO postgres;

--
-- TOC entry 3380 (class 0 OID 0)
-- Dependencies: 213
-- Name: funcionario_idfuncionario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.funcionario_idfuncionario_seq OWNED BY public.funcionario.idfuncionario;


--
-- TOC entry 217 (class 1259 OID 41161)
-- Name: matricula; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.matricula (
    idcurso integer,
    idfuncionario integer,
    matricula integer
);


ALTER TABLE public.matricula OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 41183)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    idusuario integer NOT NULL,
    usuario character varying,
    senha character varying
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 41182)
-- Name: usuario_idusuario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuario_idusuario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.usuario_idusuario_seq OWNER TO postgres;

--
-- TOC entry 3381 (class 0 OID 0)
-- Dependencies: 220
-- Name: usuario_idusuario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuario_idusuario_seq OWNED BY public.usuario.idusuario;


--
-- TOC entry 219 (class 1259 OID 41178)
-- Name: view_ferias_funcionario; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.view_ferias_funcionario AS
 SELECT p.idferias,
    p.tipo,
    p.aquisitivo,
    p.periodo,
    p.situacao,
    p.idfuncionario AS pidfuncionario,
    c.idfuncionario AS cidfuncionario,
    c.nome
   FROM (public.ferias p
     JOIN public.funcionario c ON ((c.idfuncionario = p.idfuncionario)));


ALTER TABLE public.view_ferias_funcionario OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 41174)
-- Name: view_funcionario_funcao; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.view_funcionario_funcao AS
 SELECT p.idfuncionario,
    p.nome,
    p.cpf,
    p.celular,
    p.email,
    p.endereco,
    p.idfuncao AS pidfuncao,
    c.idfuncao AS cidfuncao,
    c.descricao
   FROM (public.funcionario p
     JOIN public.funcao c ON ((c.idfuncao = p.idfuncao)));


ALTER TABLE public.view_funcionario_funcao OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 49383)
-- Name: view_matricula; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.view_matricula AS
 SELECT f.idfuncionario,
    f.nome AS fnome,
    c.idcurso,
    c.nome AS cnome,
    m.matricula
   FROM ((public.matricula m
     JOIN public.funcionario f ON ((f.idfuncionario = m.idfuncionario)))
     JOIN public.curso c ON ((c.idcurso = m.idcurso)));


ALTER TABLE public.view_matricula OWNER TO postgres;

--
-- TOC entry 3200 (class 2604 OID 41119)
-- Name: curso idcurso; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.curso ALTER COLUMN idcurso SET DEFAULT nextval('public.curso_idcurso_seq'::regclass);


--
-- TOC entry 3203 (class 2604 OID 41151)
-- Name: ferias idferias; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ferias ALTER COLUMN idferias SET DEFAULT nextval('public.ferias_idferias_seq'::regclass);


--
-- TOC entry 3201 (class 2604 OID 41128)
-- Name: funcao idfuncao; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcao ALTER COLUMN idfuncao SET DEFAULT nextval('public.funcao_idfuncao_seq'::regclass);


--
-- TOC entry 3202 (class 2604 OID 41137)
-- Name: funcionario idfuncionario; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario ALTER COLUMN idfuncionario SET DEFAULT nextval('public.funcionario_idfuncionario_seq'::regclass);


--
-- TOC entry 3204 (class 2604 OID 41186)
-- Name: usuario idusuario; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario ALTER COLUMN idusuario SET DEFAULT nextval('public.usuario_idusuario_seq'::regclass);


--
-- TOC entry 3362 (class 0 OID 41116)
-- Dependencies: 210
-- Data for Name: curso; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.curso VALUES (2, 'Java Básico', 'Alura - EAD', '10/02/2022 a 10/03/2022', 'Aguardando início');
INSERT INTO public.curso VALUES (4, 'Flutter Básico', 'Fluterando - EAD', '01/12/2021 a 20/12/2021', 'Finalizado');
INSERT INTO public.curso VALUES (3, 'UI/UX', 'Fluterando - EAD', '20/01/2022 a 20/02/2022', 'Em andamento');


--
-- TOC entry 3368 (class 0 OID 41148)
-- Dependencies: 216
-- Data for Name: ferias; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.ferias VALUES (4, 'Parcela 2', '01/03/2020 a 01/03/2021', '22/01/2022 a 31/01/2022', 'Em andamento', 4);
INSERT INTO public.ferias VALUES (3, 'Parcela 1', '01/03/2020 a 01/03/2021', '10/12/2021 a 19/12/2021', 'Concedida', 4);
INSERT INTO public.ferias VALUES (6, 'Desconto', '01/08/2020 a 01/08/2021', '10/12/2021 a 09/01/2022', 'Concedido', 3);
INSERT INTO public.ferias VALUES (8, 'Parcela 2', '01/08/2020 a 01/08/2021', '10/01/2022 a 20/01/2022', 'Concedido', 1);
INSERT INTO public.ferias VALUES (1, 'Parcela 1', '01/08/2020 a 01/08/2021', '10/02/2022 a 20/02/2022', 'Aguardando', 1);


--
-- TOC entry 3364 (class 0 OID 41125)
-- Dependencies: 212
-- Data for Name: funcao; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.funcao VALUES (1, 'Dev. Júnior');
INSERT INTO public.funcao VALUES (2, 'Dev. Pleno');
INSERT INTO public.funcao VALUES (3, 'Dev. Sênior');
INSERT INTO public.funcao VALUES (5, 'Gerente de Projetos');
INSERT INTO public.funcao VALUES (6, 'Designer');
INSERT INTO public.funcao VALUES (7, 'Editor de vídeo');


--
-- TOC entry 3366 (class 0 OID 41134)
-- Dependencies: 214
-- Data for Name: funcionario; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.funcionario VALUES (3, 'Jonathan', '111.111.111-11', '(22) 22222-2222', 'jonathan@email.com', 'Rua y', 5);
INSERT INTO public.funcionario VALUES (4, 'Diogo', '211.212.121-21', '(55) 98888-8888', 'diogo@email.com', 'Rua d', 1);
INSERT INTO public.funcionario VALUES (1, 'Rafael', '000.000.000-00', '(55) 99999-9999', 'rafael@email.com', 'Rua x', 1);


--
-- TOC entry 3369 (class 0 OID 41161)
-- Dependencies: 217
-- Data for Name: matricula; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.matricula VALUES (2, 1, 1);
INSERT INTO public.matricula VALUES (2, 4, 2);
INSERT INTO public.matricula VALUES (3, 4, 1);
INSERT INTO public.matricula VALUES (4, 1, 2);
INSERT INTO public.matricula VALUES (4, 3, 2);
INSERT INTO public.matricula VALUES (4, 4, 3);
INSERT INTO public.matricula VALUES (3, 1, 2);
INSERT INTO public.matricula VALUES (3, 3, 3);
INSERT INTO public.matricula VALUES (2, 3, 1);


--
-- TOC entry 3371 (class 0 OID 41183)
-- Dependencies: 221
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.usuario VALUES (1, 'ennes', '03AC674216F3E15C761EE1A5E255F067953623C8B388B4459E13F978D7C846F4');
INSERT INTO public.usuario VALUES (2, 'video', '03AC674216F3E15C761EE1A5E255F067953623C8B388B4459E13F978D7C846F4');


--
-- TOC entry 3382 (class 0 OID 0)
-- Dependencies: 209
-- Name: curso_idcurso_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.curso_idcurso_seq', 5, true);


--
-- TOC entry 3383 (class 0 OID 0)
-- Dependencies: 215
-- Name: ferias_idferias_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.ferias_idferias_seq', 8, true);


--
-- TOC entry 3384 (class 0 OID 0)
-- Dependencies: 211
-- Name: funcao_idfuncao_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.funcao_idfuncao_seq', 7, true);


--
-- TOC entry 3385 (class 0 OID 0)
-- Dependencies: 213
-- Name: funcionario_idfuncionario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.funcionario_idfuncionario_seq', 4, true);


--
-- TOC entry 3386 (class 0 OID 0)
-- Dependencies: 220
-- Name: usuario_idusuario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuario_idusuario_seq', 2, true);


--
-- TOC entry 3206 (class 2606 OID 41123)
-- Name: curso idcurso_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.curso
    ADD CONSTRAINT idcurso_pkey PRIMARY KEY (idcurso);


--
-- TOC entry 3212 (class 2606 OID 41155)
-- Name: ferias idferias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ferias
    ADD CONSTRAINT idferias_pkey PRIMARY KEY (idferias);


--
-- TOC entry 3208 (class 2606 OID 41132)
-- Name: funcao idfuncao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcao
    ADD CONSTRAINT idfuncao_pkey PRIMARY KEY (idfuncao);


--
-- TOC entry 3210 (class 2606 OID 41141)
-- Name: funcionario idfuncionario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT idfuncionario_pkey PRIMARY KEY (idfuncionario);


--
-- TOC entry 3214 (class 2606 OID 41190)
-- Name: usuario idusuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT idusuario_pkey PRIMARY KEY (idusuario);


--
-- TOC entry 3216 (class 2606 OID 41156)
-- Name: ferias fk_ferias_funcionario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ferias
    ADD CONSTRAINT fk_ferias_funcionario FOREIGN KEY (idfuncionario) REFERENCES public.funcionario(idfuncionario) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 3215 (class 2606 OID 41142)
-- Name: funcionario fk_funcionario_funcao; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT fk_funcionario_funcao FOREIGN KEY (idfuncao) REFERENCES public.funcao(idfuncao) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- TOC entry 3217 (class 2606 OID 41164)
-- Name: matricula fk_matricula_curso; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.matricula
    ADD CONSTRAINT fk_matricula_curso FOREIGN KEY (idcurso) REFERENCES public.curso(idcurso) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 3218 (class 2606 OID 41169)
-- Name: matricula fk_matricula_funcionario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.matricula
    ADD CONSTRAINT fk_matricula_funcionario FOREIGN KEY (idfuncionario) REFERENCES public.funcionario(idfuncionario) ON UPDATE CASCADE ON DELETE CASCADE;


-- Completed on 2022-02-03 13:05:03

--
-- PostgreSQL database dump complete
--

