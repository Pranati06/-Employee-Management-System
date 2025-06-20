<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html><body>
<h2>Employees</h2>
<a href="/add">Add New</a><br/><br/>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Department</th><th>Email</th><th>Salary</th><th>Actions</th></tr>
<c:forEach items="${employees}" var="emp">
<tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.department}</td>
    <td>${emp.email}</td>
    <td>${emp.salary}</td>
    <td>
        <a href="/edit/${emp.id}">Edit</a>
        <a href="/delete/${emp.id}">Delete</a>
    </td>
</tr>
</c:forEach>
</table>
</body></html>