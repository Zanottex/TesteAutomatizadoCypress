package automatizado.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EcommercePO extends BasePO{

    /*Dentro do E-Commerce */
    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-auth/div[1]/div/login-cliente-final/mat-card/mat-card-content/mat-form-field[1]/div[1]/div/div[2]/input")
    public WebElement Email_ecommerce;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-auth/div[1]/div/login-cliente-final/mat-card/mat-card-content/mat-form-field[2]/div[1]/div/div[2]/input")
    public WebElement senha_ecommerce;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-toolbar/div/div/div/div[2]/div/button[2]")
    public WebElement olaFaçaSeuLogin;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav/div/mat-tab-group/div/mat-tab-body[2]/div/menu-content/div/div/div[2]/button[1]")
    public WebElement Entrar;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-auth/div[1]/div/login-cliente-final/mat-card/mat-card-actions/button")
    public WebElement Logar;

    @FindBy(id = "mat-input-0")
    public WebElement barraDePesquisa;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/dashboard/div/div/div/div[2]/productshighlights/div/div[1]/div[1]")
    public WebElement bilhete_a_venda_grupo1;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/dashboard/div/div/div[2]/div[2]/productshighlights/div/div[1]/div/a/productthumb")
    public WebElement bilhete_a_venda_grupo2;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/section/div[2]/div/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[4]/button")
    public WebElement dia;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/section/div[2]/div/mat-calendar/div/mat-month-view/table/tbody/tr[4]/td[4]/button")
    public WebElement diaFim;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[2]/div/div/div/div[1]/div/div/div[1]/span[2]/span")
    public WebElement valor7dias;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/section/div[2]/div/mat-calendar/mat-calendar-header-config/div/div/button[2]")
    public WebElement ProximoMes;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/div/escolha-horario-vaga/div/section/div[2]")
    public WebElement horario;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/div/div/app-options-list/div/div")
    public WebElement confirmarHorario;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/div[1]/escolha-local-emb/div/section/div[2]")
    public WebElement localEmbarque;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-options-list/div/div")
    public WebElement localEmbarqueConfirmar;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-options-list/div/div")
    public WebElement confirmarHorario4opcoes;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/div[3]/escolha-sessao/div/section/div[2]")
    public WebElement sessao;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-options-list/div/div/button")
    public WebElement sessaoConfirmar;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[2]/div/div[2]/button")
    public WebElement proximo;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[2]/div/div/div/div[1]/div/div/div[2]/button[2]")
    public WebElement adicionarCategoria;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[2]/div/div/div/div[1]/app-coleta-pais-estado/div/div/div[1]/mat-form-field/div[1]/div/div[2]")
    public WebElement selecionarPaisOrigem;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/mat-option[1]/span/ngx-mat-select-search/div/div/input")
    public WebElement nomePaisOrigem;

    @FindBy(id = "mat-option-6")
    public WebElement confirmaPaisOrigem;

    @FindBy(id = "mat-option-7")
    public WebElement paiserrado;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[2]/div/div/div/div[1]/app-coleta-pais-estado/div/div/div[2]/mat-form-field/div[1]/div/div[2]")
    public WebElement estado;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/div[2]/escolha-horario-vaga/div/section/div[2]/mat-icon")
    public WebElement esperaHorario;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/div[3]/escolha-sessao/div/section/div[2]/mat-icon")
    public WebElement esperaSessao;

    @FindBy(id = "mat-option-250")
    public WebElement acre;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/section/div/div[2]/div/div/span")
    public WebElement DiaInicio;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/section/div/div[2]/div/div/div[1]/span[1]")
    public WebElement MesInicio;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/section/div/div[2]/div/div/div[1]/span[2]")
    public WebElement AnoInicio;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/section/div/div[2]/div/div/div[3]/span")
    public WebElement DiaTermino;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/section/div/div[2]/div/div/div[3]/div/span[1]")
    public WebElement MesTermino;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[1]/div/div/div/div/div[1]/section/div/div[2]/div/div/div[3]/div/span[2]")
    public WebElement AnoTermino;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[2]/div/div/div/div[2]/div[2]/div[2]/div/button")
    public WebElement adicionarAoCarrinho;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-coleta-dados-visitante/div/mat-dialog-content/mat-card/div/div/mat-form-field[1]/div[1]/div/div[2]/input")
    public WebElement nomeUsuario;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-coleta-dados-visitante/div/mat-dialog-content/mat-card/div/div/mat-form-field[2]/div[1]/div/div[2]")
    public WebElement tipodocumento;

    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/mat-option[5]")
    public WebElement outros;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-coleta-dados-visitante/div/mat-dialog-content/mat-card/div/div/mat-form-field[3]/div[1]/div/div[2]/input")
    public WebElement documento;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-coleta-dados-visitante/div/mat-dialog-actions/div/button[2]")
    public WebElement confirmardadosusuario;

    @FindBy(xpath = "/html/body/div[2]/div/div/mat-snack-bar-container/div/div/div/div/my-snackbar/div/div[2]/h4")
    public WebElement pegarMensagemErro;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-meu-carrinho/div/div/div[2]/mat-card/div/div[3]/div[2]/button")
    public WebElement finalizarPedido;

    @FindBy(xpath = "/html/body/e-commerce/pages/app-footer-cookies-policy/div/section/button[2]")
    public WebElement aceitarcookies;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-meu-carrinho/div/div/div[2]/mat-card/div/div[2]/div[2]/button")
    public WebElement registrarEfinalizarPedido;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/page-pagamento/div/div[5]/div[2]/div/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/div/div/section/span")
    public WebElement datas;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/dashboard/div/div/div/div[1]")
    public WebElement Nome_grupo_ecommerce;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-credenciado/mat-card-content/button[2]")
    public WebElement CódigoCredenciado;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-credenciado/mat-card-content/mat-form-field/div[1]/div/div[2]/input")
    public WebElement ColocarCódigoCredenciado;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-credenciado/div/button[2]")
    public WebElement ConfirmarCredenciado;

    //@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-options-list/div/div/button")
    //public WebElement adicionarAoCarrinho;

    //@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-options-list/div/div/button")
    //public WebElement adicionarAoCarrinho;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-meu-carrinho/div/div/div[2]/mat-card/div/div[1]/app-bilhete-card/div/div/mat-card/div[1]/div/span[2]")
    public WebElement valorBilhete1;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-meu-carrinho/div/div/div[2]/mat-card/div/div[2]/app-bilhete-card/div/div[2]/mat-card/div[2]/div/span[2]")
    public WebElement valorBilhete2;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/app-info-bilhete/div/div/div/mat-card/mat-vertical-stepper/div[2]/div/div/div/div[2]/div[1]/div/span/span[2]")
    public WebElement valorSomado;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/page-pagamento/div/div[4]/div/div/div[2]/mat-form-field[1]/div[1]/div/div[2]/input")
    public WebElement Nome_Do_Cartao;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/page-pagamento/div/div[4]/div/div/div[2]/mat-form-field[2]/div[1]/div/div[2]/input")
    public WebElement Numero_Cartao;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/page-pagamento/div/div[4]/div/div/div[2]/mat-form-field[4]/div[1]/div/div[2]/input")
    public WebElement Mes_Validade;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/page-pagamento/div/div[4]/div/div/div[2]/mat-form-field[5]/div[1]/div/div[2]/input")
    public WebElement codigo_segurança;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/page-pagamento/div/div[4]/div/div/div[3]/mat-form-field[2]/div[1]/div/div[2]/input")
    public WebElement CEP;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/page-pagamento/div/div[4]/div/div/div[3]/mat-form-field[6]/div[1]/div/div[2]/input")
    public WebElement Numero_Casa;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/page-pagamento/div/div[5]/div[4]/mat-card/div/button[1]")
    public WebElement finalizarCompra;

    @FindBy(xpath = "/html/body/e-commerce/pages/toolbar-menu/div/mat-sidenav-container/mat-sidenav-content/main/compraconfirmadacomponent/div/mat-card/mensagem-personalizada/div/section[2]/span/div")
    public WebElement confirmarCompra;

    /*Dentro do CARD */
    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/ec-config/lista-cadastros-com-busca/div/div/div/search-input/mat-form-field/div[1]/div/div[2]/input")
    public WebElement Filtro;
    
    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/ec-config/lista-cadastros-com-busca/div/mat-card/div/table/tbody/tr/td[5]/button")
    public WebElement SelecionarEcommerce;

    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/new-or-edit-ec-config/div[1]/mat-card/mat-tab-group/mat-tab-header/div/div/div/div[4]")
    public WebElement Grupos;

    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/new-or-edit-ec-config/div[1]/mat-card/mat-tab-group/div/mat-tab-body[4]/div/div/div/div[2]/mat-accordion/mat-expansion-panel[1]")
    public WebElement Grupo_TesteAutomatizado;

    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/new-or-edit-ec-config/div[1]/mat-card/mat-tab-group/div/mat-tab-body[4]/div/div/div/div[2]/mat-accordion/mat-expansion-panel[1]/div/div/mat-card/div/div[2]/div/button")
    public WebElement Adicionar_Bilhete_grupo;

    @FindBy(xpath  = "/html/body/div[3]/div[2]/div/mat-dialog-container/div/div/limber-select-product/div/div[1]/mat-form-field/div[1]/div/div[2]/input")
    public WebElement Bilhete;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/div/div/limber-select-product/div/div[3]")
    public WebElement seleciona_Bilhete;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/div/div/limber-select-product/div/div[4]/button[2]")
    public WebElement salva_Bilhete;

    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/new-or-edit-ec-config/div[2]/buttons/div/div/button[3]")
    public WebElement salva_Ecommerce;

    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/new-or-edit-ec-config/div[1]/mat-card/mat-tab-group/div/mat-tab-body[4]/div/div/div/div[2]/mat-accordion/mat-expansion-panel[1]/div/div/mat-card/div/div[2]/view-product[1]/mat-card/div/span")
    public WebElement nomeBilhete1;

    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/new-or-edit-ec-config/div[1]/mat-card/mat-tab-group/div/mat-tab-body[4]/div/div/div/div[2]/mat-accordion/mat-expansion-panel[1]/div/div/mat-card/div/div[2]/view-product[2]/mat-card/div/span")
    public WebElement nomeBilhete2;

    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/new-or-edit-ec-config/div[1]/mat-card/mat-tab-group/div/mat-tab-body[4]/div/div/div/div[2]/mat-accordion/mat-expansion-panel[1]/div/div/mat-card/div/div[2]/view-product[3]/mat-card/div/span")
    public WebElement nomeBilhete3;

    @FindBy(css = "view-product[1]")
    public WebElement tirarBilhete1;

    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/new-or-edit-ec-config/div[1]/mat-card/mat-tab-group/div/mat-tab-body[4]/div/div/div/div[2]/mat-accordion/mat-expansion-panel[1]/div/div/mat-card/div/div[2]/view-product[2]")
    public WebElement tirarBilhete2;

    @FindBy(xpath = "/html/body/app-root/app-pages/div/div/div/new-or-edit-ec-config/div[1]/mat-card/mat-tab-group/div/mat-tab-body[4]/div/div/div/div[2]/mat-accordion/mat-expansion-panel[1]/div/div/mat-card/div/div[2]/view-product[3]")
    public WebElement tirarBilhete3;

    @FindBy(xpath = "html/body/div[3]/div/div/mat-snack-bar-container/div/div/div/div/simple-snack-bar/div[1]")
    public WebElement spanMensagem;


    public EcommercePO(WebDriver driver) {
        super(driver);
    }
}
