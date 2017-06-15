
//
    var $cloud = mainwidth = null;
    var offset1 = 450;
    var offset2 = 0;
    $(document).ready(
        function () {
            $cloud1 = $("#cloud1");
            $cloud2 = $("#cloud2");
            mainwidth = 1875;
        }
    );

    /// 飘动
    setInterval(function flutter() {
        if (offset1 >= mainwidth) {
            offset1 =  -450;
        }
        if (offset2 >= mainwidth) {
			 offset2 =  -450;
        }
        offset1 += 5.1;
        offset2 += 4.5;
        $cloud1.css("background-position", offset1 + "px 0px")
		$cloud2.css("background-position", offset2 + "px 135px")
		
    }, 50);
	
	