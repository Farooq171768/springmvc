<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"/>
<script src="<c:url value="/resources/javascript/script.js"/>"></script>

<title>Home Page!</title>
</head>
<body>
<div class="continer text-center">
	<img src="<c:url value="/resources/images/404error.png" />" alt="my_image"/>
</div>
		
	
	<%-- <c:url var="imageURL" value="/resources/images/My photo(1).jpeg" />

	<!-- The correct usage of the <img> tag with the resolved URL -->
	<div class="container text-center">
		<img src="${imageURL}" alt="my_image" />
	</div> --%>
	<div class="container">
		<div class="row">

			<div class="card mx-auto mt-5 bg-primary" style="width: 50%">
				<div class="card-body py-5">
					<h3 class="text-center text-white"
						style="text-transform: uppercase">My Search</h3>
					<form action="search" class="mt-3">
						<div class="form-group">
							<input type="text" name="querybox"
								placeholder="Enter your Keyword" class="form-control" />
						</div>
						<div class="container text-center">
							<button class="btn btn-outline-light mt-4">Search</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


	<!-- <script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
			crossorigin="anonymous"></script> -->

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>