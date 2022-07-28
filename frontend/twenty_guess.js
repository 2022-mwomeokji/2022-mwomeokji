
var botton=$('.botton_hover');
botton.focus(function(){
    text1.val('포커스를 얻었습니다.');
    console.log("111");
  });

function clicked_a(){
  alert("a선택됨");
}

function clicked_b(){
  alert("b선택됨")
}

if(localStorage.getItem('num')){
  var lastData = localStorage.getItem('num')
  console.log(lastData);
 }
 localStorage.setItem("cast", JSON.stringify(lastData));

 JSON.parse(localStorage.getItem("cast"));