// 1. http GET 요청
var getRequest = function(url) {
    var xhttp = new XMLHttpRequest()
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            alert(this.responseText)
        }
    }

    xhttp.open("GET", url, true)
    xhttp.send()
}