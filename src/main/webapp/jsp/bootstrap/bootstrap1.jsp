<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="${pageContext.request.contextPath}/js/css/bootstrap/bootstrap.min.css" rel="stylesheet"> 
<title>智能学习开源社区</title>
</head>
<body>
<h1 class="">Hello, world!</h1>

 <h1>${pageContext.request.contextPath}</h1>  
 
<form class="form-inline" role="form">
  <div class="form-group">
    <label 	 for="name">名称</label>
    <input type="text" class="form-control" id="name" placeholder="请输入名称" style="height:25px; width:100px; font-size:0.5rem">
  </div>
  <div class="form-group">
    <label for="inputfile">文件输入</label>
    <input type="file" id="inputfile">
    <p class="help-block">这里是块级帮助文本的实例。</p>
  </div>
  <div class="checkbox">
    <label>
      <input type="checkbox">请打勾
    </label>
  </div>
  <button type="submit" class="btn btn-default">提交</button>
</form>
 
    <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery)  -->
      <script src="${pageContext.request.contextPath}/js/assets/lib/jquery-3.3.1.js"></script>
      <!-- 包括所有已编译的插件 -->
      <script src="${pageContext.request.contextPath}/js/assets/plugins/bootstrap/bootstrap.min.js"></script> 
</body>
</html>