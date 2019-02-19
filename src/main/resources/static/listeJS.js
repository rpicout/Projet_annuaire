$(document).ready(function() {
	$('#tableauEtablissement').DataTable( {
        responsive: true,
        "pageLength": 10
    } );
});

$(document).ready(function() {
	$('#tableauCodePostal').DataTable( {
        responsive: true,
        "pageLength": 10
    } );
});

var reloadUrl = function() {
	var cp = document.getElementById("codePostal").value; 
	console.log(cp);
	window.location.href = "http://localhost:8080/rechercheCodePostal"+cp;
};