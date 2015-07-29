<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>七牛云存储 - JavaScript SDK</title>
    <link href="favicon.ico" rel="shortcut icon">
    <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="resources/main.css">
    <link rel="stylesheet" href="resources/js/highlight/highlight.css">

    <!--[if lt IE 9]>
    <script src="resources/js/Respond-1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">

    <input type="hidden" id="domain" value="${domain}">
    <input type="hidden" id="uptoken_url" value="${uptoken_url}">
<div class="body">
    <div class="col-md-12">
        <div id="container">
            <a class="btn btn-default btn-lg " id="pickfiles" href="#" >
                <i class="glyphicon glyphicon-plus"></i>
                <span>选择文件</span>
            </a>
        </div>
    </div>

    <div style="display:none" id="success" class="col-md-12">
        <div class="alert-success">
            队列全部文件处理完毕
            <div id="result"></div>
            <img id="img" src="" alt=""/>
        </div>
    </div>

</div>


</div>




<script type="text/javascript" src="resources/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/plupload/plupload.full.min.js"></script>
<script type="text/javascript" src="resources/js/plupload/i18n/zh_CN.js"></script>
<script type="text/javascript" src="resources/js/ui.js"></script>
<script type="text/javascript" src="resources/js/qiniu.js"></script>
<script type="text/javascript" src="resources/js/highlight/highlight.js"></script>
<script type="text/javascript" src="resources/js/main.js"></script>
</body>
</html>
