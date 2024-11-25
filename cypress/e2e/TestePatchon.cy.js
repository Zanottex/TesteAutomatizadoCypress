describe('teste 1', () => {
  it('Teste de venda simples', () => {
    
    cy.visit('https://zanottin.testescard.limber.net.br/')
    cy.contains('O que está procurando?')
    cy.get('#mat-input-0').type('Bilhete para fundação')
    cy.get('.decoration-none').click()
    cy.get('section')
    // cy.get('#mat-input-0').type('Bilhete Fundação com sessão e embarque')
    // cy.get('.decoration-none').click()

  })
})