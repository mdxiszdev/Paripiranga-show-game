
package paripirangashow;


public class Paripirangashow {
    public static Pergunta[] pergs=cadastropergs();
   
    public static void main(String[] args) {
      new Principal().setVisible(true);
      
    }
    public static Pergunta[] cadastropergs(){
    Pergunta[] pergs=new Pergunta[6];
    pergs[0]=new Pergunta(1, 1, 'b', "Qual mês ocorre a famosa festa do milho?", "Janeiro", "Novembro", "Junho", "Agosto");
    pergs[1]=new Pergunta(2, 1, 'c', "Qual a árvore simbolo da cidade?", "Baraúna", "Umbuzeiro", "Coité", "Aroeira");
    pergs[2]=new Pergunta(3, 1, 'd', "Quantos anos possui o município de Paripiranga?", "139 anos", "155 anos", "145 anos", "140 anos");
    pergs[3]=new Pergunta(4, 1, 'c', "Qual desses nomes já foi de Paripiranga?", "Terra do Coite", "Serra Vermelha", "Patrocinio do Coite", "Serra do Coite");
    pergs[4]=new Pergunta(5, 1, 'b', "Qual local em Paripiranga que ficou conhecido pelos confrontos envolvendo cangaçeiros no passado?", "Cabeça da serra", "Sobrado", "Baixâo", "Centro");
    pergs[5]=new Pergunta(6, 1, 'a', "Qual dessas pessoas não foram prefeito de Paripiranga?", "Serra da maravilha", "155 anos", "145 anos", "140 anos");
    
    return pergs;
    }
    
}
