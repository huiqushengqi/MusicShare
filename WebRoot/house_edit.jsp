<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>信息管理系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<script type="text/javascript" src="scripts/jquery/jquery-1.7.1.js"></script>
		<link href="style/authority/basic_layout.css" rel="stylesheet"
			type="text/css">
		<link href="style/authority/common_style.css" rel="stylesheet"
			type="text/css">
		<script type="text/javascript" src="scripts/authority/commonAll.js"></script>
		<script type="text/javascript"
			src="scripts/jquery/jquery-1.4.4.min.js"></script>
		<script src="scripts/My97DatePicker/WdatePicker.js"
			type="text/javascript" defer="defer"></script>
		<script type="text/javascript"
			src="scripts/artDialog/artDialog.js?skin=default"></script>
		<script type="text/javascript">
	$(document).ready(function() {
		/*
		 * 提交
		 */
		$("#submitbutton").click(function() {
				window.parent.$.fancybox.close();
		});
		
		/*
		 * 取消
		 */
		$("#cancelbutton").click(function() {
			/**  关闭弹出iframe  **/
			window.parent.$.fancybox.close();
		});
	});
	
	/** 检测房源房号是否存在  **/
	function checkFyFh(){
		// 分别获取小区编号、栋号、层号、房号
		var fyID = $('#fyID').val();
		var fyXqCode = $("#fyXq").val();
		var fyDh = $("#fyDh").val();
		var fyCh = $("#fyCh").val();	
		var fyFh = $("#fyFh").val();
		if(fyXqCode!="" && fyDh!="" && fyCh!="" && fyFh!=""){
			// 给房屋坐落地址赋值
			$("#fyZldz").val($('#fyDh option:selected').text() + fyCh + "-" + fyFh);
			// 异步判断该房室是否存在，如果已存在，给用户已提示哦
			$.ajax({
				type:"POST",
				url:"checkFyFhIsExists.action",
				data:{"fangyuanEntity.fyID":fyID,"fangyuanEntity.fyXqCode":fyXqCode, "fangyuanEntity.fyDhCode":fyDh, "fangyuanEntity.fyCh":fyCh, "fangyuanEntity.fyFh":fyFh},
				dataType : "text",
				success:function(data){
// 					alert(data);
					// 如果返回数据不为空，更改“房源信息”
					if(data=="1"){
						 art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'该房室在系统中已经存在哦，\n请维护其他房室数据', ok:true,});
						 $("#fyFh").css("background", "#EEE");
						 $("#fyFh").focus();
						 return false;
					}
				}
			});
		}
	}
	
	/** 检测房源房号是否存在并提交form  **/
	function checkFyFhSubmit(){
		// 分别获取小区编号、栋号、层号、房号
		var fyID = $('#fyID').val();
		var fyXqCode = $("#fyXq").val();
		var fyDh = $("#fyDh").val();
		var fyCh = $("#fyCh").val();	
		var fyFh = $("#fyFh").val();
		if(fyXqCode!="" && fyDh!="" && fyCh!="" && fyFh!=""){
			// 给房屋坐落地址赋值
			$("#fyZldz").val($('#fyDh option:selected').text()  + fyCh + "-" + fyFh);
			// 异步判断该房室是否存在，如果已存在，给用户已提示哦
			$.ajax({
				type:"POST",
				url:"checkFyFhIsExists.action",
				data:{"fangyuanEntity.fyID":fyID,"fangyuanEntity.fyXqCode":fyXqCode, "fangyuanEntity.fyDhCode":fyDh, "fangyuanEntity.fyCh":fyCh, "fangyuanEntity.fyFh":fyFh},
				dataType : "text",
				success:function(data){
// 					alert(data);
					// 如果返回数据不为空，更改“学生信息”
					if(data=="1"){
						 art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'该房室在系统中已经存在哦，\n请维护其他房室数据', ok:true,});
						 $("#fyFh").css("background", "#EEE");
						 $("#fyFh").focus();
						 return false;
				    //提交表单数据
					}else{
						$("#submitForm").attr("action", "/xngzf/archives/saveOrUpdateFangyuan.action").submit();
					}
				}
			});
		}
		return true;
	}
	
	/** 表单验证  **/
	function validateForm(){
		if($("#fyXqName").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源小区', ok:true,});
			return false;
		}
		if($("#fyDh").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源栋号', ok:true,});
			return false;
		}
		if($("#fyCh").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源层号', ok:true,});
			return false;
		}
		if($("#fyFh").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源房号', ok:true,});
			return false;
		}
		if($("#fyZongMj").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源面积', ok:true,});
			return false;
		}
		if($("#fyJizuMj").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写计租面积', ok:true,});
			return false;
		}
		if($("#fyZldz").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源座落地址', ok:true,});
			return false;
		}
		return true;
	}
</script>
	</head>
	<body>
		<div id="nav_links">
			当前位置：基础数据&nbsp;>&nbsp;
			<span style="color: #1A5CC6;">房源编辑</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();"> <img
						src="images/common/page_close.png" width="20" height="20"
						style="vertical-align: text-top;" /> </a>
			</div>
		</div>
		<form id="submitForm" name="submitForm" action="updatestu.html"
			method="get">
			<input type="hidden" name="stu_num" value="${stu.stu_num }"
				id="stu_num" />
			<div id="container">
				<div class="ui_content">
					<table cellspacing="0" cellpadding="0" width="100%" align="left"
						border="0">
						<tr>
							<td class="ui_text_rt" width="80" height="60">
								寝室:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</td>
							<td class="ui_text_lt">
								<input type="text" id="stu_addr" style="height: 30px"
									value="${stu.stu_addr }" />
							</td>
						</tr>
						<tr>
							<td class="ui_text_rt" width="80" height="60">
								职位:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</td>
							<td class="ui_text_lt">
								<input type="text" id="stu_position" style="height: 30px"
									value="${stu.stu_position }" />
							</td>
						</tr>
						<tr>
							<td class="ui_text_rt" height="60">
								状态:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</td>
							<td class="ui_text_lt">
								<select id="stu_status" class="ui_select01" style="width: 100px">
									<option value="在校" selected="selected">
										在校
									</option>
									<option value="离校">
										离校
									</option>
									<option value="请假">
										请假
									</option>
								</select>
							</td>
						</tr>
						<tr>
							<td class="ui_text_rt" width="80">
								备注:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</td>
							<td class="ui_text_lt">
								<textarea id="stu_remarks" style="width: 190px; height: 200px">${stu.stu_remarks}</textarea>
							</td>
						</tr>
						<tr>
							<td>
								&nbsp;
							</td>
							<td class="ui_text_lt">
								&nbsp;
								<input id="submitbutton" type="submit" value="提交"
									class="ui_input_btn01" />
								&nbsp;
								<input id="cancelbutton" type="reset" value="取消"
									class="ui_input_btn01" />
							</td>
						</tr>
					</table>
				</div>
			</div>
		</form>
	</body>
</html>
