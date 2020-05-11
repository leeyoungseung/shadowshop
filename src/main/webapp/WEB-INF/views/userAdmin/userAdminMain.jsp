<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../adminTop.jsp"  %>
<div class="container">
    <div class="jumbotron">
        <h1 class="text-center">회원 관리 메인 </h1>
        <p class="text-center">이곳 에서는 회원의 등록 / 수정 / 블럭 / 삭제등의 관리기능을 제공합니다.</p>
	</div>
	<div>
	<h2 class="text-left">회원 검색</h2>
	</div>
	<div style="border: 1px">
    <form action="">
        <div class="form-group">
            <label >회원 WebID : </label>
            <input type="text" class="" id="webid">
        </div>
        <div>
            <label for="uname"></label>
            <label for="uname">Start : </label>
            <input type="text" class="" id="startDate">
            <label for="uname">End : </label>
            <input type="text" class="" id="endDate">
        </div>
        <div>
        <input type="reset" value="클리어">
        <button type="button" id="searchStart">검색하기</button>
        </div>
    </form>

    </div>
    <div>
    <br>
    </div>
    <div>
    <table id="searchedResults" class="table" border="1">
    <thead class="thead-light">
        <tr>
            <th>NO</th>
            <th>ID(E-Mail)</th>
            <th>Name</th>
            <th>Nick-Name</th>
            <th>Joined Date</th>
            <th>Status</th>
        </tr>
    </thead>
    <tbody id="searchedResultsBody" class="thead-light">
    

    </tbody>
    </table>
    <div class="box-footer" >
        <div class="text-center" style="height: 100px;line-height: 100px;text-align: center;">
            <ul id="paging" style="list-style:none;margin:0;padding:0;">

            </ul>
        </div>
    </div>
    </div>
</div>
</body>
    
<script type="template" id="searchTemplate" type="text/x-handlebars-template">
{{#each .}}
        <tr class="searchedList">
            <td>{{userNo}}</td>
            <td><a href="">{{userWebId}}</a></td>
            <td>{{userName}}</td>
            <td>{{userNickName}}</td>
            <td>{{prettifyDate userJoinedDate}}</td>
            <td>{{userStatus}}</td>
        </tr>
{{/each}}
</script>

<script type="text/javascript">
$(document).ready(function() {

	Handlebars.registerHelper("prettifyDate", function(timeValue) {
		  var dateObj = new Date(timeValue);
		  var year = dateObj.getFullYear();
		  var month = dateObj.getMonth() + 1;
		  var date = dateObj.getDate();
		  return year + "/" + month + "/" + date;
		 });
	
    var printData = function(searchArr, target, templateObject) {
    	var template = Handlebars.compile(templateObject.html());
    	var html = template(searchArr);
    	$(".searchedList").remove();
    	target.append(html);
    }
    
    var printPaging = function (pu, target){
    	var pagingStr = "";
    	if (pu.prev) {
    		pagingStr += "<li id='pagePrev' value='"+(pu.startPage - 1)+"' style='margin:0 0 0 0;padding:0 0 0 0;border:0;float:left;'>&laquo; prev</li>";
    	}
    	
    	for (var i = pu.startPage, len = pu.endPage; i <= len; i++) {
    		var strClass = pu.dto.currentPage == i ? 'class=active' : '';
    		pagingStr += "<li class='pageNum' style='margin:0 0 0 0;padding:0 0 0 0;border:0;float:left;'>&nbsp;"+ i +"&nbsp;</li>"
    	}
    	
    	
    	if (pu.next){
    		pagingStr += "<li id='pageNext' value='"+(pu.endPage + 1)+"' style='margin:0 0 0 0;padding:0 0 0 0;border:0;float:left;'>next &raquo;</li>";
    	}
    	
    	target.html(pagingStr);
    }
    
    function getList(no) {
    	var actionURL = "/userAdminRest/list";
    	actionURL += no;
    	$.getJSON(actionURL, function(data){
    		printData(data.userInfoList,$('#searchedResultsBody'),$("#searchTemplate"));
    		printPaging(data.pagingUtil,$('#paging'));
    	});
    }
    
    
    $("#searchStart").on("click", function(){
    	getList("");
    });
    
    $(document).on("click",".pageNum", function(){
    	var num = $(this).text();
    	num *=1;
    	param="?currentPage=";
    	param += num;
    	getList(param);
    });
    
    $(document).on("click","#pagePrev", function(){
    	var num = $(this).val();
    	num *=1;
    	param="?currentPage=";
    	param += num;
    	getList(param);
    });
    
    $(document).on("click","#pageNext", function(){
    	var num = $(this).val();
    	num *=1;
    	param="?currentPage=";
    	param += num;
    	getList(param);
    });
    

});
</script>
</html>