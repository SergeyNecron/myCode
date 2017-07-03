<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Пользователи</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 16px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 2px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 20px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 2px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body>

<h2>Список пользователей</h2>
<c:url var="searchuser" value="/searchresults"/>
<form:form action="${searchuser}" commandName="searcheduser">
    <table width="30%">
        <tr> <td><spring:message text="Имя:  "/><form:input path="name"/> </td> </tr>
        <tr> <td><input class="but" type="submit" name="action" value="<spring:message text="Поиск"/>"/> </td> </tr>

    </table>
</form:form>

<c:if test="${!empty listUsers}">
    <table class = "tg">
        <tr>
            <th>№</th>
            <th>Имя</th>
            <th>Возраст</th>
            <th>Админ</th>
            <th>Дата</th>
            <th colspan="2" style="text-align: left">Редактирование</th>
        </tr>
        <c:forEach items="${listUsers}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td>
                        <c:if test="${user.admin}"> Да </c:if>
                        <c:if test="${!user.admin}"> Нет </c:if>
                        </td>
                    <td>${user.createDate}</td>
                    <td><a href="<c:url value='/edit/${user.id}'/>">Изменить</a></td>
                    <td><a href="<c:url value='/remove/${user.id}'/>">Удалить</a> </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

    <c:if test="${empty user.name}">
        <h3>Новый пользователь</h3>
         Значения не должны быть пустыми
    </c:if>

    <c:if test="${!empty user.name}">
        <h3>Редактирование пользователя</h3>
    </c:if>

    <c:url var="addAction" value="/users/add"/>

    <form:form action="${addAction}" commandName="user">
        <table>
            <c:if test="${!empty user.name}">
                <tr>
                    <td>
                        <form:label path="id">
                            <spring:message text="№"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="id" readonly="true" size="8" disabled="true"/>
                        <form:hidden path="id"/>
                    </td>
                </tr>
            </c:if>
            <tr>
                <td>
                    <form:label path="name">
                        <spring:message text="Имя"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="name"/>
                </td>
            </tr>
            <tr>
                <td class="param">
                    <form:label path="age">
                        <spring:message text="Возраст"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="age"/>
                </td>
            </tr>

            <tr>
                <td><form:label path="admin"><spring:message text="Админ"/></form:label></td>
                <td>
                    <form:checkbox path="admin" value="false"/>
                </td>
            </tr>

            <tr>
                <td colspan="2" style="text-align: left">
                    <c:if test="${!empty user.name}">
                    <input type="submit"
                           value="<spring:message text="Редактировать пользователя"/>"/>
                    </c:if>
                    <c:if test="${empty user.name}">
                    <input type="submit"
                           value="<spring:message text="Добавить пользователя"/>">
                    </c:if>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
