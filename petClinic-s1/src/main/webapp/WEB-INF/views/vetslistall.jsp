<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

vetslistall.jsp

<table width="600" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td width=70> ID </td>
		<td> NAME </td>
		<td width = 350> Part </td>		
	</tr>
	<c:forEach items="${vetslist}" var="dto">
		<tr>
			<td>${dto.id}</td>
			<td>${dto.first_name}, ${dto.last_name}</td>
			<td>
				<c:forEach items="${vetspeslist}" var="vsdto" varStatus="vstatus">
				  <c:if test="${vsdto.vet_id == dto.id}">
				    ${specialtieslist[vsdto.specialty_id-1].name},
				  </c:if>
				</c:forEach>
			</td>
		</tr>
	</c:forEach>
</table>

<pre>
		// model :
		// vetslist - 의사정보 (id, first_name, last_name)
		// vetspeslist - 의사ID 와 전공ID 매핑 (vet_id, specialty_id)
		// specialtieslist - 전공 (id, name)
</pre>

<P><a href="list">FreeBoard</a>
<P><a href="vetslist">Pet-Clinic</a>

<P><a href="vetselect_view">수의사 전공별 열람</a>
<P><a href="vet_add_view">수의사 등록</a>
<P><a href="vet_add_major">의사 전공 정보 추가/수정</a>


</body>
</html>