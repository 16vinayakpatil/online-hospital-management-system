<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="crt"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page isELIgnored="false"%>



<c:url var="addUrl" value="/ctl/Receptionist" />

<c:url var="addSearch" value="/ctl/Receptionist/Search" />

<c:url var="editUrl" value="/ctl/Receptionist?id=" />


<section class="intro">
	<div class="intro-content">
		<div class="container">
			<center>
				<h2 align="center">Receptionist List</h2>
			</center>
			<br>
			<sf:form action="${addSearch }" method="post"
						 commandName="form">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Last Name</th>
							<th scope="col">Email Address</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<s:bind path="lastName">
								<td><sf:input path="lastName" class="form-control" /></td>
							</s:bind>
							<s:bind path="email">
								<td><sf:input path="email" class="form-control" /></td>
							</s:bind>
							<td><input type="submit" class="btn btn-primary"
								name="operation" value="Search">
								<input type="submit" class="btn btn-primary"
								name="operation" value="Reset"></td>
						</tr>
					</tbody>
				</table>
				<center>
					<b><%@include file="BusinessMessage.jsp"%></b>
				</center>

					<sf:input type="hidden" path="firstName" />
					
					

					<sf:input type="hidden" path="pageNo" />
					<sf:input type="hidden" path="pageSize" />

					<sf:input type="hidden" path="listsize" />
					<sf:input type="hidden" path="total" />
					<sf:input type="hidden" path="pagenosize" />

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col"><input type="checkbox" id="selectall">Select
								All</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Email Address</th>
							<th scope="col">Mobile No</th>
							<th scope="col">City</th>
							<th scope="col">Address</th>
							<th scope="col">Edit</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${list}" var="rep" varStatus="ct">
						<tr>

							<th scope="row"><input type="checkbox" class="case"
								name="ids" value="${rep.id}"></th>
							<td><c:out value="${rep.firstName}" /></td>
							<td><c:out value="${rep.lastName}" /></td>
							<td><c:out value="${rep.emailId}" /></td>
							<td><c:out value="${rep.phoneNo}" /></td>
							<td><c:out value="${rep.city}" /></td>
							<td><c:out value="${rep.address}" /></td>
							
							<td align="center"><a class="btn btn-primary"
								href="${editUrl} ${rep.id}">Edit</a></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<table>
					<thead>
						<tr>
							<td><input type="submit" name="operation" <c:if test="${form.pageNo == 1}">disabled="disabled"</c:if>
								class="btn btn-primary" value="Previous"
								></td>

							<td><input type="submit" name="operation"
								class="btn btn-primary" value="New"></td>

							<td><input type="submit" name="operation" <c:if test="${listsize== 0}">disabled="disabled"</c:if>
								class="btn btn-primary" value="Delete"
								></td>

							
							<td align="right"><input type="submit" name="operation" <c:if test="${total == pagenosize  || listsize < pageSize   }">disabled="disabled"</c:if>
								class="btn btn-primary" value="Next"></td>
					</thead>
				</table>
				
			</sf:form>
		</div>
	</div>
</section>
