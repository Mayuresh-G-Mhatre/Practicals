webiopi().ready(function() {
webiopi().setFunction(4,"out");
var content, button;
content = $("#content");

button = webiopi().createGPIOButton(4,"Room 1");
content.append(button);
});
