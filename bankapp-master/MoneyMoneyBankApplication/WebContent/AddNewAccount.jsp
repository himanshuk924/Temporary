<!DOCTYPE html>
<html>
<head>
<title>Open New Account</title>
</head>
<style>
label {
	color: white;
}

#current, #saving, #amount {
	display: none;
}
</style>
<script>
	window.history.forward(1);
</script>
<script type="text/javascript">
	function show(aval) {
		if (aval == "sav") {
			saving.style.display = 'inline-block';
			amount.style.display = 'none';
			current.style.display = 'none';
		} else if (aval == "cur") {
			saving.style.display = 'none';
			amount.style.display = 'inline-block';
			current.style.display = 'inline-block';
		} else {
			saving.style.display = 'none';
			amount.style.display = 'none';
			current.style.display = 'none';
		}
	}
	function ShowHideDiv() {
		var chkYes = document.getElementById("nosal");
		var dvPassport = document.getElementById("amouunt");
		amount.style.display = chkYes.checked ? "block" : "none";
	}

	function check() {
		var Bdate = document.getElementById('dob').value;
		var amount = document.getElementById('amt').value;
		var ODL = document.getElementById('od').value;
		var chkYes = document.getElementById("nosal");
		var Yes = document.getElementById("sal");
		var dd = document.getElementById("type");
		var selectedItem = dd.options[dd.selectedIndex].value;
		var theBday = document.getElementById('resultBday');
		var ret = true;
		if (Math.floor((Date.now() - new Date(Bdate)) / (31557600000)) < 18) {
			alert("Age Must be 18 or greater");
			ret = false;
		} else if (selectedItem == "ch") {
			alert("Select Account Type");
			ret = false;
		} else if (selectedItem == "sav") {
			if (acc_add.c_salary.value == '') {
				alert("Error: Please select a radio button!");
				ret = false;
			} else if (chkYes.checked) {
				if (amount < 5000) {
					alert("Amount Must be 5000 or greater");
					ret = false;
				}
			}
		}

		else if (selectedItem == "cur") {
			if (amount < 1) {
				alert("Amount Must be greater then 0");
				ret = false;
			} else if (ODL < 10000) {
				alert("ODLimit Must be 10000 or greater");
				ret = false;
			}
		} else {
			ret = true;
		}

		return ret;

	}
</script>
<body>

	<div align="center">
		<div>
			<div>
				<div style="background: linear-gradient(white, blue);">
					<header style="background-color: white;">
						<h3 style="text-align: center; color: blue;">Open New Account</h3>
					</header>
					<article>
						<form onsubmit="return check()" id="add" action="add.app"
							name="acc_add" method="post">
							<div>
								<div>
									<label>Name</label> <input type="text"
										placeholder="Enter Your Full Name" required name="c_Name">
								</div>
								<br>
								<div>
									<label>Email</label> <input type="email"
										placeholder="Enter Your Email" required name="c_Email">

								</div>
								<br>
								<div>
									<label>Contact Number</label> <input type="tel"
										pattern="[2-9]{1}[0-9]{9}" placeholder="Enter Contact Number"
										required name="c_contact">
								</div>
								<br>
								<div>
									<label>Date of Birth</label> <input type="date" required
										name="c_dob" id="dob">
								</div>
							</div>
							<br>
							<div>
								<div>
									<div>
										<label>Gender</label>
									</div>
									<div>
										<label> <input type="radio" required="required"
											value="male" name="gender"> <span
											class="form-check-label"> Male </span>
										</label> <label> <input type="radio" required="required"
											value="Female" name="gender"> <span
											class="form-check-label"> Female</span>
										</label>
									</div>
								</div>
								<br>
								<div>
									<label>Address</label>
									<textarea placeholder="Enter Your Adress" name="c_Address"></textarea>

								</div>
							</div>
							<br>
							<div>
								<div>
									<label>Account Type</label> <select id="type"
										required="required"
										onchange="java_script_:show(this.options[this.selectedIndex].value)"
										name="c_AccType">
										<option value="ch">Choose...</option>
										<option value="sav">Savings</option>
										<option value="cur">Current</option>
									</select>
								</div>
								<div id="amount" style="display: none;">
									<label>Amount</label> <input type="number" id="amt"
										placeholder="Enter Amount" required" name="c_amount">
								</div>
							</div>
							<div>
								<div id="saving" style="display: none;">
									<label> <input type="radio" value="salary"
										onclick="ShowHideDiv()" name="c_salary" id="sal"> <span
										class="form-check-label"> Salary </span>
									</label> <label> <input type="radio" value="notSalary"
										onclick="ShowHideDiv()" name="c_salary" id="nosal"> <span
										class="form-check-label"> Not Salary</span>
									</label>
								</div>
								<div id="current" style="display: none;">
									<label>ODLimit</label> <input type="number" id="od"
										class="form-control" placeholder="Enter ODLimit"
										name="c_ODLimit">
								</div>
							</div>
							<div>
								<div>
									<br> <input type="submit" value="Create"
										class="btn btn-primary"> <input type="reset"
										value="clear" class="btn btn-light">
								</div>
							</div>
						</form>
					</article>
				</div>
			</div>
		</div>
	</div>
</body>
</html>