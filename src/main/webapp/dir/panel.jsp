<%@ page import="model.Trip" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/search-panel" method="get">
    <label for="source">source:</label>
    <select name="source" id="source">
        <option value="tehran">Tehran</option>
        <option value="Qom">Qom</option>
        <option value="mashhad">Mashhad</option>
        <option value="shiraz">Shiraz</option>
        <option value="esfahan">Esfahan</option>
        <option value="mazandaran">Mazandaran</option>
    </select>
    <label for="destination">destination:</label>
    <select name="destination" id="destination">
        <option value="tehran">Tehran</option>
        <option value="Qom">Qom</option>
        <option value="mashhad">Mashhad</option>
        <option value="shiraz">Shiraz</option>
        <option value="esfahan">Esfahan</option>
        <option value="mazandaran">Mazandaran</option>
    </select>
    <label for="date">date:</label>
    <input name="date" type="date" value="2022-04-26" id="date" min="2022-01-01" max="2022-04-30" required>
    <button type="submit" value="search">search</button>

    <%if (request.getAttribute("tripList") != null) {%>
    <%List<Trip> trips = (List<Trip>) request.getAttribute("tripList");%>
    <table border="1px">
        <th>source</th>
        <th>destination</th>
        <th>date</th>
        <th>time</th>
        <th>buy</th>
        <%
            Collections.reverse(trips);
            for (Trip trip : trips) {
        %>
        <tr>
            <td><%=trip.getSource()%></td>
            <td><%=trip.getDestination()%></td>
            <td><%=trip.getDate()%></td>
            <td><%=trip.getTime()%></td>
            <td></td>
        </tr>
        <%}}%>
    </table>

</form>
</body>
</html>
