 jQuery(document).ready(function() {
    
	 jQuery("#calculate-btn").click(function() {

            var type = jQuery("#type").val();
            var firstinput = jQuery("#input1").val();
            var secondinput = jQuery("#input2").val();
            var data = { "type": type, 
                    "firstinput": firstinput, 
                    "secondinput":secondinput };
            $(".panel-body").scrollTop($(".panel-body")[0].scrollHeight);
            $.ajax({
                url:"calculate",
                type: "POST",
                data: JSON.stringify(data),
                contentType: "application/json",
                dataType: "json",
                success: function(data) {
                	
                	if(!data.status && data.message == "Cannot divide by zero."){
                		 $("#result-output").append('<li class="left clearfix">'+data.message+' </br></li>');
                	}
                	else if(!data.status && data.message == "Please enter a number."){
               		 $("#result-output").append('<li class="left clearfix">'+data.message+' </br></li>');
                	}
                	else if(data.status){
                		$("#result-output").append('<li class="left clearfix">'+data.firstinput+' '+data.type+' '+data.secondinput+' is <b>'+data.result+'</b></li>');
                	}
                	
                }
            });
    });
});