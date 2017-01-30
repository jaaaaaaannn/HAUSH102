jQuery(document).ready(function() {

	// Fill select dropdown list
	for(var i = 1; i <= 10; i++) {
		jQuery("#number").append(
			'<option value="' + i + '">' + i + '</option>'
			);
	}

	jQuery("#show-button").click(function() {

		var number = jQuery("#number option:selected").text();

		$.ajax({
			url:"http://jsonplaceholder.typicode.com/users",
			success: function(data) {
				jQuery(".display-holder").remove();

				$.each(data, function() {
					if (this.id <= number) {
						if (jQuery(window).width() <= 768) {
							jQuery(".user-container").append(
								'<div class="user-holder">'
								+	'<div class="user-details">'
								+		'<div class="user-logo">'
								+			'<span>' + this.name.charAt(0) + '</span>'
								+		'</div>'
								+		'<div class="user-info">'
								+			'<p><strong>' + this.name + '</strong></p><br/>'
								+			'<p>@' + this.username + '</p><br/>'
								+			'<p>' + this.address.city + '</p>'
								+		'</div>'
								+	'</div>'
								+'</div>');
						} else {
							jQuery(".user-container").append(
								'<div class="user-holder">'
								+	'<div class="user-details">'
								+		'<div class="user-logo">'
								+			'<span>' + this.name.charAt(0) + '</span>'
								+		'</div>'
								+		'<div class="user-info">'
								+			'<p><strong>' + this.name + '</strong></p>'
								+			'<p>@' + this.username + '</p><br/>'
								+			'<p>' + this.email + '</p>'
								+			'<p>' + this.company.name + '</p><br/>'
								+			'<p>"' + this.company.catchPhrase + '"</p><br/>'
								+		'</div>'
								+	'</div>'
								+'</div>');
						}	
					}
				});

				jQuery("#back-button").removeClass("hidden");	
			},
			error: function() {
				alert("Error!");
			}
		});

	});

	jQuery("#back-button").click(function() {
		location.reload();
	}); 	
});