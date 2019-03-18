package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amortizacao_002dconstante_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/menu.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Amortização Constante</title>\n");
      out.write("    </head>\n");
      out.write("    <header>\n");
      out.write("        ");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\" css/main.css\" />\n");
      out.write("\n");
      out.write("<h2>reservado header</h2>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("Menu:\n");
      out.write("<b><a href=\"home.jsp\">Home</a>\n");
      out.write("<a href=\"amortizacao-constante.jsp\">Constante</a>\n");
      out.write("<a href=\"amortizacao-americana.jsp\">Americana</a>\n");
      out.write("<a href=\"tabela-price.jsp\">Price</a></b>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("            <center>\n");
      out.write("                <H1>Amortizacao Constante</H1> \n");
      out.write("            <form>\n");
      out.write("                Valor Empréstimo: <input type=\"number\" name=\"emprestimo\">\n");
      out.write("                Taxa de Juros: <input type=\"number\" name=\"taxaJuros\">\n");
      out.write("                Parcelas: <input type=\"number\" name=\"numeroParcelas\">\n");
      out.write("                <input type=\"submit\" name=\"calcular\" value=\"calcular\">\n");
      out.write("            </form>  \n");
      out.write("            <table border=\"1>\"\n");
      out.write("                   \n");
      out.write("                     \n");
      out.write("                ");
 if (request.getParameter("calcular") != null) { 
      out.write("\n");
      out.write("                \n");
      out.write("                <tr><td>#</td><td>Parcela</td><td>Amortização</td><td>Juros</td><td>Saldo Devedor</td></tr>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                   ");

                try {
                    double emprestimo = Integer.parseInt(request.getParameter("emprestimo"));
                    double taxaJuros = Integer.parseInt(request.getParameter("taxaJuros"));
                    double numeroParcelas = Integer.parseInt(request.getParameter("numeroParcelas")); 
                    double amortizacao= emprestimo/numeroParcelas;
                    double juros= emprestimo*taxaJuros/100;
                    int i=1;
                    double parcela = amortizacao + juros;
                    double saldoAtualizado= emprestimo-amortizacao;
                    
                    double somaParcela=0, somaJuros=0;
                    
                    
                    for (i=1; i<= numeroParcelas; i++){          
                    
                 
      out.write("\n");
      out.write("                 <tr> \n");
      out.write("                    <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(parcela);
      out.write("</td> \n");
      out.write("                    <td>");
      out.print(amortizacao);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(juros);
      out.write("</td> \n");
      out.write("                    <td>");
      out.print(saldoAtualizado);
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");

                    juros= saldoAtualizado*taxaJuros/100;
                    parcela = amortizacao + juros;
                    saldoAtualizado= saldoAtualizado-amortizacao;
                    somaJuros= SomaJuros+juros;
                    
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                     } 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


                    }
                
                
                
                catch (Exception e) {}
              
                    
                        
                
                }
        
        
      out.write("\n");
      out.write("        \n");
      out.write("    </table> \n");
      out.write("    </center>\n");
      out.write("    <div  class=\"min\"> \n");
      out.write("    </div>      \n");
      out.write("    </body>\n");
      out.write("    <footer>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<center>Fatec Praia Grande - 4º Ciclo Nturno - POO</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
