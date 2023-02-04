(function (){
    function renderAboutPastorInfo(){
        let html = '';
        html += '<div class="aboutBanner">\n' +
            '        <h1 class="aboutTitle">Pastor Johnson</h1>\n' +
            '    </div>\n' +
            '    <div class="aboutImgContainer">\n' +
            '        <img class="aboutImg" src="../static/images/church_logo.jpg">\n' +
            '    </div>\n' +
            '    <div class="aboutInfoRow">\n' +
            '        <div class="aboutInfoIcon"></div>\n' +
            '        <div class="aboutInfoTextContainer">\n' +
            '            <p class="aboutInfoTextBody">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias aliquid dolorum earum expedita labore nobis numquam veritatis? Alias, commodi sint!</p>\n' +
            '            <p class="aboutSignature"></p>\n' +
            '        </div>\n' +
            '    </div>';
        return html;
    }

    function renderAboutFirstLadyHTML(){
        let html = '';
        html += '<div class="aboutBanner">\n' +
            '        <h1 class="aboutTitle">First Lady Johnson</h1>\n' +
            '    </div>\n' +
            '    <div class="aboutImgContainer">\n' +
            '        <img class="aboutImg" src="../static/images/church_logo.jpg">\n' +
            '    </div>\n' +
            '    <div class="aboutInfoRow">\n' +
            '        <div class="aboutInfoIcon"></div>\n' +
            '        <div class="aboutInfoTextContainer">\n' +
            '            <p class="aboutInfoTextBody">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias aliquid dolorum earum expedita labore nobis numquam veritatis? Alias, commodi sint!</p>\n' +
            '            <p class="aboutSignature"></p>\n' +
            '        </div>\n' +
            '    </div>';
        return html;
    }


    $('#pastorTab').click( function (e){
        $('.aboutContainer').html(renderAboutPastorInfo);
    });
    $('#firstLadyTab').click( function (e){
        $('.aboutContainer').html(renderAboutFirstLadyHTML);
    });
})();