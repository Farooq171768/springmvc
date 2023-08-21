<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Hello, world!</title>
<script>
	// Wait for the document to fully load
	document.addEventListener("DOMContentLoaded", function() {
		// Check if the alert element exists
		const alertElement = document.querySelector(".alert");
		if (alertElement) {
			// Hide the alert after 5 seconds (5000 milliseconds)
			setTimeout(function() {
				alertElement.style.display = "none";
			}, 5000);
		}
	});
</script>
</head>
<body style="background: #e2e2e2">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<c:if
							test="${not empty requestScope['org.springframework.validation.BindingResult.student']}">
							<div class="alert alert-danger" role="alert">
								<form:errors path="student.*" />
							</div>
						</c:if>
						<h3 class="text-center">Complex Form</h3>
						<form action="handleForm" method="post">
							<div class="form-group mb-3">
								<label for="name" class="form-label">Your Name</label> <input
									type="text" id="name" placeholder="Enter Name" name="name"
									class="form-control" />
							</div>

							<div class="form-group mb-3">
								<label for="id" class="form-label">Your Id</label> <input
									type="text" id="id" placeholder="Enter ID" name="id"
									class="form-control" />
							</div>

							<!-- <div class="form-group mb-3">
								<label for="date" class="form-label">Your DOB</label> <input
									type="text" id="date" placeholder="dd/mm/yyyy" name="dob"
									class="form-control" />
							</div> -->
							<div class="form-group mb-3">
								<label for="date" class="form-label">Your DOB</label> <input
									type="text" id="date" placeholder="dd/mm/yyyy" name="dob"
									class="form-control" pattern="\d{1,2}/\d{1,2}/\d{4}"
									title="Please use the format dd/mm/yyyy" />
							</div>



							<div class="form-group mb-3">
								<label for="courses" class="form-label">Select Courses</label> <select
									class="form-select" name="courses" id="courses" multiple>
									<option vlaue="JAVA" selected>JAVA</option>
									<option value="Python">Python</option>
									<option value="C++">C++</option>
									<option value="Django">Django</option>
									<option value="Spring Framework">Spring Framework</option>
								</select>
							</div>
							<div class="form-group mb-3">
								<span class="ms-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="Male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="Female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>

							<div class="form-group mb-3">
								<label for="type" class="form-label">Select Type</label> <select
									class="form-select" name="type" id="type">
									<option vlaue="OldStudent" selected>Old Student</option>
									<option value="NormaStudent">Normal Student</option>
								</select>
							</div>

							<div class="card">
								<div class="card-body">
									<p>Your address</p>
									<div class="form-group mb-3">
										<label for="street" class="form-label">Your Street</label> <input
											type="text" id="street" placeholder="Enter street"
											name="address.street" class="form-control" />
									</div>
									<div class="form-group mb-3">
										<label for="city" class="form-label">Your City</label> <input
											type="text" id="city
									" placeholder="Enter city"
											name="address.city" class="form-control" />
									</div>
								</div>
							</div>
							<div class="container text-center mt-3">
								<button class="btn btn-outline-primary" type="submit">Submit</button>
							</div>
						</form>


					</div>

				</div>


			</div>

		</div>
	</div>
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>