package automatizado.Teste;

import org.junit.Test;

import automatizado.Builder.EcommerceBuilder;
import automatizado.Page.EcommercePO;

public class EcommerceTeste extends BaseTeste{
    
    private static EcommercePO EcommercePO;
    private static final String ULR_Ecommerce = "https://zanottin.testescard.limber.net.br/";
    private static final String ULR_Card_Ecommerce = "https://testescard.limbersoftware.com.br/#/pages/ecommerce/ec-configs";
    

    @Test
    public void TC001_Venda_No_Ecommerce_bilhete_simples(){
        String aberto;
        try {
            aberto = driver.manage().window().getSize().toString();
        } catch (Exception e) {
            aberto = null;
        }
        if(aberto == null){
        iniciar(ULR_Ecommerce);
        }
        else{
        RedirecionarPag(ULR_Ecommerce);
        }
        
        EcommercePO = new EcommercePO(driver);
        EcommerceBuilder ecommerce = new EcommerceBuilder(EcommercePO);

        ecommerce.builder_LoginEcommerce(driver);
        ecommerce.builder_VendaEcommerce(driver);
             
    }

    @Test
    public void TC002_Colocar_Bilhete_no_Ecommerce(){
        String aberto;
        try {
            aberto = driver.manage().window().getSize().toString();
        } catch (Exception e) {
            aberto = null;
        }
        if(aberto == null){
        AbrirCard();
        }
        else{
            driver.get(URL_HOMOLOG);
        }
        RedirecionarPag(ULR_Card_Ecommerce);
        EcommercePO = new EcommercePO(driver);

        EcommerceBuilder ecommerce = new EcommerceBuilder(EcommercePO);

        ecommerce.builder_ColocarBilheteEcommerce(driver);

        
    }

    @Test
    public void TC003_Venda_No_Ecommerce_bilhete_vinculado(){
        String aberto;
        try {
            aberto = driver.manage().window().getSize().toString();
        } catch (Exception e) {
            aberto = null;
        }
        if(aberto == null){
        iniciar(ULR_Ecommerce);
        }
        else{
        RedirecionarPag(ULR_Ecommerce);
        }
        
        EcommercePO = new EcommercePO(driver);
        EcommerceBuilder ecommerce = new EcommerceBuilder(EcommercePO);

        ecommerce.builder_LoginEcommerce(driver);
        ecommerce.builder_VendaEcommerceVinculado(driver);
        
        
    }

    @Test
    public void TC004_Venda_Multiplas_datas(){
        String aberto;
        try {
            aberto = driver.manage().window().getSize().toString();
        } catch (Exception e) {
            aberto = null;
        }
        if(aberto == null){
        iniciar(ULR_Ecommerce);
        }
        else{
        RedirecionarPag(ULR_Ecommerce);
        }

        EcommercePO = new EcommercePO(driver);
        EcommerceBuilder ecommerce = new EcommerceBuilder(EcommercePO);

        ecommerce.builder_LoginEcommerce(driver);
        ecommerce.multiplasdatas(driver);
    }

    //TODO Achar uma forma de o sistema reconheçer o botão de retirar o bilhete do e-commerce (obs: talvez tenha que pedir para os devs)
    // @Test
    // public void TC003_Tirar_Bilhete_do_Ecommerce(){
    //     String aberto;
    //     try {
    //         aberto = driver.manage().window().getSize().toString();
    //     } catch (Exception e) {
    //         aberto = null;
    //     }
    //     if(aberto == null){
    //     AbrirCard();
    //     }
    //     else{
    //         driver.get(URL_HOMOLOG);
    //     }
    //     RedirecionarPag(ULR_Card_Ecommerce);
    //     EcommercePO = new EcommercePO(driver);

    //     EcommerceBuilder ecommerce = new EcommerceBuilder(EcommercePO);

    //     //ecommerce.tirarBilhete(driver);
    // }
}
