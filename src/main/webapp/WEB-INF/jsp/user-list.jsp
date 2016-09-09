<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
</head>
<body>
	<!-- Category Table -->
	<div class="row">
            <div class="col-lg-8">
		<div class="panel panel-default">
        	<div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered">
                        <thead>
                            <tr>
                            	<th>ID</th>
                                <th class="col-md-3">Name</th>
                                <th>Birth date</th>
                                <th>Email Address</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${users }" var="user">
								<tr>
									<td><a data-toggle="modal" data-target="#${user.id }">${user.id }</a></td>
									<td>${user.firstname } ${user.middlename } ${user.lastname }</td>
									<td>${user.birthdate }</td>
									<td>${user.email }</td>
									<td><button type="button">View</button></td>
								</tr>
								<!-- Modal -->
								<div class="modal fade" id="${user.id }" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
								  <div class="modal-dialog" role="document">
								    <div class="modal-content">
								      <div class="modal-header">
								        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								        <h4 class="modal-title" id="myModalLabel">User</h4>
								      </div>
								      <div class="modal-body">
								      <div class="form-group" cssErrorClass="has-error">
											<label class="col-md-2 control-label">Name</label>
											<p class="col-md-4">${user.id }</p>
										</div>
								      	<div class="form-group" cssErrorClass="has-error">
											<label class="col-md-2 control-label">Name</label>
											<p class="col-md-4">${user.id }</p>
										</div>
										<div class="form-group" cssErrorClass="has-error">
											<label class="col-md-2 control-label">Name</label>
											<p class="col-md-4">${user.id }</p>
										</div>
										<div class="form-group" cssErrorClass="has-error">
											<label class="col-md-2 control-label">Name</label>
											<p class="col-md-4">${user.id }</p>
										</div>
								      	ID: ${user.id }
								      	Name: ${user.firstname } ${user.middlename} ${user.lastname }
								      	Email: ${user.email }
								      	Birth date: ${user.birthdate }
								      </div>
								      <div class="modal-footer">
								        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
								      </div>
								    </div>
								  </div>
								</div>
							</c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        	</div>
        	</div>
        </div>
		
		<script src="/js/jquery-3.1.0.min.js"></script>
		<script src="/js/bootstrap.min.js"></script>
</body>
</html>