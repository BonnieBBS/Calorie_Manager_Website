<%-- 
    Document   : thanks
    Created on : Oct 16, 2014, 6:31:30 PM
    Author     : bonnie
--%>

<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Bonnie's first jsp</title>
        <link rel="stylesheet" href="main.css" type="text/css"/>
    </head>

    <body>
        <h1>Let's see the subscriber's profile!</h1>

        <p>Here is the information that you entered:</p>

        
        <label>First Name:</label>
        <span>${subscriber.firstName}</span><br>
        <label>Last Name:</label>
        <span>${subscriber.lastName}</span><br>
        <label>Birthday:</label>
        <span>${subscriber.birthday}</span><br>
        <label>Email:</label>
        <span>${subscriber.email}</span><br>
        <label>Tel:</label>
        <span>${subscriber.tel}</span><br>
        <label>Gender:</label>
        <span>${subscriber.gender}</span><br>
       
        <p>Thank you for your subscription. :D</p>

        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>

    </body>
</html>