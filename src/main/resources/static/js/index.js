var toMove = undefined;

$(document).ready(function(){
}).on('click', '#addSkillBtn', function(){
	console.log("Hi");
	//if($('#skillName').val() != ''){
		$('#addSkill').append('<input type="text" id="skillName" class="form-control" placeholder="Skill name"><input type="number" name="skillLevel" min="1" max="10"><button id="saveBtn" class="btn btn-default">Save</button>');
	//}
});

$(document).ready(function(){
}).on('click', '#toDo li', function(){
	$(this).toggleClass('pink');
	if($(this).hasClass('pink')){
		if(toMove != undefined) toMove.toggleClass('pink');
		toMove = $(this);
	}
	else toMove = undefined;
});

$(document).ready(function(){
}).on('click', '#moveTaskBtn', function(){
	if(toMove != undefined){
		$('#done').append(toMove);
		toMove.css('color', 'black');
		toMove = undefined;	
	}
});

$(document).ready(function(){	
}).on('click', '#done li', function(){
	$(this).remove();
});