$(document).ready(function(){
	$('#fetch').click(function(){
		$.ajax({
			url: "http://localhost:8080/rest-jackson-simple/rest/json/nikhilesh/get"
		}).then(function(data){
			console.log(data);
			$('#content').html(data.Name + " " + data.Email +""+ data.Password);
		});
	});

		
	$('#send').click(function(){
		$.ajax({
		    url: "",
		    dataType: 'text',
		    type: 'post',
		    contentType: 'application/json',
		    data: JSON.stringify( { "Name": $('#Name').val(), "Email": $('#Email').val(),
		    	"Password": $('#Password').val() } ),
		    processData: false,
		    success: function( data, textStatus, jQxhr ){
		        $('#response pre').html( JSON.stringify( data ) );
		    },
		    error: function( jqXhr, textStatus, errorThrown ){
		        console.log( errorThrown );
		    }
		});
	});
});
