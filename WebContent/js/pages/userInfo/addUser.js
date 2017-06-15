$(document).ready(function() {
	$("#btnSave").bind("click",btnSave_Click);
});
function btnSave_Click(){
	$.ajax({
		url:"save.do",
		type:"post",
		data:{
			"userinfoUsername":$("#loginname").val(),
			"userinfoPassword":$("#password").val(),
			"userType":$("#type").val(),
		},
		success:function(data){
			alert(data);
		}
	});
}
	
	