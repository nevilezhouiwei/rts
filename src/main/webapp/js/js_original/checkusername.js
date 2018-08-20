
  function validateForm(){
     if(checkUserName()&&checkPassword()&&checkRepassword()&&checkHobby()&&checkStatus()){
          alert("恭喜您！注册成功！");
		  return true;
      }else{
		 
		  return false;
	  }
	 
} 


function checkUserName(){
	//除去字符串两头的空格
    var name=document.getElementById("userName").value.trim();
    var nameRegex=/[a-zA-Z][0-9a-zA-Z]{3,5}$/;
    if(!nameRegex.test(name)){
        document.getElementById("nameInfo").innerHTML="用户名4到8个字符，不允许数字开头，且不能包含”@”和”#”字符";
    }else{
        document.getElementById("nameInfo").innerHTML="";
        return true;
    }

}

function checkPassword(){
    var password=document.getElementById("password").value.trim();
    var passwordRegex=/^[0-9A-Za-z_]\w{7,15}$/;
    if(!passwordRegex.test(password)){
        document.getElementById("passwordInfo").innerHTML="密码长度必须在8个字符到16个字符之间";
    }else{
        document.getElementById("passwordInfo").innerHTML="";
		return true;
    }
}
function checkRepassword(){
    var repassword=document.getElementById("repassword").value.trim();
	var password=document.getElementById("password").value.trim();

    //校验密码和上面密码必须一致
    if(repassword!==password){
        document.getElementById("repasswordInfo").innerHTML="两次输入的密码不一致";
    }else if(repassword==password){
        document.getElementById("repasswordInfo").innerHTML="";
		return true;
    }
}



function checkCerID(){
    var cerIDno=document.getElementById("cerIDno").value.trim();
    var cerIDnoRegex=/^[0-9]{17}(\d|X)$/;
    if(!cerIDnoRegex.test(cerIDno)){
        document.getElementById("cerIDnoInfo").innerHTML="身份证共18位，最后一位是数字或者大写字母X";
    }else{
        document.getElementById("cerIDnoInfo").innerHTML="";
		return true;
    }
}