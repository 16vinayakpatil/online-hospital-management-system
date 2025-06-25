<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="crt"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page isELIgnored="false"%>

<c:url var="addUrl" value="/ctl/Patient"></c:url>

<section class="intro">
	<div class="intro-content">
		<div class="container">
			<div class="row">

				<div class="col-lg-6">
					<div class="form-wrapper">
						<div class="wow fadeInRight">

							<div class="panel panel-skin">
								<div class="panel-heading">
									<h3 class="panel-title">Patient</h3>
									<b><%@include file="BusinessMessage.jsp"%></b>
								</div>


								<sf:form action="${addUrl}" method="post" commandName="form">
									<div class="panel-body">



										<sf:hidden path="id" />


										<div class="row">
											<s:bind path="firstName">
												<div class="col-xs-6 col-sm-6 col-md-6">
													<div class="form-group">
														<label>First Name</label>
														<sf:input path="firstName" class="form-control" />
														<div>
															<font color="red"><sf:errors path="firstName"  /></font>
														</div>
													</div>
												</div>
											</s:bind>

											<s:bind path="lastName">
												<div class="col-xs-6 col-sm-6 col-md-6">
													<div class="form-group">
														<label>Last Name</label>
														<sf:input path="lastName" class="form-control" />
														<div>
															<font color="red"> <sf:errors path="lastName"
																	 /></font>
														</div>
													</div>
												</div>
											</s:bind>
										</div>

										



										<s:bind path="email">

											<div class="form-group">
												<label>Email Address</label>
												<sf:input path="${status.expression}" class="form-control" />
												<div>
													<font color="red"><sf:errors
															path="${status.expression}"  /></font>
												</div>
											</div>

										</s:bind>
									

									<div class="row">
										<s:bind path="phoneNo">
											<div class="col-xs-6 col-sm-6 col-md-6">
												<div class="form-group">
													<label>Mobile No</label>
													<sf:input path="${status.expression}" class="form-control" />
													<div>
														<font color="red"><sf:errors
																path="${status.expression}"  /></font>
													</div>
												</div>
											</div>
										</s:bind>
										<s:bind path="gender">
											<div class="col-xs-6 col-sm-6 col-md-6">
												<div class="form-group">
													<label>Gender</label>

													<sf:select class="form-control" path="${status.expression}">
														<sf:option value="" label="Select" />
														<sf:options items="${genderMap}" />
													</sf:select>
													<div>
														<font color="red"> <sf:errors
																path="${status.expression}"  /></font>
													</div>
												</div>
											</div>
										</s:bind>
									</div>


									<div class="row">
										<s:bind path="dob">
											<div class="col-xs-6 col-sm-6 col-md-6">
												<div class="form-group">
													<label>Date Of Birth</label>
													<sf:input path="dob" class="form-control" />
													<div>
														<font color="red"><sf:errors path="dob"
																 /></font>
													</div>
												</div>
											</div>
										</s:bind>
										<s:bind path="city">
											<div class="col-xs-6 col-sm-6 col-md-6">
												<div class="form-group">
													<label>City</label>
													<sf:input path="city" class="form-control" />
													<div>
														<font color="red"> <sf:errors path="city"
																 /></font>
													</div>
												</div>
											</div>
										</s:bind>
									</div>

									<div class="row">
										<s:bind path="CNP">
											<div class="col-xs-6 col-sm-6 col-md-6">
												<div class="form-group">
													<label>C.N.P</label>
													<sf:input path="CNP" class="form-control" />
													<div>
														<font color="red"><sf:errors path="CNP"
																 /></font>
													</div>
												</div>
										</div>
										</s:bind>
										
										<s:bind path="age">
											<div class="col-xs-6 col-sm-6 col-md-6">
												<div class="form-group">
													<label>Age</label>
													<sf:input path="age" class="form-control" />
													<div>
														<font color="red"><sf:errors path="age"
																 /></font>
													</div>
												</div>
										</div>
										</s:bind>
										
									</div>



									
										
										<s:bind path="address">
											
												<div class="form-group">
													<label>Address</label>
													<sf:textarea rows="3" path="${status.expression}"
														class="form-control" />
													<div>
														<font color="red"> <sf:errors
																path="${status.expression}"  /></font>
													</div>
												</div>
										
										</s:bind>
									

									<input type="submit" value="Save" name="operation"
										class="btn btn-skin btn-block btn-lg">


								</sf:form>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>

</section>

