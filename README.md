# FlowMQ
Um e-commerce simplificado, com comunicação assíncrona via RabbitMQ para processar pedidos, pagamentos, notificações e controle de estoque de forma desacoplada.

1️⃣ Serviços e Responsabilidades

Serviço	Responsabilidade	Evento Publicado/Consumido
Order Service	Receber pedidos de clientes, validar e persistir	Publica PedidoCriadoEvent
Payment Service	Processar pagamentos	Consome PedidoCriadoEvent; publica PagamentoAprovadoEvent ou PagamentoReprovadoEvent
Notification Service	Notificar clientes via e-mail ou simulação	Consome PagamentoAprovadoEvent e PagamentoReprovadoEvent
Inventory Service	Atualizar estoque com base nos pedidos confirmados	Consome PagamentoAprovadoEvent

2️⃣ Fluxo de Eventos (Event-Driven)

Pedido criado: Cliente faz pedido → Order Service publica evento PedidoCriadoEvent na fila order.queue.

Processamento de pagamento: Payment Service consome PedidoCriadoEvent, valida pagamento e publica:

PagamentoAprovadoEvent → para estoque e notificação.

PagamentoReprovadoEvent → para notificação.

Atualização de estoque: Inventory Service consome PagamentoAprovadoEvent → atualiza estoque.

Notificações: Notification Service consome eventos de pagamento → envia mensagem ao cliente.

3️⃣ Arquitetura Técnica

Padrão: Event-Driven Architecture (EDA) com RabbitMQ.

Comunicação: Mensageria assíncrona via exchanges e queues.

Tecnologias:

Backend: Java + Spring Boot

Mensageria: RabbitMQ (spring-boot-starter-amqp)

Banco de dados: H2 (prototipo) ou PostgreSQL (mais realista)

Conversão de mensagens: Jackson JSON

Beans de configuração: centralizam criação de queues, exchanges, bindings e message converters.

4️⃣ Exchanges e Filas
Exchange	Tipo	Fila Destino	Routing Key
order.exchange	Direct	order.queue	order.created
order.exchange	Direct	payment.queue	order.created
payment.exchange	Direct	notification.queue	payment.status
payment.exchange	Direct	inventory.queue	payment.approved

MessageConverter: converte objetos Java em JSON automaticamente.

5️⃣ Benefícios do FlowMQ

Desacoplamento: Serviços independentes comunicam-se via eventos.

Escalabilidade: Cada serviço pode ser escalado separadamente.

Resiliência: Falhas em um serviço não travam os outros; mensagens ficam na fila até serem processadas.

Aprendizado real: Experiência com mensageria, Spring Boot e microserviços, ideal para portfólio.

6️⃣ Possíveis Evoluções

Implementar retry e dead-letter queues para mensagens falhas.

Adicionar autenticação e autorização para clientes.

Substituir H2 por PostgreSQL ou MongoDB.

Criar dashboard de monitoramento de eventos.
