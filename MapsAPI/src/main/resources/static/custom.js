var map;
var contentString = '<h2>' + city + ', ' + state + '</h2>';

function initMap() {
    map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: 39.9612, lng: -89.9988 },
        zoom: 10,
    });

    let image = {url:'github.png', scaledSize: new google.maps.Size(50, 50)};

    let marker = new google.maps.Marker({
        position: coords,
        map: map,
        icon: image,
        animation: google.maps.Animation.BOUNCE
    });

    // var contentString = '<h2> Chandler, AZ</h2> <p>Where your dreams come true.</p>';

    const infowindow = new google.maps.InfoWindow({
        content: contentString
    });

    google.maps.event.addListener(marker,'click',()=> {
        infowindow.open(map,marker)
    });


}

