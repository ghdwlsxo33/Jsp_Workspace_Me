<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col">
            <nav class="navbar bg-primary navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
                <div class="container-fluid">
                    <a class="navbar-brand" href="/todo/list">목록보기</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="#">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Link</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                            </li>
                        </ul>
                        <form class="d-flex" role="search">
                            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <div class="row content">
        <div class="col">
<%--            <h1>부트 스트랩 5.3 Card 컴포넌트 Header and Footer 의 샘플 가져오기</h1>--%>
            <div class="card">
                <div class="card-header">
                    Featured
                </div>
                <div class="card-body">
                    <form method="post" action="/todo/register">
                        <input type="hidden" name="tno" value="1">
                        <div class="mb-3">
                            <label for="title" class="form-label">제목</label>
                            <input type="text" class="form-control" id="title" placeholder="제목을 입력해주세요.">
                        </div>
                        <div class="mb-3">
                            <label for="dueDate" class="form-label">일정</label>
                            <input type="date" class="form-control" id="dueDate">
                        </div>
                        <div class="mb-3">
                            <label for="writer" class="form-label">작성자명</label>
                            <input type="text" class="form-control" id="writer" placeholder="작성자를 입력해주세요.">
                        </div>
                        <div class="mb-3">
                            <label class="form-check-label" for="finished">Finished</label>
                            <input type="checkbox" class="form-check-input" id="finished" name="finished">
                        </div>
                        <div>
                            <button type="submit" class="btn btn-primary">작성</button>
                            <button type="reset" class="btn btn-danger">초기화</button>
                        </div>
                    </form>
                </div>

            </div>
            <div class="row footer">
                <div class="row fixed-bottom">
                    <footer class="py-1 my-1">
                        <p class="text-center text-muted">@부산 it 교육센터</p>
                    </footer>

                </div>
            </div>
        </div>
    </div>
</div>

    <script>
        const serverValidErrors = {}
        <c:forEach items="${errors}" var="error">
        serverValidErrors['${error.getField()}'] = '${error.defaultMessage}'
        </c:forEach>
        console.log(serverValidErrors)
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>

</body>
</html>
