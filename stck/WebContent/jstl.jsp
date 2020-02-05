<%@include file ="header.jsp" %>

<c:out value="HelloWorld" />


<br />
<c:set var= "name" value="Yasmin Mohammad" />
Name:<c:out value="${name }"/>
<c:remove var="name"/>
<br/>
Name:<c:out value="${name}" />

<!--  Loop: <br/>
<c:forEach var="i" begin="1" end="10" step="1">
<h2>${i}</h2>
</c:forEach>
-->

 <!--  Loop with Arrays: <br/>
<c:forEach var="i" items="1,2,44,5,66">
<h2>${i}</h2>
</c:forEach>
-->
<!--  Set:<br />
<c:set var="Income" scope="session" value="${23690*4}"/>  
<c:out value="${Income}"/>  
-->
<!--  Import:<br />
<c:import var="data" url="http://www.google.com"/>  
<c:out value="${data}"/>  

-->

<!--  Catch:<br />
<c:catch var ="catchtheException">  
    
</c:catch>  
  
<c:if test = "${catchtheException != null}">  
   <p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p>  
</c:if>  

-->
When:<br/>
 <c:set var="income" scope="session" value="${4000*4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  
