/**
 * ajax 요청시 서버에서 xml형식으로 데이터를 받아와서 처리.
 */
$(document).ready(function(){
	$.ajax( {
        url : '../res/foodInfo.xml',            
        dataType : 'xml',           
        success : function( result ) {//result:서버에서 온 xml data
            if ( $(result).find('foods').length > 0 ) {//find(): xml문서 안에서 원하는 태그 찾기
                $(result).find('food').each(function() {//each(): 찾은  book 태그 각각에 대하여 반복작업 수행
                    var div = $('<div class="pdlist col-md-4"></div>');
                    var div2=	$('<div class="thumbnail"></div>').css('padding', '10px');
                    
                    var a = $('<a href="detailPage1.jsp"></a>');
                    a.append($('<img>').attr('src', '../' + $(this).find('image').text()).css('width','300px').css('height','300px'));
	                div2.append(a);
	                
                    div2.append($('<div class="caption"></div>'));
	                div2.append($('<h3>'+$(this).find('name').text()+'</h3>').css('text-align','center'));
	                div2.append($('<hr>'));
	                div2.append($('<span>' + $(this).find('material').text() + '</span>').css('display','inline-block').css('overflow','hidden').css('height','150px'));
	             
	                div2.append($('<p>'));
	                div2.append($('<a href="#" class="btn btn-primary" role="button" >추가</a>').css('margin-left','225px').css('margin-right','5px'));
	                div2.append($('<a href="#" class="btn btn-default" role="button" >찜</a>'));
	                div2.append($('</p>'));
	                div.append(div2);
                    
                    $('#all_list').append(div);
                });
            }
        }
    }); 
});
