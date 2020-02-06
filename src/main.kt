import ui.MainForm

fun main(){
    MainForm()

}

fun validate(name : String, phone : String){     //Funcao de validação de campos vazios

    if (name == "") throw Exception ("O campo nome não pode ser vazio! ")      // Os 2 campos vão extourar uma excessão
    if (phone == "") throw Exception ("O campo telefone não pode ser vazio! ")

}

fun validateDelete(name : String, phone : String) {

    if (name == "" || phone == "") throw Exception ("É nescessario selecionar um contato antes de remover!")

}

fun save(name : String, phone : String){

    validate(name,phone)

}

fun delete(name : String, phone : String){

    validateDelete(name, phone)

}
