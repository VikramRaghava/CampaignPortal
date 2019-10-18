<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Campaign Analysis</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<script type="text/javascript">
	function fetchDetails() {
		$('#totalRecordsFetched').empty();
		$('#list_table_json tbody').empty();
		var selectedDepartment = $('#departmentSelect').val();
		var selectedSection = $('#sectionSelect').val();
		var selectedFamily = $('#familySelect').val();
		$.ajax({
			type : "GET",
			url : './getCampaignDetails',
			data : {
				department : selectedDepartment,
				section : selectedSection
			},
			cache : false,
			success : function(data) {
				console.log(data);
				if (data != "") {
					json = JSON.parse(data);
					var tr;
					console.log("Total records fetched: " + json.length);
					$('#totalRecordsFetched').append(
							"Total records fetched: " + json.length);
					for (var i = 0; i < json.length; i++) {
						tr = $('<tbody><tr id="dataSection">');
						tr.append("<td>" + json[i].department + "</td>");
						tr.append("<td>" + json[i].section + "</td>");
						tr.append("<td>" + json[i].campaignName + "</td>");
						tr.append("<td>" + json[i].campaignType + "</td>");
						tr.append("<td>" + json[i].campaignDate + "</td>");
						tr.append("<td>" + json[i].totalSales + "</td>");
						tr.append("<td>" + json[i].volumeSold + "</td>");
						tr.append("<td>" + json[i].incrSales + "</td>");
						tr.append("<td>" + json[i].incrSalesPercent + "</td>");
						tr.append("<td>" + json[i].incrMargin + "</td>");
						tr.append("<td>" + json[i].incrTraffic + "</td>");
						tr.append("<td>" + json[i].incrBasket + "</td>");
						tr.append("<td>" + json[i].incrTse + "</td>");
						tr.append("</tr></tbody>");
						$('#list_table_json').append(tr);
					}
				}
			},
			error : function(data) {
				console.log("error");
				alert("404. Please wait until the File is Loaded.");
			}
		});
	}
</script>
</head>
<body>
	<form name="campaignForm" method="GET">
		<div class="container form-group">
			<div>
				<label for="departmentSelect">Select department:</label> <select
					class="form-control" id="departmentSelect" name="department"
					style="max-width: 20%;">
					<option selected="selected">Department A</option>
					<option>Department B</option>
				</select>
			</div>
			<br>
			<div>
				<label for="sectionSelect">Select section:</label> <select
					class="form-control" id="sectionSelect" name="section"
					style="max-width: 20%;">
					<option selected="selected">SECTION A</option>
					<option>SECTION B</option>
					<option>SECTION C</option>
					<option>SECTION D</option>
				</select>
			</div>
			<br>
			<div>
				<label for="familySelect">Select family:</label> <select multiple
					class="form-control" id="familySelect" name="familyList"
					style="max-width: 20%;">
					<option>FAMILY A</option>
					<option>FAMILY B</option>
					<option>FAMILY C</option>
					<option>FAMILY D</option>
					<option>FAMILY E</option>
					<option>FAMILY F</option>
					<option>FAMILY G</option>
					<option>FAMILY H</option>
				</select>
			</div>
		</div>
		<div class="container">
			<input type="button" value="Get Details" onclick="fetchDetails()">
			<input type="button" value="Analyse Results" onclick="fetchDetails()">
		</div>
	</form>
	<br />
	<div class="container" style="max-width: 100%;">
		<h3>Campaign Performance - Overview</h3>
		<p id="totalRecordsFetched" class="label"></p>
		<table class="table table-responsive" id="list_table_json">
			<thead class="thead-dark">
				<tr>
					<th>DEPARTMENT</th>
					<th>SECTION</th>
					<th>CAMPAIGN NAME</th>
					<th>CAMPAIGN TYPE</th>
					<th>CAMPAIGN DATE</th>
					<th>TOTAL SALES</th>
					<th>VOLUME SOLD</th>
					<th>INCR SALES</th>
					<th>INCR SALES PERCENT</th>
					<th>INCR MARGIN</th>
					<th>INCR TRAFFIC</th>
					<th>INCR BASKET</th>
					<th>INCR TSE</th>
				</tr>
			</thead>
		</table>
	</div>
</body>
</html>