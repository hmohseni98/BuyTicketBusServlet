<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>home</title>
    <style>
        body {
            background-image: url("images/background.jpg");
            background-size: 100%;
            font-family: Helvetica, serif;
            color: white;
            text-align: center;
        }

        .center {
            position: fixed;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }

        div.main {
            height: 350px;
            width: 400px;
            padding-top: 30px;
            color: #fff;
            background: rgba(0, 0, 0, 0.11);
            backdrop-filter: blur(5px);
        }

        input.back {
            background-color: rgba(0, 0, 0, 0.2);
        }

        input {
            display: block;
            width: 300px;
            height: 35px;
            border: 0;
            color: white;
        }

        input.btn {
            margin-top: 110px;
            background-color: blueviolet;
            color: beige;
            font-size: 22px;
        }

        p {
            margin-top: 240px;
            color: azure;
        }

        a {
            text-decoration: none;
            color: lightgray;
        }

    </style>
</head>
<body>
<div class="main center">
    <div>
        <h1>Login</h1>
        <form action="login-page" method="get">
            <input class="center back" type="text" name="username" placeholder="  Username">
            <input class="center back" style="margin-top: 55px" type="password" name="password"
                   placeholder="  Password">
            <input class="center btn" type="submit" name="submit" value="Login">
        </form>
        <p>Not a member? <a href="//">sign up</a></p>
    </div>
</div>
</body>
</html>