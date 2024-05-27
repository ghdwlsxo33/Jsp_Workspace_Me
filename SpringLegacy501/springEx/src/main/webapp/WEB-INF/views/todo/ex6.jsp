<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>오늘 점심 메뉴</title>
</head>
<body>
<h1>ex5 서버에서 넘어온 데이터를 EL표기법으로 표시하기</h1>
<h1>오늘 먹은 점심1 : <c:out value="${menu}"/></h1>
<h1>오늘 먹은 점심2 : ${menu}</h1>
<h1>넘어온 todoDTO : ${todoDTO}</h1>
<h1>넘어온 todoDTO2 : <c:out value="${todoDTO.title}"/></h1>
<h1>넘어온 todoDTO dto : ${dto}</h1>
<h1>넘어온 todoDTO2 dto의 title의 효과는 getTitle() 같은 효과 : <c:out value="${dto.title}"/></h1>
</body>
</html>









