$(document).ready(function(){
	$('#fetch').click(function(){
		$.ajax({
			url: "http://localhost:8080/rest-crud/rest/json/metallica/get"
		}).then(function(data){
			console.log(data);
			$('#content').html(data.Name + " " + data.Email +""+ data.Password);
		});
	});

		
	$('#send').click(function(){
		$.ajax({
		    url: "http://localhost:8089/rest-crud/rest/json/metallica/post",
		    dataType: 'text',
		    type: 'post',
		    contentType: 'application/json',
		    data: JSON.stringify( { "title": $('#title').val(), "singer": $('#single').val() } ),
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
