let contatos = [];
const lista_contatos_div = document.querySelector('.lista_contatos');

// Funções para adicionar, excluir e atualizar contatos

const adicionar_contato = () => {
    const nome = prompt('Qual é o nome?');
    const telefone = prompt('Qual é o telefone?');
    const e_mail = prompt('Qual é o e-mail?');

    if(!nome || !telefone || !e_mail){ // verifica se algum dos campos está vazio
        alert('Todos os campos são obrigatórios!');
        return;
    }

    const novoContato = {
        nome_contato : nome,
        novo_telefone: telefone,
        novo_e_mail: e_mail,
        id_novo_contato: contatos.length + 1
    };

    contatos.push(novoContato); // adiciona o novo contato ao array de contatos
    atualizar_lista_contatos(); // atualiza a lista de contatos exibida
};

const excluir_contato = () =>{
    if(contatos.length === 0){ // verifica se a lista de contatos está vazia
        alert('A lista de contatos está vazia!');
        return;
    }

    const qual_excluir = Number(prompt('qual é o id que voce quer excluir?'));

    for (const contato of contatos) { // verificar se o id existe
        if(contato.id_novo_contato === qual_excluir){
            contatos = contatos.filter(c => c.id_novo_contato !== qual_excluir);
            atualizar_lista_contatos();
            return;
        } else{
            alert('ID não encontrado!');
            return;
        }
    }

    contatos = contatos.filter(contato => contato.id_novo_contato !== qual_excluir); // filtra o array para remover o contato com o id especificado
};

const atualizar_lista_contatos = () => {
    lista_contatos_div.innerHTML = ''; // limpa a lista de contatos antes de atualizar
    if(contatos.length > 0){ // se contatos não estiver vazio
        for (const contato of contatos) {
            lista_contatos_div.innerHTML += `<div class="contato"><p>Nome: ${contato.nome_contato}</p><p>Numero: ${contato.novo_telefone}</p><p>Email: ${contato.novo_e_mail}</p><p>ID: ${contato.id_novo_contato}</p></div>`;
        }
    }
}