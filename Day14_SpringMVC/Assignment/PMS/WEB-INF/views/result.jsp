<%@ page isELIgnored="false"%>

<h2>${msg}</h2>

<h3>${product.productId}</h3>
<h3>${product.productName}</h3>
<h3>${product.productPrice}</h3>
<h3>${product.quantity}</h3>

<br>

<a href="${pageContext.request.contextPath}/">
    Go Home
</a>