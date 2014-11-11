// A classe String não é final?
String.metaClass.digaDois = {
    return 2;
}

"Meu texto".digaDois()

/*
class Pessoa {
    String nome
    String sobrenome
    
    int tamanhoNome() {
        nome.length()
    }
    
    String nomeNome() {
        "Meu nome é $nome"
    }
}
*/
// AOP de um modo simples?
/*
Pessoa.metaClass.invokeMethod = {String name, args ->
    println "Vou invocar $name"
    metodo = delegate.metaClass.getMetaMethod(name, args)
    resultado = metodo.invoke(delegate, args)
    println "O resultado foi... $resultado"
    resultado
}

def pessoa = new Pessoa(nome:"Henrique")
pessoa.tamanhoNome()
*/