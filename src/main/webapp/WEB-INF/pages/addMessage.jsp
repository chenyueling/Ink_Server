<%--
  Created by IntelliJ IDEA.
  User: chenyueling
  Date: 2015/7/21
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>add</title>
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

    <form id="add_massage" class="form-horizontal">
        <div class="form-group">

            <label for="headIcon">头像</label>

            <div id="headicon" >
                <a class="btn btn-default btn-lg " id="headicon_picker" href="#">
                    <i class="glyphicon glyphicon-plus"></i>
                    <span>选择头像</span>
                    <input type="hidden" name="headIcon" value=""/>
                </a>
            </div>
        </div>
        <div class="form-group">
            <label for="showName">昵称</label><input id="showName" class="form-control" name="showName"/>
        </div>
        <div class="form-group">
            <label>描述</label>
            <textarea row="3" name="showText" class="form-control"></textarea>
        </div>
        <div class="form-group">
            <label for="iconText">iconText</label>
            <input name="iconText"  class="form-control" id="iconText"/>
        </div>
        <div class="form-group">
            <label for="showImage">showImage</label>
            <div id="showImage">
                <a class="btn btn-default btn-lg " id="showImage_picker" href="#">
                    <i class="glyphicon glyphicon-plus"></i>
                    <span>选择图片</span>
                    <input type="hidden" name="showImg" value=""/>
                </a>
            </div>
        </div>
        <div class="form-group">
            <label for="font_color">是否可选</label>
                <select id="type" class="form-control" name="status" />
                <option value="false">不可选</option>
                <option value="true">可选</option>
                </select>
        </div>
        <div class="form-group">
            <label for="Style">Style</label>
            <div id="style">
                <label >Font</label>
                <div class="form-group">
                    <label for="font_color" class="control-label col-sm-1">字体颜色</label>
                    <div class="col-xs-2">
                        <input id="font_color" class="form-control" name="font_color" type="text"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="font_size" class="control-label col-sm-1">字体大小 </label>
                    <div class="col-xs-2">
                        <input id="font_size" class="form-control" name="font_size" type="text"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="border_color" class="control-label col-sm-1">边框颜色</label>
                    <div class="col-xs-2">
                        <input id="border_color" class="form-control" name="border_color" type="text"/>
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <label for="border_size" class="control-label col-sm-1">边框大小</label>
                    <div class="col-xs-2">
                        <input id="border_size" class="form-control" name="border_size" type="text"/>
                    </div>
                </div>
            </div>


            <label >BackGround</label>
            <div class="form-group">
                <label for="font_color" class="control-label col-sm-1">背景类型</label>
                <div class="col-xs-2">
                    <select id="bg_type" class="form-control" name="bg_type" />
                    <option value="bg_color">背景色</option>
                    <option value="bg_image">背景图</option>
                    </select>
                </div>
            </div>
            <div id="bg_group_color">
                <div class="form-group">
                    <label for="font_size" class="control-label col-sm-1">背景颜色 </label>
                    <div class="col-xs-2">
                        <input id="bg_color" class="form-control" name="bg_color" type="text"/>
                    </div>
                </div>
            </div>
            <div id="bg_group_image">
                <div class="form-group">
                    <label for="border_color" class="control-label col-sm-1">背景图1</label>
                    <div class="col-xs-2">
                        <div id="img1">
                            <a class="btn btn-default btn-lg " id="img1_picker" href="#">
                                <i class="glyphicon glyphicon-plus"></i>
                                <span>图1</span>
                                <input type="hidden" name="img1" value=""/>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <label for="border_size" class="control-label col-sm-1">背景图2</label>
                    <div class="col-xs-2">
                        <div id="img2">
                            <a class="btn btn-default btn-lg " id="img2_picker" href="#">
                                <i class="glyphicon glyphicon-plus"></i>
                                <span>图2</span>
                                <input type="hidden" name="img2" value=""/>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <label for="border_size" class="control-label col-sm-1">背景图3</label>
                    <div class="col-xs-2">
                        <div id="img3" >
                            <a class="btn btn-default btn-lg " id="img3_picker" href="#">
                                <i class="glyphicon glyphicon-plus"></i>
                                <span>图3</span>
                                <input type="hidden" name="img3" value=""/>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <label for="border_size" class="control-label col-sm-1">背景图4</label>
                    <div class="col-xs-2">
                        <div id="img4">
                            <a class="btn btn-default btn-lg " id="img4_picker" href="#">
                                <i class="glyphicon glyphicon-plus"></i>
                                <span>图4</span>
                                <input type="hidden" name="img4" value=""/>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <label for="border_size" class="control-label col-sm-1">背景图6</label>
                    <div class="col-xs-2">
                        <div id="img6">
                            <a class="btn btn-default btn-lg " id="img6_picker" href="#">
                                <i class="glyphicon glyphicon-plus"></i>
                                <span>图6</span>
                                <input type="hidden" name="img6" value=""/>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <label for="border_size" class="control-label col-sm-1">背景图9</label>
                    <div class="col-xs-2">
                        <div id="img9">
                            <a class="btn btn-default btn-lg " id="img9_picker" href="#">
                                <i class="glyphicon glyphicon-plus"></i>
                                <span>图9</span>
                                <input type="hidden" name="img9" value=""/>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <button id="add_btn" type="button">提交</button>
    </form>

</div>

<script type="text/javascript" src="resources/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/plupload/plupload.full.min.js"></script>
<script type="text/javascript" src="resources/js/plupload/i18n/zh_CN.js"></script>
<script type="text/javascript" src="resources/js/ui.js"></script>
<script type="text/javascript" src="resources/js/qiniu.js"></script>
<script type="text/javascript" src="resources/js/highlight/highlight.js"></script>
<script type="text/javascript" src="resources/js/img.js"></script>
<script type="text/javascript">

    $(function(){

        $("#bg_group_image").hide();

        $("#bg_type").change(function(){
            var value = $(this).val();
            if(value == "bg_image"){
                $("#bg_group_image").show();
                $("#bg_group_color").hide(1000);
            }else{
                $("#bg_group_color").show();
                $("#bg_group_image").hide(1000);
            }

        });

        $("#add_btn").bind("click",add);

    });


    function add() {
        $.ajax({
            cache: true,
            type: "POST",
            url:"messages",
            data:$('#add_massage').serialize(),
            async: false,
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                alert(data);
                $("#commonLayout_appcreshi").parent().html(data);
            }
        });
    }



</script>

</body>
</html>
