
function changeVerifyCode(img) {
    img.src="../../WEB-INF/Kaptcha?"+Math.floor(Math.random()*100);
}



