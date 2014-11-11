// Coleções
List<String> nomes = new ArrayList<String>();
nomes.add("Kico");
nomes.add("Nanna");
nomes.add("Zé");
nomes.add("Fraude");
nomes.add("Chiquinha");

def gNomes = ["Kico", "Nanna", "Zé", "Fraude", "Chiquinha"]

Map<String, String> tipos = new HashMap<String, String>();
tipos.put("Kico", "Homem");
tipos.put("Nanna", "Mulher");
tipos.put("Fraude", "Pinscher");

println tipos.get("Kico")

def gTipos = ["Kico":"Homem", "Nanna":"Mulher", "Fraude":"Pinscher"]
gTipos.Kico

String valor = "Uma string";
if (valor != null) {
    System.out.println(valor.length());
}

gValor = null //"Uma String"
gValor?.length()

def StringInterpolada = "Sou uma string $gValor"

def StringMultiLinhas = """Sou um texto
que pode ser longo
e você vai gostar 
de ver como funciono"""