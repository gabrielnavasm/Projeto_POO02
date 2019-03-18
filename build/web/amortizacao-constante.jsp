<%-- 
    Document   : home
    Created on : 13/03/2019, 09:10:53
    Author     : Marcos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amortização Constante</title>
    </head>
    <header>
        <%@include file="WEB-INF/jspf/header.jspf"%>
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        </header>
    <body>
        
      
            <center>
                <H1>Amortização Constante</H1> 
            <form>
                Valor Empréstimo: <input type="number" name="emprestimo">
                Taxa de Juros: <input type="number" name="taxaJuros">
                Parcelas: <input type="number" name="numeroParcelas">
                <input type="submit" name="calcular" value="calcular">
            </form>  
            <table border="1>"
                   
                     
                <% if (request.getParameter("calcular") != null) { %>
                
                <tr><td>#</td><td>Parcela</td><td>Amortizações</td><td>Juros</td><td>Saldo Devedor</td></tr>
                
                    
                   <%
                try {
                    double emprestimo = Integer.parseInt(request.getParameter("emprestimo"));
                    double taxaJuros = Integer.parseInt(request.getParameter("taxaJuros"));
                    double numeroParcelas = Integer.parseInt(request.getParameter("numeroParcelas")); 
                    double amortizacao= emprestimo/numeroParcelas;
                    double juros= emprestimo*taxaJuros/100;
                    int i=1;
                    double parcela = amortizacao + juros;
                    double saldoAtualizado= emprestimo-amortizacao;
                    
                    double somaParcela=juros, somaJuros=juros;
                    
                    
                    for (i=1; i<= numeroParcelas; i++){          
                    
                 %>
                 <tr> 
                    <td><%=i%></td>
                    <td><%=parcela%></td> 
                    <td><%=amortizacao%></td>
                    <td><%=juros%></td> 
                    <td><%=saldoAtualizado%></td>
                    
                    
                    <%
                    
                    juros= saldoAtualizado*taxaJuros/100;
                    parcela = amortizacao + juros;
                    saldoAtualizado= saldoAtualizado-amortizacao;
                    somaJuros= somaJuros+juros;
                    somaParcela= somaParcela + parcela;
                    %>
                </tr>
                
                <%
                     } 
%>

<tr><td>#</td><td><%=somaParcela%></td><td><%=emprestimo%></td><td><%=somaJuros%></td><td>TOTAIS</td></tr>

<%

                    }
                
                
                
                catch (Exception e) {}
              
                    
                        
                
                }
        
        %>
        
    </table> 
    </center>
    <div  class="min"> 
    </div>      
    </body>
    <footer>
         <%@include file="WEB-INF/jspf/footer.jspf"%>
    </footer>
</html>
