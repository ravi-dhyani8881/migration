<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
<!-- jQuery Code executes on Date Format option ----->
<script src="/script.js"></script>
<link rel="stylesheet" href="/style.css">

<html lang="en">
<body>
            
          <div class="container">
<h1>Add Schdular </h1>
<div class="main">
<form action="Schdular" method="get">
<label>Name :</label>
<input type="text" name="jobName" id="Name"/>
<label>DateTime :</label></br>
<input  id="datetime" name="dateTime" type="datetime-local" value="2000-01-01T00:00:00+05:00">
 
<input type="submit" id="submit" value="Submit">
</form>
</div>
</div>
             
    </body>
</html>