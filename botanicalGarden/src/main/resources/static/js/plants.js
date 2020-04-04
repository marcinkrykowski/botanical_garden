jQuery(document).ready(function($) {
    $(".badge-pill").click(function(event) {
        event.stopPropagation();
    });
    $(".clickable").click(function() {
        window.document.location = $(this).parent().attr('href');
    });
});
