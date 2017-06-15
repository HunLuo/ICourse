function checkAndSubmit() {
	var userName = document.getElementById("userName").value;
	var userPassword = document.getElementById("userPassword").value;
	var flag = true;
	document.getElementById("userNameWarning").style.display = "none";
	document.getElementById("passWarning").style.display = "none";
	if(userName == "") {
		flag = false;
		document.getElementById("userNameWarning").innerHTML = "用户名不能为空！";
		document.getElementById("userNameWarning").style.display = "inline";
	}
	if(userName != ""&&userName != "admin") {
		flag = false;
		document.getElementById("userNameWarning").innerHTML = "用户名错误！";
		document.getElementById("userNameWarning").style.display = "inline";
	}
	if(userPassword == "") {
		flag = false;
		document.getElementById("passWarning").innerHTML = "密码不能为空！";
		document.getElementById("passWarning").style.display = "inline";
	}
	if(userPassword != ""&&userPassword != "123456") {
		flag = false;
		document.getElementById("passWarning").innerHTML = "密码错误！";
		document.getElementById("passWarning").style.display = "inline";
	}
	
	if(flag) {
		window.location.href = "index.html";
	}
}