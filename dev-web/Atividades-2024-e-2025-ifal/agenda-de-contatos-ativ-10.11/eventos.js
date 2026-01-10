let contatos = [];
const lista_contatos_div = document.querySelector('.lista_contatos');

const adicionar_contato = () => {
    const nome = prompt("Qual é o seu nome?")
    const email = prompt("Qual é o seu email?")
    const numero = prompt("Qual é o seu numero?")

    const novo_contato = {
        nome : nome,
        email : email,
        numero : numero,
        id : contatos.length > 0 ? contatos.length + 1: 1
    }
    contatos.push(novo_contato)
    mostrar_contatos()
}

const mostrar_contatos = () => {
    lista_contatos_div.innerHTML = ''
    for (contato of contatos){
        lista_contatos_div.innerHTML += `
        <div class="contato" id="contato-${contato.id}">
            <p>${contato.nome}</p>
            <p>Email: ${contato.email}</p>
            <p>Numero: ${contato.numero}</p>
            <p>ID: ${contato.id}</p>
        </div>
        `
    }
}

const excluir_contato = () => {
    const id_contato = parseInt(prompt("Qual o ID do contato que deseja excluir?"))

    i = 0;
    let achou_contato = false;

    while (achou_contato == false){
        if (contatos[i].id === id_contato){
            contatos.splice(i, 1)

            organizar_ids()
            
            mostrar_contatos()
            achou_contato = true
        }else{
            i++
        }
    }
}

const organizar_ids = () => {
    for (let i = 0; i < contatos.length; i++){
        if (contatos[i].id != i + 1){ // se tal id  de indice tal for diferente do mesmo, mudar seu id para o respectivo indice 
            contatos[i].id = i + 1
        }
    }
}