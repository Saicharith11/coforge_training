<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>

<table border="1">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Quantity</th>
</tr>

<c:forEach items="${products}" var="p">

<tr>
    <td>${p.productId}</td>
    <td>${p.productName}</td>
    <td>${p.productPrice}</td>
    <td>${p.quantity}</td>
</tr>

</c:forEach>

</table>