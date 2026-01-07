import streamlit as st
import sistema
st.title("Meu Primeiro Projeto Streamlit")

nome = st.text_input("Digite seu nome")
endereco = st.text_input("Digite seu endereço (Não inclua vírgulas!!!)")
idade = st.number_input("Digite sua idade", min_value=0, max_value=120, step=1)
dt_nascimento = st.date_input("Escolha sua data de nascimento")
tipo_cliente = st.selectbox("Selecione o tipo de cliente", ["Pessoa fisica", "Pessoa juridica"])
cadastrar_botao = st.button("Cadastrar")

if cadastrar_botao:
    sistema.cadastrar(nome, idade, endereco, dt_nascimento, tipo_cliente, st)
    