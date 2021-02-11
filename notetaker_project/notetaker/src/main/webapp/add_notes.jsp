<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h2>Please fill your note</h2>

		<form action="SaveNoteServlet" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">Note Title</label> 
				<input
				 name = "title"
					type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter here">

			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Note Description</label>
				<textarea
				name = "content"
				 id="content" placeholder="enter your content here"
					class="form-control">
				 </textarea>
			</div>
			
			<button type="submit" class="btn btn-primary">Add</button>
		</form>
	</div>
</body>
</html>