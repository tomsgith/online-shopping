$(function(){
	
	// solving the active menu problem
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
	     $('#listPrducts').addClass('active');
	     break;
	default:
		$('#listPrducts').addClass('active');
	    $('#a_'+ menu).addClass('active');
		break;
	}
	
})