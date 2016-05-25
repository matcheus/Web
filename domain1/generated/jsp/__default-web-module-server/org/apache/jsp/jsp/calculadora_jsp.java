package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculadora_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>Calculadora</h2>\r\n");
      out.write("\t<form>\r\n");
      out.write("\t\tOperador 1: <input name=\"oper1\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\tOperação: <input name=\"op\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\tOperador 2: <input name=\"oper2\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<button>Calcular</button>\r\n");
      out.write("\t</form>\r\n");

String oper1Str = request.getParameter("oper1");
String opStr = request.getParameter("op");
String oper2Str = request.getParameter("oper2");

int oper1 = oper1Str == null ? 0 : Integer.parseInt(oper1Str);
opStr = opStr == null ? "" : opStr;
int oper2 = oper2Str == null ? 0 : Integer.parseInt(oper2Str);

int resultado = 0;

if (opStr.equals("+")) {
	resultado = oper1 + oper2;
} else if (opStr.equals("-")) {
	resultado = oper1 - oper2;
}

out.print("Resultado: " + resultado);

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
