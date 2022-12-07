
const MainButton = document.querySelector(".main");
MainButton.onclick = () =>{
    location.href="/background";
}


const BoardButton = document.querySelector(".board");
BoardButton.onclick = () =>{
    location.href="/board/list";
}

const signButton = document.querySelector(".sign");
signButton.onclick = () =>{
    location.href="/board/sign";
}

const loginButton = document.querySelector(".login");
loginButton.onclick = () =>{
    location.href="/board/login";
}

const lsoginButton = document.querySelector(".signup");
lsoginButton.onclick = () =>{
    location.href="/board/sign";
}