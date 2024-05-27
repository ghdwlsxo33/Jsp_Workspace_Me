<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>JSP-Model2(MVC)-todoReg</title>
</head>
<body>
<h1><%= "임시 todoReg 화면." %>
</h1>
<form method="post" action="/todo/register">
    <input type="hidden" name="tno" value="1">
    <div>
        <input type="text" name="title" placeholder="제목을 입력해주세요.">
    </div>
    <div>
        <input type="date" name="dueDate">
    </div>
    <div>
        <input type="text" name="writer" placeholder="작성자를 입력해주세요.">
    </div>
    <div>
        Finishde : <input type="checkbox" name="finidhed">
    </div>
    <div>
        <button type="reset">초기화</button>
        <button type="submit">작성</button>
    </div>
</form>
</body>
</html>









