<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html><body>
<form action="${pageContext.request.contextPath}/save" method="post">
    <input type="hidden" name="id" value="${employee.id}" />
    Name: <input type="text" name="name" value="${employee.name}" /><br/>
    Department: <input type="text" name="department" value="${employee.department}" /><br/>
    Email: <input type="email" name="email" value="${employee.email}" /><br/>
    Salary: <input type="number" step="0.01" name="salary" value="${employee.salary}" /><br/>
    <input type="submit" value="Submit" />
</form>
</body></html>