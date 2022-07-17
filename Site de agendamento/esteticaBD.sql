--
-- PostgreSQL database dump
--

-- Dumped from database version 14.0
-- Dumped by pg_dump version 14.0

-- Started on 2022-02-14 18:03:42

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
-- TOC entry 238 (class 1259 OID 49562)
-- Name: agendamento_atendimento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.agendamento_atendimento (
    id bigint NOT NULL,
    data_consulta date,
    hora_consulta time without time zone,
    situacao character varying(9) NOT NULL,
    observacao character varying(100) NOT NULL,
    cliente_id bigint NOT NULL,
    funcionario_id bigint NOT NULL,
    servico_id bigint NOT NULL
);


ALTER TABLE public.agendamento_atendimento OWNER TO postgres;

--
-- TOC entry 237 (class 1259 OID 49561)
-- Name: agendamento_atendimento_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.agendamento_atendimento_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.agendamento_atendimento_id_seq OWNER TO postgres;

--
-- TOC entry 3507 (class 0 OID 0)
-- Dependencies: 237
-- Name: agendamento_atendimento_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.agendamento_atendimento_id_seq OWNED BY public.agendamento_atendimento.id;


--
-- TOC entry 228 (class 1259 OID 49527)
-- Name: agendamento_cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.agendamento_cliente (
    id bigint NOT NULL,
    nome character varying(35) NOT NULL,
    endereco character varying(100) NOT NULL,
    telefone character varying(15) NOT NULL,
    email character varying(100) NOT NULL,
    foto character varying(100)
);


ALTER TABLE public.agendamento_cliente OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 49526)
-- Name: agendamento_cliente_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.agendamento_cliente_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.agendamento_cliente_id_seq OWNER TO postgres;

--
-- TOC entry 3508 (class 0 OID 0)
-- Dependencies: 227
-- Name: agendamento_cliente_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.agendamento_cliente_id_seq OWNED BY public.agendamento_cliente.id;


--
-- TOC entry 230 (class 1259 OID 49534)
-- Name: agendamento_funcionario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.agendamento_funcionario (
    id bigint NOT NULL,
    nome character varying(35) NOT NULL,
    telefone character varying(15) NOT NULL,
    email character varying(100) NOT NULL,
    funcao character varying(50) NOT NULL,
    data_admissao date,
    foto character varying(100)
);


ALTER TABLE public.agendamento_funcionario OWNER TO postgres;

--
-- TOC entry 229 (class 1259 OID 49533)
-- Name: agendamento_funcionario_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.agendamento_funcionario_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.agendamento_funcionario_id_seq OWNER TO postgres;

--
-- TOC entry 3509 (class 0 OID 0)
-- Dependencies: 229
-- Name: agendamento_funcionario_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.agendamento_funcionario_id_seq OWNED BY public.agendamento_funcionario.id;


--
-- TOC entry 232 (class 1259 OID 49541)
-- Name: agendamento_produto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.agendamento_produto (
    id bigint NOT NULL,
    nome character varying(35) NOT NULL,
    preco character varying(10) NOT NULL,
    fornecedor character varying(50) NOT NULL,
    quantidade integer NOT NULL
);


ALTER TABLE public.agendamento_produto OWNER TO postgres;

--
-- TOC entry 231 (class 1259 OID 49540)
-- Name: agendamento_produto_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.agendamento_produto_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.agendamento_produto_id_seq OWNER TO postgres;

--
-- TOC entry 3510 (class 0 OID 0)
-- Dependencies: 231
-- Name: agendamento_produto_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.agendamento_produto_id_seq OWNED BY public.agendamento_produto.id;


--
-- TOC entry 234 (class 1259 OID 49548)
-- Name: agendamento_servico; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.agendamento_servico (
    id bigint NOT NULL,
    nome character varying(35) NOT NULL,
    descricao character varying(100) NOT NULL,
    preco character varying(10) NOT NULL
);


ALTER TABLE public.agendamento_servico OWNER TO postgres;

--
-- TOC entry 233 (class 1259 OID 49547)
-- Name: agendamento_servico_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.agendamento_servico_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.agendamento_servico_id_seq OWNER TO postgres;

--
-- TOC entry 3511 (class 0 OID 0)
-- Dependencies: 233
-- Name: agendamento_servico_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.agendamento_servico_id_seq OWNED BY public.agendamento_servico.id;


--
-- TOC entry 236 (class 1259 OID 49555)
-- Name: agendamento_servicoproduto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.agendamento_servicoproduto (
    id bigint NOT NULL,
    quantidade integer NOT NULL,
    produto_id bigint NOT NULL,
    servico_id bigint NOT NULL
);


ALTER TABLE public.agendamento_servicoproduto OWNER TO postgres;

--
-- TOC entry 235 (class 1259 OID 49554)
-- Name: agendamento_servicoproduto_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.agendamento_servicoproduto_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.agendamento_servicoproduto_id_seq OWNER TO postgres;

--
-- TOC entry 3512 (class 0 OID 0)
-- Dependencies: 235
-- Name: agendamento_servicoproduto_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.agendamento_servicoproduto_id_seq OWNED BY public.agendamento_servicoproduto.id;


--
-- TOC entry 216 (class 1259 OID 49414)
-- Name: auth_group; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.auth_group (
    id integer NOT NULL,
    name character varying(150) NOT NULL
);


ALTER TABLE public.auth_group OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 49413)
-- Name: auth_group_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.auth_group_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.auth_group_id_seq OWNER TO postgres;

--
-- TOC entry 3513 (class 0 OID 0)
-- Dependencies: 215
-- Name: auth_group_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.auth_group_id_seq OWNED BY public.auth_group.id;


--
-- TOC entry 218 (class 1259 OID 49423)
-- Name: auth_group_permissions; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.auth_group_permissions (
    id bigint NOT NULL,
    group_id integer NOT NULL,
    permission_id integer NOT NULL
);


ALTER TABLE public.auth_group_permissions OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 49422)
-- Name: auth_group_permissions_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.auth_group_permissions_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.auth_group_permissions_id_seq OWNER TO postgres;

--
-- TOC entry 3514 (class 0 OID 0)
-- Dependencies: 217
-- Name: auth_group_permissions_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.auth_group_permissions_id_seq OWNED BY public.auth_group_permissions.id;


--
-- TOC entry 214 (class 1259 OID 49407)
-- Name: auth_permission; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.auth_permission (
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    content_type_id integer NOT NULL,
    codename character varying(100) NOT NULL
);


ALTER TABLE public.auth_permission OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 49406)
-- Name: auth_permission_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.auth_permission_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.auth_permission_id_seq OWNER TO postgres;

--
-- TOC entry 3515 (class 0 OID 0)
-- Dependencies: 213
-- Name: auth_permission_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.auth_permission_id_seq OWNED BY public.auth_permission.id;


--
-- TOC entry 220 (class 1259 OID 49430)
-- Name: auth_user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.auth_user (
    id integer NOT NULL,
    password character varying(128) NOT NULL,
    last_login timestamp with time zone,
    is_superuser boolean NOT NULL,
    username character varying(150) NOT NULL,
    first_name character varying(150) NOT NULL,
    last_name character varying(150) NOT NULL,
    email character varying(254) NOT NULL,
    is_staff boolean NOT NULL,
    is_active boolean NOT NULL,
    date_joined timestamp with time zone NOT NULL
);


ALTER TABLE public.auth_user OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 49439)
-- Name: auth_user_groups; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.auth_user_groups (
    id bigint NOT NULL,
    user_id integer NOT NULL,
    group_id integer NOT NULL
);


ALTER TABLE public.auth_user_groups OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 49438)
-- Name: auth_user_groups_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.auth_user_groups_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.auth_user_groups_id_seq OWNER TO postgres;

--
-- TOC entry 3516 (class 0 OID 0)
-- Dependencies: 221
-- Name: auth_user_groups_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.auth_user_groups_id_seq OWNED BY public.auth_user_groups.id;


--
-- TOC entry 219 (class 1259 OID 49429)
-- Name: auth_user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.auth_user_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.auth_user_id_seq OWNER TO postgres;

--
-- TOC entry 3517 (class 0 OID 0)
-- Dependencies: 219
-- Name: auth_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.auth_user_id_seq OWNED BY public.auth_user.id;


--
-- TOC entry 224 (class 1259 OID 49446)
-- Name: auth_user_user_permissions; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.auth_user_user_permissions (
    id bigint NOT NULL,
    user_id integer NOT NULL,
    permission_id integer NOT NULL
);


ALTER TABLE public.auth_user_user_permissions OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 49445)
-- Name: auth_user_user_permissions_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.auth_user_user_permissions_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.auth_user_user_permissions_id_seq OWNER TO postgres;

--
-- TOC entry 3518 (class 0 OID 0)
-- Dependencies: 223
-- Name: auth_user_user_permissions_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.auth_user_user_permissions_id_seq OWNED BY public.auth_user_user_permissions.id;


--
-- TOC entry 226 (class 1259 OID 49505)
-- Name: django_admin_log; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.django_admin_log (
    id integer NOT NULL,
    action_time timestamp with time zone NOT NULL,
    object_id text,
    object_repr character varying(200) NOT NULL,
    action_flag smallint NOT NULL,
    change_message text NOT NULL,
    content_type_id integer,
    user_id integer NOT NULL,
    CONSTRAINT django_admin_log_action_flag_check CHECK ((action_flag >= 0))
);


ALTER TABLE public.django_admin_log OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 49504)
-- Name: django_admin_log_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.django_admin_log_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.django_admin_log_id_seq OWNER TO postgres;

--
-- TOC entry 3519 (class 0 OID 0)
-- Dependencies: 225
-- Name: django_admin_log_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.django_admin_log_id_seq OWNED BY public.django_admin_log.id;


--
-- TOC entry 212 (class 1259 OID 49398)
-- Name: django_content_type; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.django_content_type (
    id integer NOT NULL,
    app_label character varying(100) NOT NULL,
    model character varying(100) NOT NULL
);


ALTER TABLE public.django_content_type OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 49397)
-- Name: django_content_type_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.django_content_type_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.django_content_type_id_seq OWNER TO postgres;

--
-- TOC entry 3520 (class 0 OID 0)
-- Dependencies: 211
-- Name: django_content_type_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.django_content_type_id_seq OWNED BY public.django_content_type.id;


--
-- TOC entry 210 (class 1259 OID 49389)
-- Name: django_migrations; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.django_migrations (
    id bigint NOT NULL,
    app character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    applied timestamp with time zone NOT NULL
);


ALTER TABLE public.django_migrations OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 49388)
-- Name: django_migrations_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.django_migrations_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.django_migrations_id_seq OWNER TO postgres;

--
-- TOC entry 3521 (class 0 OID 0)
-- Dependencies: 209
-- Name: django_migrations_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.django_migrations_id_seq OWNED BY public.django_migrations.id;


--
-- TOC entry 239 (class 1259 OID 49606)
-- Name: django_session; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.django_session (
    session_key character varying(40) NOT NULL,
    session_data text NOT NULL,
    expire_date timestamp with time zone NOT NULL
);


ALTER TABLE public.django_session OWNER TO postgres;

--
-- TOC entry 3253 (class 2604 OID 49565)
-- Name: agendamento_atendimento id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_atendimento ALTER COLUMN id SET DEFAULT nextval('public.agendamento_atendimento_id_seq'::regclass);


--
-- TOC entry 3248 (class 2604 OID 49530)
-- Name: agendamento_cliente id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_cliente ALTER COLUMN id SET DEFAULT nextval('public.agendamento_cliente_id_seq'::regclass);


--
-- TOC entry 3249 (class 2604 OID 49537)
-- Name: agendamento_funcionario id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_funcionario ALTER COLUMN id SET DEFAULT nextval('public.agendamento_funcionario_id_seq'::regclass);


--
-- TOC entry 3250 (class 2604 OID 49544)
-- Name: agendamento_produto id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_produto ALTER COLUMN id SET DEFAULT nextval('public.agendamento_produto_id_seq'::regclass);


--
-- TOC entry 3251 (class 2604 OID 49551)
-- Name: agendamento_servico id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_servico ALTER COLUMN id SET DEFAULT nextval('public.agendamento_servico_id_seq'::regclass);


--
-- TOC entry 3252 (class 2604 OID 49558)
-- Name: agendamento_servicoproduto id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_servicoproduto ALTER COLUMN id SET DEFAULT nextval('public.agendamento_servicoproduto_id_seq'::regclass);


--
-- TOC entry 3241 (class 2604 OID 49417)
-- Name: auth_group id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_group ALTER COLUMN id SET DEFAULT nextval('public.auth_group_id_seq'::regclass);


--
-- TOC entry 3242 (class 2604 OID 49426)
-- Name: auth_group_permissions id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_group_permissions ALTER COLUMN id SET DEFAULT nextval('public.auth_group_permissions_id_seq'::regclass);


--
-- TOC entry 3240 (class 2604 OID 49410)
-- Name: auth_permission id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_permission ALTER COLUMN id SET DEFAULT nextval('public.auth_permission_id_seq'::regclass);


--
-- TOC entry 3243 (class 2604 OID 49433)
-- Name: auth_user id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user ALTER COLUMN id SET DEFAULT nextval('public.auth_user_id_seq'::regclass);


--
-- TOC entry 3244 (class 2604 OID 49442)
-- Name: auth_user_groups id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_groups ALTER COLUMN id SET DEFAULT nextval('public.auth_user_groups_id_seq'::regclass);


--
-- TOC entry 3245 (class 2604 OID 49449)
-- Name: auth_user_user_permissions id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_user_permissions ALTER COLUMN id SET DEFAULT nextval('public.auth_user_user_permissions_id_seq'::regclass);


--
-- TOC entry 3246 (class 2604 OID 49508)
-- Name: django_admin_log id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_admin_log ALTER COLUMN id SET DEFAULT nextval('public.django_admin_log_id_seq'::regclass);


--
-- TOC entry 3239 (class 2604 OID 49401)
-- Name: django_content_type id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_content_type ALTER COLUMN id SET DEFAULT nextval('public.django_content_type_id_seq'::regclass);


--
-- TOC entry 3238 (class 2604 OID 49392)
-- Name: django_migrations id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_migrations ALTER COLUMN id SET DEFAULT nextval('public.django_migrations_id_seq'::regclass);


--
-- TOC entry 3500 (class 0 OID 49562)
-- Dependencies: 238
-- Data for Name: agendamento_atendimento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.agendamento_atendimento VALUES (1, '2022-02-10', '14:00:00', 'realizado', 'Volta dia 10/03 para reavaliação', 3, 3, 3);
INSERT INTO public.agendamento_atendimento VALUES (2, '2022-02-24', '10:00:00', 'agendado', 'Primeira vez', 2, 1, 2);
INSERT INTO public.agendamento_atendimento VALUES (3, '2022-02-08', '11:00:00', 'cancelado', 'Aguardando cliente remarcar', 1, 2, 1);


--
-- TOC entry 3490 (class 0 OID 49527)
-- Dependencies: 228
-- Data for Name: agendamento_cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.agendamento_cliente VALUES (1, 'Miguel', 'rua tal', '(55) 99999-9999', 'miguel@email', 'clientes/user.png');
INSERT INTO public.agendamento_cliente VALUES (2, 'Helena', 'rua tal', '(55) 99999-9999', 'helena@email.com', 'clientes/user_ZmQD0bf.png');
INSERT INTO public.agendamento_cliente VALUES (3, 'Alice', 'rua tal', '(55) 99999-9999', 'alice@email', 'clientes/user_beddj8j.png');


--
-- TOC entry 3492 (class 0 OID 49534)
-- Dependencies: 230
-- Data for Name: agendamento_funcionario; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.agendamento_funcionario VALUES (1, 'Laura', '(55) 98888-8888', 'laura@email', 'Atendente', '2022-01-10', 'funcionarios/user.png');
INSERT INTO public.agendamento_funcionario VALUES (2, 'Maria', '(55) 98888-8888', 'maria@email', 'Estética facial', '2021-08-02', 'funcionarios/user_ZTA2a4t.png');
INSERT INTO public.agendamento_funcionario VALUES (3, 'Heloísa', '(55) 98888-8888', 'heloisa@email.com', 'Terapia capitar', '2021-08-02', 'funcionarios/user_3okUxHa.png');


--
-- TOC entry 3494 (class 0 OID 49541)
-- Dependencies: 232
-- Data for Name: agendamento_produto; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.agendamento_produto VALUES (1, 'Dermaroller', '20,00', 'Lojas Americanas', 5);
INSERT INTO public.agendamento_produto VALUES (2, 'Ácido hialurônico', '359,00', 'Derm Shop', 10);
INSERT INTO public.agendamento_produto VALUES (3, 'Creme Reduxel Slim', '160,00', 'Casas Bahia', 20);


--
-- TOC entry 3496 (class 0 OID 49548)
-- Dependencies: 234
-- Data for Name: agendamento_servico; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.agendamento_servico VALUES (1, 'Microagulhamento', 'Estimula a produção de colágeno', '399,00');
INSERT INTO public.agendamento_servico VALUES (2, 'Skinbooster', 'Resultado superior aos cremes noturnos', '750,00');
INSERT INTO public.agendamento_servico VALUES (3, 'Massagem modeladora', 'Restaura a saúde e bem estar', '150,00');


--
-- TOC entry 3498 (class 0 OID 49555)
-- Dependencies: 236
-- Data for Name: agendamento_servicoproduto; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.agendamento_servicoproduto VALUES (1, 1, 3, 3);
INSERT INTO public.agendamento_servicoproduto VALUES (2, 1, 2, 2);
INSERT INTO public.agendamento_servicoproduto VALUES (3, 1, 1, 1);


--
-- TOC entry 3478 (class 0 OID 49414)
-- Dependencies: 216
-- Data for Name: auth_group; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3480 (class 0 OID 49423)
-- Dependencies: 218
-- Data for Name: auth_group_permissions; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3476 (class 0 OID 49407)
-- Dependencies: 214
-- Data for Name: auth_permission; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.auth_permission VALUES (1, 'Can add log entry', 1, 'add_logentry');
INSERT INTO public.auth_permission VALUES (2, 'Can change log entry', 1, 'change_logentry');
INSERT INTO public.auth_permission VALUES (3, 'Can delete log entry', 1, 'delete_logentry');
INSERT INTO public.auth_permission VALUES (4, 'Can view log entry', 1, 'view_logentry');
INSERT INTO public.auth_permission VALUES (5, 'Can add permission', 2, 'add_permission');
INSERT INTO public.auth_permission VALUES (6, 'Can change permission', 2, 'change_permission');
INSERT INTO public.auth_permission VALUES (7, 'Can delete permission', 2, 'delete_permission');
INSERT INTO public.auth_permission VALUES (8, 'Can view permission', 2, 'view_permission');
INSERT INTO public.auth_permission VALUES (9, 'Can add group', 3, 'add_group');
INSERT INTO public.auth_permission VALUES (10, 'Can change group', 3, 'change_group');
INSERT INTO public.auth_permission VALUES (11, 'Can delete group', 3, 'delete_group');
INSERT INTO public.auth_permission VALUES (12, 'Can view group', 3, 'view_group');
INSERT INTO public.auth_permission VALUES (13, 'Can add user', 4, 'add_user');
INSERT INTO public.auth_permission VALUES (14, 'Can change user', 4, 'change_user');
INSERT INTO public.auth_permission VALUES (15, 'Can delete user', 4, 'delete_user');
INSERT INTO public.auth_permission VALUES (16, 'Can view user', 4, 'view_user');
INSERT INTO public.auth_permission VALUES (17, 'Can add content type', 5, 'add_contenttype');
INSERT INTO public.auth_permission VALUES (18, 'Can change content type', 5, 'change_contenttype');
INSERT INTO public.auth_permission VALUES (19, 'Can delete content type', 5, 'delete_contenttype');
INSERT INTO public.auth_permission VALUES (20, 'Can view content type', 5, 'view_contenttype');
INSERT INTO public.auth_permission VALUES (21, 'Can add session', 6, 'add_session');
INSERT INTO public.auth_permission VALUES (22, 'Can change session', 6, 'change_session');
INSERT INTO public.auth_permission VALUES (23, 'Can delete session', 6, 'delete_session');
INSERT INTO public.auth_permission VALUES (24, 'Can view session', 6, 'view_session');
INSERT INTO public.auth_permission VALUES (25, 'Can add Cliente', 7, 'add_cliente');
INSERT INTO public.auth_permission VALUES (26, 'Can change Cliente', 7, 'change_cliente');
INSERT INTO public.auth_permission VALUES (27, 'Can delete Cliente', 7, 'delete_cliente');
INSERT INTO public.auth_permission VALUES (28, 'Can view Cliente', 7, 'view_cliente');
INSERT INTO public.auth_permission VALUES (29, 'Can add Funcionário', 8, 'add_funcionario');
INSERT INTO public.auth_permission VALUES (30, 'Can change Funcionário', 8, 'change_funcionario');
INSERT INTO public.auth_permission VALUES (31, 'Can delete Funcionário', 8, 'delete_funcionario');
INSERT INTO public.auth_permission VALUES (32, 'Can view Funcionário', 8, 'view_funcionario');
INSERT INTO public.auth_permission VALUES (33, 'Can add Produto', 9, 'add_produto');
INSERT INTO public.auth_permission VALUES (34, 'Can change Produto', 9, 'change_produto');
INSERT INTO public.auth_permission VALUES (35, 'Can delete Produto', 9, 'delete_produto');
INSERT INTO public.auth_permission VALUES (36, 'Can view Produto', 9, 'view_produto');
INSERT INTO public.auth_permission VALUES (37, 'Can add Serviço', 10, 'add_servico');
INSERT INTO public.auth_permission VALUES (38, 'Can change Serviço', 10, 'change_servico');
INSERT INTO public.auth_permission VALUES (39, 'Can delete Serviço', 10, 'delete_servico');
INSERT INTO public.auth_permission VALUES (40, 'Can view Serviço', 10, 'view_servico');
INSERT INTO public.auth_permission VALUES (41, 'Can add servico produto', 11, 'add_servicoproduto');
INSERT INTO public.auth_permission VALUES (42, 'Can change servico produto', 11, 'change_servicoproduto');
INSERT INTO public.auth_permission VALUES (43, 'Can delete servico produto', 11, 'delete_servicoproduto');
INSERT INTO public.auth_permission VALUES (44, 'Can view servico produto', 11, 'view_servicoproduto');
INSERT INTO public.auth_permission VALUES (45, 'Can add Consulta', 12, 'add_atendimento');
INSERT INTO public.auth_permission VALUES (46, 'Can change Consulta', 12, 'change_atendimento');
INSERT INTO public.auth_permission VALUES (47, 'Can delete Consulta', 12, 'delete_atendimento');
INSERT INTO public.auth_permission VALUES (48, 'Can view Consulta', 12, 'view_atendimento');


--
-- TOC entry 3482 (class 0 OID 49430)
-- Dependencies: 220
-- Data for Name: auth_user; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3484 (class 0 OID 49439)
-- Dependencies: 222
-- Data for Name: auth_user_groups; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3486 (class 0 OID 49446)
-- Dependencies: 224
-- Data for Name: auth_user_user_permissions; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3488 (class 0 OID 49505)
-- Dependencies: 226
-- Data for Name: django_admin_log; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3474 (class 0 OID 49398)
-- Dependencies: 212
-- Data for Name: django_content_type; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.django_content_type VALUES (1, 'admin', 'logentry');
INSERT INTO public.django_content_type VALUES (2, 'auth', 'permission');
INSERT INTO public.django_content_type VALUES (3, 'auth', 'group');
INSERT INTO public.django_content_type VALUES (4, 'auth', 'user');
INSERT INTO public.django_content_type VALUES (5, 'contenttypes', 'contenttype');
INSERT INTO public.django_content_type VALUES (6, 'sessions', 'session');
INSERT INTO public.django_content_type VALUES (7, 'agendamento', 'cliente');
INSERT INTO public.django_content_type VALUES (8, 'agendamento', 'funcionario');
INSERT INTO public.django_content_type VALUES (9, 'agendamento', 'produto');
INSERT INTO public.django_content_type VALUES (10, 'agendamento', 'servico');
INSERT INTO public.django_content_type VALUES (11, 'agendamento', 'servicoproduto');
INSERT INTO public.django_content_type VALUES (12, 'agendamento', 'atendimento');


--
-- TOC entry 3472 (class 0 OID 49389)
-- Dependencies: 210
-- Data for Name: django_migrations; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.django_migrations VALUES (1, 'contenttypes', '0001_initial', '2022-02-13 16:45:02.403988-03');
INSERT INTO public.django_migrations VALUES (2, 'auth', '0001_initial', '2022-02-13 16:45:02.955243-03');
INSERT INTO public.django_migrations VALUES (3, 'admin', '0001_initial', '2022-02-13 16:45:03.043188-03');
INSERT INTO public.django_migrations VALUES (4, 'admin', '0002_logentry_remove_auto_add', '2022-02-13 16:45:03.064175-03');
INSERT INTO public.django_migrations VALUES (5, 'admin', '0003_logentry_add_action_flag_choices', '2022-02-13 16:45:03.085166-03');
INSERT INTO public.django_migrations VALUES (6, 'agendamento', '0001_initial', '2022-02-13 16:45:03.293409-03');
INSERT INTO public.django_migrations VALUES (7, 'contenttypes', '0002_remove_content_type_name', '2022-02-13 16:45:03.524076-03');
INSERT INTO public.django_migrations VALUES (8, 'auth', '0002_alter_permission_name_max_length', '2022-02-13 16:45:03.537982-03');
INSERT INTO public.django_migrations VALUES (9, 'auth', '0003_alter_user_email_max_length', '2022-02-13 16:45:03.551142-03');
INSERT INTO public.django_migrations VALUES (10, 'auth', '0004_alter_user_username_opts', '2022-02-13 16:45:03.564134-03');
INSERT INTO public.django_migrations VALUES (11, 'auth', '0005_alter_user_last_login_null', '2022-02-13 16:45:03.57917-03');
INSERT INTO public.django_migrations VALUES (12, 'auth', '0006_require_contenttypes_0002', '2022-02-13 16:45:03.583178-03');
INSERT INTO public.django_migrations VALUES (13, 'auth', '0007_alter_validators_add_error_messages', '2022-02-13 16:45:03.595147-03');
INSERT INTO public.django_migrations VALUES (14, 'auth', '0008_alter_user_username_max_length', '2022-02-13 16:45:03.69492-03');
INSERT INTO public.django_migrations VALUES (15, 'auth', '0009_alter_user_last_name_max_length', '2022-02-13 16:45:03.707911-03');
INSERT INTO public.django_migrations VALUES (16, 'auth', '0010_alter_group_name_max_length', '2022-02-13 16:45:03.723947-03');
INSERT INTO public.django_migrations VALUES (17, 'auth', '0011_update_proxy_permissions', '2022-02-13 16:45:03.741537-03');
INSERT INTO public.django_migrations VALUES (18, 'auth', '0012_alter_user_first_name_max_length', '2022-02-13 16:45:03.757527-03');
INSERT INTO public.django_migrations VALUES (19, 'sessions', '0001_initial', '2022-02-13 16:45:03.790505-03');
INSERT INTO public.django_migrations VALUES (20, 'agendamento', '0002_alter_atendimento_situacao_and_more', '2022-02-14 16:43:17.371531-03');


--
-- TOC entry 3501 (class 0 OID 49606)
-- Dependencies: 239
-- Data for Name: django_session; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3522 (class 0 OID 0)
-- Dependencies: 237
-- Name: agendamento_atendimento_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.agendamento_atendimento_id_seq', 4, true);


--
-- TOC entry 3523 (class 0 OID 0)
-- Dependencies: 227
-- Name: agendamento_cliente_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.agendamento_cliente_id_seq', 4, true);


--
-- TOC entry 3524 (class 0 OID 0)
-- Dependencies: 229
-- Name: agendamento_funcionario_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.agendamento_funcionario_id_seq', 4, true);


--
-- TOC entry 3525 (class 0 OID 0)
-- Dependencies: 231
-- Name: agendamento_produto_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.agendamento_produto_id_seq', 3, true);


--
-- TOC entry 3526 (class 0 OID 0)
-- Dependencies: 233
-- Name: agendamento_servico_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.agendamento_servico_id_seq', 4, true);


--
-- TOC entry 3527 (class 0 OID 0)
-- Dependencies: 235
-- Name: agendamento_servicoproduto_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.agendamento_servicoproduto_id_seq', 4, true);


--
-- TOC entry 3528 (class 0 OID 0)
-- Dependencies: 215
-- Name: auth_group_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.auth_group_id_seq', 1, false);


--
-- TOC entry 3529 (class 0 OID 0)
-- Dependencies: 217
-- Name: auth_group_permissions_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.auth_group_permissions_id_seq', 1, false);


--
-- TOC entry 3530 (class 0 OID 0)
-- Dependencies: 213
-- Name: auth_permission_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.auth_permission_id_seq', 48, true);


--
-- TOC entry 3531 (class 0 OID 0)
-- Dependencies: 221
-- Name: auth_user_groups_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.auth_user_groups_id_seq', 1, false);


--
-- TOC entry 3532 (class 0 OID 0)
-- Dependencies: 219
-- Name: auth_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.auth_user_id_seq', 1, false);


--
-- TOC entry 3533 (class 0 OID 0)
-- Dependencies: 223
-- Name: auth_user_user_permissions_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.auth_user_user_permissions_id_seq', 1, false);


--
-- TOC entry 3534 (class 0 OID 0)
-- Dependencies: 225
-- Name: django_admin_log_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.django_admin_log_id_seq', 1, false);


--
-- TOC entry 3535 (class 0 OID 0)
-- Dependencies: 211
-- Name: django_content_type_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.django_content_type_id_seq', 12, true);


--
-- TOC entry 3536 (class 0 OID 0)
-- Dependencies: 209
-- Name: django_migrations_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.django_migrations_id_seq', 20, true);


--
-- TOC entry 3312 (class 2606 OID 49567)
-- Name: agendamento_atendimento agendamento_atendimento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_atendimento
    ADD CONSTRAINT agendamento_atendimento_pkey PRIMARY KEY (id);


--
-- TOC entry 3298 (class 2606 OID 49532)
-- Name: agendamento_cliente agendamento_cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_cliente
    ADD CONSTRAINT agendamento_cliente_pkey PRIMARY KEY (id);


--
-- TOC entry 3300 (class 2606 OID 49539)
-- Name: agendamento_funcionario agendamento_funcionario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_funcionario
    ADD CONSTRAINT agendamento_funcionario_pkey PRIMARY KEY (id);


--
-- TOC entry 3302 (class 2606 OID 49546)
-- Name: agendamento_produto agendamento_produto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_produto
    ADD CONSTRAINT agendamento_produto_pkey PRIMARY KEY (id);


--
-- TOC entry 3304 (class 2606 OID 49553)
-- Name: agendamento_servico agendamento_servico_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_servico
    ADD CONSTRAINT agendamento_servico_pkey PRIMARY KEY (id);


--
-- TOC entry 3306 (class 2606 OID 49560)
-- Name: agendamento_servicoproduto agendamento_servicoproduto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_servicoproduto
    ADD CONSTRAINT agendamento_servicoproduto_pkey PRIMARY KEY (id);


--
-- TOC entry 3267 (class 2606 OID 49604)
-- Name: auth_group auth_group_name_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_group
    ADD CONSTRAINT auth_group_name_key UNIQUE (name);


--
-- TOC entry 3272 (class 2606 OID 49462)
-- Name: auth_group_permissions auth_group_permissions_group_id_permission_id_0cd325b0_uniq; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_group_permissions
    ADD CONSTRAINT auth_group_permissions_group_id_permission_id_0cd325b0_uniq UNIQUE (group_id, permission_id);


--
-- TOC entry 3275 (class 2606 OID 49428)
-- Name: auth_group_permissions auth_group_permissions_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_group_permissions
    ADD CONSTRAINT auth_group_permissions_pkey PRIMARY KEY (id);


--
-- TOC entry 3269 (class 2606 OID 49419)
-- Name: auth_group auth_group_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_group
    ADD CONSTRAINT auth_group_pkey PRIMARY KEY (id);


--
-- TOC entry 3262 (class 2606 OID 49453)
-- Name: auth_permission auth_permission_content_type_id_codename_01ab375a_uniq; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_permission
    ADD CONSTRAINT auth_permission_content_type_id_codename_01ab375a_uniq UNIQUE (content_type_id, codename);


--
-- TOC entry 3264 (class 2606 OID 49412)
-- Name: auth_permission auth_permission_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_permission
    ADD CONSTRAINT auth_permission_pkey PRIMARY KEY (id);


--
-- TOC entry 3283 (class 2606 OID 49444)
-- Name: auth_user_groups auth_user_groups_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_groups
    ADD CONSTRAINT auth_user_groups_pkey PRIMARY KEY (id);


--
-- TOC entry 3286 (class 2606 OID 49477)
-- Name: auth_user_groups auth_user_groups_user_id_group_id_94350c0c_uniq; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_groups
    ADD CONSTRAINT auth_user_groups_user_id_group_id_94350c0c_uniq UNIQUE (user_id, group_id);


--
-- TOC entry 3277 (class 2606 OID 49435)
-- Name: auth_user auth_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user
    ADD CONSTRAINT auth_user_pkey PRIMARY KEY (id);


--
-- TOC entry 3289 (class 2606 OID 49451)
-- Name: auth_user_user_permissions auth_user_user_permissions_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_user_permissions
    ADD CONSTRAINT auth_user_user_permissions_pkey PRIMARY KEY (id);


--
-- TOC entry 3292 (class 2606 OID 49491)
-- Name: auth_user_user_permissions auth_user_user_permissions_user_id_permission_id_14a6b632_uniq; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_user_permissions
    ADD CONSTRAINT auth_user_user_permissions_user_id_permission_id_14a6b632_uniq UNIQUE (user_id, permission_id);


--
-- TOC entry 3280 (class 2606 OID 49599)
-- Name: auth_user auth_user_username_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user
    ADD CONSTRAINT auth_user_username_key UNIQUE (username);


--
-- TOC entry 3295 (class 2606 OID 49513)
-- Name: django_admin_log django_admin_log_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_admin_log
    ADD CONSTRAINT django_admin_log_pkey PRIMARY KEY (id);


--
-- TOC entry 3257 (class 2606 OID 49405)
-- Name: django_content_type django_content_type_app_label_model_76bd3d3b_uniq; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_content_type
    ADD CONSTRAINT django_content_type_app_label_model_76bd3d3b_uniq UNIQUE (app_label, model);


--
-- TOC entry 3259 (class 2606 OID 49403)
-- Name: django_content_type django_content_type_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_content_type
    ADD CONSTRAINT django_content_type_pkey PRIMARY KEY (id);


--
-- TOC entry 3255 (class 2606 OID 49396)
-- Name: django_migrations django_migrations_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_migrations
    ADD CONSTRAINT django_migrations_pkey PRIMARY KEY (id);


--
-- TOC entry 3316 (class 2606 OID 49612)
-- Name: django_session django_session_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_session
    ADD CONSTRAINT django_session_pkey PRIMARY KEY (session_key);


--
-- TOC entry 3309 (class 1259 OID 49595)
-- Name: agendamento_atendimento_cliente_id_39140943; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX agendamento_atendimento_cliente_id_39140943 ON public.agendamento_atendimento USING btree (cliente_id);


--
-- TOC entry 3310 (class 1259 OID 49596)
-- Name: agendamento_atendimento_funcionario_id_b21149c0; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX agendamento_atendimento_funcionario_id_b21149c0 ON public.agendamento_atendimento USING btree (funcionario_id);


--
-- TOC entry 3313 (class 1259 OID 49597)
-- Name: agendamento_atendimento_servico_id_5ac9d4d1; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX agendamento_atendimento_servico_id_5ac9d4d1 ON public.agendamento_atendimento USING btree (servico_id);


--
-- TOC entry 3307 (class 1259 OID 49578)
-- Name: agendamento_servicoproduto_produto_id_abc2dce9; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX agendamento_servicoproduto_produto_id_abc2dce9 ON public.agendamento_servicoproduto USING btree (produto_id);


--
-- TOC entry 3308 (class 1259 OID 49579)
-- Name: agendamento_servicoproduto_servico_id_93629621; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX agendamento_servicoproduto_servico_id_93629621 ON public.agendamento_servicoproduto USING btree (servico_id);


--
-- TOC entry 3265 (class 1259 OID 49605)
-- Name: auth_group_name_a6ea08ec_like; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX auth_group_name_a6ea08ec_like ON public.auth_group USING btree (name varchar_pattern_ops);


--
-- TOC entry 3270 (class 1259 OID 49473)
-- Name: auth_group_permissions_group_id_b120cbf9; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX auth_group_permissions_group_id_b120cbf9 ON public.auth_group_permissions USING btree (group_id);


--
-- TOC entry 3273 (class 1259 OID 49474)
-- Name: auth_group_permissions_permission_id_84c5c92e; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX auth_group_permissions_permission_id_84c5c92e ON public.auth_group_permissions USING btree (permission_id);


--
-- TOC entry 3260 (class 1259 OID 49459)
-- Name: auth_permission_content_type_id_2f476e4b; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX auth_permission_content_type_id_2f476e4b ON public.auth_permission USING btree (content_type_id);


--
-- TOC entry 3281 (class 1259 OID 49489)
-- Name: auth_user_groups_group_id_97559544; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX auth_user_groups_group_id_97559544 ON public.auth_user_groups USING btree (group_id);


--
-- TOC entry 3284 (class 1259 OID 49488)
-- Name: auth_user_groups_user_id_6a12ed8b; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX auth_user_groups_user_id_6a12ed8b ON public.auth_user_groups USING btree (user_id);


--
-- TOC entry 3287 (class 1259 OID 49503)
-- Name: auth_user_user_permissions_permission_id_1fbb5f2c; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX auth_user_user_permissions_permission_id_1fbb5f2c ON public.auth_user_user_permissions USING btree (permission_id);


--
-- TOC entry 3290 (class 1259 OID 49502)
-- Name: auth_user_user_permissions_user_id_a95ead1b; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX auth_user_user_permissions_user_id_a95ead1b ON public.auth_user_user_permissions USING btree (user_id);


--
-- TOC entry 3278 (class 1259 OID 49600)
-- Name: auth_user_username_6821ab7c_like; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX auth_user_username_6821ab7c_like ON public.auth_user USING btree (username varchar_pattern_ops);


--
-- TOC entry 3293 (class 1259 OID 49524)
-- Name: django_admin_log_content_type_id_c4bce8eb; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX django_admin_log_content_type_id_c4bce8eb ON public.django_admin_log USING btree (content_type_id);


--
-- TOC entry 3296 (class 1259 OID 49525)
-- Name: django_admin_log_user_id_c564eba6; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX django_admin_log_user_id_c564eba6 ON public.django_admin_log USING btree (user_id);


--
-- TOC entry 3314 (class 1259 OID 49614)
-- Name: django_session_expire_date_a5c62663; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX django_session_expire_date_a5c62663 ON public.django_session USING btree (expire_date);


--
-- TOC entry 3317 (class 1259 OID 49613)
-- Name: django_session_session_key_c0390e0f_like; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX django_session_session_key_c0390e0f_like ON public.django_session USING btree (session_key varchar_pattern_ops);


--
-- TOC entry 3329 (class 2606 OID 49580)
-- Name: agendamento_atendimento agendamento_atendime_cliente_id_39140943_fk_agendamen; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_atendimento
    ADD CONSTRAINT agendamento_atendime_cliente_id_39140943_fk_agendamen FOREIGN KEY (cliente_id) REFERENCES public.agendamento_cliente(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3330 (class 2606 OID 49585)
-- Name: agendamento_atendimento agendamento_atendime_funcionario_id_b21149c0_fk_agendamen; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_atendimento
    ADD CONSTRAINT agendamento_atendime_funcionario_id_b21149c0_fk_agendamen FOREIGN KEY (funcionario_id) REFERENCES public.agendamento_funcionario(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3331 (class 2606 OID 49590)
-- Name: agendamento_atendimento agendamento_atendime_servico_id_5ac9d4d1_fk_agendamen; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_atendimento
    ADD CONSTRAINT agendamento_atendime_servico_id_5ac9d4d1_fk_agendamen FOREIGN KEY (servico_id) REFERENCES public.agendamento_servico(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3327 (class 2606 OID 49568)
-- Name: agendamento_servicoproduto agendamento_servicop_produto_id_abc2dce9_fk_agendamen; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_servicoproduto
    ADD CONSTRAINT agendamento_servicop_produto_id_abc2dce9_fk_agendamen FOREIGN KEY (produto_id) REFERENCES public.agendamento_produto(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3328 (class 2606 OID 49573)
-- Name: agendamento_servicoproduto agendamento_servicop_servico_id_93629621_fk_agendamen; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agendamento_servicoproduto
    ADD CONSTRAINT agendamento_servicop_servico_id_93629621_fk_agendamen FOREIGN KEY (servico_id) REFERENCES public.agendamento_servico(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3320 (class 2606 OID 49468)
-- Name: auth_group_permissions auth_group_permissio_permission_id_84c5c92e_fk_auth_perm; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_group_permissions
    ADD CONSTRAINT auth_group_permissio_permission_id_84c5c92e_fk_auth_perm FOREIGN KEY (permission_id) REFERENCES public.auth_permission(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3319 (class 2606 OID 49463)
-- Name: auth_group_permissions auth_group_permissions_group_id_b120cbf9_fk_auth_group_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_group_permissions
    ADD CONSTRAINT auth_group_permissions_group_id_b120cbf9_fk_auth_group_id FOREIGN KEY (group_id) REFERENCES public.auth_group(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3318 (class 2606 OID 49454)
-- Name: auth_permission auth_permission_content_type_id_2f476e4b_fk_django_co; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_permission
    ADD CONSTRAINT auth_permission_content_type_id_2f476e4b_fk_django_co FOREIGN KEY (content_type_id) REFERENCES public.django_content_type(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3322 (class 2606 OID 49483)
-- Name: auth_user_groups auth_user_groups_group_id_97559544_fk_auth_group_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_groups
    ADD CONSTRAINT auth_user_groups_group_id_97559544_fk_auth_group_id FOREIGN KEY (group_id) REFERENCES public.auth_group(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3321 (class 2606 OID 49478)
-- Name: auth_user_groups auth_user_groups_user_id_6a12ed8b_fk_auth_user_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_groups
    ADD CONSTRAINT auth_user_groups_user_id_6a12ed8b_fk_auth_user_id FOREIGN KEY (user_id) REFERENCES public.auth_user(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3324 (class 2606 OID 49497)
-- Name: auth_user_user_permissions auth_user_user_permi_permission_id_1fbb5f2c_fk_auth_perm; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_user_permissions
    ADD CONSTRAINT auth_user_user_permi_permission_id_1fbb5f2c_fk_auth_perm FOREIGN KEY (permission_id) REFERENCES public.auth_permission(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3323 (class 2606 OID 49492)
-- Name: auth_user_user_permissions auth_user_user_permissions_user_id_a95ead1b_fk_auth_user_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.auth_user_user_permissions
    ADD CONSTRAINT auth_user_user_permissions_user_id_a95ead1b_fk_auth_user_id FOREIGN KEY (user_id) REFERENCES public.auth_user(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3325 (class 2606 OID 49514)
-- Name: django_admin_log django_admin_log_content_type_id_c4bce8eb_fk_django_co; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_admin_log
    ADD CONSTRAINT django_admin_log_content_type_id_c4bce8eb_fk_django_co FOREIGN KEY (content_type_id) REFERENCES public.django_content_type(id) DEFERRABLE INITIALLY DEFERRED;


--
-- TOC entry 3326 (class 2606 OID 49519)
-- Name: django_admin_log django_admin_log_user_id_c564eba6_fk_auth_user_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.django_admin_log
    ADD CONSTRAINT django_admin_log_user_id_c564eba6_fk_auth_user_id FOREIGN KEY (user_id) REFERENCES public.auth_user(id) DEFERRABLE INITIALLY DEFERRED;


-- Completed on 2022-02-14 18:03:45

--
-- PostgreSQL database dump complete
--

