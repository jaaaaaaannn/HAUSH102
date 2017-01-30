jQuery(document).ready(function() {

	jQuery("#message-input").keypress(function(event) {
		if (event.keyCode == 13) {
                    $("#send-button").click();
                }
	});

	jQuery("#send-button").click(function() {
		var inputMessage = jQuery("#message-input").val();

		jQuery(".message-output-holder").append('<div class="message-holder"><img src="images/profile.png" class="profile-image"><div class="message-info"><p><strong>YOU</strong></p><p>' + inputMessage +'</p></div></div>');
		jQuery("#message-input").val("");

		$.ajax({
			url:"http://sandbox.api.simsimi.com/request.p?key=2fe0b429-f279-44ec-8236-4d73c71971fb&lc=en&ft=1.0&text=" + inputMessage,
			success: function(data) {
				jQuery(".message-output-holder").append('<div class="simsimi-message-holder"><div class=""><p><strong>SIMSIMI</strong><br />' + data.response +'</p><img src="images/simsimi.png" class="simsimi-image"></div></div>');
			}
		});
	});
});