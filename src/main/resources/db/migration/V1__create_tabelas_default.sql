CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE endereco (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    cep VARCHAR(10) NOT NULL,
    logradouro VARCHAR(200) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    complemento VARCHAR(200) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    uf VARCHAR(2) NOT NULL,
    ddd VARCHAR(2) NOT NULL
);

--CREATE TABLE atleta (
  --  id UUID get_random_uuid() PRIMARY KEY,
    --nome VARCHAR(50) NOT NULL,
    --email VARCHAR(50) NOT NULL,
    --telefone VARCHAR(50) NOT NULL,
    --endereco_id
--);