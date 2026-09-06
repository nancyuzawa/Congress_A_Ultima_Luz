package objeto;

import main.PainelDoJogo;
import java.awt.Graphics2D;
import dados.Progresso;
import entidade.Entidade;

public class ObjNevoaDensa extends Entidade {

    PainelDoJogo painel;
    public static final String objNome = "Nevoa Densa";

    public ObjNevoaDensa(PainelDoJogo painel) {
        super(painel);
        this.painel = painel;

        tipo = tipoObstaculo;
        nome = objNome;
        baixo1 = setup("/res/objeto/nevoa_densa", painel.tamanhoDoTile * 2, painel.tamanhoDoTile);

        // Deslocamento da colisão (Offsets X e Y)
        areaSolida.x = 4;
        areaSolida.y = 4;
        
        // Tamanho útil da caixa de colisão
        areaSolida.width = (painel.tamanhoDoTile * 2) - 16; 
        areaSolida.height = painel.tamanhoDoTile - 8;

        areaSolidaPadraoX = areaSolida.x;
        areaSolidaPadraoY = areaSolida.y;

        setDialogo();
    }

    public void setDialogo() {
        dialogo[0][0] = "Derrote todos inimigos para dissipar a névoa!";
    }

    @Override
    public void interagir() {
        if (Progresso.invasaoMapa1Ativa) {
            iniciarDialogo(this, 0);
        }
    }

    @Override
    public void atualizar() {
        aplicarEstadoDeColisao();
    }

    @Override
    public void desenhar(Graphics2D g2) {
        aplicarEstadoDeColisao();

        if (!Progresso.invasaoMapa1Ativa) {
            return;
        }

        super.desenhar(g2);
    }

    private void aplicarEstadoDeColisao() {
        if (Progresso.invasaoMapa1Ativa) {
            temColisao = true;
            // Define o tamanho reduzido quando ativa:
            areaSolida.width = (painel.tamanhoDoTile * 2) - 16;
            areaSolida.height = painel.tamanhoDoTile - 8;
        } else {
            temColisao = false;
            areaSolida.width = 0;
            areaSolida.height = 0;
        }
    }
}