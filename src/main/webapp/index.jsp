<html>

<body onload="sms()">
	<form id="demo" action="TwilioSend" method="post"></form>
	<h2>Mandar's SMS service</h2>
	
</body>
<script>
	function sms() {
		var sendsms = document.getElementById("demo");
		sendsms.submit();
		alert('Message sent');
	}
</script>
</html>