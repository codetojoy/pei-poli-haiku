import * as c from "./const.js";

let haikus = [];
let haiku = null;

export function getRandom(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

export function updateUI(haiku) {
  if (document && haiku) {
    document.getElementById("haiku-line1").innerHTML = haiku.line1;
    document.getElementById("haiku-line2").innerHTML = haiku.line2;
    document.getElementById("haiku-line3").innerHTML = haiku.line3;
    document.getElementById("haiku-date").innerHTML = haiku.date;
    document.getElementById("haiku-author").innerHTML = `${haiku.honourific} ${haiku.name}`;
    document.getElementById("haiku-source").href = haiku.source;
  }
}

export function chooseRandomHaiku() {
  const numHaikus = haikus.length;
  const i = getRandom(0, numHaikus - 1);
  haiku = haikus[i];
  updateUI(haiku);
}

export function chooseInitialHaiku() {
  fetch(c.JSON_FILE)
    .then((response) => response.json())
    .then((jsonData) => {
      haikus = jsonData.children;
      chooseRandomHaiku();
    });
}

// ----------------- DOM/event handlers

function nextHandler(event) {
  chooseRandomHaiku();
}

if (document) {
  if (document.getElementById("next-arrow")) {
    document.getElementById("next-arrow").addEventListener("click", nextHandler);
  }
}
