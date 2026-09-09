<h1>Geração do executável com jpackage</h1>

<h2>Parte 1: Gerar o arquivo .JAR (No VS Code)</h2>

<p>⚠️Observação: é necessário ter a extensão <code>Extension Pack for Java</code> no VS Code.</p>
<img width="978" height="174" alt="image" src="https://github.com/user-attachments/assets/3eb915ff-42ec-476b-a85a-4141fd5eaf71" />

<ol>
  <li>Abrir o VS Code, ir na aba Java Projects e exportar como jar</li>
  <img width="427" height="364" alt="image" src="https://github.com/user-attachments/assets/821cee20-ca0d-4cf3-ad0d-acd99dc7d27f" />
  <li>Selecionar a opção abaixo:</li>
  <img width="594" height="125" alt="image" src="https://github.com/user-attachments/assets/1de3d2cb-aacd-4409-970b-7b26b0388c3f" />
  <li>Depois ele gerará o arquivo .jar:</li>
  <img width="403" height="315" alt="image" src="https://github.com/user-attachments/assets/124084d7-b1cc-464e-a959-1076d94f325f" />
</ol>

<h2>Parte 2: Preparar a Pasta de Build (No Windows)</h2>
<p>Para evitar erros de "arquivo não encontrado", a organização é importante.</p>

<ol>
  <li>Tenha uma pasta fixa (ex: na Área de Trabalho) chamada <code>BuildDoJogo</code>, por exemplo.</li>
  <li>Copie o arquivo <code>.jar</code> gerado para dentro dessa pasta.</li>
  <li>Garanta que o seu ícone (<code>nomeDoIcone.ico</code>) também esteja lá dentro.</li>
</ol>

<p>A pasta BuildDoJogo deve ter apenas:</p>
<ul>
  <li>
    📄 <code>[Nome_Arquivo_JAR].jar</code>
  </li>
  <li>
    🎨 <code>nomeDoIcone.ico</code>
  </li>
</ul>

<h2>Parte 3: O Comando Mágico (No Terminal)</h2>
<ol>
  <li>Abra o terminal (PowerShell).</li>
  <li>Pegue os caminhos atualizados:</li>
  <ul>
    <li><strong>[CAMINHO_PASTA]</strong>: Shift + Botão Direito na pasta <code>BuildDoJogo</code> → <em>Copiar como caminho</em>.</li>
    <li><strong>[CAMINHO_ICONE]</strong>: Shift + Botão Direito no arquivo <code>.ico</code> -> <em>Copiar como caminho</em>.</li>
    <li><strong>[Nome_Arquivo_JAR]</strong>: Nome do arquivo gerado no VS Code.</li>
  </ul>
  <li>Rode o comando abaixo (lembre-se de manter as aspas que vêm no "Copiar como caminho"):</li>
  </br>
  <p>PowerShell</p>
 <pre><code>&amp; "C:\Program Files\Java\jdk-26.0.2.1\bin\jpackage" --input "[CAMINHO_PASTA]" --name "AUltimaLuz" --main-jar "[NOME_ARQUIVO_JAR].jar" --main-class main.Principal --type app-image --icon "[CAMINHO_ICONE]" --dest "[CAMINHO_PASTA]"</code></pre>
</ol>

<p>⚠️Observação: O caminho <code>"C:\Program Files\Java\jdk-16.0.1\bin\jpackage"</code> pode variar de acordo com a versão do Java instalada no computador. <strong>Altere o caminho para a versão do Java que você possui instalada.</strong></p>

<h2>🚀 O Resultado</h2>
<p>Será gerado uma pasta com o nome atribuído. Dentro dele terá o executável <code>AUltimaLuz.exe</code> onde será possível rodar.</p>
</br>
<img width="1000" height="413" alt="image" src="https://github.com/user-attachments/assets/05866229-0c84-4596-86ec-81a43e5cbf80" />
<h3>📦 Como executar o jogo em outro computador?</h3>
<p>
    A pasta <code>AUltimaLuz</code> gerada contém todos os arquivos necessários
    para executar o jogo, incluindo o Java Runtime incorporado.
</p>

<ol>
    <li>Clique com o botão direito na pasta <code>AUltimaLuz</code>.</li>
    <li>Selecione <strong>Enviar para → Pasta compactada (zip)</strong>.</li>
    <li>
        Transfira o arquivo <code>.zip</code> para o computador onde o jogo
        será executado.
    </li>
    <li>
        Extraia o conteúdo do <code>.zip</code> e execute o arquivo
        <code>.exe</code>.
    </li>
</ol>

