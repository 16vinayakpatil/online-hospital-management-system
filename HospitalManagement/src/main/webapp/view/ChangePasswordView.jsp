<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="crt"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page isELIgnored="false"%>

<c:url var="addUrl" value="/ctl/User/changepassword"></c:url>

	<section class="intro">
	<div class="intro-content">
		<div class="container">
			<div class="row">

				<div class="col-lg-6">
					<div class="form-wrapper">
						<div class="wow fadeInRight">

							<div class="panel panel-skin">
								<div class="panel-heading">
									<h3 class="panel-title">Change Password</h3>
									<b><%@include file="BusinessMessage.jsp"%></b>
								</div>
								<sf:form action="${addUrl }" method="post" commandName="form">

								<div class="panel-body">
									



										

										<div class="row">
										<s:bind path="oldPassword">
											<div class="col-xs-6 col-sm-6 col-md-6">
												<div class="form-group">
													<label>Old Password</label> <sf:input type="password" path="${status.expression}"
									class="form-control" />
													<div>
														<font color="red"><sf:errors path="${status.expression}" cssClass="help-block" /></font>
													</div>
												</div>
											</div>
											
											</s:bind>
										</div>

										<div class="row">
										<s:bind path="newPassword">
											<div class="col-xs-6 col-sm-6 col-md-6">
												<div class="form-group">
													<label>New Password</label> <sf:input type="password" path="${status.expression}"
														class="form-control" />
													<div>
														<font color="red"><sf:errors path="${status.expression}" cssClass="help-block" /></font>
													</div>
												</div>
											</div>
											</s:bind>
											<s:bind path="confirmPassword">
											<div class="col-xs-6 col-sm-6 col-md-6">
												<div class="form-group">
													<label>Confirm Password</label> <sf:input type="password" path="${status.expression}"
									class="form-control" />
													<div>
														<font color="red"><sf:errors path="${status.expression}" cssClass="help-block" /></font>
													</div>
												</div>
											</div>
											</s:bind>
										</div>
											
										</div>
										<input type="submit" value="ChangePassword"
											name="operation" class="btn btn-skin btn-block btn-lg">

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
