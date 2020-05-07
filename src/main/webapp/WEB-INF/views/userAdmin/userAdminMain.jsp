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
    </div>
</div>
</body>
    
<script type="template" id="searchTemplate" type="text/x-handlebars-template">
{{#each .}}
        <tr class="searchedList">
            <td>{{userNo}}</td>
            <td>{{userWebId}}</td>
            <td>{{userName}}</td>
            <td>{{userNickName}}</td>
            <td>{{userJoinedDate}}</td>
            <td>{{userStatus}}</td>
        </tr>
{{/each}}
</script>
<script>
$(document).ready(function() {

    var printData = function(searchArr, target, templateObject) {
    	var template = Handlebars.compile(templateObject.html());
    	var html = template(searchArr);
    	$(".searchedList").remove();
    	target.append(html);
    }
    
    function getList(actionURL) {
    	$.getJSON(actionURL, function(data){
    		printData(data,$('#searchedResultsBody'),$("#searchTemplate"));
    	});
    }
    
    $("#searchStart").on("click", function(){
    	getList("/userAdminRest/list");
    });
    
});
</script>
</html>