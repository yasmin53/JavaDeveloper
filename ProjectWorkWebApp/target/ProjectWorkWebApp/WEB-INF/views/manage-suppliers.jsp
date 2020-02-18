<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="${supplierUrl}" modelAttribute="supplier">
<div class="row">
            <div class="col"><form:label path="id">ID</form:label></div>
            <div class="col">
            <form:input type="number" class="form-control" placeholder="id" path="id"/>
            </div>
          </div>
          <div class="row">
          <div class="col"><form:label path="username">Username</form:label></div>
            <div class="col"><form:input class="form-control" placeholder="Enter the Username" path="username" /></div>
          </div>
          <div class="row">
            <div class="col"><form:label path="password">Password</form:label></div>
            <div class="col"><form:input type="number" class="form-control" placeholder="Enter the Password" path="password"/></div>
          </div>
        </div>
        <hr>
        <div>
            <button type="button" class="btn btn-primary btn-block">Submit</button>
        </div>
         <br>
         <hr>
        <div>
            <table class="table table-striped" >
                <thead>
                  <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Username</th>
                    <th scope="col">Password</th>
                    <th scope="col">Actions</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>${supplier.id } </td>
                    <td>${supplier.username }</td>
                    <td>${supplier.password}</td>
                    <td><button type="button" class="btn btn-success"><i class="fas fa-edit"></i></button>
                      <button type="button" class="btn btn-danger"><i class="far fa-trash-alt"></i></button>
                    </td>
                  </tr>
                </tbody>
              </table>
      </div>
      </form:form>