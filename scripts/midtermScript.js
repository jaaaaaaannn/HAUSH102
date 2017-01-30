jQuery(document).ready(function() {

	jQuery("#request-input").keyup(function() {
		jQuery(".user-info-holder").empty();
		var inputMessage = jQuery("#request-input").val();

		for (var i = 0; i <= inputMessage; i++){
			$.ajax({
				url:'https://jsonplaceholder.typicode.com/users/'+i,
				success: function(data) {
					jQuery(".user-info-holder").append('<div class="user-content"><div class="icon">'+data.name.charAt(0)+'</div><div class="info-container"><h2 class="name">'+data.name+'</h2><p class="username">@'+data.username+'</p></div><div class="info-container"><p class="website">'+data.website+'</p><p class="company">'+data.company.name+'</p></div><div class="info-container"><p class="catchPhrase">'+data.company.catchPhrase+'</p></div></div>');
				}
			});
		}
	});
});