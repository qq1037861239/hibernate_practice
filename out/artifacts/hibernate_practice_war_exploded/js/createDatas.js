
var abc = ['0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g',
           'h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x',
           'y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
           'P','Q','R','S','T','U','V','W','X','Y','Z'];

var handle = null;

function dotOrder(length) {
    var str = '';
    for (var i = 0; i < length; i++) {
        str = str.concat(abc[Math.floor(Math.random() * 62)]);
    }
    return str;
}

function generateData() {
    var top = (Math.random() * 1000).toFixed(2);
    var bottom = (Math.random() * 1000).toFixed(2);
    var left = (Math.random() * 1000).toFixed(2);
    var right = (Math.random() * 1000).toFixed(2);
    var dot = dotOrder(12);
    return {
        top_d: top,
        bottom_d: bottom,
        left_d: left,
        right_d: right,
        dot: dot
    };
}

function sendData() {
    var xmh = new XMLHttpRequest();

    xmh.open("POST", "receive", true);
    xmh.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xmh.onreadystatechange = function() {
        if (xmh.readyState === 4 && xmh.status === 200 || xmh.status === 304) {
            console.log("success!")
        } else {
            console.log("failed!")
        }
    };
    xmh.send(JSON.stringify(generateData()));
}

function loopGen() {
    handle = setInterval(sendData, 250);
}

function stopGen() {
    clearInterval(handle);
}