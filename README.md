# README
-----feladatok lentebb  
|  
|  
ˇ  
**Csapattagok:**  
- Bódi Tibor
- Csapó Dániel
- Papp Dániel
- Szukács Marcell  

**Terv:**  
Oldalnézetes/felülnézetes játék. Egy testépítőt irányít a játékos és  pl.: a konditeremből kell hazajutni az utcán, miközben nem-fitt emberek próbálják ebben megakadályozni. A játékos üthet és a pályán található tárgyakat dobhat az ellenfelek kiütésére.  
**Cél:**  
Eljutni A pontból B pontba a pályán(több útvonal is választható), ezalatt a lehető legtöbb pontot összegyűjtve  
**Pontok:**  
A játékos pontot kap ellenfelek kiütéséért, feladatok elvégzéséért(+ gyorsaságért?)  
Pontot veszít járókelők/feladat adó NPC-k kiütéséért  
**A játékosnak van:**  
muscle mass - a játékos életereje, ha nagyobb, akkor erősebbek a támadásai és nagyobb tárgyakat tud felvenni/eldobni, de lassabban mozog  
**Objektumok a pályán:**  
- **environment** - blokkolja a játékos mozgását  
- **interactable** - használható tárgyak
  - *throwable* - eldobható tárgyak ellenfelek sebzésére
  - *consumable* - elfogyasztható tárgyak pl. muscle masst növel
  - *quest item* - egy feladat végrehajtásához szükséges tárgy  
- **npc** - nem játékos karakterek
  - *enemy* - ellenséges karakterek
  - *quest npc(interactable)* - feladat adó karakter
  - *bystander* - járókelő, passzív karakter  
# KEZDETI FELADATOK  
- main menü screen elkészítése, amin van legalább egy játékkezdő gomb és egy leaderboard gomb
- online(ha nincs internet akkor helyi) leaderboard elkészítése ami mutatja a legjobb X játékos pontszámát (név + pontszám) van hozzá netes tárhely amit tudunk használni
- a játékban található objektumok osztályainak csinálása
- game screen elkezdése
- játéklogika/objektum ütközés(box2d)
# HELP  
libgdx keretrendszer:  
[Tutorial 1](https://www.gamefromscratch.com/page/LibGDX-Tutorial-series.aspx)  
[Official wiki és referencia](https://github.com/libgdx/libgdx/wiki)  
[box2d physics](https://github.com/libgdx/libgdx/wiki/box2d#dynamic-bodies)  
ingyenes assetekre 1 példa:  
https://itch.io/game-assets/free
