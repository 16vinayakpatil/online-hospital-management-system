<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="crt"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page isELIgnored="false"%>

<c:url var="forget" value="/Login/ForgetPassword"/>


<section  class="intro">
      <div class="intro-content">
        <div class="container">
          <div class="row">
           
            <div class="col-lg-6">
              <div class="form-wrapper">
                <div class="wow fadeInRight" >

                  <div class="panel panel-skin">
                    <div class="panel-heading">
                      <h3 class="panel-title">Login</h3>
                      <b><%@include file="BusinessMessage.jsp"%></b> 
                    </div>
                   
            
            
                    <div class="panel-body">
                    <sf:form action="Login" method="post" commandName="form" >
                      
                      
                      
                       
                       
                        <div class="row">
                        <s:bind path="userName">
                          <div class="col-xs-6 col-sm-6 col-md-6">
                            <div class="form-group">
                              <label>User Name</label>
                             	<sf:input path="userName" class="form-control" />
                              <div><font  color="red"><sf:errors path="userName" cssClass="help-block" /></font></div>
                            </div>
                          </div>
                          </s:bind>
                          
                          <s:bind path="password">
                          <div class="col-xs-6 col-sm-6 col-md-6">
                            <div class="form-group">
                              <label>Password</label>
                              <sf:input type="password" path="${status.expression}"
									class="form-control" />
                              <div><font
                        color="red"> <sf:errors path="${status.expression}" cssClass="help-block" /></font></div>
                            </div>
                          </div>
                          </s:bind>
                        </div>

                        <input type="submit" value="SignIn" name="operation" class="btn btn-skin btn-block btn-lg">

                        <p class="lead-footer"><a href="${forget}">Forget my password</a></p>

                      </sf:form>
                    </div>
                  </div>

                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

