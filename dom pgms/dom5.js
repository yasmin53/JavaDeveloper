var em = document.createElement('em');
var strong = document.querySelector('strong');
var div = document.querySelector('div');
em.textContent = 'hi';
div.replaceChild(em, strong);