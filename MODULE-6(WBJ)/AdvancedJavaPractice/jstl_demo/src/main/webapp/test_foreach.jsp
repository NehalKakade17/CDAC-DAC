<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<p>Session timeout: ${pageContext.session.maxInactiveInterval} seconds</p>
<UL>
	<c:forEach var="seconds" begin="100"
		end="${pageContext.session.maxInactiveInterval}" 
		step="50">
		<LI>${seconds}seconds value<br />
	</c:forEach>
	<LI>Timeout exceeded.
</UL>
