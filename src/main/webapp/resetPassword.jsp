<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html> 
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Book Store - ILP1</title>
<style> 
Body {
  font-family: Calibri, Helvetica, sans-serif;
  background-color: pink;
}
button { 
       background-color: #4CAF50; 
       width: 100%;
        color: orange; 
        padding: 15px; 
        margin: 10px 0px; 
        border: none; 
        cursor: pointer; 
         } 
 form { 
        border: 3px solid #f1f1f1; 
    } 
 input[type=text], input[type=password] { 
        width: 100%; 
        margin: 8px 0;
        padding: 12px 20px; 
        display: inline-block; 
        border: 2px solid green; 
        box-sizing: border-box; 
    }
 button:hover { 
        opacity: 0.7; 
    } 
  
      
   
 .container { 
        padding: 25px; 
        background-color: lightblue;
    } 
</style> 
</head>  
<body>  
	<h1 style="text-align:center;">Book Store - ILP1</h1>
    <h2> Reset Password </h2> 
    <form action="ResetServlet" method="post">
        <div class="container"> 
            <label>Email: </label> 
            <input type="text" placeholder="Enter EmailId" name="emailId" id="email" required>
            <button type="submit">Reset</button> 
             
            
            <span>Already Have an account? <a href="index.jsp"> login</a></span> 
			<br>
			<span>New User? <a href="register.jsp"> Register here! </a></span> 
        </div> 
    </form>   
</body>   
</html>

 
