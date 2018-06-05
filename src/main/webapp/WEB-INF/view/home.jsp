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
<input type="text" name="sname" id="Name"/>
<label>Date to execute :</label>
<input type="text" name="selected_date" id="datepicker"/>
<label>Select Date Format :</label>
<select id="format">
<option value="mm/dd/yy">Default - mm/dd/yyyy</option>
<option value="dd/mm/yy">dd/mm/yyyy</option>
<option value="yy-mm-dd">ISO 8601 - yyyy-mm-dd</option>
<option value="d M, y">Short - d M, y</option>
<option value="d MM, y">Medium - d MM, y</option>
<option value="DD, d MM, yy">Full - DD, d MM, yyyy</option>
<option value="&apos;day&apos; d &apos;of&apos; MM &apos;in the year&apos; yy">With text - 'day' d 'of' MM 'in the year' yyyy</option>
</select>
<input type="submit" id="submit" value="Submit">
</form>
</div>
</div>
             
    </body>
</html>