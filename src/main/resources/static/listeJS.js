$(document).ready(function() {
	$('#tableauEtablissement').DataTable();
});

collapseRow = function(){
	var row = document.getElementById("collapseRow");
	row.hidden(false);
}