# README
-----feladatok és help lentebb  
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
- main menü screen elkészítése, amin van legalább egy játékkezdő gomb és egy leaderboard gomb, a példában található skinnel és atlassal próbáld meg, majd megcsinálom hozzá az egyedi verziót  
- online(ha nincs internet akkor helyi) leaderboard elkészítése ami mutatja a legjobb X játékos pontszámát (név + pontszám) van hozzá netes tárhely amit tudunk használni
- a játékban található objektumok osztályainak csinálása
- game screen elkezdése
- játéklogika/objektum ütközés(box2d)  
- input processor osztály, ami működik a menüben, a leaderboardban és a játékban is  
- assetek rajzolása  
# HELP  
libgdx keretrendszer:  
[Tutorial 1](https://www.gamefromscratch.com/page/LibGDX-Tutorial-series.aspx)  
[Official wiki és referencia](https://github.com/libgdx/libgdx/wiki)  
[box2d physics](https://github.com/libgdx/libgdx/wiki/box2d#dynamic-bodies)   
input processing:  
[Input processor referencia](https://libgdx.badlogicgames.com/ci/nightlies/docs/api/com/badlogic/gdx/InputProcessor.html)  
menü screen/leaderboard példa:    
[példa](https://stackoverflow.com/questions/32451921/how-to-create-libgdx-main-menu-screen)  
ingyenes assetekre 1 példa:  
https://itch.io/game-assets/free
