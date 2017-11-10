<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
  <head> 
    <title>My JSP 'index.jsp' starting page</title>
    
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
    	$(function(){
    		$("#sel").click(function(){
    			$("#list").show();
    			$("tbody").empty();
	    		$.ajax({
	    			type:"get",
	    			url:"/goodsreserve/getlist.json",
	    			data:{district:$("[name=district]").val()},
	    			dataType:"json",
	    			success:function(data){
	    				var html = "";
	    				for (var i = 0; i < data.length; i++) {
							 html += "<tr><td>"+data[i].id+"</td><td>"+data[i].goodsName+"</td><td>"+data[i].price+"</td><td>"+data[i].counts+"</td><td>"+data[i].statusName+"</td><td><a href='http://msi:8080/goodsreserve/update?id="+data[i].id+"'>修改</a>"+"</td></tr>";
						}
						$("tbody").append(html);
	    			},
	    			error:function(){
	    				alert("error");
	    			}
	    			
	    		});
    		});
    	});
    </script>
    
  </head>
  
  <body>
  
  	<div>
  		<span>请选择区域:</span>
  		<select name="district" style="width: 80px;height:30px">
  			<option value="0">朝阳订单</option>
  			<option value="1">海淀订单</option>
  			<option value="2">丰台订单</option>
  			<option value="3">宣武订单</option>
  			<option value="4">昌平订单</option>
  		</select>
  		<button id="sel">查询</button>
  	</div>
  	
  	<div id="list" hidden="hidden">
  	
  		<table border="1">
  		
  			<thead>
  				<tr>
  					<td>商品编号:</td>
  					<td>商品名称:</td>
  					<td>商品价格:</td>
  					<td>商品库存数量:</td>
  					<td>订单状态:</td>
  					<td>操作:</td>
  				</tr>
  			</thead>
  				
  			<tbody>
  				
  			</tbody>
  			
  		</table>
  	</div>
  
  </body>
</html>
