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
    <form action="" class="needs-validation" novalidate>
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
        <button id="searchStart">검색하기</button>
        </div>
    </form>

    </div>
    <div>
    <br>
    </div>
    <div>
    <table class="table" border="1">
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
    <tbody id="searchedResults">

    </tbody>
    </table>
    </div>
</div>
</body>
    <script>
        $(function() {
            //모든 datepicker에 대한 공통 옵션 설정
            $.datepicker.setDefaults({
                dateFormat: 'yy-mm-dd' //Input Display Format 변경
                ,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
                ,showMonthAfterYear:true //년도 먼저 나오고, 뒤에 월 표시
                ,changeYear: true //콤보박스에서 년 선택 가능
                ,changeMonth: true //콤보박스에서 월 선택 가능                
                ,showOn: "both" //button:버튼을 표시하고,버튼을 눌러야만 달력 표시 ^ both:버튼을 표시하고,버튼을 누르거나 input을 클릭하면 달력 표시  
                ,buttonImage: "http://jqueryui.com/resources/demos/datepicker/images/calendar.gif" //버튼 이미지 경로
                ,buttonImageOnly: true //기본 버튼의 회색 부분을 없애고, 이미지만 보이게 함
                ,buttonText: "선택" //버튼에 마우스 갖다 댔을 때 표시되는 텍스트                
                ,yearSuffix: "년" //달력의 년도 부분 뒤에 붙는 텍스트
                ,monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'] //달력의 월 부분 텍스트
                ,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip 텍스트
                ,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 부분 텍스트
                ,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 부분 Tooltip 텍스트
                ,minDate: "-1M" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
                ,maxDate: "+1M" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)                    
            });
 
            //input을 datepicker로 선언
            $("#startDate").datepicker();                    
            $("#endDate").datepicker();
            
            //From의 초기값을 오늘 날짜로 설정
            $('#startDate').datepicker('setDate', 'today'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
            //To의 초기값을 내일로 설정
            $('#endDate').datepicker('setDate', '+1D'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
        });
    </script>
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
    var printData = function(searchArr, target, templateObject) {
    	var template = Handlebars.compile(templateObject.html());
    	var html = template(searchArr);
    	$(".searchedList").remove();
    	target.after(html);
    }
    
    function getList(actionURL) {
    	$.getJSON(actionURL, function(data){
    		alert("start");
    		//alert(data[0].userWebId);
    		printData(data,$("#searchedResults"),$("#searchTemplate"));
    		alert("end"); 
    	});
    }
    
    $("#searchStart").on("click", function(){
    	getList("/userAdminRest/list");
    });
    
</script>
</html>