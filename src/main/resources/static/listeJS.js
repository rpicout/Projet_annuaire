$(document).ready(function() {
	$('#tableauEtablissement').DataTable();
});

collapseRow = function(){
	var row = document.getElementById("collapseRow");
	row.hidden(false);
});

$(document).ready(function() {
	$('#tableauCodePostal').DataTable();
} );
