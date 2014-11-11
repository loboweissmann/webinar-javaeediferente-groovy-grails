package projetos

class Projeto {
	String nome
	String descricao
    
	static hasMany = [tarefas:Tarefa]

    static constraints = {
    	nome nullable:false, maxSize:128
    	descricao nullable:false, maxSize:1024
    }
}
