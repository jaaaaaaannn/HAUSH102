$(document).ready(function() {

  $('#dex-chat').on('click', '#chat-submit', function(e) {
    e.preventDefault();

    message = $('#chat-input').val();
    message = message.toLowerCase();
    sendMessage();
    ai(message);
    clearInterval(aiAuto);

  });

  function aiAutoMessage() {
    var messageArray = [
      'Hello?',
      'Anyone there?',
      'Soooo boring...'
    ];

    sendMessage(messageArray);
  }

  var aiAuto = setInterval(aiAutoMessage, 10000);

  function ai(message) {
    if (message.indexOf('hi') >= 0) {
      var messageArray = [
        'Hello to you too!',
        'Waaaatssssuuuppp?!!',
        'HEY YOU!'
      ]
      sendMessage(messageArray);
    }
    else if (message.indexOf('cpe') >= 0) {
      var messageArray = [
        'JAVASCRIPT!!',
        'HTML5!!',
        'CSS3!!'
      ]
      sendMessage(messageArray);
    }
    else if (message.indexOf('ball') >= 0) {
      var messageArray = [
        'Ball is life <3',
        'Lets play basketball.',
        'For threeeee!!'
      ]
      sendMessage(messageArray);
    }
    else if (message.indexOf('sweg') >= 0) {
      var messageArray = [
        'AWESOME!!',
        'AWESOME!!',
        'BUK JOO'
      ]
      sendMessage(messageArray);
    }
    else {
        var messageArray = [
            'What do you mean?',
            'Wut wut wut?'
        ];
        sendMessage(messageArray);
    }
  }

  //scroll to latest chat-input
  function scrollToMessage() {
      var msgBox = $('#aichat-msg');
      var height = msgBox[0].scrollHeight;
      msgBox.scrollTop(height);
  }

  //send message
  function sendMessage(message) {
    if (message) {

        $('#chat-input').addClass('disabled');
        $('#chat-input').attr('disabled', 'disabled');
        $('#chat-submit').addClass('disabled');
        $('#chat-submit').attr('disabled', 'disabled');

        var respond = message[Math.floor(Math.random() * message.length)];

        setTimeout(function() {
            aiPre     = '<span class="ai-writing">Bot is writing... <i class="glyphicon glyphicon-pencil"></i></span>';
            aiVal     = respond;
            aiMessage = $('#aichat-msg').html() + '<p class="from-ai"><em><span class="user">BOT</span>' + aiPre + '</em></p>';
            $('#chat-input').attr('placeholder', 'Bot is writing...');
            $('#aichat-msg').html(aiMessage);
            scrollToMessage();
        }, 800);

        setTimeout(function() {
            aiMessageReplace = $('#aichat-msg .from-ai:last-child()');
            aiMessage = '<div class="text-holder ai" id="chat-msg"><div class="custom-chat"><p><span class="ai">BOT</span>'+aiVal+'</p></div></div>';
            $('#chat-input').attr('placeholder', 'message...');
            aiMessageReplace.html(aiMessage);
            scrollToMessage();
            $('#chat-input').removeClass('disabled');
            $('#chat-input').removeAttr('disabled');
            $('#chat-submit').removeClass('disabled');
            $('#chat-submit').removeAttr('disabled');
        }, 2800);

    } else {
        userInput = $('#chat-input').val();
        userMsg = $('#aichat-msg').html() + '<div class="text-holder user" id="chat-msg"><div class="custom-chat"><p><span class="user">YOU</span>'+userInput+'</p></div></div>';
        $('#aichat-msg').html(userMsg);
        scrollToMessage();
        $('#chat-input').val('');
    }

  }

});
