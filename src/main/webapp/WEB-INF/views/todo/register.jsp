<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>등록하기</h1>
<form action="/todo/register-views" method="post">
    <div>
        Title: <input type="text" name="title"/>
    </div>
    <div>
        DueDate: <input type="date" name="dueDate"/>
    </div>
    <div>
        Writer: <input type="text" name="writer"/>
    </div>
    <div>
        Finished: <input type="checkbox" name="finished"/>
    </div>

    <button name="submit">등록</button>
</form>

</body>
</html>
