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

var reloadUrlSearch = function() {
	var cp = document.getElementById("codePostal").value; 
	window.location.href = "http://localhost:8080/rechercheCodePostal"+cp;
};

var reloadUrlMAJ = function() {
	console.log("slt");
	var id = document.getElementById("id").value; 
	window.location.href = "http://localhost:8080/modifierEtablissement"+id;
};