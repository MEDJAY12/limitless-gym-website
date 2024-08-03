<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
    <title>Booking Successful</title>
    <style>
        body {
            background-color: #f0f8ff; /* AliceBlue */
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            text-align: center;
            margin-top: 50px;
            animation: fadeIn 1.5s ease-in-out;
        }

        h2 {
            color: #008000; /* Green */
            margin-bottom: 20px;
            font-size: 2em;
            animation: zoomIn 0.5s ease-in-out;
        }

        p {
            color: #333;
            font-size: 1.2em;
        }

        a {
            color: #007bff; /* Blue */
            text-decoration: none;
            font-weight: bold;
            border-bottom: 2px solid transparent;
            transition: border-bottom 0.3s ease-in-out;
        }

        a:hover {
            border-bottom: 2px solid #007bff;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }

        @keyframes zoomIn {
            from {
                transform: scale(0);
            }
            to {
                transform: scale(1);
            }
        }
    </style>
</head>
<body>
    <h2>Booking Successful!</h2>
    <p>Your booking has been processed successfully.</p>
    <p><a href="index.jsp">Back to Home</a></p>
</body>
</html>

