

CREATE TABLE atleta (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telefone VARCHAR(50) NOT NULL,
    endereco_id UUID,

    FOREIGN KEY (endereco_id) REFERENCES endereco(id) ON DELETE CASCADE
);

CREATE TABLE local (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    esporte VARCHAR(50) NOT NULL,
    endereco_id UUID,

    FOREIGN KEY (endereco_id) REFERENCES endereco(id) ON DELETE CASCADE
);

CREATE TABLE partida (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    dataHoraParida TIMESTAMP NOT NULL,
    dataHoraCriacao TIMESTAMP NOT NULL,
    quantidadeJogadores INT NOT NULL,
    local_id UUID NOT NULL,

    FOREIGN KEY (local_id) REFERENCES local(id) ON DELETE CASCADE
);

CREATE TABLE partida_atleta (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    partida_id UUID NOT NULL,
    atleta_id UUID NOT NULL,

    FOREIGN KEY (partida_id) REFERENCES partida(id) ON DELETE CASCADE,
    FOREIGN KEY (atleta_id) REFERENCES atleta(id) ON DELETE CASCADE
);