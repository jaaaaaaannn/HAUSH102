<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
       	<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.js"></script>
        <link rel="stylesheet" href="resources/style.css"/>
        <script type="text/javascript" src="resources/calculate.js"></script>
        <!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

		<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


    </head>
    <body>
    <div class="container">
    	<div class="row">
    	  <div class="col-lg-8 col-lg-push-2">
       	 <div class="panel panel-default">
		    <div class="panel-heading">Online Technology Final Exam</div>
		    <div class="panel-body">
    				<ul class="result-output" id="result-output">
                 
                    </ul>
	    		</div>
			</div>
				<div class="form-group">
				  <label for="sel1">Type:</label>
				  <select class="form-control" id="type">
				    <option>Addition</option>
				    <option>Subtraction</option>
				    <option>Divide</option>
				    <option>Multiply</option>
				  </select>
				</div>
				<div class="form-group">
				  <label for="inp1">Input 1:</label>
				  <input type="text" class="form-control" id="input1" placeholder="Please enter a number">
				</div>
				<div class="form-group">
				  <label for="inp2">Input 2:</label>
				  <input type="text" class="form-control" id="input2" placeholder="Please enter a number">
				</div>
				<div class="form-group">
				 <button type="button" class="btn btn-primary btn-block" id="calculate-btn">SUBMIT</button>
				</div>
			
			</div>
		</div>
	</div>
    </body>
</html>
