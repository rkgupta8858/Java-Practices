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
      h1 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
      }
      form {
        background: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        width: 350px;
      }
      table {
        width: 100%;
        border-collapse: collapse;
      }
      table td {
        padding: 10px;
        vertical-align: middle;
      }
      table td:first-child {
        text-align: right;
        font-weight: bold;
        color: #555;
      }
      table input[type="text"] {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 14px;
      }
      input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        border: none;
        padding: 10px;
        width: 100%;
        font-size: 16px;
        cursor: pointer;
        border-radius: 4px;
        margin-top: 10px;
      }
      input[type="submit"]:hover {
        background-color: #45a049;
      }
    </style>
  </head>
  <body>
    <form action="add.jsp" method="post">
      <h1>Add Employee Page</h1>
      <table>
        <tr>
          <td>Employee ID:</td>
          <td><input type="text" name="empId" placeholder="Enter Employee Id"></td>
        </tr>
        <tr>
          <td>Employee Name:</td>
          <td><input type="text" name="empName" placeholder="Enter Employee Name"></td>
        </tr>
        <tr>
          <td>Employee Salary:</td>
          <td><input type="text" name="empSal" placeholder="Enter Employee Salary"></td>
        </tr>
        <tr>
          <td colspan="2" style="text-align: center;">
            <input type="submit" value="Add Employee">
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>
