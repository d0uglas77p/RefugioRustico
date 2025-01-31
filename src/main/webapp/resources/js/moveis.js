function openFullscreen(img) {
    const fullscreenDiv = document.createElement("div");
    fullscreenDiv.style.position = "fixed";
    fullscreenDiv.style.top = "0";
    fullscreenDiv.style.left = "0";
    fullscreenDiv.style.width = "100vw";
    fullscreenDiv.style.height = "100vh";
    fullscreenDiv.style.backgroundColor = "rgba(0, 0, 0, 0.9)";
    fullscreenDiv.style.display = "flex";
    fullscreenDiv.style.alignItems = "center";
    fullscreenDiv.style.justifyContent = "center";
    fullscreenDiv.style.zIndex = "10000";

    const closeFullscreen = () => {
        document.body.removeChild(fullscreenDiv);
        document.removeEventListener("keydown", escClose);
    };

    const escClose = (event) => {
        if (event.key === "Escape") {
            closeFullscreen();
        }
    };

    fullscreenDiv.onclick = closeFullscreen;
    document.addEventListener("keydown", escClose);

    const fullImg = document.createElement("img");
    fullImg.src = img.src;
    fullImg.style.maxWidth = "90%";
    fullImg.style.maxHeight = "90%";
    fullImg.style.borderRadius = "10px";
    fullImg.style.boxShadow = "0 0 20px rgba(255, 255, 255, 0.5)";

    fullscreenDiv.appendChild(fullImg);
    document.body.appendChild(fullscreenDiv);
}