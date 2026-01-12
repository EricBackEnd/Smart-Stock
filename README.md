# 📦 Smart-Stock

Sistema de Controle de Estoque e Demandas com Análise Inteligente de Dados

---

## 📌 Visão Geral

O **Smart-Stock** é um sistema desenvolvido com fins **educacionais e práticos**, que simula um **produto real de mercado** voltado para empreendedores e pequenos negócios. O sistema permite o controle de estoque e vendas, aliado à **análise inteligente de dados**, gerando **insights estratégicos** para apoio à tomada de decisão.

O projeto explora tecnologias modernas amplamente utilizadas no mercado, integrando backend, frontend, banco de dados relacional e não relacional, além de conceitos de nuvem e escalabilidade.

---

## 🎯 Objetivos do Projeto

* Controlar produtos, estoque e vendas
* Analisar histórico de vendas por período
* Identificar variações e padrões de demanda
* Gerar alertas automáticos (estoque baixo e vendas atípicas)
* Sugerir reposição de produtos e ajustes de preço
* Aplicar boas práticas de arquitetura de software

---

## 🧠 Principais Funcionalidades

* Cadastro e gerenciamento de produtos
* Controle de estoque em tempo real
* Registro de vendas
* Histórico de preços
* Análise de demanda (diária, semanal e mensal)
* Geração de alertas inteligentes
* Dashboards e gráficos interativos
* Sistema multiusuário com autenticação

---

## 🏗️ Arquitetura do Sistema

O Smart-Stock adota uma **arquitetura em camadas**, baseada em **API RESTful**, garantindo organização, manutenibilidade e escalabilidade.

### Backend

* Java
* API REST versionada
* Arquitetura em camadas:

  * Controller
  * Service
  * Domain
  * Repository

### Frontend

* React (Web)
* Interface responsiva e intuitiva
* Dashboards e visualizações gráficas

---

## 🗄️ Persistência de Dados

### Oracle Database (Banco Relacional)

Utilizado como banco principal para dados transacionais e históricos:

* Usuários
* Produtos
* Estoque
* Vendas
* Itens de venda
* Histórico de preços
* Análises de demanda
* Alertas

Garante integridade, consistência e confiabilidade dos dados.

---

### Redis (Banco Não Relacional)

Utilizado como **banco complementar**, com foco em **performance e insights**, não substituindo o Oracle.

Principais usos:

* Cache de dashboards e consultas analíticas
* Armazenamento de alertas recentes e não lidos
* Métricas temporárias de demanda em tempo real
* Rankings de produtos mais vendidos

O Redis melhora significativamente a performance da aplicação e a experiência do usuário.

---

## ☁️ Infraestrutura e Nuvem

O projeto é planejado para execução em ambiente de nuvem, utilizando a **Microsoft Azure**, com foco em:

* Escalabilidade horizontal
* Ambientes separados (dev, test, prod)
* Alta disponibilidade
* Observabilidade (logs e métricas)

---

## 🔐 Segurança

* Autenticação e autorização de usuários
* Controle de acesso por perfil (roles)
* Isolamento de dados por usuário (multi-tenant)

Atende aos requisitos de segurança definidos no projeto.

---

## 📊 Observabilidade

O sistema prevê:

* Logs de aplicação
* Métricas de desempenho
* Monitoramento de erros

Esses recursos permitem análise de comportamento e suporte à evolução do sistema.

---

## 🧩 Tecnologias Utilizadas

* **Backend:** Java
* **Frontend:** React
* **Banco de Dados Relacional:** Oracle Database
* **Banco Não Relacional:** Redis
* **Nuvem:** Microsoft Azure
* **Arquitetura:** API RESTful

---

## 📚 Documentação

A documentação do projeto inclui:

* Documento de Requisitos
* Documentação do Banco de Dados
* Diagramas UML
* Definição de arquitetura

Esses materiais estão disponíveis no repositório para apoio ao estudo e entendimento do sistema.

---

## 🚀 Status do Projeto

📌 **Em desenvolvimento**

O projeto está sendo construído de forma incremental, priorizando clareza arquitetural, boas práticas e alinhamento com o objetivo educacional.

---

## 👨‍💻 Autor

Projeto desenvolvido para fins de estudo e prática de engenharia de software, integração de tecnologias e arquitetura de sistemas.

---

## 📄 Licença

Este projeto possui caráter educacional. A definição de licença pode ser ajustada conforme necessidade futura.
