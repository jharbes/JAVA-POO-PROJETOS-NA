/*

@Component 
Mais genérico, pode ser usado em qualquer tipo de classe


@Service
Pode anotar a classe onde ficam as regras de negocio


@Repository
Classes onde vao acontecer persistencia de transacoes com o banco de dados


@Controller
Classes que vao receber algum tipo de requisicao



@Autowired
Cria pontos de injecao das classes onde foram utilizados Beans, ou seja, naquele ponto havera injecao das instancias das classes, onde o spring ira criar, manipular e destruir elementos daquela classe quando for preciso.