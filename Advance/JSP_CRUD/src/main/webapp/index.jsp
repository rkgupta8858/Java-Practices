<html>
  <head>
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
      }
      table {
        width: 400px;
        background: #fff;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        border-collapse: collapse;
        overflow: hidden;
      }
      th {
        background-color: #4CAF50;
        color: white;
        font-size: 18px;
        padding: 15px;
        text-align: center;
      }
      td {
        padding: 10px;
        text-align: left;
        border-bottom: 1px solid #ddd;
      }
      tr:last-child td {
        border-bottom: none;
      }
      td:first-child {
        width: 30px;
        text-align: center;
        font-weight: bold;
      }
      a {
        text-decoration: none;
        color: #4CAF50;
        font-size: 16px;
        font-weight: bold;
      }
      a:hover {
        color: #45a049;
      }
    </style>
  </head>
  <body>
    <table>
      <tr>
        <th colspan="2">Employee Operations</th>
      </tr>
      <tr>
        <td>1.</td>
        <td><a href="addemp.jsp">Add Employee</a></td>
      </tr>
      <tr>
        <td>2.</td>
        <td><a href="updateemp.jsp">Update Employee</a></td>
      </tr>
      <tr>
        <td>3.</td>
        <td><a href="deleteemp.jsp">Delete Employee</a></td>
      </tr>
      <tr>
        <td>4.</td>
        <td><a href="findemp.jsp">Find Employee</a></td>
      </tr>
      <tr>
        <td>5.</td>
        <td><a href="findall.jsp">Find All Employees</a></td>
      </tr>
    </table>
  </body>
</html>
