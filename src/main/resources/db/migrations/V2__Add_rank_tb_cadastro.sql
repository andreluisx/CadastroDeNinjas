-- Migration para adicionar a coluna de rank na tabela CADASTRO

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);