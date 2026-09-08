<img width="1024" height="506" alt="a_ultima_luz" src="https://github.com/user-attachments/assets/1761a461-84f9-467a-81f2-30831ecdcfc6" />
</br>

**A Última Luz** é um protótipo de jogo *soulslike* com elementos de RPG e exploração, desenvolvido como parte de um projeto acadêmico.  
O jogo combina narrativa, ambientação sombria e desafios estratégicos, proporcionando uma experiência imersiva e desafiadora.
</br>
</br>
<div align="center">
  <img width="64" height="64" alt="baixo1-export" src="https://github.com/user-attachments/assets/eac59a87-a493-4eb5-b188-75a6480f452f" />
  . ݁₊ ⊹ . ݁˖ .
  <img width="64" height="64" alt="baixo1-export" src="https://github.com/user-attachments/assets/d8e41dad-c0ea-4f21-bc4b-c77a53bcd9ee" />
  . ݁₊ ⊹ . ݁˖ .
  <img width="64" height="64" alt="baixo1-export" src="https://github.com/user-attachments/assets/f44fc1c4-c259-47f9-8840-a30f5375b9ca" />
  . ݁₊ ⊹ . ݁˖ .
  <img width="64" height="64" alt="baixo1-export" src="https://github.com/user-attachments/assets/da122f75-ecde-4cee-949b-c4d4589f3b6b" />
</div>
</br>

<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/nancyuzawa/Feature_A_Ultima_Luz?color=%2304D361">
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/nancyuzawa/Feature_A_Ultima_Luz">
  <a href="https://github.com/tgmarinho/nlw1/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/nancyuzawa/Feature_A_Ultima_Luz">
  </a>
</p>
<p align="center">  
	<a href="#ambientacao">Ambientação</a> • <a href="#publico">Público-Alvo</a> • <a href="#mecanicas">Mecânicas Implementadas</a> • <a href="#tecnologias">Tecnologias e Referências</a> • <a href="#configuracao">Configuração do Ambiente</a> • <a href="#prototipo">Imagem do Protótipo</a> • <a href="#autoras">Autoras</a> 
</p>
</p>

<h2 id="ambientacao">🌍 Ambientação</h2>

Em um mundo em constante transformação, o jogador explora diferentes  mapas, enfrentando inimigos e descobrindo fragmentos da história.  
O ciclo **dia/noite** afeta a jogabilidade e a ambientação, tornando o mundo mais dinâmico e vivo.

---

<h2 id="publico">👥 Público-Alvo</h2>

Voltado para jogadores **a partir de 12 anos**, fãs de **RPGs e jogos de ação** com foco em **exploração, estratégia e progressão**.  
O protótipo foi desenvolvido para a plataforma **PC**.

---

<h2 id="mecanicas">🧩 Mecânicas Implementadas</h2>

- 🎮 **Game loop funcional** e controle via teclado  
- 🧍‍♂️ **Sprites e animações** personalizadas  
- 🧱 **Sistema de tiles e câmera dinâmica**  
- 💬 **Interações com objetos, NPCs e diálogos**  
- 🎒 **Inventário com itens equipáveis e projetáveis**  
- ⚔️ **Sistema de combate** com vida, mana, atributos e chefões  
- 🌫️ **Eventos ambientais** (buracos, cura, teleporte, iluminação, viagem rápida)  
- 🌙 **Ciclo dia/noite e iluminação dinâmica**  
- 🗺️ **Minimapa e interface** (menus, seleção de classe e tela de game over)  
- 🔍 **Algoritmo A*** (A-Estrela, busca de caminhos inteligente)  
- 💰 **Sistema de comércio e saque de baús**  
- 🎭 **Cutscenes, quebra cabeça e efeitos sonoros** integrados  

---

<h2 id="tecnologias">🛠️ Tecnologias e Referências</h2>

O desenvolvimento foi inspirado em tutoriais e conceitos apresentados pelo canal [RyiSnow](https://www.youtube.com/@RyiSnow), fundamentais para a estrutura de base do jogo.  
As mecânicas e recursos visuais foram adaptados e expandidos para criar uma experiência única.

---

<h2 id="configuracao">⚙️ Configuração do Ambiente</h2>

### 🧰 Requisitos

- **Java JDK** 21 ou superior  
- **Visual Studio Code** com as seguintes extensões:
  - Java Extension Pack (inclui)
    - Language Support for Java™ by Red Hat  
    - Debugger for Java  
    - Java Test Runner  
    - Maven for Java  
    - Visual Studio IntelliCode

### 🔧 Passos de Instalação

1. Instale o **Java JDK 21**.  
2. Instale o **Visual Studio Code**.  
3. Na aba de extensões do VS Code, instale o **Java Extension Pack**.  
4. Clone o repositório:

```bash
git clone https://github.com/nancyuzawa/Feature_A_Ultima_Luz.git
```
5. No terminal, dentro da pasta do projeto, execute o comando abaixo para compilar o projeto:
```bash
javac -encoding UTF-8 -d bin (Get-ChildItem src -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```
*Observação: Pode ocorrer o erro abaixo durante a compilação. Para corrigi-lo, renomeie o arquivo `lodoVerde.java` para `LodoVerde.java` e execute novamente o comando da etapa 5.*
<pre>
error: class LodoVerde is public, should be declared in a file named LodoVerde.java
public class LodoVerde extends Entidade{
       ^
1 error
</pre>

<img width="165" height="438" alt="image" src="https://github.com/user-attachments/assets/db828eb1-9652-4090-a26e-696cf14df927" />

6. Ainda no terminal, copie os recursos para garantir que imagens e outros recursos necessários estejam disponíveis durante a execução:
```bash
Copy-Item -Recurse -Force res bin/
```
7. Por fim, execute o projeto:
```bash
java -cp bin main.Principal
```

<h2 id="prototipo">🖼️ Imagem do Protótipo</h2>

<p align="center">
  <img src="https://github.com/user-attachments/assets/5d8ca03b-a6d6-4db7-9612-9615fbeb2a47" width="48%">
  &nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/6fafddb4-c8d8-4a19-abf1-8a3c77bc7666" width="48%">
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/875014c7-36e1-4bd9-ac6a-51aa58f62219" width="48%">
  &nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/f6f8e3af-98b9-4de9-8b62-3437ae371756" width="48%">
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/fe514dae-997b-44f7-92f8-72f59e634e13" width="48%">
  &nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/b2782d51-bf0a-41ab-82e2-0f88c9be1b8c" width="48%">
</p>

<h2 id="autoras">🧑‍💻 Autoras</h2>

- Nancy Yuzawa CP3025641 – Desenvolvedora e pesquisadora do projeto.
- Rafaela Ferreira CP3026353 – Desenvolvedora e pesquisadora do projeto.
</br>
<div align="center">

. ݁₊ ⊹ . ݁˖ . ݁₊ ⊹ . ݁˖ .

### 🌙 A Última Luz

**Obrigada por jogar!**

. ݁₊ ⊹ . ݁˖ . ݁₊ ⊹ . ݁˖ .

</div>
</br></br>
<div align="center">
  <img width="64" height="64" alt="cima1-export" src="https://github.com/user-attachments/assets/b648e5b3-78dd-4a40-a9fa-6f6e5d348130" />
  . ݁₊ ⊹ . ݁˖ .
  <img width="64" height="64" alt="cima1-export" src="https://github.com/user-attachments/assets/7e4e78aa-080e-41bd-b39e-a4dbb0241184" />
  . ݁₊ ⊹ . ݁˖ .
  <img width="64" height="64" alt="cima1-export" src="https://github.com/user-attachments/assets/ed206176-c0a2-4ca9-8d8a-8e671b363278" />
  . ݁₊ ⊹ . ݁˖ .
  <img width="64" height="64" alt="cima1-export" src="https://github.com/user-attachments/assets/58cf1213-f910-4a3d-9b92-c38b08980231" />
</div>


