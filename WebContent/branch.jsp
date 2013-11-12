<%@include file="header.jsp" %>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h3>BranchDetails</h3>
	<form name="user" action="login" method="post">
	<div class="container" style="75%;">
		<div class="row">
			<div class="form-group">
				<div class="col-sm-10">
				<label for="inputPassword3" class="col-sm-2 control-label">Code</label>
				<input type="text" class="form-control" placeholder="Code">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group">
				<div class="col-sm-10">
				<label for="inputPassword3" class="col-sm-2 control-label">BranchName</label>
				<input type="text" class="form-control" placeholder="BranchName">
				</div>
			</div>
		</div>
		<div class="row">
 		<div class="form-group">
    		 <div class="col-sm-offset-2 col-sm-10">
    			<input type="hidden"
					name="action" value="login">
      			<button type="submit" class="btn btn-primary">Submit</button>
      			<button type="reset" class="btn btn-primary">Reset</button>
    		</div>    		
  		</div>	
  		</div>
  		</div>
  		</form>	
  <%@include file="footer.jsp" %>
		