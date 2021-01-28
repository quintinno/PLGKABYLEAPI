INSERT INTO PUBLIC.TB_CATEGORIA_LIVRO (CODIGO, DESCRICAO) VALUES
(NEXTVAL ('PUBLIC.HIBERNATE_SEQUENCE'), 'Programação'),
(NEXTVAL ('PUBLIC.HIBERNATE_SEQUENCE'), 'Banco de Dados'),
(NEXTVAL ('PUBLIC.HIBERNATE_SEQUENCE'), 'Literatura'),
(NEXTVAL ('PUBLIC.HIBERNATE_SEQUENCE'), 'Infraestrutura');

INSERT INTO PUBLIC.TB_LIVRO (codigo, DATA_ATUALIZACAO_REGISTRO, DATA_CRIACAO_REGISTRO, DESCRICAO, IS_ATIVO, NOME, PRECO_UNITARIO, QUANTIDADE_ESTOQUE, SKU, URL_IMAGEM, USUARIO_ULTIMA_ALTERACAO, ID_CATEGORIA_LIVRO) VALUES 
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Web Scraping com Python: Coletando Mais Dados da web Moderna', 67.70, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/41gx74x+gdL._SX347_BO1,204,203,200_.jpg', '000.000.000-00', 1),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Estruturas de Dados e Algoritmos com JavaScript: Escreva um Código JavaScript Complexo e Eficaz Usando a Mais Recente ECMAScript ', 71.91, 10, 'LV_0002_0002', '', '000.000.000-00', 2),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Javascript e Jquery: Desenvolvimento de Interfaces web Interativas', 85.88, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/41QGA9y1LZL._SX357_BO1,204,203,200_.jpg', '000.000.000-00', 3),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Javascript e Jquery: Desenvolvimento de Interfaces web Interativas', 135.99, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/41vEGoXo1sL._SX323_BO1,204,203,200_.jpg', '000.000.000-00', 4),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Técnicas de Invasão: Aprenda as técnicas usadas por hackers em invasões reais', 47.92, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/41ZLzHFZIYL._SX311_BO1,204,203,200_.jpg', '000.000.000-00', 1),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Fundamentos de HTML5 e CSS3', 54.99, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/51lMsgv7s8L._SX357_BO1,204,203,200_.jpg', '000.000.000-00', 2),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Desenvolvendo Websites com PHP: Aprenda a Criar Websites Dinâmicos e Interativos com PHP e Bancos de Dados', 47.90, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/61AQWLbbbuL._SX347_BO1,204,203,200_.jpg', '000.000.000-00', 3),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Algoritmos Funcionais: Introdução Minimalista à Lógica de Programação Funcional Pura Aplicada à Teoria dos Conjuntos', 34.90, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/51nObPCqLcL._SX357_BO1,204,203,200_.jpg', '000.000.000-00', 4),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'React - Aprenda Praticando: Desenvolva Aplicações web Reais com uso da Biblioteca React e de Seus Módulos Auxiliares', 69.00, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/51ATqZkXSzL._SX363_BO1,204,203,200_.jpg', '000.000.000-00', 1),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Python Fluente: Programação Clara, Concisa e Eficaz', 109.99, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/51Ov4P3XiEL._SX357_BO1,204,203,200_.jpg', '000.000.000-00', 1);
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'MySQL: Comece com o principal banco de dados open source do mercado', 35.91, 10, 'LV_0002_0002', 'https://m.media-amazon.com/images/I/41sO3IBUXVL.jpg', '000.000.000-00', 2),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Oracle Database 12c Security Cookbook (English Edition)', 136.99, 10, 'LV_0002_0002', 'https://m.media-amazon.com/images/I/515kI4kRUWL.jpg', '000.000.000-00', 2),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'Manual de DevOps: Como Obter Agilidade, Confiabilidade e Segurança em Organizações Tecnológicas', 75.20, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/51HyO3cPUiL._SX351_BO1,204,203,200_.jpg', '000.000.000-00', 4),
(nextval ('public.hibernate_sequence'), NOW(), NOW(), '', true, 'O Projeto Fênix: um Romance Sobre TI, DevOps e Sobre Ajudar o seu Negócio a Vencer', 54.99, 10, 'LV_0002_0002', 'https://images-na.ssl-images-amazon.com/images/I/51QanGkqphL._SX348_BO1,204,203,200_.jpg', '000.000.000-00', 4);

