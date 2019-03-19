<%-- 
    Document   : home
    Created on : 19/03/2019, 08:23:53
    Author     : Gabriel
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amortização Americana</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %> 
         <center>
                <H1>Amortização Americana</H1> 
        
        <form>
            Valor Empréstimo: <input type="number" name="valorFinanciado">
            Taxa de juros (%): <input type="number" name="juros">
            Parcelas: <input type="number" name="mes"><br/>

            <br/><input type="submit" name="calcular" value="Calcular"><br/><br/>
            
            <% if(request.getParameter("calcular")!=null){ %>
                
                <% try{ %>
                <% int i=0; %>
                <% double vf = Double.valueOf(request.getParameter("valorFinanciado")); %>
                <% double meses = Double.valueOf(request.getParameter("mes")); %>
                <% double juros000 = Double.valueOf(request.getParameter("juros")); %>
                <% double amortizacao = 0; %>
                <% double totalAmortizacao = 0; %>
                <% double parc = 0; %>
                <% double totalParc = 0; %>
                <% double juros = 0; %>
                <% double totalJuros = 0; %>
                <% double saldoDev = 0; %>
                <% double juros999 = juros000/100; %>
                
                
                
                <table border="1">
                    <tr><td>X</td><td>Parcelas</td><td>Amortizações</td><td>Juros</td><td>Saldo Devedor</td></tr>
                    
                    <% for(i =1 ; i<=meses; i++){%>
                        <% saldoDev = vf; %>
                        <% juros =  juros999 * saldoDev; %>
                        <% parc = juros; %>
                        
                        <% if(i == meses){ %>
                            <% amortizacao = saldoDev; %>
                            <% saldoDev = 0; %>
                            <% parc = amortizacao + juros; %>
                        <% } %>
                       
                        <tr>
                            <td><%= i %></td>
                            <td><%= parc %></td>
                            <td><%= amortizacao %></td>
                            <td><%= juros %></td>
                            <td><%= saldoDev %></td>  
                        </tr>
                        
                        
                        
                        <% totalAmortizacao = totalAmortizacao + amortizacao; %>
                        <% totalJuros += juros; %>
                        <% totalParc += parc; %>
                            
                    <% }%>
                        
                
                    <tr>
                        <td> -> </td>
                        <td><%= totalParc %></td>
                        <td><%= totalAmortizacao %></td>
                        <td><%= totalJuros %></td>
                        <td><center><b> <- Total </b></center></td> 
                    </tr>
                </table>
                <center>

                    
                
                <% }catch(Exception e){%>
                    <h2 style="color:red">Por favor digite os campos necessários</h2>
                <% }%>
            <% } %>
        </form>
    </body>
      <div  class="min"> 
    </div>
    <footer>
         <%@include file="WEB-INF/jspf/footer.jspf"%>
    </footer>
</html>