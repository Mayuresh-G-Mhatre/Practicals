<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Currency Converter</title>
    </head>
    <body>
        <h1>Currency Converter</h1>
        <hr>
        <p>Enter an amount to convert:</p>
        <form method="post" action="ConvertCurrencyServlet">
            <table style="width: 100%; padding: 0px; border-spacing: 0px; border: 0px;">
                <tr>
                    <td> Convert: <br />
                        <input type="text" name="amount" value="1" size="10" tabindex="1" />
                        <div>Enter an amount</div>
                    </td>
                </tr>
                <tr>
                    <td> From this currency:<br />
                        <select name="From" size="3" tabindex="2">
                            <option value="USD">America (United States), Dollar (USD)</option>
                            <option value="INR">India, Rupee (INR)</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td> To this currency:<br />
                        <select name="To" size="3" tabindex="3">
                            <option value="USD">America (United States), Dollar (USD)</option>
                            <option value="INR">India, Rupee (INR)</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input name="cmdSubmit" type="submit" value="Submit" tabindex="4" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
