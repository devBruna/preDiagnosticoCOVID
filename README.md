# preDiagnosticoCOVID

SISTEMA DE PRÉ-DIAGNÓSTICO DE COVID

Desenvolvedores:

Bruna de Jesus Ribeiro Cursino

Gabriel Xavier de Lima

Mateus de Sá Nass

Rafael Alves Mendonça

DO PROJETO 

 O  Projeto  aqui  desenvolvido  visa,  de  forma  simples,  ajudar  pessoas  a  obterem  informações  sobre  a  possibilidade  de  estarem  contaminadas  com  o  vírus  da  COVID-19, auxiliando na obtenção de informações acerca do vírus e seus sintomas. 
 O  sistema,  desenvolvido  na  linguagem  Java,  traz  diversos  sintomas  que  a 
 COVID  pode  causar,  além  de  outros  sintomas  que  podem  ser  confundidos  com  COVID,  mas  que  são  de  outras  doenças,  como  gripe  e  asma.  Através  de  uma  anamnese,  o  sistema  trará  ao  usuário  qual  a  probabilidade  dele  estar  com  coronavírus ( altíssima  probabilidade,  alta  probabilidade,  probabilidade  ou  baixa  probabilidade). 
 O  resultado  obtido  não  trás  o  diagnóstico  de  nenhuma  doença,  mas  a  informação  de  que  há  a  possibilidade  de  contaminação  do  indivíduo  com  o  novo  vírus,  devendo  este  procurar  um  médico  para  concreto  diagnóstico  médico  e  medicação específica. 
 
DOS REQUISITOS 
 
 Receber diversos sintomas do paciente como dados de entrada. 
 Apontar possível doença que ele possui - pré-diagnóstico de uma doença. 
 Apontar  qual  a  probabilidade  de  os  sintomas  indicarem  COVID-19,  Gripe  ou  Asma. 
 Deixar  claro  que  é  um  pré-diagnóstico  e  que  o  indivíduo  deve  procurar  um  médico. 
 
DAS DOENÇAS E SINTOMAS 
  1	- COVID 
 Sintomas mais comuns: Febre,  Tosse, Cansaço, Perda de Paladar ou Olfato, Dores  de Garganta, Dores de Cabeça, Dores e Desconfortos 
 Menos Comum: Diarréia, Irritações na Pele, Olhos Vermelhos. 
 Mais Graves:  Dificuldade para respirar/falta de ar, Perda de Fala, Mobilidade ou  Confusão, Dores no Peito. 
 Sintomas menos comuns: Dores de garganta, Dor de cabeça 
  2	- ASMA 
 Falta de Ar ou Dificuldade para Respirar, Sensação de Aperto no Peito ou Peito 
 Pesado, Chiado no Peito, Tosse 
  3	- GRIPE 
 Febre, Dor de Garganta. Tosse, Dor no Corpo, Dor de Cabeça 
 
COMANDOS UTILIZADOS NO CÓDIGO DO PROJETO 
 
 Foram utilizados no projeto os seguintes comandos: 
 "Println"  -  gera  uma  saída  de  texto  entre  aspas  duplas  para  o  paciente,  significando  uma  String,  criando  uma  nova  linha  e  posicionando  o  cursor  na  linha  abaixo, o que é identificado pela terminação "ln". 
 “Scanner”  -  classe  utilizada  para  capturar  a  informação  que  o  usuário  digita  no  console. 
 "While" ( Enquanto)  -  comando  de  repetição  em  que,  caso  o  usuário  digite  um  número  que  não  seja  atribuído  a  nenhum  sintoma,  o  programa  pede  que  seja  digitado  um  número  válido  novamente,  e  para  validar  basta  digitar  um  número  de  sintoma previsto no menu. 
 "Do-While"  -  utilizado  para  gerar  um  loop  do  menu  até  que  a  condição  de  encerrar o programa ser escolhido. 
 "If-Else"  (Se-senão)  -  utilizados  para  dar  sequência  ao  menu,  onde,  caso  o  paciente  selecione  uma  alternativa,  o  código  dará  sequência  à  ação  previamente  determinada.  Se  o  usuário  selecionar  uma  alternativa  inexistente,  uma  mensagem  de "Opção inexistente" será mostrada. 
 "If-Else"  -  também  utilizado  para  fazer  a  leitura  dos  3  sintomas  e  dar  a  probabilidade  de  cada  doença,  utilizando  variadas  condições  de  "If-else"  para  determinar as probabilidades do pré-diagnóstico. 
 “Try-Catch-Finally–scan.Close”  -  Utilizado  para  tratar  erros  e  fechar  (finalizar)  o comando Scanner. 
 
TUTORIAL PARA UTILIZAÇÃO DO PROGRAMA 
 PASSO 1.  O programa iniciará e pedirá para o paciente informar o nome dele. 
 
 PASSO  2.  Depois  de  informado  o  nome,  o  programa  listará  os  sintomas  disponíveis  em  seu  sistema.  Depois,  pedirá  ao  paciente  que  informe  os  3  sintomas  mais  fortes  presentes  no  seu  corpo.  Ele  deverá  digitar  números  de  1  a  14,  correspondente  aos  sintomas. 
 
 PASSO  3.  Após  informado  os  sintomas,  o  programa  exibirá  um  pequeno  menu,  e  pedirá ao paciente que ele informe a opção desejada. 
 
 PASSO  4.  Se  o  paciente  digitar  1,  aparecerá  uma  tela  (próxima  página)  mostrando  os  sintomas  para  cada  doença  que  o  programa  suporta.  No  final,  o  menu  volta  novamente para que o paciente possa prosseguir. 9+6*-----------------------------------9*+ 

  
