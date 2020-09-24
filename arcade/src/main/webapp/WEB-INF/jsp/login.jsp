<html>

    <head>
        <link rel="stylesheet" href="/myDefault.css">
        <title>Login Page</title>
    </head>

    <body>
        <div id="form-box">
            <font color="red">${errorMessage}</font>
            <form method="post">
                Name : <input type="text" name="username" />
                Password : <input type="password" name="password" />
                <input type="submit" />
            </form>
            <a href="register"><h3>Click here to register</h3></a>
        </div>
    </body>

</html>