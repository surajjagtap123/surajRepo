<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

${listEmployees}

<c:forEach items="${listEmployees}" var="employee">
					<tr>
						<td>${employee.age}</td>
						<td>${employee.loc}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-todo?id=${employee.age}">Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-todo?id=${employee.age}">Delete</a></td>
					</tr>
				</c:forEach>