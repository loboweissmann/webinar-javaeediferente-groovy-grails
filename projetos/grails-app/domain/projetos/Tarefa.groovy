package projetos

class Tarefa {

	String nome
	Boolean pronta

	static belongsTo = [projeto:Projeto]

    static constraints = {
    }
}
