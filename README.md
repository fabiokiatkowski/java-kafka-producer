# java-kafka-producer

# Como rodar o projeto
No diretório **configuration** execute o comando:

`docker-compose up --build -d`

ou execute o arquivo docker-compose.yaml que esta neste diretório, ele irá subir as imagens do Zookeeper, Kafka e MongoDB

# Criando manualmente o tópico no Kafka
Para criar o tópico manualmente, após rodar o comando para iniciar as imagens, rode no diretório **configuration**:

`docker-compose exec kafka /bin/sh -c "kafka-topics --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic local_order_topic"`

OBS: Acho que a aplicação criará automaticamente, porém caso não o comando esta ai.

# Subindo o projeto
Instale as dependências do maven e suba o projeto normalmente.
