# SGC
Sistema de Gestão de Clientes
Este projeto é um sistema simples de cadastro e gerenciamento de clientes, utilizando conceitos de Programação Orientada a Objetos (POO) em Java. O sistema permite adicionar, listar, editar e excluir clientes de um arquivo de texto (clientes.txt) usando um HashMap para armazenar os dados temporariamente durante a execução.

# Funcionalidades:
Adicionar Cliente: O usuário pode adicionar um novo cliente fornecendo o ID, nome e e-mail. O cliente é armazenado no HashMap e no arquivo de texto.
Listar Clientes: Exibe todos os clientes cadastrados, mostrando o ID, nome e e-mail de cada um.
Editar Cliente: Permite editar o nome ou e-mail de um cliente existente, fornecendo o ID do cliente a ser modificado.
Excluir Cliente: Remove um cliente do sistema, deletando o cliente do HashMap e atualizando o arquivo de texto.

# Tecnologias Utilizadas:
Java: Linguagem de programação para desenvolvimento da aplicação.
BufferedReader/BufferedWriter: Para leitura e escrita de dados no arquivo de texto.
HashMap: Para armazenar os clientes em memória temporária, associando um ID único a cada cliente. 
