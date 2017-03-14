/**
 * Created by Joshua Rom on 3/13/2017.
 */
jQuery(document).ready(function() {
    jQuery("#submitbtn").click(function() {
        var input1 = jQuery("#input1").val();
        var input2 = jQuery("#input2").val();
        var operation = jQuery("#operation").find(":selected").val();
        var data = {};
        // jQuery(".message-output-holder").append('<div class="message-holder"><div class="message-info"><p><strong>'+ input1 +' is ' ++ ' '+ input2 +'</strong></div></div>');
        // jQuery("#message-input").val("");

        data["firstNumber"] = input1;
        data["secondNumber"] = input2;
        data["operation"] = operation;
        console.log(data);

        jQuery.ajax({
            type:"POST",
            url: "/api/calculate",
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify(data),
            success: function (data) {
                jQuery('.message-output-holder').append('<div class="message-holder"><div class="message-info">'
                    + '<p><strong>' + data.result + '</strong></p>'
                    +'</div></div>');
            }
        });
    });
});