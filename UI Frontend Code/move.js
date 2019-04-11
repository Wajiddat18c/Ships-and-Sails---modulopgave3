
// denne function flytter de forskellige elementer
function dragElement(elmnt) {
    var pos1 = 0, pos2 = 0, pos3 = 0, pos4 = 0;
    //flytter billed
    elmnt.onmousedown = dragMouseDown;

    //når musknap holdes nede.
    function dragMouseDown(e) {
        e = e || window.event;
        e.preventDefault();
        // får mus makørs postiotin ved start
        pos3 = e.clientX;
        pos4 = e.clientY;
        document.onmouseup = closeDragElement;
        // call a function whenever the cursor moves:
        document.onmousemove = elementDrag;
    }
    //flytter billed-element
    function elementDrag(e) {
        e = e || window.event;
        e.preventDefault();
        // regner ud den nye mus position
        pos1 = pos3 - e.clientX;
        pos2 = pos4 - e.clientY;
        pos3 = e.clientX;
        pos4 = e.clientY;
        // sætter element til den nye position
        elmnt.style.top = (elmnt.offsetTop - pos2) + "px";
        elmnt.style.left = (elmnt.offsetLeft - pos1) + "px";
    }

    // stopper bevægelse
    function closeDragElement() {
        document.onmouseup = null;
        document.onmousemove = null;
    }
}