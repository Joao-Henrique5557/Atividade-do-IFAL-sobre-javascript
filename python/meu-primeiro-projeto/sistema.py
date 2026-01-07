def cadastrar(nome, idade, endereco, dt_nascimento, tipo_cliente, st):
    if idade >= 18:
        if nome != "" and endereco != "" and tipo_cliente != "" and dt_nascimento != "" and idade != 0:
            with open("base_de_dados.csv", "a", encoding="utf-8") as arquivo:
                arquivo.write(f"Seja bem vindo {nome}!, idade: {idade}, endereço: {endereco}, data de nascimento: {dt_nascimento}, tipo de cliente: {tipo_cliente}\n")
            print("Cadastro realizado com sucesso!")
            st.success("Cadastro realizado com sucesso!")
        else:
            st.warning("Por favor, preencha todos os campos antes de cadastrar.")
    else:
        st.warning("Cadastro não permitido para menores de 18 anos.")