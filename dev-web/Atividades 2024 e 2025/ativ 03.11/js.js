const mostrar_numeros_pares = () => {
    const resultado = document.getElementById("resultado");
    resultado.innerHTML = ""; // limpa o conteúdo anterior
    for (let i = 1; i <= 100; i++) {
        if (i % 2 === 0) {
          resultado.innerHTML += i + "<br>";
        }
    }
}

const tabuada = () => {
    const input = document.getElementById("input");
    const numero = Number(input.value);
    const resultado = document.getElementById("resultado");

    if (!numero) {
        resultado.innerHTML = "Por favor, digite um número válido.";
        return;
    } else{
        if(numero > 10 || numero < 1){
            resultado.innerHTML = "Por favor, digite um número entre 1 e 10.";
            return;
        }
    }

    resultado.innerHTML = `Tabuada de ${numero}:<br>`;
    for (let i = 1; i <= 10; i++) {
        const res = numero * i;
        resultado.innerHTML += `${numero} x ${i} = ${res}<br>`;
    }
}

const verificar_idade = () => {
    const input_idade = document.getElementById("idade");
    const idade = Number(input_idade.value);
    const resultado = document.getElementById("resultado");

    if (!idade) {
        resultado.innerHTML = "Por favor, digite uma idade válida.";
        return;
    }

    if (idade < 18) {
        resultado.innerHTML = "Você é menor de idade.";
    } else if (idade < 60) {
        resultado.innerHTML = "Você é um adulto.";
    } else {
        resultado.innerHTML = "Você é um idoso.";
    }
}

let numero_aleatorio = null;
let numero_erros = 0;
const jogar_joguinho = () => {
    const messagens_de_acerto = ['parabens! você acertou!', "otimo trabalho!", "wow, incrivel!"];
    const messagens_de_erros = ['não foi dessa vez', 'quem sabe da proxima', 'tente novamente!'];

    const input_numero = document.getElementById("numero_jogo");
    const numero = Number(input_numero.value);
    const resultado = document.getElementById("resultado");

    if (!numero) {
        resultado.innerHTML = "Por favor, digite um número válido.";
        return;
    } else{
        if(numero > 10 || numero < 1){
            resultado.innerHTML = "Por favor, digite um número entre 1 e 10.";
            return;
        }
    }

    if(!numero_aleatorio){
        numero_aleatorio = Math.floor(Math.random() * 10);
        if(numero_aleatorio == 0){
            numero_aleatorio = 1;
        }
    }    

    if (numero === numero_aleatorio) {
        let msg = null;
        
        const numero = Math.floor(Math.random() * 3) + 1;

        if (numero === 1) {
            msg = messagens_de_acerto[0];
        } else if (numero === 2) {
            msg = messagens_de_acerto[1];
        } else {
            msg = messagens_de_acerto[2];
        }

        resultado.innerHTML = msg;
        resultado.innerHTML += `<br>Erros: ${numero_erros}`;
        numero_aleatorio = null;
    } else {
        let msg = null;
        
        const numero = Math.floor(Math.random() * 3) + 1;

        if (numero === 1) {
            msg = messagens_de_erros[0];
        } else if (numero === 2) {
            msg = messagens_de_erros[1];
        } else {
            msg = messagens_de_erros[2];
        }

        numero_erros +=1;

        resultado.innerHTML = msg;
    }
}

const informar_quantidade = () => {
    const resultado = document.getElementById('resultado');
    resultado.innerHTML = '<ul>';
    const numero = Number(prompt('Quantos itens?'));
    let i = 0;
    let itens  = [];
    while(numero > i){
        let item = prompt('qual o item?');
        itens[i] = item;

        i++;
    }

   i = 0;
   while(itens.length > i){
       resultado.innerHTML += `<li>${itens[i]}</li>`;
       i++;
   }

   resultado.innerHTML += '</ul>';
}