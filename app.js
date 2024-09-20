document.addEventListener('DOMContentLoaded', function() {
    let startX;

    function handleTouchStart(event) {
        const touch = event.touches[0];
        startX = touch.clientX;
    }

    function handleTouchMove(event) {
        if (!startX) {
            return;
        }

        const touch = event.touches[0];
        const diffX = touch.clientX - startX;

        if (diffX > 50) {
            // Swipe right: navigate to the next section (e.g., show messages)
            alert("Swipe Right Detected");
        } else if (diffX < -50) {
            // Swipe left: navigate to the previous section (e.g., go back to home)
            alert("Swipe Left Detected");
        }

        startX = null; // Reset start position after swipe
    }

    const content = document.querySelector('.content');
    content.addEventListener('touchstart', handleTouchStart);
    content.addEventListener('touchmove', handleTouchMove);
});