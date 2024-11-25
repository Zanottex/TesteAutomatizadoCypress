package automatizado.Builder;

import static org.junit.Assert.assertEquals;

import java.util.StringTokenizer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import automatizado.Page.EcommercePO;

public class EcommerceBuilder {
    
    private EcommercePO ECommercePO;
    private String email_usuario = "gustavozanotto119@gmail.com";
    private String senha_usuario = "1";
    private String E_Commerce_CARD = "171";
    private String Nome_bilhete = "5150";
    private String Nome_Cartao = "Gustavin Zanottin";
    private String Numero_Cartao = "4000000000000010";
    private String mes_validade = "122500";
    private String codigo_segurança = "123";
    private String CEP = "85509432";
    private String Numero_Casa = "1050";
 

    public EcommerceBuilder(EcommercePO venda){
        this.ECommercePO = venda;
    }

    public EcommerceBuilder mudarNome_Cartao(String nome){
        this.Nome_Cartao = nome;
        return this;
    }

    public EcommerceBuilder mudarNumero_Cartao(String numero){
        this.Numero_Cartao = numero;
        return this;
    }

    public EcommerceBuilder mudarMes_validade(String mes){
        this.mes_validade = mes;
        return this;
    }

    public EcommerceBuilder mudarsenha_usuario(String senha){
        this.senha_usuario = senha;
        return this;
    }

    public EcommerceBuilder mudarCodigo_Segurança(String codigo){
        this.codigo_segurança = codigo;
        return this;
    }

    public EcommerceBuilder mudarCEP(String cep){
        this.CEP = cep;
        return this;
    }

    public EcommerceBuilder mudarNumero_Casa(String numero_Casa){
        this.Numero_Casa = numero_Casa;
        return this;
    }

    public void builder_ColocarBilheteEcommerce(WebDriver driver){

        Wait<WebDriver> wait = new WebDriverWait(driver, 5000);

        wait.until(d -> ECommercePO.Filtro.isDisplayed());
        ECommercePO.Filtro.sendKeys(E_Commerce_CARD);

        wait.until(d -> ECommercePO.SelecionarEcommerce.isDisplayed());
        ECommercePO.SelecionarEcommerce.click();

        wait.until(d -> ECommercePO.Grupos.isDisplayed());
        ECommercePO.Grupos.click();

        wait.until(d -> ECommercePO.Grupo_TesteAutomatizado.isDisplayed());
        ECommercePO.Grupo_TesteAutomatizado.click();

        wait.until(d -> ECommercePO.Grupo_TesteAutomatizado.isEnabled());
        ECommercePO.Adicionar_Bilhete_grupo.click();

        wait.until(d -> ECommercePO.Bilhete.isDisplayed());
        ECommercePO.Bilhete.sendKeys(Nome_bilhete);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(d -> ECommercePO.seleciona_Bilhete.isDisplayed());
        ECommercePO.seleciona_Bilhete.click();
        wait.until(d -> ECommercePO.salva_Bilhete.isDisplayed());
        ECommercePO.salva_Bilhete.click();
        ECommercePO.salva_Ecommerce.click();

        wait.until(d -> ECommercePO.spanMensagem.isDisplayed());
        String mensagem = ECommercePO.spanMensagem.getText();
        assertEquals("E-commerce salvo com sucesso!", mensagem);
    

    }

    public void builder_VendaEcommerce(WebDriver driver){
        Wait<WebDriver> wait = new WebDriverWait(driver, 5000);

        wait.until(d -> ECommercePO.barraDePesquisa.isDisplayed());
        ECommercePO.barraDePesquisa.sendKeys("Bilhete Normal");
        ECommercePO.bilhete_a_venda_grupo1.click();
        try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.ProximoMes.click();
        wait.until(d -> ECommercePO.dia.isDisplayed());
        try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.dia.click();

        try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        wait.until(d -> ECommercePO.horario.isEnabled());
        ECommercePO.horario.click();
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.confirmarHorario.click();

        wait.until(d -> ECommercePO.proximo.isEnabled());
        ECommercePO.proximo.click();

        wait.until(d -> ECommercePO.adicionarCategoria.isDisplayed());
        ECommercePO.adicionarCategoria.click();

        wait.until(d -> ECommercePO.adicionarAoCarrinho.isDisplayed());
        ECommercePO.adicionarAoCarrinho.click();

        wait.until(d -> ECommercePO.finalizarPedido.isDisplayed());
        ECommercePO.finalizarPedido.click();

        wait.until(d -> ECommercePO.Nome_Do_Cartao.isDisplayed());
        ECommercePO.Nome_Do_Cartao.sendKeys(Nome_Cartao);

        ECommercePO.Numero_Cartao.sendKeys(Numero_Cartao);

        ECommercePO.Mes_Validade.sendKeys(mes_validade);

        ECommercePO.codigo_segurança.sendKeys(codigo_segurança);

        ECommercePO.CEP.sendKeys(CEP);

        ECommercePO.Numero_Casa.sendKeys(Numero_Casa);
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.finalizarCompra.click();
        wait.until(d -> ECommercePO.confirmarCompra.isDisplayed());
        String mensagem = ECommercePO.confirmarCompra.getText();
        assertEquals("Em breve você receberá os ingressos em seu e-mail e também poderá realizar a impressão dos mesmos acessando 'Minhas Reservas'.", mensagem);
    }

    public void builder_LoginEcommerce(WebDriver driver){

        Wait<WebDriver> wait = new WebDriverWait(driver, 5000);

        wait.until(d -> ECommercePO.aceitarcookies.isDisplayed());
        ECommercePO.aceitarcookies.click();
        try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        wait.until(d -> ECommercePO.olaFaçaSeuLogin.isDisplayed());
        ECommercePO.olaFaçaSeuLogin.click();
        try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        wait.until(d -> ECommercePO.Entrar.isDisplayed());
        ECommercePO.Entrar.click();
        try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        wait.until(d -> ECommercePO.Email_ecommerce.isDisplayed());
        ECommercePO.Email_ecommerce.clear();
        ECommercePO.Email_ecommerce.sendKeys(email_usuario);

        ECommercePO.senha_ecommerce.clear();
        ECommercePO.senha_ecommerce.sendKeys(senha_usuario);

        try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.Logar.click();

    }

    public void builder_VendaEcommerceVinculado(WebDriver driver){
        Wait<WebDriver> wait = new WebDriverWait(driver, 5000);
        wait.until(d -> ECommercePO.barraDePesquisa.isDisplayed());
        ECommercePO.barraDePesquisa.sendKeys("Bilhete Vinculado 1");
        ECommercePO.bilhete_a_venda_grupo1.click();
            
        //Pode ser feito por meio de um while com uma variavel para quebrar o loop que só é utilizada assim que ha a confirmação de algum campo em tela

        try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.ProximoMes.click();
        wait.until(d -> ECommercePO.dia.isDisplayed());
        try {
            Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.dia.click();
        try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        wait.until(d -> ECommercePO.horario.isEnabled());
        ECommercePO.horario.click();
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.confirmarHorario.click();

        wait.until(d -> ECommercePO.proximo.isEnabled());
        ECommercePO.proximo.click();

        wait.until(d -> ECommercePO.adicionarCategoria.isDisplayed());
        ECommercePO.adicionarCategoria.click();

        StringTokenizer  Result = new StringTokenizer(ECommercePO.valorSomado.getText());
        String valortotal = Result.nextToken(" ");
         valortotal = Result.nextToken(" ");
         valortotal = valortotal.replaceAll(",", ".");
         Float valorsomado = Float.valueOf(valortotal);

        wait.until(d -> ECommercePO.adicionarAoCarrinho.isDisplayed());
        ECommercePO.adicionarAoCarrinho.click();
        wait.until(d -> ECommercePO.valorBilhete1.isDisplayed());
        StringTokenizer resulBilhete1 = new StringTokenizer(ECommercePO.valorBilhete1.getText());
        String valorbilhete1 = resulBilhete1.nextToken(" ");
         valorbilhete1 = resulBilhete1.nextToken(" ");
         valorbilhete1 = valorbilhete1.replaceAll(",", ".");
        Float valor1 = Float.valueOf(valorbilhete1);

        StringTokenizer resulBilhete2 = new StringTokenizer(ECommercePO.valorBilhete2.getText());
        String valorbilhete2 = resulBilhete2.nextToken(" ");
         valorbilhete2 = resulBilhete2.nextToken(" ");
         valorbilhete2 = valorbilhete2.replaceAll(",", ".");
        Float valor2 = Float.valueOf(valorbilhete2);

        if(valor1 + valor2 == valorsomado){
        wait.until(d -> ECommercePO.finalizarPedido.isDisplayed());
        ECommercePO.finalizarPedido.click();

        wait.until(d -> ECommercePO.Nome_Do_Cartao.isDisplayed());

        ECommercePO.Nome_Do_Cartao.sendKeys(Nome_Cartao);

        ECommercePO.Numero_Cartao.sendKeys(Numero_Cartao);

        ECommercePO.Mes_Validade.sendKeys(mes_validade);

        ECommercePO.codigo_segurança.sendKeys(codigo_segurança);

        ECommercePO.CEP.sendKeys(CEP);

        ECommercePO.Numero_Casa.sendKeys(Numero_Casa);
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        ECommercePO.finalizarCompra.click();

        wait.until(d -> ECommercePO.confirmarCompra.isDisplayed());
        String mensagem = ECommercePO.confirmarCompra.getText();
        assertEquals("Em breve você receberá os ingressos em seu e-mail e também poderá realizar a impressão dos mesmos acessando 'Minhas Reservas'.", mensagem);
        }
        else{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Valor dos bilhetes Incoerente!');");
        }
    }


    public void multiplasdatas(WebDriver driver){
        Wait<WebDriver> wait = new WebDriverWait(driver, 5000);
        wait.until(d -> ECommercePO.bilhete_a_venda_grupo1.isDisplayed());
        ECommercePO.barraDePesquisa.sendKeys("Bilhete Multiplas Datas de Visita");
        ECommercePO.bilhete_a_venda_grupo1.click();
            
        try {
            Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.ProximoMes.click();
        wait.until(d -> ECommercePO.dia.isEnabled());
        try {
            Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.dia.click();
        wait.until(d -> ECommercePO.diaFim.isDisplayed());
        
        ECommercePO.diaFim.click();
        try {
            Thread.sleep(17000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        wait.until(d -> ECommercePO.horario.isEnabled());
        ECommercePO.horario.click();
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        ECommercePO.confirmarHorario.click();

        wait.until(d -> ECommercePO.proximo.isEnabled());
        ECommercePO.proximo.click();

        wait.until(d -> ECommercePO.adicionarCategoria.isDisplayed());
        ECommercePO.adicionarCategoria.click();

        wait.until(d -> ECommercePO.valor7dias.isDisplayed());
        StringTokenizer resul = new StringTokenizer(ECommercePO.valor7dias.getText());
        String valor = resul.nextToken(" ");
        valor = resul.nextToken(" ");
        valor = valor.replaceAll(",", ".");
        Float valorfinal = Float.valueOf(valor);

        if(valorfinal == 70.00){
        wait.until(d -> ECommercePO.adicionarAoCarrinho.isDisplayed());
        ECommercePO.adicionarAoCarrinho.click();

        wait.until(d -> ECommercePO.finalizarPedido.isDisplayed());
        ECommercePO.finalizarPedido.click();

        wait.until(d -> ECommercePO.Nome_Do_Cartao.isDisplayed());

        ECommercePO.Nome_Do_Cartao.sendKeys(Nome_Cartao);

        ECommercePO.Numero_Cartao.sendKeys(Numero_Cartao);

        ECommercePO.Mes_Validade.sendKeys(mes_validade);

        ECommercePO.codigo_segurança.sendKeys(codigo_segurança);

        ECommercePO.CEP.sendKeys(CEP);

        ECommercePO.Numero_Casa.sendKeys(Numero_Casa);
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        ECommercePO.finalizarCompra.click();

        wait.until(d -> ECommercePO.confirmarCompra.isDisplayed());
        String mensagem = ECommercePO.confirmarCompra.getText();
        assertEquals("Em breve você receberá os ingressos em seu e-mail e também poderá realizar a impressão dos mesmos acessando 'Minhas Reservas'.", mensagem);
        }
        else{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Valor dos bilhetes Incoerente!');");
        }
    }

    //TODO Terminar a parte de tirar o bilhete posteriormente
    // public void tirarBilhete(WebDriver driver){
    //     Wait<WebDriver> wait = new WebDriverWait(driver, 5000);

    //     wait.until(d -> ECommercePO.Filtro.isDisplayed());
    //     ECommercePO.Filtro.sendKeys(E_Commerce_CARD);

    //     wait.until(d -> ECommercePO.SelecionarEcommerce.isDisplayed());
    //     ECommercePO.SelecionarEcommerce.click();

    //     wait.until(d -> ECommercePO.Grupos.isDisplayed());
    //     ECommercePO.Grupos.click();

    //     wait.until(d -> ECommercePO.Grupo_TesteAutomatizado.isDisplayed());
    //     ECommercePO.Grupo_TesteAutomatizado.click();

    //     wait.until(d -> ECommercePO.nomeBilhete1.isDisplayed());
    //     String mensagem = ECommercePO.nomeBilhete1.getText();
    //     if(mensagem == "5150 - *"){
    //         ECommercePO.tirarBilhete1.click();
    //     }
    //     try {
    //         mensagem = ECommercePO.nomeBilhete2.getText();
    //     } catch (Exception e) {
            
    //     }
    //     if(mensagem == "5150 - *"){
    //         ECommercePO.tirarBilhete2.click();
    //     }
    //     try {
    //         mensagem = ECommercePO.nomeBilhete3.getText();
    //     } catch (Exception e) {
            
    //     }
    //     if(mensagem == "5150 - *"){
    //         ECommercePO.tirarBilhete3.click();
    //     }
    //     ECommercePO.tirarBilhete1.click();
    //     ECommercePO.salva_Ecommerce.click();
    // }
}
