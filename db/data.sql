#Brigskibe
INSERT INTO `sails`.`skibe` (`navn`, `maxNoOfSailorsOnShip`, `maxSpeed`, `shipType`, `gunsPrRow`, `rowsOfGuns`, `noOfSailorsNeededToShoot`, `maxNoOfSails`, `noOfSailorsNeededToSail`, `maxHull`, `maxSpeedChange`, `maxSail`, `noOfTurns`) VALUES ('Molly', '60', '2', 'Brig', '8', '1', '24', '4', '24', '25', '1', '30', '1');
#Ship of the line
INSERT INTO `sails`.`skibe` (`navn`,  `maxNoOfSailorsOnShip`, `maxSpeed`, `shipType`, `gunsPrRow`, `rowsOfGuns`, `noOfSailorsNeededToShoot`, `maxNoOfSails`, `noOfSailorsNeededToSail`, `maxHull`, `maxSpeedChange`, `maxSail`, `noOfTurns`) VALUES ('Alma', '160', '5', 'Ship of the Line', '16', '2', '48', '10', '60', '60', '5', '60', '2');
#Man of War
INSERT INTO `sails`.`skibe` (`navn`,  `maxNoOfSailorsOnShip`, `maxSpeed`, `shipType`, `gunsPrRow`, `rowsOfGuns`, `noOfSailorsNeededToShoot`, `maxNoOfSails`, `noOfSailorsNeededToSail`, `maxHull`, `maxSpeedChange`, `maxSail`, `noOfTurns`) VALUES ('Yrsa', '340', '4', 'Man at War', '28', '3', '84', '24', '144', '140', '1', '80', '1');
select * from skibe;

#Scenarier
INSERT INTO `sails`.`scenarie` (`navn`, `sizeX`, `sizeY`) VALUES ('stor', '24', '24');
INSERT INTO `sails`.`scenarie` (`navn`, `sizeX`, `sizeY`) VALUES ('lille', '12', '12');
select * from scenarie;


#Skibenes positioner og nationalitet
#lille bane
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (1, 1, 3, 3, "Holland");
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (2, 1, 6, 3, "Holland");
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (3, 1, 9, 3, "Holland");

INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (1, 1, 3, 9, "Tyskland");
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (2, 1, 6, 9, "Tyskland");
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (3, 1, 9, 9, "Tyskland");

#stor bane
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (1, 2, 3, 3, "Holland");
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (2, 2, 6, 3, "Holland");
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (3, 2, 9, 3, "Holland");

INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (1, 2, 3, 9, "Tyskland");
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (2, 2, 6, 9, "Tyskland");
INSERT INTO Skibspositioner (Skibe_idSkib, Scenarie_idScenarie, posX, posY, Nationalitet) VALUES (3, 2, 9, 9, "Tyskland");


select * from Skibspositioner;


