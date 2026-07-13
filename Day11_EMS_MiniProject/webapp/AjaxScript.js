function getEmployeeDetails() {

	var eid = document.getElementById("eid").value;

	var req = new XMLHttpRequest();

	req.open("GET", "EmployeeServlet?eid=" + eid, true);

	req.onreadystatechange = function() {

		if (req.readyState == 4 && req.status == 200) {

			var result = req.responseText.trim();

			var arr = result.split(" ");

			if (arr[0] == "null") {

				document.getElementById("ename").value = "";
				document.getElementById("esalary").value = "";
				document.getElementById("dno").value = "";

			} else {

				document.getElementById("ename").value = arr[0];
				document.getElementById("esalary").value = arr[1];
				document.getElementById("dno").value = arr[2];

			}
		}
	};

	req.send();
}