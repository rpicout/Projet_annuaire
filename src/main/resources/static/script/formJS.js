var reloadUrlMAJ = function() {
	var id = document.getElementById("id").value; 
	window.location.href = "http://localhost:8080/modifierEtablissement"+id;
};

var submit = function() {
	var id = document.getElementById("id2").value; 
	var nom = document.getElementById("nom").value; 
	var tel = document.getElementById("tel").value; 
	var fax = document.getElementById("fax").value; 
	var web = document.getElementById("web").value; 
	var mail = document.getElementById("mail").value; 
	var type = document.getElementById("type").value; 
	var statut = document.getElementById("statut").value; 
	var cacademie = document.getElementById("cacademie").value; 
	var lacademie = document.getElementById("lacademie").value; 
	var onisep = document.getElementById("onisep").value; 
	var siret = document.getElementById("siret").value; 
	var adr1 = document.getElementById("adr1").value; 
	var adr2 = document.getElementById("adr2").value; 
	var adr3 = document.getElementById("adr3").value; 
	var cp = document.getElementById("cp").value; 
	var ccommune = document.getElementById("ccommune").value; 
	var ncommune = document.getElementById("ncommune").value; 
	var cdep = document.getElementById("cdep").value; 
	var ldep = document.getElementById("ldep").value; 
	var cregion = document.getElementById("cregion").value; 
	var lregion = document.getElementById("lregion").value; 
	var x = document.getElementById("x").value; 
	var y = document.getElementById("y").value; 
	var latitude = document.getElementById("latitude").value; 
	var longitude = document.getElementById("longitude").value; 
	var precision = document.getElementById("precision").value; 
	var epsg = document.getElementById("epsg").value; 
	var maternelle = document.getElementById("maternelle").value; 
	var elementaire = document.getElementById("elementaire").value; 
	var generale = document.getElementById("generale").value; 
	var technologique = document.getElementById("technologique").value; 
	var professionnelle = document.getElementById("professionnelle").value; 
	var resto = document.getElementById("resto").value; 
	var hebergement = document.getElementById("hebergement").value; 
	var ulis = document.getElementById("ulis").value; 
	var apprentissage = document.getElementById("apprentissage").value; 
	var segpa = document.getElementById("segpa").value; 
	var arts = document.getElementById("arts").value; 
	var cinema = document.getElementById("cinema").value; 
	var theatre = document.getElementById("theatre").value; 
	var sport = document.getElementById("sport").value; 
	var internationale = document.getElementById("internationale").value; 
	var europeenne = document.getElementById("europeenne").value; 
	var agricole = document.getElementById("agricole").value; 
	var militaire = document.getElementById("militaire").value; 
	var metiers = document.getElementById("metiers").value; 
	var postBAC = document.getElementById("postBAC").value; 
	var aep = document.getElementById("aep").value; 
	var greta = document.getElementById("greta").value; 
	var nbEleves = document.getElementById("nbEleves").value; 
	var typeContrat = document.getElementById("typeContrat").value; 
	var circonscription = document.getElementById("circonscription").value; 
	var dateOuvert = document.getElementById("dateOuvert").value; 
	var dateMAJ = document.getElementById("dateMAJ").value; 
	var etat = document.getElementById("etat").value; 
	var ministere = document.getElementById("ministere").value; 
	var multilignes = document.getElementById("multilignes").value; 
	var rpic = document.getElementById("rpic").value; 
	var rpid = document.getElementById("rpid").value; 
	var cnature = document.getElementById("cnature").value; 
	var lnature = document.getElementById("lnature").value; 

	window.location.href = "http://localhost:8080/modifierEtablissement/id="+id+"/nom="+nom+"/tel="+tel+"/fax="+fax+"/web="+web+"/mail="+mail+"/type="+type+"/statut="+statut+"/cacademie="+cacademie+
		"/lacademie="+lacademie+"/onisep="+onisep+"/siret="+siret+"/adr1="+adr1+"/adr2="+adr2+"/adr3="+adr3+"/cp="+cp+"/ccommune="+ccommune+"/ncommune="+ncommune+"/cdep="+cdep+"/ldep="+ldep+"/cregion="+
		cregion+"/lregion="+lregion+"/x="+x+"/y="+y+"/latitude="+latitude+"/longitude="+longitude+"/precision="+precision+"/epsg="+epsg+"/maternelle="+maternelle+"/elementaire="+elementaire+"/generale="+
		generale+"/technologique="+technologique+"/professionnelle="+professionnelle+"/resto="+resto+"/hebergement="+hebergement+"/ulis="+ulis+"/apprentissage="+apprentissage+"/segpa="+segpa+"/arts="+
		arts+"/cinema="+cinema+"/theatre="+theatre+"/sport="+sport+"/internationale="+internationale+"/europeenne="+europeenne+"/agricole="+agricole+"/militaire="+militaire+"/metiers="+metiers+"/postBAC="+
		postBAC+"/aep="+aep+"/greta="+greta+"/nbEleves="+nbEleves+"/typeContrat="+typeContrat+"/circonscription="+circonscription+"/dateOuvert="+dateOuvert+"/dateMAJ="+dateMAJ+"/etat="+etat+"/ministere="+
		ministere+"/multilignes="+multilignes+"/rpic="+rpic+"/rpid="+rpid+"/cnature="+cnature+"/lnature="+lnature;
}