<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>My JSP 'update.jsp' starting page</title>
  </head>
  
  <body>
  
  	<div>
  		<form action="${pageContext.request.contextPath }/updatesave" method="post">
  			<table>
  			
  				<tr>
  					<td>商品编号:</td>
  					<td> <input type="text" name="id" value="${good.id }"/> </td>
  				</tr>
  				<tr>
  					<td>商品名称:</td>
  					<td> <input type="text" name="goodsName" value="${good.goodsName }"/> </td>
  				</tr>
  				<tr>
  					<td>商品价格:</td>
  					<td> <input type="text" name="price" value="${good.price }"/> </td>
  				</tr>
  				<tr>
  					<td>库存数量:</td>
  					<td> <input type="text" name="counts" value="${good.counts }"/> </td>
  				</tr>
  				<tr>
  					<td>订单状态:</td>
  					<td> 
  						<select name="status">
  							<option
  							<c:if test="${good.status == 0 }">
  								selected="selected"
  							</c:if>
  							 value="0" >待处理</option>
  							 
  							<option
  							<c:if test="${good.status == 1 }">
  								selected="selected"
  							</c:if>
  							 value="1" >处理中</option>
  							 
  							<option 
  							<c:if test="${good.status == 2 }">
  								selected="selected"
  							</c:if>
  							value="2" >已处理</option>
  							
  						</select>
  						
  						<span>${error }</span>
  						
  					 </td>
  				</tr>
  				
  				<tr>
  					<td> <input type="submit" value="提交"/> </td>
  					<td> <input type="button" value="返回"/> </td>
  				</tr>
  				
  			</table>
  		</form>
  	</div>
  
  </body>
</html>
