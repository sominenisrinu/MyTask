<%@include file="header.jsp" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="container" style="height: 75%;">
	<form name="user" action="login" method="post">
		<div class="row">
			<div class="form-group">
				<div class="col-sm-10">
				<label for="inputPassword3" class="col-sm-2 control-label">User Name</label>
				<input type="text" class="form-control" placeholder="User Name">
				</div>
			</div>
		</div>
		<div class="row">
		<div class="form-group">    		
    		<div class="col-sm-10">
    			<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
     			<input type="password" class="form-control" id="inputPassword3" placeholder="Password">
    		</div>
 		</div>		
 		</div>
 		<div class="row">
 		<div class="form-group">
    		 <div class="col-sm-offset-2 col-sm-10">
    			<input type="hidden"
					name="action" value="login">
      			<button type="submit" class="btn btn-primary">Sign in</button>
      			<button type="reset" class="btn btn-primary">Reset</button>
    		</div>    		
  		</div>	
  		</div>	
  		<br>
  		<div class="row" >
    	<div class="nav">
    		 <div class="col-sm-offset-2 col-sm-10">
    		<a href="forgotpassword.jsp" class="btn btn-primary">Forgot Password</a>
    		<a href="register.jsp" class="btn btn-primary">Register</a>
    		</div>
  		</div>	
  		</div>			
	</form>
	</div>
</body>
</html>
<%@include file="footer.jsp" %>