<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RPcart</title>
<%@include file="header.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<form class="row g-3" action=" profilservlet" method="post">
  <div class="col-md-6">
    <label for="inputName" class="form-label">Name</label>
    <input type="text" class="form-control" id="inputName">
  </div>
  <div class="col-md-6">
    <label for="inputEmail" class="form-label">Email</label>
    <input type="Email" class="form-control" id="Email">
  </div>
  <div class="col-12">
    <label for="inputAddress" class="form-label">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
  </div>
  <div class="col-12">
    <label for="inputAddress2" class="form-label">Address 2</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  <div class="col-md-6">
    <label for="inputCity" class="form-label">City</label>
    <input type="text" class="form-control" id="inputCity">
  </div>
  <div class="col-md-4">
    <label for="inputState" class="form-label">State</label>
    <select id="inputState" class="form-select">
      <option selected>Choose...</option>
      <option>Andhra Pradesh</option>
 
 <option>Arunachal Pradesh</option>
 
 <option>Assam</option>
 
 <option>Bihar</option>
 
 <option>Chhattisgarh</option>
 <option>Raipur</option>
 <option>Goa</option>
>
 <option>Gujarat</option>
 
 <option> Haryana</option>

 <option>Himachal Pradesh</option>

 <option>Jharkhand</option>
 
 <option>Karnataka</option>
 
 <option>Kerala</option>

<option>Madhya Pradesh</option>

<option>Maharashtra</option>

<option>Manipur</option>

<option>Meghalaya</option>

<option>Mizoram</option>

<option>Nagaland</option>

<option>Odisha</option>

<option>Punjab</option>

<option>Rajasthan</option>

<option>Sikkim</option>

<option>Tamil Nadu</option>

<option>Telangana</option>

<option>Tripura</option>

<option>Uttarakhand</option>

<option>Uttar Pradesh</option>

<option>West Bengal</option>

 
    </select>
  </div>
  <div class="col-md-2">
    <label for="inputZip" class="form-label">Pin</label>
    <input type="text" class="form-control" id="inputZip">
  </div>
  <div class="col-12">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <div class="col-12">
    <button type="submit" class="btn btn-primary">Submit</button>
  </div>
</form>

<%@include file="footer.jsp"%>
</body>
</html>