<%@ page import="java.util.*" %>
<html>
  <body>
    <h1> Beer Recomendations JSP </h1>
    <p>
      <%
        List styles = (List)request.getAttribute("styles");
        Iterator it = styles.iterator();
        while(it.hasNext()){
          out.print("<br>try: "+it.next());
        }
      %>
  <body>
</html>
