 # lições de desenvolvimento azure <img src="https://logos-world.net/wp-content/uploads/2021/03/Azure-Logo-2020-present.png" alt="Logo" width="200" align="right">

-> A computação em nuvem é uma tecnologia que permite o armazenamento, processamento e acesso a dados e aplicativos por meio da internet, eliminando a necessidade de infraestrutura física local.

Domínio do objetivo: Seu principal objetivo é oferecer flexibilidade, escalabilidade e eficiência, permitindo que empresas e usuários acessem recursos computacionais sob demanda, pagando apenas pelo que utilizam. É amplamente usada para hospedagem de sites, backup de dados, desenvolvimento de software e análise de big data, entre outros.

Comparação dos modelos de nuvem: Existem três modelos principais:

Nuvem Pública: Recursos compartilhados entre vários usuários, gerenciados por provedores como AWS, Google Cloud ou Azure, ideal para custo-benefício e escalabilidade.
Nuvem Privada: Infraestrutura dedicada a uma única organização, oferecendo maior controle e segurança, mas com custos mais altos.
Nuvem Híbrida: Combina pública e privada, permitindo flexibilidade para mover dados entre elas conforme a necessidade, equilibrando custo e segurança.
Comparação entre Capex e Opex:

Capex (Capital Expenditure): Refere-se a investimentos iniciais em hardware e infraestrutura física, comuns em modelos tradicionais, com altos custos fixos e depreciação ao longo do tempo.
Opex (Operational Expenditure): Predominante na computação em nuvem, envolve custos operacionais contínuos, como assinaturas de serviços, oferecendo maior flexibilidade e eliminando a necessidade de grandes investimentos iniciais.
Em resumo, a computação em nuvem transforma a forma como os recursos de TI são consumidos, priorizando agilidade e redução de custos fixos em favor de um modelo mais adaptável.

Infraestrutura como Serviço (IaaS): Fornece recursos básicos de computação, como servidores virtuais, armazenamento e redes. O usuário gerencia sistemas operacionais, aplicativos e configurações, enquanto o provedor cuida da infraestrutura física. Exemplo: Amazon Web Services (AWS) EC2. Oferece alta flexibilidade, mas exige mais gerenciamento pelo usuário.
Plataforma como Serviço (PaaS): Oferece uma plataforma pronta para desenvolvimento e implantação de aplicativos, incluindo sistemas operacionais e ferramentas de desenvolvimento. O provedor gerencia a infraestrutura e o sistema operacional, permitindo que o usuário foque no código e nos aplicativos. Exemplo: Google App Engine. Ideal para rapidez no desenvolvimento.
Software como Serviço (SaaS): Entrega aplicativos prontos para uso, acessados pela internet. O provedor gerencia tudo — infraestrutura, software e atualizações —, enquanto o usuário apenas utiliza o serviço. Exemplo: Google Workspace ou Microsoft 365. Exige o menor esforço de gerenciamento pelo usuário.
Comparação:
Responsabilidade: IaaS dá mais controle (e trabalho) ao usuário; PaaS equilibra controle e facilidade; SaaS é quase todo gerenciado pelo provedor.
Flexibilidade: IaaS é o mais flexível, seguido por PaaS; SaaS é o menos flexível, pois é pré-configurado.
Uso: IaaS para infraestrutura personalizada, PaaS para desenvolvimento ágil, SaaS para soluções prontas.
Esses modelos atendem a diferentes necessidades, desde controle total até conveniência máxima, dentro do conceito de responsabilidade compartilhada na nuvem.


# Criando Máquinas Virtuais no Microsoft Azure 

## Índice

1. [Introdução](#introdução)
2. [Acessando o Portal do Azure](#acessando-o-portal-do-azure)
3. [Criando uma Máquina Virtual](#criando-uma-máquina-virtual)
   - [Passo 1: Acessar a Seção de Máquinas Virtuais](#passo-1-acessar-a-seção-de-máquinas-virtuais)
   - [Passo 2: Configurações Básicas](#passo-2-configurações-básicas)
   - [Passo 3: Tamanho da Máquina Virtual](#passo-3-tamanho-da-máquina-virtual)
   - [Passo 4: Configurações de Disco](#passo-4-configurações-de-disco)
   - [Passo 5: Configurações de Rede](#passo-5-configurações-de-rede)
   - [Passo 6: Revisão e Criação](#passo-6-revisão-e-criação)
4. [Gerenciando a Máquina Virtual](#gerenciando-a-máquina-virtual)
5. [Conclusão](#conclusão)

## Introdução

As Máquinas Virtuais no Azure permitem que você execute aplicações em ambientes isolados, simulando servidores físicos. Este guia explica como criar uma VM a partir do zero.

## Acessando o Portal do Azure

1. **Acesse o portal do Azure**:
   - Visite o site [https://portal.azure.com](https://portal.azure.com).
   - Insira suas credenciais (email e senha) para fazer login.

## Criando uma Máquina Virtual

### Passo 1: Acessar a Seção de Máquinas Virtuais

1. No painel de navegação à esquerda, clique em "Todos os Serviços".
2. No campo de busca, digite "Máquinas Virtuais" e selecione a opção "Máquinas Virtuais" em "Computação".
3. Clique em "Adicionar" ou "Criar" para iniciar o processo de criação de uma nova máquina virtual.

### Passo 2: Configurações Básicas

1. **Assinatura e Grupo de Recursos**:
   - Selecione a assinatura correta e um grupo de recursos existente ou crie um novo.

2. **Detalhes da Instância**:
   - Insira o nome da máquina virtual.
   - Escolha a região onde a VM será hospedada.
   - Selecione a disponibilidade, se necessário (opcional).

3. **Imagens e Sistema Operacional**:
   - Selecione a imagem do sistema operacional que deseja usar (por exemplo, Windows Server, Ubuntu, etc.).

4. **Tipo de Autenticação**:
   - Escolha entre senha ou chave SSH para autenticação.

### Passo 3: Tamanho da Máquina Virtual

1. Escolha o tamanho da máquina virtual com base nos requisitos de CPU, memória e armazenamento. Azure oferece várias opções, desde VMs pequenas e econômicas até instâncias maiores e mais potentes.

### Passo 4: Configurações de Disco

1. Selecione o tipo de disco de SO (SSD, HDD).
2. Adicione discos adicionais, se necessário, para armazenamento de dados.

### Passo 5: Configurações de Rede

1. **Rede Virtual e Sub-rede**:
   - Escolha uma rede virtual existente ou crie uma nova.
   - Selecione a sub-rede desejada.

2. **Endereço IP Público**:
   - Escolha se a VM terá um endereço IP público.

3. **Grupo de Segurança de Rede (Firewall)**:
   - Configure regras de entrada e saída, como permitir acesso via RDP (para Windows) ou SSH (para Linux).

### Passo 6: Revisão e Criação

1. **Revisar Configurações**:
   - Verifique todas as configurações feitas e clique em "Revisar + criar".
   
2. **Implantação**:
   - Após a revisão, clique em "Criar" para iniciar o processo de implantação da máquina virtual. A criação pode levar alguns minutos.

## Gerenciando a Máquina Virtual

1. **Acessar a VM**:
   - Após a criação, você pode acessar a VM utilizando RDP, SSH ou outras ferramentas de gerenciamento remoto.

2. **Configurações Adicionais**:
   - Acesse o painel da VM para ajustar configurações, monitorar desempenho e gerenciar recursos associados.
  
# Configurando uma Instância de Banco de Dados no Microsoft Azure 

## Índice

1. [Introdução](#introdução)
2. [Acessando o Portal do Azure](#acessando-o-portal-do-azure)
3. [Criando uma Instância de Banco de Dados](#criando-uma-instância-de-banco-de-dados)
   - [Passo 1: Acessar a Seção de Banco de Dados](#passo-1-acessar-a-seção-de-banco-de-dados)
   - [Passo 2: Configurações Básicas](#passo-2-configurações-básicas)
   - [Passo 3: Configurações de Escalabilidade](#passo-3-configurações-de-escalabilidade)
   - [Passo 4: Configurações de Segurança](#passo-4-configurações-de-segurança)
   - [Passo 5: Revisão e Criação](#passo-5-revisão-e-criação)
4. [Gerenciando a Instância de Banco de Dados](#gerenciando-a-instância-de-banco-de-dados)
5. [Conclusão](#conclusão)

## Introdução

O Microsoft Azure oferece uma variedade de opções de banco de dados, como o SQL Database, MySQL, PostgreSQL e Cosmos DB. Este guia se concentra na criação e configuração de uma instância de banco de dados relacional.

## Acessando o Portal do Azure

1. **Acesse o portal do Azure**:
   - Visite [https://portal.azure.com](https://portal.azure.com).
   - Insira suas credenciais (email e senha) para acessar o portal.

## Criando uma Instância de Banco de Dados

### Passo 1: Acessar a Seção de Banco de Dados

1. No menu à esquerda, clique em "Todos os Serviços".
2. No campo de busca, digite "Banco de Dados" e selecione o tipo de banco de dados desejado (por exemplo, "SQL Database", "MySQL", "PostgreSQL").
3. Clique em "Adicionar" ou "Criar" para iniciar o processo de criação de uma nova instância de banco de dados.

### Passo 2: Configurações Básicas

1. **Assinatura e Grupo de Recursos**:
   - Escolha a assinatura correta e selecione ou crie um grupo de recursos.

2. **Nome do Banco de Dados**:
   - Insira um nome único para a instância do banco de dados.

3. **Servidor e Localização**:
   - Selecione ou crie um novo servidor de banco de dados e escolha a localização (região) onde ele será hospedado.

4. **Versão do Banco de Dados**:
   - Escolha a versão do banco de dados (ex.: SQL Server, MySQL 5.7, PostgreSQL 12).

### Passo 3: Configurações de Escalabilidade

1. **Camada de Serviço**:
   - Selecione a camada de serviço mais adequada, como **Basic**, **Standard**, ou **Premium**, dependendo das suas necessidades de desempenho e custo.

2. **Tamanho e Desempenho**:
   - Ajuste o número de DTUs ou vCores, conforme necessário, para determinar o desempenho da instância.

### Passo 4: Configurações de Segurança

1. **Autenticação**:
   - Configure a autenticação do banco de dados. Você pode optar por usar autenticação por senha ou integração com o Active Directory.

2. **Firewall**:
   - Defina as regras de firewall para controlar quais endereços IP podem acessar o banco de dados.

3. **Backup e Recuperação**:
   - Configure as opções de backup, incluindo backups automáticos e retenção de backups.

### Passo 5: Revisão e Criação

1. **Revisar Configurações**:
   - Revise todas as configurações inseridas e ajuste conforme necessário.

2. **Implantação**:
   - Clique em "Criar" para iniciar o processo de criação da instância de banco de dados. A criação pode levar alguns minutos.

## Gerenciando a Instância de Banco de Dados

1. **Acessar o Banco de Dados**:
   - Após a criação, você pode acessar o banco de dados usando ferramentas como o SQL Server Management Studio (SSMS) ou MySQL Workbench, dependendo do tipo de banco de dados.

2. **Configurações Adicionais**:
   - No painel da instância de banco de dados no Azure, você pode ajustar o desempenho, realizar backups, restaurar o banco de dados, e monitorar o uso de recursos.

# Configurando Recursos e Dimensionamentos em Máquinas Virtuais no Microsoft Azure

## Índice

1. [Introdução](#introdução)
2. [Acessando o Portal do Azure](#acessando-o-portal-do-azure)
3. [Configurando Recursos da Máquina Virtual](#configurando-recursos-da-máquina-virtual)
   - [Passo 1: Acessar as Configurações da VM](#passo-1-acessar-as-configurações-da-vm)
   - [Passo 2: Escolhendo o Tipo de Tamanho da VM](#passo-2-escolhendo-o-tipo-de-tamanho-da-vm)
   - [Passo 3: Configurando o Armazenamento](#passo-3-configurando-o-armazenamento)
   - [Passo 4: Configurando a Rede](#passo-4-configurando-a-rede)
4. [Redimensionando a Máquina Virtual](#redimensionando-a-máquina-virtual)
   - [Passo 1: Acessar a Opção de Redimensionamento](#passo-1-acessar-a-opção-de-redimensionamento)
   - [Passo 2: Escolher o Novo Tamanho](#passo-2-escolher-o-novo-tamanho)
   - [Passo 3: Revisão e Aplicação](#passo-3-revisão-e-aplicação)
5. [Conclusão](#conclusão)

## Introdução

A configuração de recursos e dimensionamentos em uma máquina virtual no Azure é crucial para garantir que ela atenda às suas necessidades de performance e custo. O Azure permite alterar o número de CPUs virtuais, a quantidade de memória, tipos de disco e outras configurações para otimizar o uso da máquina.

## Acessando o Portal do Azure

1. **Acesse o portal do Azure**:
   - Visite [https://portal.azure.com](https://portal.azure.com).
   - Insira suas credenciais (email e senha) para acessar o portal.

## Configurando Recursos da Máquina Virtual

### Passo 1: Acessar as Configurações da VM

1. No painel de navegação à esquerda, clique em "Máquinas Virtuais" para listar todas as VMs.
2. Selecione a VM que deseja configurar.
3. No painel da VM, acesse a seção de "Configurações".

### Passo 2: Escolhendo o Tipo de Tamanho da VM

1. **Tamanho da VM**:
   - No menu de configurações, selecione "Tamanho" para ajustar o número de CPUs virtuais e a memória RAM.
   - Escolha um tamanho baseado em suas necessidades de performance (ex.: DS1_v2, D4_v3, etc.).

2. **Considerações de Desempenho**:
   - Se você precisa de maior desempenho para cargas de trabalho intensivas, considere VMs com mais vCPUs e maior capacidade de memória.
   - Para cargas de trabalho menores, uma VM menor pode ser suficiente, otimizando os custos.

### Passo 3: Configurando o Armazenamento

1. **Tipos de Disco**:
   - No menu "Discos", você pode escolher entre discos gerenciados padrão (HDD) ou premium (SSD). SSDs são mais rápidos e recomendados para cargas de trabalho que exigem alta performance de I/O.

2. **Adicionar Discos**:
   - Adicione discos adicionais conforme necessário para armazenamento de dados, garantindo que cada disco esteja configurado de acordo com suas necessidades de performance e redundância.

### Passo 4: Configurando a Rede

1. **Rede Virtual**:
   - No menu "Rede", você pode configurar ou modificar a rede virtual à qual a VM está conectada.
   - Certifique-se de que a sub-rede e o grupo de segurança de rede (NSG) estejam configurados para permitir o tráfego necessário.

2. **Endereço IP Público**:
   - Escolha se a VM terá um endereço IP público, permitindo acesso externo ou mantendo-a restrita à rede interna.

## Redimensionando a Máquina Virtual

### Passo 1: Acessar a Opção de Redimensionamento

1. Para redimensionar uma VM existente, vá até o painel da máquina virtual no portal do Azure.
2. No menu lateral, clique em "Tamanho" para visualizar as opções de redimensionamento.

### Passo 2: Escolher o Novo Tamanho

1. **Selecione um Novo Tamanho**:
   - Escolha um novo tamanho da lista, que melhor se adapte às suas necessidades de CPU, memória e custo.
   - Preste atenção às restrições de disponibilidade regional para certos tamanhos.

### Passo 3: Revisão e Aplicação

1. Após selecionar o novo tamanho, clique em "Redimensionar" para aplicar as mudanças.
2. **Atenção**: O processo de redimensionamento pode causar uma breve interrupção no funcionamento da VM, então programe a alteração para momentos de menor impacto.

## 👩‍💻 Desenvolvedora
   
   <p>
       <img 
         align="left" 
         width="80" 
         src="https://github.com/Mirellawanessa/DIO-Trilha-Java-Basico/blob/main/GitHub/imagens/User.jpeg?raw=true"
       />
       <p>&nbsp;&nbsp;&nbsp;Mirella Wanessa<br>
       &nbsp;&nbsp;&nbsp;
       <a href="https://github.com/Mirellawanessa">GitHub</a>&nbsp;|&nbsp;
       <a href="https://www.linkedin.com/in/mirellawanessa/">LinkedIn</a>&nbsp;|&nbsp;
       <a href="https://www.instagram.com/_mirella.page/?next=%2F">Instagram</a>
       &nbsp;|&nbsp;</p>
   </p>
   
   ---
   
   ⌨️ with 💜 by [Mirella Wanessa](https://github.com/Mirellawanessa)
